package pennyjardriver;

public class PennyJar {

    private static int goal, allPennies = 0;
    private int pennies = 0;

    public static void setGoal(int goal) {
        PennyJar.goal = goal;
    }

    public static int getAllPennies() {
        return PennyJar.allPennies;
    }

    public int getPennies() {
        return this.pennies;
    }

    public void addPenny() {
        System.out.println("Clink!");
        this.pennies++;
        PennyJar.allPennies++;
        if (PennyJar.allPennies >= PennyJar.goal) {
            System.out.println("Time to spend!");
        }
    }
}
