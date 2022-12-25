def String call( Map config=[:] ) {

  def pattern = ~/(\d)\.(\d)\.(\d)$/

  def String tt = config.version
  println ("debug = "+tt)
  return  tt.replaceFirst(pattern) { _,major,minor -> "${major}.${minor}.0"}

 
  //switch(config.incType.toUpperCase()) {
  //  case "MAJOR":
  //    return config.version.replaceFirst(pattern) { _,major,minor,patch -> "${(major as int) + 1}.0.0"}
  //  case "MINOR":
  //    return  config.version.replaceFirst(pattern) { _,major,minor,patch -> "${major}.${(minor as int) + 1}.0"}
  //  case "PATCH":
  //    return config.version.replaceFirst(pattern) { _,major,minor,patch -> "${major}.${minor}.${(patch as int) + 1}"}
  //  default:
  //    return config.version
  //}

}

