package ch02.ex1_4_3_StringTemplates2


fun maxNum(a:Int ,b:Int): String{
    return "The biggest number ${if(a > b) ("is "+a)  else if (a == b) "...are equals" else  ("is "+b)}"
}



fun main(args: Array<String>) {
    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")  
    println(maxNum(2,3))
}