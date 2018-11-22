package a_dataframe.examples

import org.apache.spark.SparkConf
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger
object d_ConvertingRDDTODataFrame {

  case class Person(id: Int, name: String, age: Int, numOfFriends: Int);

  def convertToDomainObj(line: String): Person = {
    val fields = line.split(",");
    val person: Person = Person(fields(0).toInt, fields(1), fields(2).toInt, fields(3).toInt);
    return person;
  }

  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val conf = new SparkConf().setMaster("local[*]").setAppName("Word Count");
    val sparkSession = SparkSession.builder().config(conf).getOrCreate();

    val sc = sparkSession.sparkContext;
    val lines = sc.textFile("G:/MY_NOTES-1.0.1/MY_CODE_STUFF_RUN/SCALA_SPARK_WORKSPACE/B_SPARK_SCALA_DATA_FRAME_EXAMPLE/datasets/fakefriends.csv");
    val people = lines.map { line => convertToDomainObj(line) }

    // Infer the schema, and register the DataSet as a table.
    import sparkSession.implicits._
    val schemaPeople = people.toDF();
    schemaPeople.printSchema()
    schemaPeople.createOrReplaceTempView("people")
    //   sparkSession.sql("SELECT * FROM people").show()
    // SQL can be run over DataFrames that have been registered as a table
    val teenagers = sparkSession.sql("SELECT * FROM people WHERE age >= 13 AND age <= 19")

    val results = teenagers.collect()

    results.foreach(println)

    sparkSession.stop()
  }

}