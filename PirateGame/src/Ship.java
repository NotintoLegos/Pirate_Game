public class Ship{
    int speed;
    static String shipType;
    int cannons;
    int sails;
    int health;
    int power;
    double range;
    double upSpeed;
    double downSpeed;
    String sailColor;
    double posLat;
    double posLong;
    int degree;

    public Ship(String shipType, int cannons, int sails, int health, int power, double range, double upSpeed, double downSpeed, String sailColor, double posLat, double posLong) {
        this.shipType= shipType;
        this.cannons = cannons;
        this.sails = sails;
        this.health = health;
        this.power = power;
        this.range = range;
        this.upSpeed = upSpeed;
        this.downSpeed= downSpeed;
        this.sailColor = sailColor;
        this.posLat= posLat;
        this.posLong= posLong;
    }

    public String getShipType(){
        return shipType;
    }

    public int getCannons() {
        return cannons;
    }

    public int getSails() {
        return sails;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public double getRange() {
        return range;
    }

    public double getupSpeed() {
        return upSpeed;
    }
    public double getDownSpeed(){
        return downSpeed;
    }

    public String getSailColor() {
        return sailColor;
    }

    public double getPosLat() {
        return posLat;
    }

    public double getPosLong() {
        return posLong;
    }
    /////////////////////////////
// sail number, width and length are not changeable

    public void setCannons(int cannons) {
        this.cannons = cannons;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public void setUpSpeed(double upSpeed) {
        this.upSpeed = upSpeed;
    }
    public void setDownSpeed(double downSpeed){
        this.downSpeed= downSpeed;
    }

    public void setSailColor(String sailColor) {
        this.sailColor = sailColor;
    }

    public void setPosLat(double posLat) {
        this.posLat = posLat;
    }

    public void setPosLong(double posLong) {
        this.posLong = posLong;
    }
///// need to fix speed later
    public void distance(int d, int gale){
        speed=1;
    }

    public double calcLat(int d) {
        double radians= Math.toRadians(d);
        double x = Math.cos(radians) * speed;
        return posLat += x;
    }
    public double calcLong(int d){
        double radians= Math.toRadians(d);
        double y= Math.sin(radians) * speed;
        return posLong +=y;
    }

    public void sail(int deg){
        posLat= calcLat(deg);
        posLong= calcLong(deg);
        System.out.println("Latitude: "+ posLat+ "\nLongitude: "+ posLong);
    }
    public void addCannon(int c){
        cannons+= c;
    }
    public void shield(int s){
        health+= 10*s;
    }
    public void powerUp(int p){
        power+=5*p;
    }



    public static void main(String[] args) {
        Ship tester= new Ship("English", 2, 3, 39, 24, 3.4, 2.7,3.2, "White", 0, 0);
        System.out.println(tester.posLat+ "\n"+ tester.posLong);
        tester.sail(135);
    }
}
