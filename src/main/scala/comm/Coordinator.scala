package comm

object Coordinator {
  def main(args: Array[String]): Unit = {
    val r = scala.util.Random
    while (true){
      val latitudeDeg: Int = -90 + r.nextInt(180)
      val latitudeMin : Int = r.nextInt(60)
      val latitudeSec : Double = s"${r.nextInt(60)}.${r.nextInt(9999)}".toDouble
      val longitudeDeg : Int = -180 + r.nextInt(360)
      val longitudeMin : Int = r.nextInt(60)
      val longitudeSec : Double = s"${r.nextInt(60)}.${r.nextInt(9999)}".toDouble
      val latDecimal : Double = f"${latitudeDeg + latitudeMin/60 + latitudeSec/3600}%1.6f".toDouble
      val longDecimal : Double = f"${longitudeDeg + longitudeMin/60 + longitudeSec/3600}%1.6f".toDouble
      println(s"$latDecimal,$longDecimal,$latitudeDeg,$latitudeMin,$latitudeSec,$longitudeDeg,$longitudeMin,$longitudeSec")
      Thread.sleep(1000)
    }
  }
}
