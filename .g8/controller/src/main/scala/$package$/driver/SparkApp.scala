package $package$.driver

trait SparkSessionWrapper extends Serializable {
  lazy val spark: SparkSession = {
    SparkSession
      .builder()
      .master("local")
      .appName("$projectname$")
      .getOrCreate()
  }
}