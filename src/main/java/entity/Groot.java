package entity;

public class Groot extends Plant {
    String name = "Грут";
    String genus = "Flora colossus";
    private boolean grootIsGone = false;
    private final int grootIsGoneTreshold = 10;

    public Groot(int height, int waterLevel, Color flowerpotColor) {
        super(height, waterLevel, flowerpotColor);
        minWaterLevelNeededForGrow = 5;
        waterNeededForGrow = 4;
        growSpeed = 5;
        System.out.printf("Посажен новый %s\n", name);
    }

    @Override
    public void showPlantState() {
        System.out.println("------------------");
        System.out.printf("%s, род %s\n", name, genus);
        String msg = null;
        if (!grootIsGone) {
            msg = String.format("Высота: %d, уровень воды: %d, минимальный уровень воды для роста: %d\n",
                    height,
                    waterLevel,
                    minWaterLevelNeededForGrow);
        } else {
            msg = String.format("%s вырос и ушёл из горшка!\n", name);
        }
        System.out.printf(msg);
        System.out.println("------------------");
    }

    @Override
    public void growEffect() {
        if (height >= grootIsGoneTreshold && !grootIsGone) {
            grootIsGone = true;
            System.out.printf("%s вырос и ушёл по своим делам!\n", name);
        }
    }

    @Override
    public void grow(){
        if (grootIsGone) {
            System.out.printf("%s уже вырос и ушёл!\n", name);
        } else {
            super.grow();
        }
    }

    public void dance(){
        System.out.printf("%s танцует 〜(꒪꒳꒪)〜\n", name);
    }

    public void say(){
        System.out.printf("Я есть %s\n", name);
    }
}
