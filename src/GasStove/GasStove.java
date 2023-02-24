public class GasStove {
    int sizeOfGasStove;
    int electricCookTop;
    int gasCookTop;
    String off;


    public GasStove(int sizeOfGasStove, int electricCookTop, int gasCookTop, String off) {
        this.sizeOfGasStove = sizeOfGasStove;
        setElectricCookTop(electricCookTop);
        setElectricCookTop(electricCookTop);
        setOff(off);

    }

    public void setElectricCookTop(int electricCookTop) {
        if (electricCookTop >= 1 && electricCookTop <= 3) {
            this.electricCookTop = electricCookTop;
        } else {
            System.out.println("The Gas Stove can have only from 1 to 3 electric cook tops.");
        }
    }

    public void setGasCookTop(int gasCookTop) {
        if (gasCookTop >= 3 && gasCookTop <= 5) {
            this.gasCookTop = gasCookTop;
        } else {
            System.out.println("The Gas Stove can have only from 3 to 5 gas cook tops.");
        }
    }

    public void setOff(String off) {
        if (off == "off") {
            System.out.println("Used energy is 0");
        } else if (off == "onelectric") {
            System.out.println("Used energy from electric gas stoves is " + electricCookTop * 100);
        } else if (off == "ongas") {
            System.out.println("Used energy from gas cook stoves is " + gasCookTop * 80);
        } else {
            System.out.println("You can choose only off/onelectric/ongas");
        }
    }
}
