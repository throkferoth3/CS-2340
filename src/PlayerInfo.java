import java.util.ArrayList;

public class PlayerInfo {
    private static int difficulty;
    private static int money;
    private static int health;
    private static String name;
    private static ArrayList<Tower> ownedTowers = new ArrayList<Tower>();

    public static int getDifficulty() {
        return difficulty;
    }
    public static int getMoney() {
        return money;
    }
    public static int getHealth() {
        return health;
    }
    public static String getName() {
        return name;
    }
    public static void setDifficulty(int d) {
        difficulty = d;
    }
    public static void setMoney(int m) {
        money = m;
    }
    public static void modifyMoney(int m) {
        money += m;
    }
    public static void setHealth(int h) {
        health = h;
    }
    public static void modifyHealth(int h) {
        health += h;
    }
    public static void setName(String n) {
        name = n;
    }
    public static void addTower(Tower t) {
        ownedTowers.add(t);
    }

    public static boolean validPlacement(double X, double Y) {
        if (ownedTowers == null) {
            return true;
        }
        if (Y <= 30) {
            return false;
        }
        for (int i = 0; i < ownedTowers.size(); i++) {
            if (ownedTowers.get(i).isWithin(X, Y)) {
                return false;
            }
        }
        return true;
    }
}
