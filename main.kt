fun main(){
   var car1=Car("Audi")
    var car2=Car("BMW")
    var driver1=Driver("Olga" ,"B51H5")
    var driver2=Driver("Johan" ,"P10P4")
    var dispatcher=Dispatcher()
    dispatcher.Car(driver1,car1)
    driver1.Trip()
    driver1.FinishTrip()
    dispatcher.SuspendDriver(driver2)
    driver2.Repair()
}