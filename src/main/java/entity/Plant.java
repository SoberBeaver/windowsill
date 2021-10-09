package entity;

public abstract class Plant {
    protected String name;
    protected String genus; // род
    protected int height;
    protected int waterLevel;
    protected int minWaterLevelNeededForGrow;
    protected Color flowerpotColor;
    protected int growSpeed = 1;
    protected int waterNeededForGrow = 1;
    protected int waterStep = 1;

    public Plant(int height, int waterLevel, Color flowerpotColor) {
        this.height = height;
        this.waterLevel = waterLevel;
        this.flowerpotColor = flowerpotColor;
    }

    public void grow() {
        if (waterLevel >= minWaterLevelNeededForGrow) {
            height += growSpeed;
            waterLevel -= waterNeededForGrow;
            System.out.printf("Растение выросло на %d\n", this.growSpeed);
            growEffect();
        } else {
            System.out.println("Не достаточно воды для роста, полейте растение");
        }
    }

    public void toWater(int waterStep) {
        waterLevel += waterStep;
        System.out.printf("Растение полито, уровень воды %d\n", this.waterLevel);
    }

    public void toWater() {
        toWater(waterStep);
    }

    public abstract void showPlantState();
    public abstract void growEffect();
}