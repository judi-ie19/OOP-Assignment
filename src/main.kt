fun main(){
    var student=Human("judith",21,50)
    student.eat(10)
    println(student.weight)
    student.speak("codehive2022")
    student.birthday()
    var judith=User("Emmah","Akinyi","owuorakinyjudith@gmail.com",757497424,"1234f")
    println(judith.email)
    println(judith.phonenumber)



}
class Human(var name:String,var age:Int,var weight:Int) {

    fun eat(foodWeight: Int){
        weight+=foodWeight
        println("i am eating $foodWeight kgs of food")

    }
    fun speak(speech:String){
        println(speech)
    }

    fun birthday(){
        age+=1
        println(age)

    }

}

data class User(var firsttname:String,var lastname:String,var email:String,var phonenumber:Int,var password:String){

}


