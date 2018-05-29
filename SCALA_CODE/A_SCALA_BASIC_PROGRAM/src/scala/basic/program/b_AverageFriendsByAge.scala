package scala.basic.program
import org.apache.spark.sql.SparkSession
import org.apache.log4j.Level
import org.apache.log4j.Logger
object b_AverageFriendsByAge {
  /* THIS IS THE INPUT
  Name	  Age	NumberOfFriends
  Ajay	  23	13
  Raju	  23	20
  Rakesh	28	19
  Mahesh	27	16
  Rahul	  26	23
  Prakash	28	17
  Papu	  28	14
  */
  
  //OUTPUT
  /*
  23 AGE KE KITNEY LOG HAI --> (13 + 20) /2       33/2 = 16
  28 AGE KE KITNEY LOG HAI --> (19 + 17 + 14)/2		50/3 = 16
  
   */
  def parseLine(line: String) = {
    val fields = line.split("	")
    //println("fields :: " + fields)
    val age = fields(1).toInt;
    //println("age :: " + age)
    val noOfFriends = fields(2).toInt;
    //println("noOfFriends :: " + noOfFriends)
    (age, noOfFriends);
  }
  def main(args: Array[String]): Unit = {
        Logger.getLogger("org").setLevel(Level.ERROR)

    val sc = SparkSession.builder().appName("avg").master("local").getOrCreate().sparkContext
    val lineRDD = sc.textFile("./input_data/friendsDetails.txt")
    
    println("lineRDD :: " + lineRDD);
    lineRDD.foreach(println);
    
    val filteredDataRDD = lineRDD.filter { 
              x => !x.contentEquals("Name	Age	NumberOfFriends") 
    }
    
    println("filteredDataRDD :: " + filteredDataRDD);
    filteredDataRDD.foreach(println);
    
    val lines = filteredDataRDD.map { parseLine }
    //(23,13)
    println("lines :: " + lines);
    lines.foreach(println)
    
    val mappedValues = lines.mapValues { x => (x, 1) };
        //    mappedValues.foreach(println);
    //(23,(13,1))
    //(23,(20,1))
    //(28,(19,1))
    //(27,(16,1))
    //(26,(23,1))
    //(28,(17,1))
    //(28,(14,1))
    
    println("mappedValues :: " + mappedValues)
    mappedValues.foreach(println)
    
    val totalsByAge = mappedValues.reduceByKey((x, y) => (x._1 + y._1, x._2 + y._2));
    println("totalsByAge :: " + totalsByAge);
    totalsByAge.foreach(println);
    val result = totalsByAge.mapValues(x => x._1 / x._2);
    result.foreach(println);
  }

}