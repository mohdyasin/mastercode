package a_dataframe.examples
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.spark.sql.functions._
import org.apache.spark.sql.functions._

object c_JoinsOperationsExample {
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val conf = new SparkConf().setMaster("local[*]").setAppName("Simple Join Operation");
    val sparkSession = SparkSession.builder().config(conf).getOrCreate();

    val orderDFReader = sparkSession.read.format("csv");
    orderDFReader.option("header", "true");
    orderDFReader.option("inferSchema", "true");
    orderDFReader.option("delimiter", "|")
    val orderDF = orderDFReader.csv("./datasets/order-details.csv");

    val customerDFReader = sparkSession.read.format("csv");
    customerDFReader.option("header", "true");
    customerDFReader.option("inferSchema", "true");
    customerDFReader.option("delimiter", "|")
    val customerDF = customerDFReader.csv("./datasets/customer-details.csv");
    val join = orderDF.join(customerDF);
    join.groupBy(orderDF("Cust_Id")).sum("Amount").orderBy(desc("sum(Amount)")) show ();

  }
}