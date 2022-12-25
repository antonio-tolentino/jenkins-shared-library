def String call( Map config=[:] ) {

  def versionParts = config.version.tokenize('.')

   if (versionParts.size != 3) {
      throw new IllegalArgumentException("Expected format MAJOR.MINOR.PATCH - got ${config.version}")
  }

  def major = versionParts[0].toInteger()
  def minor = versionParts[1].toInteger()
  def patch = versionParts[2].toInteger()

 
  switch(config.incType.toUpperCase()) {
    case "MAJOR":
      return "${major + 1}.0.0"
    case "MINOR":
      return "${major}.${minor + 1}.0"
    case "PATCH":
      return "${major}.${minor}.${patch + 1}"
    default:
      return config.version
  }

}

