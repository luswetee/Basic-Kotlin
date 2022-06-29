fun main(args: Array<String>) {
    //WHILE LOOP
    var countone=0
    while (countone<=5){
        println(countone)
        countone++
    }
//DO WHILE LOOP
    var counttwo=10
    do {
        println(counttwo)
        counttwo++
    }while (counttwo<=15)
    //REPEAT LOOP
    repeat(10){
        println("goodmorning")
    }
    //FOR IN LOOP
    var names= arrayOf("King","Shanky","Faith","Linet","Brian","Masetu")
    for (jina in names){
        println(jina)
    }
    var ascendingnumbers=0..20
    for (nambari in ascendingnumbers){
        println(nambari)
    }
    var descendingnumbers=20 downTo 0
    for (n in descendingnumbers){
        println(n)
    }
}