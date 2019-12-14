package pack.driver

class MainEtl extends SparkSessionWrapper {
  // Use your io.schemas for implement CsvReader, JsonReader, XmlReader...
  def getInput(): DataFrame = ??? 
  val sourceDF=getInput()
  sourceDF.transform(EntityTransform.withEntityId())
}

object Main extends App{
  log.info("Starting Entity Transformation ...")
  
}