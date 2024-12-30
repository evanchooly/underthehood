///usr/bin/env jbang "$0" "$@" ; exit $?
//KOTLIN 2.0.20
import java.io.File
import java.nio.file.Files.lines

private const val WEAVE = "<!-- weave: "

fun main() {
    var lines = File("index-template.html")
        .readLines()
        .joinToString("\n") { line ->
            if (!line.contains(WEAVE)) {
                line
            } else {
                var name = line.substringAfter(WEAVE).substringBefore(" ")
                var indent = line.substringBefore(WEAVE)
                val file = File("fragments/$name")
                if (file.exists()) {
                    file.readLines()
                        .joinToString(separator = "\n") { line -> indent + line }
                } else {
                    "$file does not exist"
                }
            }
        }
    File("index.html").writeText(lines)
}
