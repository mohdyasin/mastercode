package a_dataframe.examples
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.spark.sql.functions._
object b_ReadingCSVData {
  
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val conf = new SparkConf().setAppName("Demo").setMaster("local");
    val sparkSession = SparkSession.builder().config(conf).getOrCreate();

    /* val sc = sparkSession.sparkContext
    sc.textFile("./datasets/employee.csv")*/
    
    val employeeDF = sparkSession.read.format("csv").option("header", "true").load("G:/MY_NOTES-1.0.1/MY_CODE_STUFF_RUN/SCALA_SPARK_WORKSPACE/B_SPARK_SCALA_DATA_FRAME_EXAMPLE/datasets/employee.csv");
    
//    employeeDF.show()
//     employeeDF.printSchema()
   /*val res = employeeDF.select("name", "salary")
   res.show()*/
    
    employeeDF.createOrReplaceTempView("empl");
    employeeDF.sqlContext.sql("select Name, Age from empl").show();
    //    employeeDF.sqlContext.sql("select City, (Temp *9 + 32)/5 as TempInFar from empl").show();

  }

}