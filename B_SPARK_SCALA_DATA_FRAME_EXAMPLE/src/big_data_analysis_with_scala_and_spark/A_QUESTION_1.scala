package big_data_analysis_with_scala_and_spark

import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import java.text.SimpleDateFormat
import java.sql.Date


object A_QUESTION_1 {
  
  case class CFFPurchase(customerId:Int, destination:String, price:Double);

  def main(args: Array[String]): Unit = {
    
    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = SparkSession.builder().appName("array").master("local").getOrCreate().sparkContext
    val r1 = List((11, 10000), (11, 20000), (12, 30000), (12, 40000), (13, 5000));
    val r2 = List((11, "Hyd"), (12, "Del"), (13, "Hyd"));

   
    
    val purchasesPerMonth = sc.parallelize(List(
        CFFPurchase(100,"Geneva", 22.25),
        CFFPurchase(300,"Zurich",42.10),
        CFFPurchase(100,"Fribourg",12.40),
        CFFPurchase(200,"St. Gallen", 8.20),
        CFFPurchase(100,"Lucerne",31.60),
        CFFPurchase(300,"Basel",16.20)
        ));  
    
    val one = purchasesPerMonth.map(p => (p.customerId, p.price));
    one.foreach(println);
    val two = one.groupByKey();
    two.foreach(println);
    val three = two.map(p=> (p._1, (p._2.size, p._2.sum))).collect();
    three.foreach(println);
   
  }
}

