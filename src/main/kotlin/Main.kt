import java.util.Calendar

fun main(args: Array<String>) {

    val robot1=Robot("Asheesh")
    println(" Hi there, My name is ${robot1.name} and I will be your personal assistant !!")
    println()
    robot1.ringtone("6:00 AM")
    println()

    robot1.makeCoffee(Coffee(true,1))
    println()

    robot1.heatWater(70)
    println()

    robot1.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()

    robot1.cook()
    println()

    robot1.iron("White","Black")
    println()

}