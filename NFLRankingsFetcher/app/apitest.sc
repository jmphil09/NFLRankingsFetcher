import scala.io.Source
import java.io._

object apitest {

  val site = "http://espn.go.com/nfl/powerrankings"
                                                  //> site  : String = http://espn.go.com/nfl/powerrankings
  lazy val teamStr = Source.fromURL(site, "UTF-8").mkString
                                                  //> teamStr: => String


  def getTeams(str: String): List[String] = {
  	
  	val teamBeginOdd = """<tr class="oddrow" align=left><td class="pr-rank">"""
  	val teamBeginEven = """<tr class="evenrow" align=left><td class="pr-rank">"""
    val teamEnd = """</td></tr>"""
    val beginLengthOdd = teamBeginOdd.length
    val beginLengthEven = teamBeginEven.length
    val endLength = teamEnd.length
    
    def findStrEnd(str: String): Int = {
  		for(i <- 0 to str.length-1){
  			if(str.drop(i).take(endLength)==teamEnd) return i + endLength
  		}
  		0
    }
  
  	def helper(str: String, list: List[String]): List[String] = {
  		if(list.length==32) list
  		else if(str.take(beginLengthOdd)==teamBeginOdd || str.take(beginLengthEven)==teamBeginEven) {
  			val endIndex = findStrEnd(str)
  			val strResult = str.take(endIndex)
  			helper(str.drop(endLength), list ++ List(strResult))
  		}
  		else helper(str.drop(1), list)
  	}
  	
  	helper(str, List())
  }                                               //> getTeams: (str: String)List[String]
  
  
  
  lazy val allTeams = getTeams(teamStr)           //> allTeams: => List[String]
  allTeams.length                                 //> res0: Int = 32
  
  
  def getTeamRank(str: String): Int = {
  	def helper(str: String, counter: Int): String = {
  		if(counter==2) str.take(2)
  		else if(str(0)=='>') helper(str.drop(1), counter+1)
  		else helper(str.drop(1),counter)
  	}
  	val rank = helper(str, 0)
  	
  	if(rank.drop(1)=="<") rank.take(1).toInt
  	else rank.toInt
  }                                               //> getTeamRank: (str: String)Int
  

  
  def getTeamName(str: String): String = {
  	
  	val teamMap = Map("Seah" -> "Seahawks", "Bron" -> "Broncos", "49er" -> "49ers", "Patr" -> "Patriots",
   "Sain" -> "Saints", "Pack" -> "Packers", "Colt" -> "Colts", "Card" -> "Cardinals", "Eagl" -> "Eagles",
   "Beng" -> "Bengals", "Pant" -> "Panthers", "Bear" -> "Bears", "Rave" -> "Ravens", "Falc" -> "Falcons",
   "Chie" -> "Chiefs", "Char" -> "Chargers", "Stee" -> "Steelers", "Rams" -> "Rams", "Gian" -> "Giants",
   "Lion" -> "Lions", "Jets" -> "Jets", "Cowb" -> "Cowboys", "Bucc" -> "Buccaneers", "Dolp" -> "Dolphins",
   "Tita" -> "Titans", "Texa" -> "Texans", "Bill" -> "Bills", "Reds" -> "Redskins", "Viki" -> "Vikings",
   "Jagu" -> "Jaguars", "Raid" -> "Raiders", "Brow" -> "Browns")
   
  	def helper(str: String, counter: Int): String = {
  		if(counter==10) str.take(4)
  		else if(str(0)=='>') helper(str.drop(1), counter+1)
  		else helper(str.drop(1), counter)
  	}
  	
  	teamMap(helper(str,0))
  }                                               //> getTeamName: (str: String)String
  

  var teamRankings = Map(" " -> 0)                //> teamRankings  : scala.collection.immutable.Map[String,Int] = Map(" " -> 0)
                                                  //| 
  for(team <- allTeams){
  	teamRankings = teamRankings + (getTeamName(team) -> getTeamRank(team))
  }
  
