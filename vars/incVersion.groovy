def String call( Map config=[:] ) {

  def versionParts = config.version.tokenize('.')

  println versionParts

  if (versionParts.size != 3) {
      throw new IllegalArgumentException("Wrong version format - expected MAJOR.MINOR.PATCH - got ${version}")
  }

  def major = versionParts[0].toInteger()
  def minor = versionParts[1].toInteger()
  def patch = versionParts[2].toInteger()

 
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

