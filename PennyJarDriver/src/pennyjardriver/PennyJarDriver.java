package pennyjardriver;

public class PennyJarDriver {

    public static void main(String[] args) {
        PennyJar pennyJar1 = new PennyJar();
        PennyJar pennyJar2 = new PennyJar();
        PennyJar.setGoal(4000);
        for (int i = 0; i < 4010; i++) {
            pennyJar1.addPenny();
        }
        pennyJar2.addPenny();
        System.out.println(pennyJar1.getPennies());
        System.out.println(PennyJar.getAllPennies());
    }
}
