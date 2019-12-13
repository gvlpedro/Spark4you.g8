package $package$.driver


class MainEtl extends SparkSessionWrapper {
  // Use your io.schemas for implement CsvReader, JsonReader, XmlReader...
  def getInput(): DataFrame = ??? 
  val sourceDF=getInput()
  sourceDF.transform($entity;format="Camel,word"$Transform.with$entity$Id())
}

object Main extends App{
  log.info("Starting $entity;format="Camel,word"$ Transformation ...")
  
}