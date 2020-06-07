package basic.myclass
//2)Usage of class concept
class Mission(var day:Int) {
    val days_array= arrayOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    init {
        println("Today is ${days_array[day-1]} and your mission is:")
    }
    fun valuate() {
        //3)Usage of when statement
        when (days_array[day-1]) {
            "Sunday" -> println("Study two lessons of codelabs")
            "Monday"-> println("Revise concepts learnt on Sunday")
            "Tuesday"->println("You must work on a project")
            "Wednesday"->println("Gardening day")
            "Thursday","Friday","Saturday"->println("Sports day")
            else -> println("Invalid day")
        }
    }
}