fun main() {
    // Crear una lista de figuras utilizando polimorfismo
    val figuras: List<Figura> = listOf(
        Círculo(5.0),            // Círculo de radio 5
        Rectángulo(3.0, 4.0),    // Rectángulo con base 3 y altura 4
        Triángulo(3.0, 4.0)      // Triángulo con base 3 y altura 4
    )

    // Recorrer la lista e imprimir información de cada figura
    for (figura in figuras) {
        println("Clase: ${figura::class.simpleName}")
        println("Área: ${figura.area()}")
        println("Perímetro: ${figura.perimetro()}")
        println("------------")
    }
}