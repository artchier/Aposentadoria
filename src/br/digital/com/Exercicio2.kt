package br.digital.com

fun main(){
    val aposentado1 = Aposentado(30, 'f', 65)
    val aposentado2 = Aposentado(60, 'f', 30)

    aposentado1.aposentou()
    aposentado2.aposentou()
}