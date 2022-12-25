def String call( Map config=[:] ) {

  def pattern = ~/(\d{1,3})\.(\d{1,3})\.\d{1,4}$/



  switch(map.incType.toUpperCase()) {
    case "MAJOR":
      return map.version.replaceFirst(pattern) { _,major,minor,patch -> "${(major as int) + 1}.0.0"}
    case "MINOR":
      return  map.version.replaceFirst(pattern) { _,major,minor,patch -> "${major}.${(minor as int) + 1}.0"}
    case "PATCH":
      return map.version.replaceFirst(pattern) { _,major,minor,patch -> "${major}.${minor}.${(patch as int) + 1}"}
    default:
      return map.version
  }
}