package handling.exception.spark

import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.IntegerType
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.types.BooleanType
import org.apache.spark.sql.functions._
import org.apache.spark.sql.DataFrame
import java.io.FileNotFoundException
import scala.util.Try
import scala.util.Failure
import scala.util.Success

object ExceptionHandlingInSparkDataFrame {
  def main(args: Array[String]) {
    // SET THE LOG LEVEL TO ONLY PRINT ERRORS
    Logger.getLogger("org").setLevel(Level.ERROR)
    createDataFrame("C:\\Users\\Dell\\Desktop\\SPARK_D_P\\SPARK_FSO_DATA\\Fire_Department_Calls_for_Service.csv") match {
      case Success(df) => {
        // proceed with your pipeline
        df.printSchema()
      }
      case Failure(ex) => //handle exception
    }

  }

  def createDataFrame(fileName: String): Try[DataFrame] = {

    try {
      val fireServiceCallSchema = StructType(Array(
        StructField("CallNumber", IntegerType, true), StructField("UnitID", StringType, true), StructField("IncidentNumber", IntegerType, true),
        StructField("CallType", StringType, true), StructField("CallDate", StringType, true), StructField("WatchDate", StringType, true),
        StructField("ReceivedDtTm", StringType, true), StructField("EntryDtTm", StringType, true), StructField("DispatchDtTm", StringType, true),
        StructField("ResponseDtTm", StringType, true), StructField("OnSceneDtTm", StringType, true), StructField("TransportDtTm", StringType, true),
        StructField("HospitalDtTm", StringType, true), StructField("CallFinalDisposition", StringType, true), StructField("AvailableDtTm", StringType, true),
        StructField("Address", StringType, true), StructField("City", StringType, true), StructField("ZipcodeOfIncident", IntegerType, true),
        StructField("Battalion", StringType, true), StructField("StationArea", StringType, true), StructField("Box", StringType, true),
        StructField("OriginalPriority", StringType, true), StructField("Priority", StringType, true), StructField("FinalPriority", IntegerType, true),
        StructField("ALSUnit", BooleanType, true), StructField("CallTypeGroup", StringType, true), StructField("NumberOfAlarms", IntegerType, true), StructField("UnitType", StringType, true),
        StructField("UnitSequenceInCallDispatch", IntegerType, true), StructField("FirePreventionDistrict", StringType, true),
        StructField("SupervisorDistrict", StringType, true), StructField("NeighborhooodsDistrict", StringType, true),
        StructField("Location", StringType, true), StructField("RowID", StringType, true)))
      val spark = SparkSession.builder.master("local").getOrCreate()
      val df = spark.read.format("csv").option("header", "true").schema(fireServiceCallSchema).csv(fileName)
      Success(df)
    } catch {
      case ex: FileNotFoundException => {
        println(s"File $fileName not found")
        Failure(ex)
      }
      case unknown: Exception => {
        println(s"Unknown exception: $unknown")
        Failure(unknown)
      }
    }
  }
}