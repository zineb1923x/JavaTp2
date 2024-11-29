public class Parite {
    static void verifierParite (int a ) {
        boolean isPair = (a%2==0);
        if (isPair) {
            System.out.println("le nombre que vous avez saisi est pair");
        }
        else {
            System.out.println("le nombre que vous avez saisi est impair");
        }
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        verifierParite(a);
    
}
}