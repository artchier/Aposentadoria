package br.digital.com

class Aposentado(var idade: Int, var sexo: Char, var anos: Int) {

    fun aposentou() {
//        when {
//            anos >= 30 -> {
//                when {
//                    sexo == 'f' -> when {
//                        idade >= 60 -> println(true)
//                        else -> println(false)
//                    }
//                    idade >= 65 -> println(true)
//                    else -> println(false)
//                }
//            }
//            else -> println(false)
//        }
        when {
            anos >= 30 -> when (sexo) {
                'f' -> when {
                    idade >= 60 -> println(true)
                    else -> println(false)
                }
                else -> when {
                    idade >= 65 -> println(true)
                    else -> println(false)
                }
            }
            else -> println(false)
        }
    }
}