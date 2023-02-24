public class Sportsman {
    int[] points;

    public Sportsman(int... points) {
        setPoints(points);
    }

    public void setPoints(int[] points) {
        for (int i = 0; i < points.length; i++) {
            if (points[i] >= 50 && points[i] <= 100) {
                this.points[i] = points[i];
            } else {
                System.exit(1);
            }
        }
    }


    public double theArithmeticMeanOfANumber() {
        double sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum = (sum + points[i] / 2);
        }
        return sum;
    }
    public int equalPoints(Sportsman sportsman1, Sportsman sportsman2) {
        if (sportsman1.theArithmeticMeanOfANumber() > sportsman2.theArithmeticMeanOfANumber()) {
            return 1;
        } else if (sportsman1.theArithmeticMeanOfANumber() < sportsman2.theArithmeticMeanOfANumber()) {
            return -1;
        } else {
            return 0;
        }
    }
}
