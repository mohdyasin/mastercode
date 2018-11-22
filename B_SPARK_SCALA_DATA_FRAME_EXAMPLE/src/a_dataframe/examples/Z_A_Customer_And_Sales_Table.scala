package a_dataframe.examples

import org.apache.spark.SparkConf
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger
object Z_InterviewQuestion {

  case class Person(id: Int, name: String, age: Int, numOfFriends: Int);

  case class Employee(name: String, age: Int, depId: String)
  case class Department(id: String, name: String)

  def myInc(input:Double) = input + 100000.0
      
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = new SparkContext("local", "Csv loading example")
      val sqlContext = new org.apache.spark.sql.SQLContext(sc)
      
      val salesDF = sqlContext.load("com.databricks.spark.csv", Map("path" -> "G:\\MY_NOTES-1.0.1\\MY_CODE_STUFF_RUN\\SCALA_SPARK_WORKSPACE\\B_SPARK_SCALA_DATA_FRAME_EXAMPLE\\datasets\\sales.csv", "header" -> "true"))
      salesDF.printSchema()
      salesDF.createOrReplaceTempView("sales")
    
      val customerDF = sqlContext.load("com.databricks.spark.csv", Map("path" -> "G:\\MY_NOTES-1.0.1\\MY_CODE_STUFF_RUN\\SCALA_SPARK_WORKSPACE\\B_SPARK_SCALA_DATA_FRAME_EXAMPLE\\datasets\\customer.csv", "header" -> "true"))
      customerDF.printSchema()
      customerDF.createOrReplaceTempView("customer")
      
      sqlContext.sql("select customerId, customerName from customer").show()
      
      salesDF.join(customerDF, "customerId").show();
    
      sqlContext.udf.register("incBy50", myInc _);
      
      val results = sqlContext.sql("select customerId, incBy50(amountPaid) from sales")
      
      
      
      results.show();
      //Or 
      //salesDF.join(customerDF, salesDF("customerId") === customerDF("customerId"), "inner").show();
      
      
      /*
      val aggDF = sqlContext.sql("select sum(amountPaid) from sales")
      println(aggDF.collectAsList())
      
      salesDF.select("itemId").show();
    
      salesDF.select("itemId").agg(("itemId","sum")).show()
    */  
  }

}