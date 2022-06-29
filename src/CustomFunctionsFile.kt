fun main(args: Array<String>) {
    motto()
    userverification(username = "kingwanyama",email = "kingwanyama@GMAIL.COM")
    average(23.0,50,65.0f)
    addition(300,300.0)
    println(addition(300,300.0))
    login("King")
    login("KIng@gmail.com","king123")
}

fun motto(){
    println("Hello,this is our motto")
}

fun userverification(username:String, email:String){
    println("Hello,your username is $username and your email is $email")
}

fun average(x:Double,y:Int,z:Float){
    var result =(x+y+z)/3.0
    println("Your average is $result")
}

fun addition(x:Int,y:Double):Double{
    var answer =x+y
    return answer
}
fun login(name:String){
    println("Hello your name is $name")
}

fun login(email:String,password:String){
    println("Hello your email is $email and password is $password")
}