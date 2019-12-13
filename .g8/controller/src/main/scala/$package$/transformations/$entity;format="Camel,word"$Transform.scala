package $package$.transformations

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.{col, concat_ws}

/** You must have an artifact com.tenant.project.io.schemas */
case class Person(name:String, lastname: String, phone:String)

/***************************************************************
 *      THIS IS A TEMPLATE (with a simple transformation)
 ***************************************************************
 */
object $entity;format="Camel,word"$Transform {

  /** Best practice for variety of schemas */
  def with$entity$Id( field1: String ="name",
                      field2: String ="lastname",
                      phone: String="phone"
                  )(df: DataFrame): DataFrame = {
    df.withColumn("$entity$_id",
      concat_ws("-", col(field1), col(field2), col(phone))
    )
  }
  // used as follow: sourceDF.transform(with$entity$Id())
  // used as follow: sourceDF.transform(with$entity$Id("name", "lastname", "addressStr"))
}