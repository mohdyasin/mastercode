package merging.tow.rdd

import org.apache.spark.SparkConf
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger

object MerginTwoRDD {
  
  
  def main(args: Array[String]): Unit = {
    
    Logger.getLogger("org").setLevel(Level.ERROR)
    val conf = new SparkConf().setMaster("local[*]").setAppName("Word Count");
    val sparkSession = SparkSession.builder().config(conf).getOrCreate();

    val sc = sparkSession.sparkContext;
    val lines = sc.textFile("G:/MY_NOTES-1.0.1/MY_CODE_STUFF_RUN/SCALA_SPARK_WORKSPACE/B_SPARK_SCALA_DATA_FRAME_EXAMPLE/datasets/sales-hm.csv");
    //lines.foreach(println)
   val lines1 = sc.textFile("G:/MY_NOTES-1.0.1/MY_CODE_STUFF_RUN/SCALA_SPARK_WORKSPACE/B_SPARK_SCALA_DATA_FRAME_EXAMPLE/datasets/sales-hm_1.csv");
   
   lines.subtract(lines1).foreach(println)
   
  }

}
