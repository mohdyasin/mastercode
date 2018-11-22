package a_big_data_and_spark_application
import org.apache.log4j._
import org.apache.spark.sql.SparkSession

import java.text.SimpleDateFormat
import java.sql.Date
import org.apache.spark.sql.types._
object C_DataFrame {
  case class Employee(id: Int, fname: String, lname: String, age: Int, city: String);

  def main(args: Array[String]): Unit = {

    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = SparkSession.builder().appName("array").master("local").getOrCreate().sparkContext

    val purchasesPerMonth = sc.parallelize(List(
      Employee(1001, "FN1", "LN1", 25, "BNG1"),
      Employee(1002, "FN2", "LN2", 25, "BNG2"),
      Employee(1003, "FN3", "LN3", 25, "BNG3"),
      Employee(1004, "FN4", "LN4", 25, "BNG4"),
      Employee(1005, "FN5", "LN5", 25, "BNG5")));

    //val purchasesPerMonthDF = purchasesPerMonth.toDF;

  }
}