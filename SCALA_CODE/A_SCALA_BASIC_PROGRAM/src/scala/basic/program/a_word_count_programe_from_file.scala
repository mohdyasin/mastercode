package scala.basic.program
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.spark.sql.SparkSession

object a_word_count_programe_from_file {
  
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)

    val sc = SparkSession.builder().appName("array").master("local").getOrCreate().sparkContext
    val txtRDD = sc.textFile("./input_data/arrays_data.txt")
    println("txtRDD :: " + txtRDD);
    println("txtRDD.foreach(println)");
    txtRDD.foreach(println);

    //split the documents into words in one long list
    val words = txtRDD.flatMap(x => x.split("\t"))
    println("words :: " + words);
    words.foreach(println);

    // give each word a count of 1
    val wordT = words.map(x => (x, 1))
    //sum up the counts for each word
    println("wordT :: " + wordT);
    wordT.foreach(println);

    val wordCount = wordT.reduceByKey((a, b) => a + b)
    println("wordCount :: " + wordCount);
    wordCount foreach println ;
    //txtRDD.saveAs
  }
}