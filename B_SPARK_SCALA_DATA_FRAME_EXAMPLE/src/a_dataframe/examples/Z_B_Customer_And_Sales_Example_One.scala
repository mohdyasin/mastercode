package a_dataframe.examples
import org.apache.spark.SparkConf
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger

object Z_A_InterviewQuestion_Two {
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
      
      val salesResults = sqlContext.sql("select customerId, amountPaid from sales")
    	val customerResults = sqlContext.sql("select customerId,	customerFirstName, customerMiddleName,	customerLastName from customer")
      println(":::::::::::::Sales Results::::::::::::::");
    	salesResults.show();
    	
    	println(":::::::::::::Customer Results::::::::::::::");
      customerResults.show();
      //customerResults.withColumn("D", lit(750)).show()
      import org.apache.spark.sql.functions.{col, lit, when}
      import org.apache.spark.sql.functions.{concat, lit}
      //customerResults.select(concat(col("customerFirstName"), lit(" "), col("customerLastName"))).show()
      println(customerResults.withColumn("Full Name", concat(col("customerFirstName"), lit(" "), col("customerLastName"))).count());
      val myExpression = "x+y"

      import org.apache.spark.sql.functions._
       import org.apache.spark.sql.functions._
       //customerResults.withColumn("D", expr(col("customerFirstName"))).show();
      //customerResults.withColumn("z",expr(myExpression)).show()
      
  }
}