public class Wind extends Ship{
    static int galeSpeed= (int) (30* Math.random());
    static int galeDir= (int) (360 * Math.random());

    public Wind(String shipType, int cannons, int sails, int health, int power, double range, double upSpeed, double downSpeed, String sailColor, double posLat, double posLong) {
        super(shipType, cannons, sails, health, power, range, upSpeed, downSpeed, sailColor, posLat, posLong);
    }


    public double relativeWind(){

    }

    public double windPercent(int effectDegree){
        double windPer=45;
        for(int i=effectDegree; i>=0; i--){
            windPer-=0.5;
        }
        return windPer;
    }

    public static void main(String[] args) {
        System.out.println(galeSpeed+" knots @ "+galeDir);
    }
}
