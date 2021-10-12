package entity;

public class Sansevieria extends Plant {
    String name = "Cансевиерия";
    String genus = "Sansevieria";

    public Sansevieria(int height, int waterLevel, Color flowerpotColor){
        super(height, waterLevel, flowerpotColor);
        this.minWaterLevelNeededForGrow = 4;
        this.growSpeed = 2;
        this.waterNeededForGrow = 2;
        System.out.printf("~~~~Посажена новая %s~~~~\n", name);
    }

    @Override
    public void growEffect() {
    }

    @Override
    public void showPlantState() {
        System.out.println("------------------");
        System.out.printf("%s, род %s\n", name, genus);
        System.out.printf("Высота: %d, уровень воды: %d, минимальный уровень воды для роста: %d\n",
                height, waterLevel, minWaterLevelNeededForGrow);
        System.out.println("------------------");
    }
}
