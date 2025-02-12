class Triángulo(val base: Double, val altura: Double, color: String) : Figura(color) {

    constructor(base: Double, altura: Double) : this(base, altura, "Blanco")
    override fun area(): Double {
        return (base * altura) / 2
    }
    override fun perimetro(): Double {
        return base * 3
    }
}