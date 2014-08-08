import scala.io.Source

object apitest {

  
  val site = "http://espn.go.com/nfl/powerrankings"
                                                  //> site  : String = http://espn.go.com/nfl/powerrankings
  val teamStr = Source.fromURL(site, "UTF-8").mkString
                                                  //> teamStr  : String = <!DOCTYPE html>
                                                  //| <html xmlns:fb="http://www.facebook.com/2008/fbml">
                                                  //| <head><script src="http://sports-ak.espn.go.com/sports/optimizely.js"></scri
                                                  //| pt><meta charset="iso-8859-1">
                                                  //| <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
                                                  //| <script type="text/javascript">    
                                                  //|     if(true && navigator && navigator.userAgent.toLowerCase().indexOf("teams
                                                  //| tream") >= 0) {
                                                  //|         window.location = 'http://a.m.espn.go.com/mobilecache/general/apps/s
                                                  //| c';
                                                  //|     }
                                                  //| </script>
                                                  //| 	<script>(function(){function e(e){e=e.replace(/[\[]/,"\\[").replace(/[\]
                                                  //| ]/,"\\]");var t=new RegExp("[\\?&]"+e+"=([^&#]*)"),n=t.exec(location.search)
                                                  //| ;return n==null?"":decodeURIComponent(n[1].replace(/\+/g," "))}var t=navigat
                                                  //| or.userAgent,n=window.location,r=document.cookie,i=document.referrer,s=i==="
                                                  //| "||i.indexOf(".go.com")!==-1,o=s?"http://m.espn.go.com/nfl/rankings?src=desk
                                                  //| top":"http://m.espn.go.com/nfl/rankings?src=desktop&rand=ref~
                                                  //| Output exceeds cutoff limit.


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
  teamRankings.size
  teamRankings                                    //> res1: scala.collection.immutable.Map[String,Int] = Map(Colts -> 7, Browns -
                                                  //| > 32, Rams -> 18, Giants -> 19, Redskins -> 28, Falcons -> 14, 49ers -> 3, 
                                                  //| Raiders -> 31, Bills -> 27, Packers -> 6, Lions -> 20, Dolphins -> 24, Pant
                                                  //| hers -> 11, Steelers -> 17, Eagles -> 9, Buccaneers -> 23, Bengals -> 10, C
                                                  //| hargers -> 16, Jaguars -> 30, Titans -> 25, Ravens -> 13, Texans -> 26, Sai
                                                  //| nts -> 5, Bears -> 12, Seahawks -> 1, Jets -> 21, Cardinals -> 8, Chiefs ->
                                                  //|  15, Broncos -> 2, Vikings -> 29, Cowboys -> 22, Patriots -> 4)
                                                  //> res2: Int = 32
  
    
}