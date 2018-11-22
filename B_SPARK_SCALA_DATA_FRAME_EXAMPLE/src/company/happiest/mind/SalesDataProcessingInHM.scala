package company.happiest.mind
import org.apache.spark.SparkConf
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger

object SalesDataProcessingInHM {
  
  def main(args: Array[String]): Unit = {
    
    Logger.getLogger("org").setLevel(Level.ERROR)
    val conf = new SparkConf().setMaster("local[*]").setAppName("Word Count");
    val sparkSession = SparkSession.builder().config(conf).getOrCreate();

    val sc = sparkSession.sparkContext;
    val lines = sc.textFile("G:/MY_NOTES-1.0.1/MY_CODE_STUFF_RUN/SCALA_SPARK_WORKSPACE/B_SPARK_SCALA_DATA_FRAME_EXAMPLE/datasets/sales-hm.csv");
    //lines.foreach(println)


    val header = lines.first() //extract header
    val data = lines.filter(row => row != header)   //filter out header
    val data1 = data.map{
      row => 
        val rec = row.split(",");
        (rec(1),(rec(2).toInt * rec(3).toInt)); 
    };
    data1.reduceByKey(_+_).foreach(println);
    //data.foreach(println)
    
    sparkSession.stop()
  
  }
}