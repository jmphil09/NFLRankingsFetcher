import scala.io.Source
import java.io._

object initializeTeams {
  def fileWriter(filename: String, rankStr: String) = {
    //val writer = new PrintWriter(new File("C:/Users/James/Desktop/git-workspace/NFLRankingsFetcher/NFLRankingsFetcher/data/" + filename + ".txt" ))
    val writer = new PrintWriter(new File("C:/Users/fligh_000/Desktop/git-workspace/NFLRankingsFetcher/NFLRankingsFetcher/data/" + filename + ".txt"))
    writer.write(rankStr)
    writer.close()
  }                                               //> fileWriter: (filename: String, rankStr: String)Unit

  

	//need to go through each text file and add appropriate ranking for each one of the teams

	var teamString = new String               //> teamString  : String = ""
	teamString += "int RCardinals [19]= {0, 26, 25, 21, 22, 19, 19, 21, 24, 17, 17, 16, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RFalcons [19]= {0, 2, 4, 6, 14, 16, 22, 23, 20, 23, 26, 29, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RRavens [19]= {0, 8, 11, 11, 11, 14, 9, 12, 14, 15, 21, 18, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RBills [19]= {0, 30, 29, 26, 24, 23, 23, 25, 21, 20, 23, 26, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RPanthers [19]= {0, 23, 24, 27, 21, 21, 26, 24, 18, 12, 12, 6, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RBears [19]= {0, 14, 9, 9, 4, 9, 10, 10, 13, 14, 9, 11, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RBengals [19]= {0, 9, 10, 10, 6, 11, 8, 8, 7, 7, 8, 10, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RBrowns [19]= {0, 28, 30, 31, 25, 20, 16, 18, 22, 21, 18, 19, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RCowboys [19]= {0, 18, 13, 15, 15, 18, 15, 13, 10, 13, 13, 15, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RBroncos [19]= {0, 4, 3, 2, 2, 1, 1, 1, 3, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RLions [19]= {0, 21, 18, 18, 16, 10, 12, 11, 11, 10, 10, 9, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RPackers [19]= {0, 5, 7, 5, 12, 12, 11, 9, 9, 8, 11, 13, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RTexans [19]= {0, 7, 6, 4, 13, 15, 17, 22, 26, 28, 28, 28, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RColts [19]= {0, 11, 12, 14, 9, 6, 4, 6, 4, 3, 2, 7, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RJaguars [19]= {0, 29, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RChiefs [19]= {0, 19, 20, 13, 8, 5, 3, 2, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RDolphins [19]= {0, 20, 17, 12, 7, 7, 13, 14, 16, 19, 19, 22, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RVikings [19]= {0, 17, 21, 23, 26, 24, 28, 29, 30, 30, 30, 30, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RPatriots [19]= {0, 6, 5, 7, 5, 4, 6, 5, 8, 9, 7, 5, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RSaints [19]= {0, 13, 8, 8, 3, 3, 2, 3, 5, 5, 6, 4, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RGiants [19]= {0, 12, 16, 20, 29, 30, 31, 31, 29, 29, 29, 25, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RJets [19]= {0, 32, 27, 28, 18, 22, 18, 20, 15, 16, 14, 12, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RRaiders [19]= {0, 31, 31, 29, 30, 28, 24, 26, 28, 22, 24, 27, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int REagles [19]= {0, 25, 14, 19, 23, 27, 21, 17, 19, 26, 20, 14, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RSteelers [19]= {0, 16, 23, 25, 28, 29, 29, 27, 25, 27, 27, 24, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RRams [19]= {0, 15, 15, 17, 20, 26, 25, 19, 27, 25, 25, 20, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RChargers [19]= {0, 24, 26, 16, 19, 17, 20, 15, 12, 11, 15, 17, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RFortyNiners [19]= {0, 3, 1, 3, 10, 8, 7, 7, 6, 6, 5, 8, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RSeahawks [19]= {0, 1, 2, 1, 1, 2, 5, 4, 4, 4, 4, 3, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RBuccaneers [19]= {0, 22, 28, 30, 31, 31, 30, 30, 31, 31, 31, 31, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RTitans [19]= {0, 27, 22, 22, 17, 13, 14, 16, 17, 18, 16, 21, 0, 0, 0, 0, 0, 0, 0};\n"
	teamString += "int RRedskins [19]= {0, 10, 19, 24, 27, 25, 27, 28, 23, 24, 22, 23, 0, 0, 0, 0, 0, 0, 0};\n"

teamString                                        //> res0: String = "int RCardinals [19]= {0, 26, 25, 21, 22, 19, 19, 21, 24, 17
                                                  //| , 17, 16, 0, 0, 0, 0, 0, 0, 0};
                                                  //| int RFalcons [19]= {0, 2, 4, 6, 14, 16, 22, 23, 20, 23, 26, 29, 0, 0, 0, 0,
                                                  //|  0, 0, 0};
                                                  //| int RRavens [19]= {0, 8, 11, 11, 11, 14, 9, 12, 14, 15, 21, 18, 0, 0, 0, 0,
                                                  //|  0, 0, 0};
                                                  //| int RBills [19]= {0, 30, 29, 26, 24, 23, 23, 25, 21, 20, 23, 26, 0, 0, 0, 0
                                                  //| , 0, 0, 0};
                                                  //| int RPanthers [19]= {0, 23, 24, 27, 21, 21, 26, 24, 18, 12, 12, 6, 0, 0, 0,
                                                  //|  0, 0, 0, 0};
                                                  //| int RBears [19]= {0, 14, 9, 9, 4, 9, 10, 10, 13, 14, 9, 11, 0, 0, 0, 0, 0, 
                                                  //| 0, 0};
                                                  //| int RBengals [19]= {0, 9, 10, 10, 6, 11, 8, 8, 7, 7, 8, 10, 0, 0, 0, 0, 0, 
                                                  //| 0, 0};
                                                  //| int RBrowns [19]= {0, 28, 30, 31, 25, 20, 16, 18, 22, 21, 18, 19, 0, 0, 0, 
                                                  //| 0, 0, 0, 0};
                                                  //| int RCowboys [19]= {0, 18, 13, 15, 15, 18, 15, 13, 10, 13, 13, 15, 0, 0, 0,
                                                  //|  0, 0, 0, 0};
                                                  //| int RBroncos [19]= {0, 4, 3, 2, 2, 1, 1, 1, 3, 2, 3, 2, 0, 0, 0, 0, 0, 0, 0
                                                  //| };
                                                  //| int RLions 
                                                  //| Output exceeds cutoff limit.
fileWriter("2014TeamRank", teamString)
}