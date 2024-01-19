fun main(){
    var pervoe:Int = readLine()!!.toInt()
    var deystvie:String = readLine()!!
    var vtoroe:Int = readLine()!!.toInt()
    if (deystvie == "+"){
        var response:Int = pervoe + vtoroe
        println(response)
    }
    if (deystvie == "-"){
        var response:Int = pervoe - vtoroe
        println(response)
    }
    if (deystvie == "*"){
        var response:Int = pervoe * vtoroe
        println(response)
    }
    if (deystvie == "/"){
        var response:Float = pervoe.toFloat() / vtoroe
        println(response)
    }
}