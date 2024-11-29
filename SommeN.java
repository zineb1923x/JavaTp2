public class SommeN {
    static int somme(int n) {
        int s=0 ;
        for (int i=0 ; i<=n ;i++ ) {
            s=s+i ;
        }
        return s;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = somme(n);
        System.out.println(sum);
    }
}