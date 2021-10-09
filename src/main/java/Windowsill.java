import entity.Color;
import entity.Orchid;
import entity.Sansevieria;
import entity.Groot;

public class Windowsill {
    public static void main(String[] args) {
        Orchid orchid = new Orchid(2, 2, Color.WHITE);
        orchid.showPlantState();
        orchid.grow();
        orchid.toWater(10);
        orchid.grow();
        orchid.showPlantState();

        Sansevieria sansevieria = new Sansevieria(2, 3, Color.BROWN);
        sansevieria.showPlantState();
        sansevieria.grow();
        sansevieria.toWater();
        sansevieria.grow();
        sansevieria.showPlantState();

        Groot groot = new Groot(7, 4, Color.GREEN);
        groot.showPlantState();
        groot.toWater(15);
        groot.say();
        groot.dance();
        groot.grow();
        groot.grow();
        groot.showPlantState();
    }
}
