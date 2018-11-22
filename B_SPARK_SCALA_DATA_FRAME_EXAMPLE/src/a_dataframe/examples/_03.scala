package com.npntraining.examples

import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object _03 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("Small")
    val sc = new SparkContext(conf);
    val sqlContext = new SQLContext(sc);
    val employeeDF = sqlContext.read.json("G:/MY_NOTES-1.0.1/MY_CODE_STUFF_RUN/SCALA_SPARK_WORKSPACE/B_SPARK_SCALA_DATA_FRAME_EXAMPLE/datasets/employee.json");
    employeeDF.registerTempTable("employee");
    val employeeData = sqlContext.sql("select name,address.state from employee");
    employeeData.collect().foreach(println);
    val stateData = sqlContext.sql("select name,address.state from employee where address.state='California'");
    stateData.collect().foreach(println);
  }
}