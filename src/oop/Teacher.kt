package oop

fun main(args: Array<String>) {
    var firststudent=Student("Faith",100)
    firststudent.viewResults()

    var firstboardmember = boardmember("Linet",105)
    firstboardmember.publishMagazine()
}

open class Teacher(open var name:String,open var age:Int) {
    fun viewResults(){
        println("Hello $name you can view your results")
    }
    fun publishMagazine(){
        println("Hello $name you are $age years and can publish a magazine")
    }
}

open class Student(name: String,age: Int):Teacher(name,age){
    fun sitforexams(){
        println("Hello,I can sit for exams")
    }
}

class boardmember(name: String,age: Int):Student(name, age){

}