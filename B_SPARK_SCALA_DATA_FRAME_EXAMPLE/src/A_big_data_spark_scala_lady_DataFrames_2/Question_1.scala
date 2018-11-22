package A_big_data_spark_scala_lady_DataFrames_2
import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.IntegerType
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.types.BooleanType
import org.apache.spark.sql.functions._
object Question_1 {
  def main(args: Array[String]) {
    // SET THE LOG LEVEL TO ONLY PRINT ERRORS
    Logger.getLogger("org").setLevel(Level.ERROR)

    // CREATE SPARK SESSION
    val spark = SparkSession.builder.master("local").getOrCreate()
    import spark.implicits._

    // CREATE SCHEMA
    val abosDFSchema = StructType(Array(
      StructField("id", IntegerType, true),
      StructField("lastName", StringType, true),
      StructField("typeOfSub", StringType, true)))
      
    val locationsDFSchema = StructType(Array(
      StructField("id", IntegerType, true),
      StructField("city", StringType, true)))

    // LOAD DATA
    val abosDF = spark.read.format("csv").option("header", "true").schema(abosDFSchema)
      .csv("G:\\MY_NOTES-1.0.1\\MY_CODE_STUFF_RUN\\SCALA_SPARK_WORKSPACE\\B_SPARK_SCALA_DATA_FRAME_EXAMPLE\\datasets\\bigdata_spark_lady\\abos.txt");

    // LOAD DATA
    val locationsDF = spark.read.format("csv").option("header", "true").schema(locationsDFSchema)
      .csv("G:\\MY_NOTES-1.0.1\\MY_CODE_STUFF_RUN\\SCALA_SPARK_WORKSPACE\\B_SPARK_SCALA_DATA_FRAME_EXAMPLE\\datasets\\bigdata_spark_lady\\locations.txt");

    
    // PRINT SCHEMA
    abosDF.select("id","lastName","typeOfSub").show();
    locationsDF.select("id","city").show();
    
    abosDF.join(locationsDF, abosDF("id")=== locationsDF("id")).show();
    abosDF.join(locationsDF, abosDF("id")=== locationsDF("id"), "left_outer").show();
    abosDF.join(locationsDF, abosDF("id")=== locationsDF("id"), "right_outer").show();

  }
}