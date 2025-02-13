class Triángulo(private val base: Double, val altura: Double, color: String?) : Figura(color) {
    override fun area(): Double {
        return (base * altura) / 2
    }
    override fun perimetro(): Double {

        val hipotenusa = Math.sqrt(base*base+altura*altura)
        return base+altura+hipotenusa
    }
}