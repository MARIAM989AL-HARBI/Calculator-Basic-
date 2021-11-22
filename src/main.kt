import java.lang.Exception

fun main() {
    fun checkNumber(num: String): Int {
        try {
            return num.toInt()
        } catch (e: Exception) {
            return 0  // return 0 ..return the user's number or 0 if they enter something other than a number
        }
    }

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    while (true) {
        print("Enter your first number:  ") // first number
        val num1 = checkNumber(readLine()!!)
        print("Enter your second number:  ") //  Second number
        val num2 = checkNumber(readLine()!!)

        println("$num1 + $num2 = ${add(num1, num2)}") // sum first

        print("Would you like to add more numbers? (Y/N) >> ")  // complete the program user yes
        // not complete the program user No
        var yes = readLine()!!.toString()
        if (yes != "y" && yes != "y") {
            break
        }
    }
}

