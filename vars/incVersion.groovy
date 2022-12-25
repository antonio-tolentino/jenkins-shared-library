def String call( Map config=[:] ) {

  println ("debug = " + config.version)
  def pattern = ~/(\d{1,3})\.(\d{1,3})\.\d{1,4}$/



  switch(config.incType.toUpperCase()) {
    case "MAJOR":
      return config.version.replaceFirst(pattern) { _,major,minor,patch -> "${(major as int) + 1}.0.0"}
    case "MINOR":
      return  config.version.replaceFirst(pattern) { _,major,minor,patch -> "${major}.${(minor as int) + 1}.0"}
    case "PATCH":
      return config.version.replaceFirst(pattern) { _,major,minor,patch -> "${major}.${minor}.${(patch as int) + 1}"}
    default:
      return config.version
  }

  def newVersion = version.replaceFirst(pattern) { _,major,minor -> "${major}.${(patch as int) + 1}.0"}
}

