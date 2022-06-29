package oop

fun main(args: Array<String>) {
    var firstUser = User("King","King@gmail.com","123","1234")

    firstUser.register()
    firstUser.login()

    var secondUser=User("eMobilis","emobilis@gmail.com","12345","12345")

    secondUser.login()
}

class User {
        //Theses are the user properties
        var name:String
        var email:String
        var password:String
        var confirmpassword:String

        constructor(name: String,email:String,password:String,confirmpassword:String){
            this.name = name
            this.email = email
            this.password = password
            this.confirmpassword=confirmpassword
        }

    fun register(){
        if (!password.equals(confirmpassword)){
            println("Passwords don't match")
        }else{
            println("User registered successfully")
        }
    }

    fun login(){
        if (email.equals("emobilis@gmail.com")&&password.equals("12345")){
            println("Login successful")
        }else{
            println("Login failed")
        }
    }
}