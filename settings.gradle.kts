include(":lib")

//include(":testing:testapp")
include(":testing:testapp:animation")
include(":testing:testapp:base")
include(":testing:testapp:custom")
include(":testing:testapp:theme")

include(":testing:testapp:src:main:java:com:google:android:material:testapp:appbar")

//
//include(":tests")
//include(":tests:material:animation")
//include(":tests:material:theme")

include(":catalog")

//include(":demos:java:io:material:demo:shrine")
//include(":demos:java:io:material:demo:shrine:filters")
//include(":demos:java:io:material:demo:shrine:products")
//include(":demos:java:io:material:demo:shrine:theme")

rootProject.children.filter { !it.children.isEmpty() }.map { it.children }.forEach {
  val allChildren = mutableListOf<ProjectDescriptor>()
  flattenList(it, allChildren)
  allChildren.forEach { project ->
    project.name = project.path.substring(1).replace(":", "-")
    println("[${project.name}]")
  }

}

fun flattenList(nestedList: Iterable<ProjectDescriptor>, flatList: MutableList<ProjectDescriptor>) {
  nestedList.forEach { e ->
    when {
      e.children.isEmpty() -> flatList.add(e)
      else -> {
        flatList.add(e)
        flattenList(e.children, flatList)
      }
    }
  }
}
