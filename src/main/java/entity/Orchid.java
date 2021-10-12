package entity;

public class Orchid extends Plant {
    String name = "Орхидея";
    String genus = "Orchidaceae";
    private boolean blossom = false;
    private final int blossomThreshold = 3;

    public Orchid(int height, int waterLevel, Color flowerpotColor) {
        super(height, waterLevel, flowerpotColor);
        minWaterLevelNeededForGrow = 3;
        if (height >= blossomThreshold) {
            this.blossom = true;
        }
        System.out.printf("~~~~Посажена новая %s~~~~\n", name);
    }

    @Override
    public void growEffect() {
        if (height >= blossomThreshold && !blossom) {
            blossom = true;
            System.out.println("У растения расцвел цветок!");
        }
    }

    @Override
    public void showPlantState(){
        System.out.println("------------------");
        System.out.printf("%s, род %s\n", name, genus);
        System.out.printf("Высота: %d, уровень воды: %d, минимальный уровень воды для роста: %d\n",
                height, waterLevel, minWaterLevelNeededForGrow);
        System.out.printf("Цветок %s\n", (blossom) ? "распустился" : "не распустился");
        System.out.println("------------------");
    }
}