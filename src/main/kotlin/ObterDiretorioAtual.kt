fun main(){

    println("Você está diretório: ${getCaminhoAtual()}")
}

fun getCaminhoAtual():String{

    return System.getProperty("user.dir")
}