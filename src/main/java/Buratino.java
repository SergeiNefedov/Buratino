public class Buratino {
    static int startApple;
    static int takeKarabas;
    static int finishApple;

    public static void main(String[] args){
        startApple = 100;
        takeKarabas = 25;
        finishApple = startApple - takeKarabas;
        System.out.println("startApple=" + startApple);
        System.out.println("takeKarabas=" + takeKarabas);
        System.out.println("finishApple=" + finishApple);
    }
}
