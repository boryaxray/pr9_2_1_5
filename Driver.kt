class Driver(public  var name:String,public var driverLicense: String) {
    var car: Car?=null
    fun Repair(){
        println("$name запросил ремонт авто")
    }
    fun Trip(){
        if(car!=null) {
            println("$name оставил заявку на рейс")
            car?.availble=false
        }else{
            println("Такая машина занята,попробуйте другую, $name")
        }
    }
    fun FinishTrip(){
        println("$name закончил рейс.")
        car?.availble=true
    }



}