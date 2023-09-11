fun main(args: Array<String>) {
    //Задание 1

    fun printFullName(firstName: String, lastName: String) {
        println(firstName + " " + lastName)
    }
    printFullName("Dana", "Djarkas")

    //Задание 2

    fun printFullName() {
        var firstName: String = "Dana"
        var lastName: String = "Djarkas"
        printFullName(firstName, lastName)
    }
    //Задание 3

    fun calculateFullName(firstName: String, lastName: String): String {
        return "$firstName , $lastName"

        val myFullName = calculateFullName(firstName, lastName)
        println(myFullName)
    }

    //Задание 4
    fun calculateFullNamelength(firstName: String, lastName: String): Pair<String, Int> {
        return Pair("$firstName $lastName", (firstName + lastName).length)
    }

    //Задание 5

    fun prostchislo(number: Int): Boolean {
        if (number <= 1) {
            return false
        }

        for (i in 2..<number) {
            if (number % i == 0) {
                return false

        }
        return false
    }
    return true
}
    println(prostchislo (-5))

}

    //Задание 6

