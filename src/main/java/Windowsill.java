import entity.*;

public class Windowsill {
    public static void main(String[] args) {
        Plant orchid = new Orchid(2, 2, Color.WHITE);
        orchid.showPlantState();
        orchid.grow();
        orchid.toWater(10);
        orchid.grow();
        orchid.showPlantState();

        Plant sansevieria = new Sansevieria(2, 3, Color.BROWN);
        sansevieria.showPlantState();
        sansevieria.grow();
        sansevieria.toWater();
        sansevieria.grow();
        sansevieria.showPlantState();

        Groot groot = new Groot(7, 4, Color.GREEN);
        groot.showPlantState();

        Groot castedGroot = groot;
        castedGroot.say();
        castedGroot.dance();
        groot.grow();
        groot.grow();
        groot.showPlantState();
    }
}
