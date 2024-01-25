
/*
Hardware store
In this project, we have a hardware store that sells different products.
We represent this product using classes.
Now we can se the classes and some examples of the kind of product that they are going to content:
1-ConstructionProduct: nails, screws, cement, sand etc. we sell it by it units, for ex.
10 kg of sand
2-ElectricProduct: cables, electric tape, socket outlet,power drills, hole puncher, etc.
3-HandTool: hammer, hand saw
4-GardenProduct:shovel, plant pot
5-HouseholdItem: kettle, broom, brush
6-WaterProduct:water filter, water pump
7-GasProduct: gas valve,etc

Also, we have:
Employee: the employee of the store.
Supplier: the one that sells the product.
Client: the one that buys the product.
 */

public class Main {
    public static void main(String[] args) {
        //Instantiations of the different implemented classes after the implementation of abstract

        System.out.println("Hello and welcome to hardware store!! \n");
        //classes
        //humans or companies
        BigClient bigClient=new BigClient("Edward Cullen","Edward@gmail.com","+224586634");
        System.out.println(bigClient.toString()+"\n");
        Supplier rinoMax= new Supplier("Jason Krueger","jason@gmail.com","+12812516","sand");
        Employee carlosRusso = new Employee("carlos Russo", "123@gmail.com", "12345678", "Deposit");
        Employee joseAntonio = new Employee("Jose Antonio", "123@gmail.com", "12345678", "seller");

        //Polymorphism with Person abstract class example
        rinoMax.setSupplierAge(21);
        bigClient.setBigClientAge(60);
        carlosRusso.setEmployeeAge(30);
        rinoMax.checkAge();
        System.out.println();
        bigClient.checkAge();
        System.out.println();
        carlosRusso.checkAge();
        System.out.println();

        //Products
        ConstructionProduct sand = new ConstructionProduct("Sand", "White sand", "Tn");
        System.out.println(sand.getRawMaterialDescription());
        //Creating the first Electric product
        ElectricProduct lightBulb = new ElectricProduct("Light bulb 2", "led light bulb");
        //Getting the product name
        System.out.println(lightBulb.toString());
        //setting the power field
        lightBulb.setPower(10);
        //getting the power field
        System.out.println("The lightBulb power is: "+lightBulb.getPower()+"kW\n");
        //Creating the second Electric product
        ElectricProduct lightBulb2 = new ElectricProduct("Light bulb 1", "led light bulb");
        //getting the lightBulb2 id that used hashCode override to create a unique id
        System.out.println(lightBulb2.toString()+"\n");
        //Checking if lightBulb is equal to lightBulb2 to implement hashCode and equals override
        System.out.println("Electric products are equals?: "+lightBulb.equals(lightBulb2)+"\n");

        //Creating GardenProduct Objects
        GardenProduct gardenScissors = new GardenProduct("Big scissors", "Big size scissors to cut grass", false);
        GardenProduct gardenScissors1 = new GardenProduct("Medium scissors", "Medium size scissors to cut grass", false);
        GardenProduct gardenScissors2 = new GardenProduct("Small scissors", "Small size scissors to cut grass", false);

        //Creating a new gas Product
        GasProduct gasBurner = new GasProduct("Gas Burner", "Gas kitchen burner");
        System.out.println(gasBurner.toString()+"\n");
        GasProduct gasBurner2 = new GasProduct("Gas Burner", "Gas kitchen burner");
        gasBurner2.setStock(8);
        System.out.println("Gas burner stock is: "+gasBurner2.getStock());
        //Creating a HandTool Object
        HandTool handSaw=new HandTool("Hand saw","Small hand saw");
        System.out.println(handSaw.getProductDescription());
        //Creating HouseholdItem Objects
        HouseholdItem broom =new HouseholdItem("Big broom","Industrial boom");
        System.out.println(broom.getProductName());
        HouseholdItem broom1 =new HouseholdItem("Small broom","House boom");
        //Creating a WaterProduct Object
        WaterProduct pump1=new WaterProduct("Excelsior pump","20 hp power pump");
        System.out.println(pump1.getProductName());
    }
}
