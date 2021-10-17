fun main () {

    val r = Point()

    r.xCoordinate = 10
    r.yCoordinate = 15

    println("kordinatebi")
    println(r)

    val t = Point()
    t.xCoordinate = 10
    t.yCoordinate = 15
    println("equals metodi r da t")
    println(r.equals(t))

    r.changingXCoordinate(xCoordinate = -10)
    r.changingYCoordinate(yCoordinate = -15)

    println(r)
}

class Point {

    var xCoordinate: Int = 1
    var yCoordinate: Int = 2

    override fun toString(): String {

        return ("($xCoordinate;$yCoordinate)")
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (xCoordinate == other.xCoordinate)
                if(yCoordinate == other.yCoordinate)
                    return true
        }
        return false
    }

    fun changingXCoordinate(xCoordinate: Int) {
        this.xCoordinate = xCoordinate
        println("simetriulad gadatana")
    }
    fun changingYCoordinate(yCoordinate: Int) {
        this.yCoordinate = yCoordinate
    }
}