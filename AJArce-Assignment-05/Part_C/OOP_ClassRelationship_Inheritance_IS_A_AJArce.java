package mechanic;

public class OOP_ClassRelationship_Inheritance_IS_A_AJArce {
    public static void testingLuxuryCar(){
        LuxuryElectricCar luxuryCar = new LuxuryElectricCar("Tesla", "Model S", 2024, 4, "Electric", 100, 80, "Leather", false);

        luxuryCar.startVehicle();
        luxuryCar.activateSelfDriving();
        luxuryCar.showBatteryStatus();
    }

    public static void main(String[] args){
        testingLuxuryCar();
    }
}
