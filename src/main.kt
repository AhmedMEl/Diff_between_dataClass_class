data class Employee(var name:String,var age:Int)//****(1)****

//The primary constructor needs to have at least one parameter;
//All primary constructor parameters need to be marked as val or var;
//abstract data class Employee(var name:String,var age:Int) //****(6)****
// Data classes cannot be abstract, open, sealed or inner

class Students(name: String,age: Int)
//abstract class Students(name: String,age: Int)

fun main() {
   val emp =Employee("ali",11)
   val emp2 =Employee("ali",11)

   println("The Data Class")
   println(emp.toString())//****(2)****
   println(emp == emp2)//****(3)****
    println(emp.equals(emp2))  // Prints true

   val emp3=emp.copy(name = "Ahmed")

   println(emp3.toString())//****(4)****
   println(emp3.component2())//****(5)****
   println(emp3.component1())
    val name1 = emp.name//****(7)****Accessing the properties of the data class
    println(name1)
// Destructuring Declaration****(8)****
    val (id, name) = emp

    println("******************************************************************************************")
    println("The Normal Class")

    val stu =Students("ali",11)
    val stu2 =Students("ali",11)

    println(stu.toString())//****(2)****
    println(stu == stu2)//****(3)****
    println(stu.equals(stu2))// print false
//    ****(7)****not accessing the properties of the class
//    val name2 = stu.name
//    println(name2)
// val (id, name) = stu   not working
}