import java.io._

package object fileWriter {
	def fileWriterFun(filename: String, rankStr: String) = {
      //val writer = new PrintWriter(new File("C:/Users/James/Desktop/git-workspace/NFLRankingsFetcher/NFLRankingsFetcher/data/" + filename + ".txt" ))
      val writer = new PrintWriter(new File("C:/Users/fligh_000/Desktop/git-workspace/NFLRankingsFetcher/NFLRankingsFetcher/data/" + filename + ".txt"))
      writer.write(rankStr)
      writer.close()
    }
	
	def testFun = "this worked"
}