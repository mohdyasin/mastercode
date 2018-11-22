package a_big_data_and_spark_application

import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import java.text.SimpleDateFormat
import java.sql.Date

object B_GroupByReduceByExample {
  case class CFFPurchase(customerId: Int, destination: String, price: Double);

  def main(args: Array[String]): Unit = {

    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = SparkSession.builder().appName("array").master("local").getOrCreate().sparkContext

    val purchasesPerMonth = sc.parallelize(List(
      CFFPurchase(100, "Geneva", 22.25),
      CFFPurchase(300, "Zurich", 42.10),
      CFFPurchase(100, "Fribourg", 12.40),
      CFFPurchase(200, "St. Gallen", 8.20),
      CFFPurchase(100, "Lucerne", 31.60),
      CFFPurchase(300, "Basel", 16.20)));

    val one = purchasesPerMonth.map(p => (p.customerId, (1, p.price)));

    println("one");
    one.foreach(println);
    val two = one.reduceByKey(((v1, v2) => (v1._1 + v2._1, v1._2 + v2._2)));
    println("two");
    two.foreach(println);
    val three = two.collect();
    println("three");
    three.foreach(println);
  }
}
