fun main(args: Array<String>) {
    var marks=40
    var result = (if (marks < 50) {
        "E"
    } else if (marks < 60) {
        "D"
    } else if (marks < 70) {
        "C"
    } else if (marks < 80) {
        "B"
    } else {
        "A"
    }).apply {
        println(this)
    }
    var BettingNumber=0
    var BettingResult= when (BettingNumber){
        1->{
            "Ooops!!!You've lost"
        }
        2->{
            "Congrats!! You've won"
        }
        3->{
            "Ooops!!! You've lost"
        }
        else->{
            "Please enter a number from 1-3"
        }
    }
    println(BettingResult)
}