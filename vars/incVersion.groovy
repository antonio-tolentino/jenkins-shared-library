def String call( Map config=[:] ) {

  def versionParts = config.version.tokenize('.')

  if (versionParts.size != 3) {
    throw new IllegalArgumentException("Expected version format: MAJOR.MINOR.PATCH - got ${config.version}")
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
      throw new IllegalArgumentException("Expected incType values: major, minor, patch - got ${config.incType}")
      return config.version
  }

}

