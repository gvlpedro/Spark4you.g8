package pack.transformations

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.{col, concat_ws}

/** Your model should be in a separated archifact io.schemas */
case class $entity;format="Camel"$(name:String, lastname: String, phone:String)

/***************************************************************
 *      THIS IS A TEMPLATE (with a simple transformation)
 ***************************************************************
 */
object $entity;format="Camel"$Transform {
  /** Best practice for variety of schemas */
  def with$entity;format="Camel"$Id(field1: String ="name",
                   field2: String ="lastname",
                   phone: String="phone"
                  )(df: DataFrame): DataFrame = {
    df.withColumn("$entity;format="lower"$_id",
                  concat_ws("-", 
                  col(field1), 
                  col(field2), 
                  col(phone))
                  )
  }
  // used as follow: sourceDF.transform(with$entity;format="Camel"$Id())
  // used as follow: sourceDF.transform(with$entity;format="Camel"$Id("name", "lastname", "addressStr"))
}