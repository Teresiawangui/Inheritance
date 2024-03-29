fun main() {
val banker = Banker("mercy",45)
    val doctor = Doctor("rehema",38)
    val farmer = Farmer("wanjiku",43)
    banker.eat()
    doctor.eat()
    farmer.eat()

    banker.introduction()
    doctor.introduction()
    farmer.introduction()


}
 open class Person( var name:String,var age:Int) {
     fun talk(words: String) {
         println(words)
     }

      open fun eat() {
         println("yum")
     }

     fun sleep() {
         println("zzzzzzz")
     }
      open fun introduction(){
         println("Hi I am $name")
     }
 }

class Banker(name: String, age: Int):Person(name,age) {


     fun countMoney(notes:Array<Int>):Int{
        var sum = 0
        notes.forEach { note->sum+=note }
        return sum
    }

    override fun eat() {
        println("chop money")
    }
}
class Doctor(name:String,age:Int):Person(name,age){

    fun treatPatient(patient:String,disease:String){
        println("Treat $patient for $disease")
    }

    override fun introduction() {
        super.introduction()
        println("Hi I am doctor $name")
    }

}
class Farmer(name:String,age:Int):Person(name,age){
    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
        /*super.eat()*/
        println("I am eating the food that I've grown")
    }
    open class People(var name:String,capacity: Int)
}
