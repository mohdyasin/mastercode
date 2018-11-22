package A_big_data_spark_scala_lady_DataFrames_2
import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.IntegerType
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.types.BooleanType
import org.apache.spark.sql.functions._
object Question_2 {
  def main(args: Array[String]) {
    // SET THE LOG LEVEL TO ONLY PRINT ERRORS
    Logger.getLogger("org").setLevel(Level.ERROR)

    // CREATE SPARK SESSION
    val spark = SparkSession.builder.master("local").getOrCreate()

    // CREATE SCHEMA
    val employeeSchema = StructType(Array(
      StructField("street", StringType, true),
      StructField("zip", StringType, true),
      StructField("price", IntegerType, true)
      ))

    // LOAD DATA
    val listingDF = spark.read.format("csv").option("header", "true").schema(employeeSchema)
      .csv("G:\\MY_NOTES-1.0.1\\MY_CODE_STUFF_RUN\\SCALA_SPARK_WORKSPACE\\B_SPARK_SCALA_DATA_FRAME_EXAMPLE\\datasets\\bigdata_spark_lady\\listhome.txt");

    // PRINT SCHEMA
    listingDF.printSchema()
    import spark.implicits._
    //The only difference is if you will do lot of this like multiple and condition spark query optimizer optimized the query
    listingDF.groupBy($"zip").max("price").show();
    
  }
}