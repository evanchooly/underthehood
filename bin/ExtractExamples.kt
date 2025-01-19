///usr/bin/env jbang "$0" "$@" ; exit $?

//KOTLIN 2.0.20
//DEPS org.ow2.asm:asm-tree:9.7
//DEPS org.ow2.asm:asm-util:9.7
//DEPS org.zeroturnaround:zt-exec:1.12

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.FileWriter
import java.io.PrintWriter
import org.objectweb.asm.*
import org.objectweb.asm.util.Textifier
import org.objectweb.asm.util.TraceClassVisitor
import org.zeroturnaround.exec.ProcessExecutor

fun main() {
    println("Parsing class")
    val buildDir = File("target/classes")
    buildDir.walkTopDown()
        .filter { it.extension == "class" }
        .forEach { file -> dump(file) }
}

fun dump(file: File) {
    val txtOutputDir = File("target/txt-files")
    txtOutputDir.mkdirs()
    val base = file.nameWithoutExtension
    val txt = File(txtOutputDir, "${base}.txt")
    println("Emitting $txt")
    val txtOutput = PrintWriter(FileWriter(txt))
    var inputStream = FileInputStream(file)
    val traceClassVisitor = TraceClassVisitor(null, Textifier(), txtOutput);
    ClassReader(inputStream).accept(traceClassVisitor, 0);
    val javap = File(txtOutputDir, "${base}.javap")
    println("Emitting $javap")
    ProcessExecutor().command("javap", "-v", "-s", "-c", "-p", file.absolutePath)
        .redirectOutput(FileOutputStream(javap))
        .execute().getExitValue();
}
