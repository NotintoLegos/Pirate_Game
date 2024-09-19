public class Player {
    int numShips=1;
    int numForts=1;
    int gold=0;
    int iron=0;

    Player player1= new Player(numShips, numForts, gold, iron);

    public Player(int numShips, int numForts, int gold, int iron) {
        this.numShips = numShips;
        this.numForts = numForts;
        this.gold = gold;
        this.iron = iron;
    }

    public static void main(String[] args) {
        Player player1= new Player(1,1,0,0);
        System.out.println(player1);
    }
}
