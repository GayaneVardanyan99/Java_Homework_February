public class Building {
    String typeOfBuilding;
    int numberOfFloors;
    int[] twoRoomApartment;
    int[] threeRoomApartment;
    public Building(String typeOfBuilding, int numberOfFloors, int[] twoRoomApartment, int[] threeRoomApartment) {
        this.typeOfBuilding = typeOfBuilding;
        this.numberOfFloors = numberOfFloors;
        setTwoRoomApartment(twoRoomApartment);
        setThreeRoomApartment(threeRoomApartment);
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTwoRoomApartment(int[] twoRoomApartment) {
        for (int i = 0; i < twoRoomApartment.length; i++) {
            System.out.println(twoRoomApartment[i]);
        }
    }

    public void setThreeRoomApartment(int[] threeRoomApartment) {
        for (int i = 0; i < threeRoomApartment.length; i++) {
            System.out.println(threeRoomApartment[i]);
        }
    }

    public int sumOfApartments() {
        int sumOfTwoRoomApartments = 0;
        int sumOfThreeRoomApartments = 0;
        for (int i = 0; i < twoRoomApartment.length; i++) {
            sumOfTwoRoomApartments++;
        }
        for (int j = 0; j < threeRoomApartment.length; j++) {
            sumOfThreeRoomApartments++;
        }
        return sumOfTwoRoomApartments + sumOfThreeRoomApartments;
    }
}
