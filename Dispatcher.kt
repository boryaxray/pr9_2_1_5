class Dispatcher {
    fun Car(driver: Driver,car:Car){
        driver.car=car
        println("Машина ${car.model} была взята водителем ${driver.name}")
    }
    fun SuspendDriver(driver: Driver){
        println("${driver.name} остановил свой рейс.")
        driver.car?.availble=true
        driver.car=null
    }
}