  teamRankings -= " "
  teamRankings.size                               //> res1: Int = 32
  teamRankings                                    //> res2: scala.collection.immutable.Map[String,Int] = Map(Colts -> 7, Browns -
                                                  //| > 32, Rams -> 18, Giants -> 19, Redskins -> 28, Falcons -> 14, 49ers -> 3, 
                                                  //| Raiders -> 31, Bills -> 27, Packers -> 6, Lions -> 20, Dolphins -> 24, Pant
                                                  //| hers -> 11, Steelers -> 17, Eagles -> 9, Buccaneers -> 23, Bengals -> 10, C
                                                  //| hargers -> 16, Jaguars -> 30, Titans -> 25, Ravens -> 13, Texans -> 26, Sai
                                                  //| nts -> 5, Bears -> 12, Seahawks -> 1, Jets -> 21, Cardinals -> 8, Chiefs ->
                                                  //|  15, Broncos -> 2, Vikings -> 29, Cowboys -> 22, Patriots -> 4)


def fileWriter(filename: String, rankStr: String) = {
  //val writer = new PrintWriter(new File("C:/Users/James/Desktop/git-workspace/NFLRankingsFetcher/NFLRankingsFetcher/data/" + filename + ".txt" ))
  val writer = new PrintWriter(new File("C:/Users/fligh_000/Desktop/git-workspace/NFLRankingsFetcher/NFLRankingsFetcher/data/" + filename + ".txt" ))
  writer.write(rankStr)
  writer.close()
}                                                 //> fileWriter: (filename: String, rankStr: String)Unit

var strResult = new String                        //> strResult  : String = ""
for(line <- teamRankings.toSeq.sortBy(_._2)){
strResult += line.toString.drop(1).dropRight(1) + "\n"
}
strResult                                         //> res3: String = "Seahawks,1
                                                  //| Broncos,2
                                                  //| 49ers,3
                                                  //| Patriots,4
                                                  //| Saints,5
                                                  //| Packers,6
                                                  //| Colts,7
                                                  //| Cardinals,8
                                                  //| Eagles,9
                                                  //| Bengals,10
                                                  //| Panthers,11
                                                  //| Bears,12
                                                  //| Ravens,13
                                                  //| Falcons,14
                                                  //| Chiefs,15
                                                  //| Chargers,16
                                                  //| Steelers,17
                                                  //| Rams,18
                                                  //| Giants,19
                                                  //| Lions,20
                                                  //| Jets,21
                                                  //| Cowboys,22
                                                  //| Buccaneers,23
                                                  //| Dolphins,24
                                                  //| Titans,25
                                                  //| Texans,26
                                                  //| Bills,27
                                                  //| Redskins,28
                                                  //| Vikings,29
                                                  //| Jaguars,30
                                                  //| Raiders,31
                                                  //| Browns,32
                                                  //| "

   val dummyTeamMap = Map("Seahawks" -> 0, "Broncos" -> 0, "49ers" -> 0, "Patriots" -> 0,
   "Saints" -> 0, "Packers" -> 0, "Colts" -> 0, "Cardinals" -> 0, "Eagles" -> 0,
   "Bengals" -> 0, "Panthers" -> 0, "Bears" -> 0, "Ravens" -> 0, "Falcons" -> 0,
   "Chiefs" -> 0, "Chargers" -> 0, "Steelers" -> 0, "Rams" -> 0, "Giants" -> 0,
   "Lions" -> 0, "Jets" -> 0, "Cowboys" -> 0, "Buccaneers" -> 0, "Dolphins" -> 0,
   "Titans" -> 0, "Texans" -> 0, "Bills" -> 0, "Redskins" -> 0, "Vikings" -> 0,
   "Jaguars" -> 0, "Raiders" -> 0, "Browns" -> 0) //> dummyTeamMap  : scala.collection.immutable.Map[String,Int] = Map(Colts -> 0
                                                  //| , Browns -> 0, Rams -> 0, Giants -> 0, Redskins -> 0, Falcons -> 0, 49ers -
                                                  //| > 0, Raiders -> 0, Bills -> 0, Packers -> 0, Lions -> 0, Dolphins -> 0, Pan
                                                  //| thers -> 0, Steelers -> 0, Eagles -> 0, Buccaneers -> 0, Bengals -> 0, Char
                                                  //| gers -> 0, Jaguars -> 0, Titans -> 0, Ravens -> 0, Texans -> 0, Saints -> 0
                                                  //| , Bears -> 0, Seahawks -> 0, Jets -> 0, Cardinals -> 0, Chiefs -> 0, Bronco
                                                  //| s -> 0, Vikings -> 0, Cowboys -> 0, Patriots -> 0)
    
    var dummyStrResult = new String               //> dummyStrResult  : String = ""
		for(line <- dummyTeamMap.toSeq.sortBy(_._2)){
			dummyStrResult += line.toString.drop(1).dropRight(1) + "\n"
		}
		dummyStrResult                    //> res4: String = "Colts,0
                                                  //| Browns,0
                                                  //| Rams,0
                                                  //| Giants,0
                                                  //| Redskins,0
                                                  //| Falcons,0
                                                  //| 49ers,0
                                                  //| Raiders,0
                                                  //| Bills,0
                                                  //| Packers,0
                                                  //| Lions,0
                                                  //| Dolphins,0
                                                  //| Panthers,0
                                                  //| Steelers,0
                                                  //| Eagles,0
                                                  //| Buccaneers,0
                                                  //| Bengals,0
                                                  //| Chargers,0
                                                  //| Jaguars,0
                                                  //| Titans,0
                                                  //| Ravens,0
                                                  //| Texans,0
                                                  //| Saints,0
                                                  //| Bears,0
                                                  //| Seahawks,0
                                                  //| Jets,0
                                                  //| Cardinals,0
                                                  //| Chiefs,0
                                                  //| Broncos,0
                                                  //| Vikings,0
                                                  //| Cowboys,0
                                                  //| Patriots,0
                                                  //| "

   fileWriter("2014Week18", dummyStrResult)
  
    
}