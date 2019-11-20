package com.xwsoft

import org.apache.spark.sql.SparkSession

/**
 * Test
 *
 */
object App {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local").appName("App").getOrCreate()
    import spark.implicits._
    val df = Seq(
      (1, "First Value", java.sql.Date.valueOf("2019-11-01")),
      (2, "Second Value", java.sql.Date.valueOf("2019-11-01"))
    ).toDF("int_column", "string_column", "date_column")
    df.show()
  }
}
