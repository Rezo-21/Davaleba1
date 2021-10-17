fun main() {

    var f1 = Fraction(7F,20F)

    var f2 = Fraction(5F,12F)

    println(f1)
    println(f1.mimateba(f1,f2))
    println(f1.gayofa(f1,f2))
    println(f1.shekveca(3F))

}

class Fraction(private var numerator: Float, private var denominator: Float) {

    fun shekveca (gamyofi: Float): String {

        var n = numerator / gamyofi
        var d = denominator / gamyofi
        return "shekvecili wiladi: $n/$d"
    }

    fun mimateba (a: Fraction, b:Fraction): String {
        var n1 = a.numerator * b.denominator
        var n2 = b.numerator * a.denominator
        var d1 = a.denominator * b.denominator

        return "wiladebis jami: ${n1 + n2}/$d1"
    }

    fun gayofa (a: Fraction, b:Fraction): String {
        var n = a.numerator * b.denominator
        var d = a.denominator * b.numerator

        return "gayofis shedegi: $n/$d"
    }
}