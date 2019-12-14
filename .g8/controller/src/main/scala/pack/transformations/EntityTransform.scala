package pack.transformations

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.{col, concat_ws}

/** Your model should be in a separated archifact io.schemas */
case class Entity(name:String, lastname: String, phone:String)

/***************************************************************
 *      THIS IS A TEMPLATE (with a simple transformation)
 ***************************************************************
 */
object EntityTransform {
  /** Best practice for variety of schemas */
  def withEntityId(field1: String ="name",
                   field2: String ="lastname",
                   phone: String="phone"
                  )(df: DataFrame): DataFrame = {
    df.withColumn("entity_id",
                  concat_ws("-", 
                  col(field1), 
                  col(field2), 
                  col(phone))
                  )
  }
  // used as follow: sourceDF.transform(withEntityId())
  // used as follow: sourceDF.transform(withEntityId("name", "lastname", "addressStr"))
}