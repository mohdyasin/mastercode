package A_DATA_FRAME_API_WITH_EMPLOYEE

import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.IntegerType
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.types.BooleanType
import org.apache.spark.sql.functions._
object B_AUTHOR_DATAFRAME_EXAMPLE {
  def main(args: Array[String]) {
    // SET THE LOG LEVEL TO ONLY PRINT ERRORS
    Logger.getLogger("org").setLevel(Level.ERROR)

    // CREATE SPARK SESSION
    val spark = SparkSession.builder.master("local").getOrCreate()

    // CREATE SCHEMA
    
    val authorSchema = StructType(Array(
      StructField("authorID", IntegerType, true), 
      StructField("subforum", StringType, true), 
      StructField("likes", StringType, true)
      ))

    // LOAD DATA
    val authorDF = spark.read.format("csv").option("header", "true").schema(authorSchema)
      .csv("C:\\Users\\Dell\\Desktop\\SPARK_D_P\\big_data_analysis_with_scala_and_spark\\author.txt");

    // PRINT SCHEMA
    authorDF.printSchema()
    authorDF.orderBy("authorID").show();
    authorDF.groupBy("authorID", "subforum").agg(count("authorID")).show();
  }
}