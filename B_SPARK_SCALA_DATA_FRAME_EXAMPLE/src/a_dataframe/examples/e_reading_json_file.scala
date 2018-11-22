package a_dataframe.examples
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.log4j.Level
import org.apache.log4j.Logger

object e_reading_json_file {
  def main(args: Array[String]): Unit = {
        Logger.getLogger("org").setLevel(Level.ERROR)

    val conf = new SparkConf().setMaster("local[*]").setAppName("Small")
    val sc = new SparkContext(conf);
    val sqlContext = new SQLContext(sc);
    val employeeDF = sqlContext.read.json("./datasets/employee.json");
    employeeDF.registerTempTable("employee");
    val employeeData = sqlContext.sql("select name,address.state from employee");
    employeeData.collect().foreach(println);
    val stateData = sqlContext.sql("select name,address.state from employee where address.state='California'");
    stateData.collect().foreach(println);
  }
}