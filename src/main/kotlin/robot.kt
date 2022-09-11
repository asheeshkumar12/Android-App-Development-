import java.util.Calendar

class Robot(var name:String ){

     fun ringtone(time:String)=println("Good mornings! | Its $name ,The time is already $time ,please wake up!!!")
     fun makeCoffee(coffee:Coffee){
         if(coffee.black){
             println("Your black coffee with ${coffee.spoonOfSugar} spoon of sugar is ready! ")
         }
         else{
             println("your coffee with ${coffee.spoonOfSugar} spoon of sugar is ready! ")
         }
     }
     fun heatWater(tempreture:Int){
         println("Bath water with  tempreture $tempreture C. is ready , take a bath now!  ")
     }
     fun packBag(day:Int){
         val msg="Books kept for today are: "
         val subjects=arrayOf("Math","Physics","chemistry","Electronics","computers","Materials Science","Human values")
         when(day){
             Calendar.MONDAY ->println("$msg ${subjects[0]},${subjects[1]},${subjects[2]}")
             Calendar.TUESDAY->println("$msg ${subjects[0]},${subjects[1]},${subjects[2]}")
             Calendar.WEDNESDAY ->println("$msg ${subjects[1]},${subjects[2]},${subjects[3]}")
             Calendar.THURSDAY->println("$msg ${subjects[4]},${subjects[3]}")
             Calendar.FRIDAY->println("$msg ${subjects[5]},${subjects[6]},${subjects[1]}")
             else->println("Invalid day or Its may be holy days")
         }
     }
    fun cook(){
        val breakfast= mutableListOf("Tea","Bread","Samosa","Oats","Eggs")
        val lunch= mutableListOf("Roti","Rice","Daal","Paneer","rajma","Patato","Green Vegetables")
        println("Today breakfast is ${breakfast.random()} and lunch is ${lunch.random()}")
    }
    fun iron(shirtColor:String,trouserColor:String){
        val shirtColors= mutableListOf("Black","Red","Blue","Orange","Yellow")
        val trouserColors= mutableListOf("Black","White","Blue","Gray")
        if(shirtColors.contains(shirtColor)){
            if(trouserColors.contains(trouserColor)){
                println("your cloth are ready! ")
            }
            else{
                println("Do not have trouser for this color.  Next time goto shopping for trouser this color !")
            }

        }
        else{
            println("Do not have this t-shirt color .May be next time for shopping for this shirt  !")
        }
    }



}