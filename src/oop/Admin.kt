package oop

fun main(args: Array<String>) {
    var firstAdmin = Admin("King",9000000.00,"Kingwanyama@gmail.com")
    firstAdmin.registerUser()
    println(firstAdmin.salary)
    firstAdmin.setidnumber("49633163")
    println(firstAdmin.getidnumber())
}

class Admin {
    var name:String
    var salary:Double
    var email:String
    private var phonenumber:String=""
    private var idnumber:String=""

    constructor(name:String,salary:Double,email:String){
        this.name=name
        this.salary=salary
        this.email=email
    }

    fun registerUser(){
        println("Yeah! I can register a user")
    }
    fun suspendEmployee(){
        println("Yeah! I can suspend an employee")
    }

    fun setPhonenumber(phonenumber:String){
        this.phonenumber=phonenumber
    }

    fun getPhonenumber():String {
        return this.phonenumber
    }
    fun setidnumber(idnumber:String){
        this.idnumber=idnumber
    }

    fun getidnumber():String {
        return this.idnumber
    }

    }