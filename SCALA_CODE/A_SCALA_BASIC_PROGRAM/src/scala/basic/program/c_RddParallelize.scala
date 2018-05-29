package scala.basic.program
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger
object c_RddParallelize {

  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)
		val conf = new SparkConf().setAppName("colection").setMaster("local")
		val session = SparkSession.builder().config(conf).getOrCreate()
		val sc = session.sparkContext
		
    val data = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("data :: " + data);
		
    val collectionRDD = sc.parallelize(data)
    println("collectionRDD :: " + collectionRDD);
    
    val sumOfArrayElmnt = collectionRDD.sum()
    println("sumOfArrayElmnt :: " + sumOfArrayElmnt);
    
    val sums = collectionRDD.reduce((x, y) => x + y) //Check y cant we use reduceByKey here
    println("sums :: " + sums)
    println("sumOfArrayElmnt :: " + sumOfArrayElmnt)
    println(sumOfArrayElmnt / 10)
  }

}