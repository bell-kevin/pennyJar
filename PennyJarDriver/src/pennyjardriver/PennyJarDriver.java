package pennyjardriver;

public class PennyJarDriver {

    public static void main(String[] args) {
         PennyJar pennyJar1 = new PennyJar();
        PennyJar pennyJar2 = new PennyJar();
        PennyJar.setGoal(4000);
        PennyJar1.addPenny();
        PennyJar1.addPenny();
        PennyJar2.addPenny();
        System.out.println(pennyJar1.getPennies());
        System.out.println(PennyJar.getAllPennies());
    }  
}
