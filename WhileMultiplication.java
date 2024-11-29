public class WhileMultiplication {
    void afficherMultiplication(int n) {
        int i = 0;
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            WhileMultiplication multiplication = new WhileMultiplication();
            multiplication.afficherMultiplication(n);
        } else {
            System.out.println("Please provide a number as a command-line argument.");
        }
    }
}