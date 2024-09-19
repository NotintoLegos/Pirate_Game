public class TestShip{
    double posLat;
    double posLong;
    double speed;

    public TestShip(double posLat, double posLong, double speed) {
        this.posLat = posLat;
        this.posLong = posLong;
        this.speed= speed;
    }

    public double getPosLat() {
        return posLat;
    }

    public void setPosLat(double posLat) {
        this.posLat = posLat;
    }

    public double getPosLong() {
        return posLong;
    }

    public void setPosLong(double posLong) {
        this.posLong = posLong;
    }

    public double getSpeed() {
        return speed;
    }

    public double calcLat(int d) {
        double radians= Math.toRadians(d);
        double x = Math.cos(radians) * getSpeed();
        return posLat += x;
    }
    public double calcLong(int d){
        double radians= Math.toRadians(d);
        double y= Math.sin(radians) * getSpeed();
        return posLong +=y;
    }

    public void sail(int deg){
        posLat= calcLat(deg);
        posLong= calcLong(deg);
        System.out.println("Latitude: "+ posLat+ "\nLongitude: "+ posLong);
    }

    public static void main(String[] args) {
        TestShip tester= new TestShip(0,0,5.00);
        System.out.println(tester.posLat+ "\n"+ tester.posLong);
        tester.sail(135);
    }
}
