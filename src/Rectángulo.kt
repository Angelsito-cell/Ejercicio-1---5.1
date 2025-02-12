
class Rectángulo(val base: Double, val altura: Double, color: String) : Figura(color){
    override fun area(): Double {
        return base * altura
    }
    override fun perimetro(): Double {
        return base * 2 + altura * 2
    }
}