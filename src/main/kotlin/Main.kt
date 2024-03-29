import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    var m = Array(4) { Array<Int>(4) { Random.nextInt(1, 9)} }
    var sumaFilas = Array(m.size){0}
    var sumaColum = Array(m[0].size){0}


    imprimirTablero(m)
    sumarFilasColumnas(m, sumaFilas, sumaColum)



}

fun sumarFilasColumnas(m:Array<Array<Int>>, sumaFilas:Array<Int>, sumaColum:Array<Int>){
    sumaColumnas(m,sumaColum)
    sumaFilas(m, sumaFilas)
    println("La suma de las filas es")
    println(Arrays.toString(sumaFilas))
    println("La suma de las columnas es")
    println(Arrays.toString(sumaColum))

}

fun imprimirTablero(m:Array<Array<Int>>){

    for (f in m.indices){
        for (c in m[f].indices){
            print("${m[f][c]} ")
        }
        println()
    }
}

fun sumaFilas(m:Array<Array<Int>>, sumaFilas:Array<Int>){
    var f: Int = 0
    var c: Int = 0

    while (f < m.size){
        while (c < m[0].size){
            sumaFilas[f] += m[f][c]
            c++
        }
        c = 0
        f++
    }

}

fun sumaColumnas (m:Array<Array<Int>>, sumaColumnas:Array<Int>){
    var f: Int = 0
    var c: Int = 0

    while (c < m.size){
        while (f < m[0].size){
            sumaColumnas[c] += m[f][c]
            f++
        }
        f = 0
        c++
    }

}
