import java.io.File

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Missing password")
        return
    }
    val password = args[0]
    println("Password: $password")

    val folders = File("/").listFiles { file -> file.isDirectory() }
    folders?.forEach { folder -> println(folder) }
}

main(args)