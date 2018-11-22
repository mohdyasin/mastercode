package a_dataframe.examples
import org.apache.spark.SparkConf
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger

object Z_DZONE_FIRE_CELL_EXAMPLE {

  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = new SparkContext("local", "Csv loading example")
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)

    val sfoDF = sqlContext.load("com.databricks.spark.csv", Map("path" -> "C:\\Users\\Dell\\Desktop\\SPARK_D_P\\SPARK_FSO_DATA\\Fire_Department_Calls_for_Service.csv", "header" -> "true"))
    sfoDF.printSchema()
    sfoDF.createOrReplaceTempView("sales")
    println(sfoDF.count());

    val distinctTypesOfCallsDF = sfoDF.select("Call Type").distinct()
    distinctTypesOfCallsDF.collect().foreach(println)
  }

}