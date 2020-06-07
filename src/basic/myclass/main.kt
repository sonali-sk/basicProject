/*This is a basic project which automatically gets the int value of current day(considering
Sunday as first day of the week,so if it's Sunday the integer value is 1) and displays the mission of that day*/
package basic.myclass
import java.util.*
//1)Usage of functions concept
fun knowMission(){
     val cal=Calendar.getInstance()
     val Mission1=Mission(cal.get(Calendar.DAY_OF_WEEK))
    Mission1.valuate()
}
fun main(){
    println("--------KNOW YOUR MISSION OF THE DAY--------")
    knowMission()
    println("\n-----------Have a nice day!-----------")
}