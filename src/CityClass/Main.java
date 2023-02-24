public class Main{
    public static void main(String[] args) {

        City newCity = new City("Goris", 20000, "Armenia", "Syunik");
        newCity.name = "Goris";
        System.out.println("The name of City is " + newCity.name + ".");
        System.out.println("The population of City is " + newCity.population + ".");
        System.out.println("The City is located in " + newCity.inWhichCountry + ".");
        System.out.println("The City is located in " + newCity.inWhichRegion + " region.");
    }
}