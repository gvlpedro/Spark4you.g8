package $package$.driver

/**  Please abstract ETL transformation to change INPUT/OUTPUT
 * INPUT --> ETL --> OUTPUT
 */
class MainEtl extends SparkSessionWrapper {
  def getInput(): DataFrame = ??? // Input will be loaded from CsvReader, JsonReader, XmlReader...
  val sourceDF=getInput()
  sourceDF.transform(TransformationPersonId.withPersonId())

  // finally you can use a io.schemas code SinkDatalakeWriter, SinkJdbcWriter ...
}

object Main extends App{
  println("hi")
}