import kotlin.math.PI

class Círculo(val radio: Double, color : String?) : Figura(color) {
    override fun area(): Double {
        return PI * radio * radio
    }
    override fun perimetro(): Double {
        return 2 * PI * radio
    }}