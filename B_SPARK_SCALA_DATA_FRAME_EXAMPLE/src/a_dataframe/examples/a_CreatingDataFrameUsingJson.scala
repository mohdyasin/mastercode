package a_dataframe.examples
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.spark.sql.functions._
object CreatingDataFrameUsingJson {

  def main(args: Array[String]): Unit = {

    Logger.getLogger("org").setLevel(Level.ERROR)
    val sparkSession = SparkSession.builder().master("local").appName("Simple Job").getOrCreate();
    //create the data frame using SparkSession (data frame = rdd + schema )
    val empDF = sparkSession.read.json("./datasets/example01/customer-data.json");
    println("empDF.show()");
    empDF.show()
    
    println("empDF.printSchema()");
    empDF.printSchema()
    
    println("empDF.select(\"name", "\"salary\").show()");
    empDF.select("name", "salary").show()

    //Filter example
    println("empDF.filter(empDF(\"age\") === 40).show()");
    empDF.filter(empDF("age") === 40).show()

    //Group By example
    println("empDF.groupBy(\"gender\").count().show()");
    empDF.groupBy("gender").count().show()
    
    //Aggregate example
    println("empDF.groupBy(\"deptid\").agg(avg(empDF(\"salary\")), max(empDF(\"age\"))).show()");
    
    empDF.groupBy("deptid").agg(avg(empDF("salary")), max(empDF("age"))).show()
  }

}