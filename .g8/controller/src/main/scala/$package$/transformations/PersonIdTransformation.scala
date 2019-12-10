package $package$.transformations

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.{col, concat_ws}

/** You must have an artifact com.tenant.project.io.schemas */
case class Person(name:String, lastname: String, phone:String)

/***************************************************************
 *      THIS IS A TEMPLATE (with a simple transformation)
 ***************************************************************
 */
object TransformationPersonId {

  /** Best practice for variety of schemas */
  def withPersonId( field1: String ="name",
                    field2: String ="lastname",
                    phone: String="phone"
                  )(df: DataFrame): DataFrame = {
    df.withColumn("person_id",
      concat_ws("-", col(field1), col(field2), col(phone))
    )
  }
  // used as follow: sourceDF.transform(withPersonId())
  // used as follow: sourceDF.transform(withPersonId("name", "lastname", "addressStr"))
}