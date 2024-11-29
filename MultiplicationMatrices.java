public class MultiplicationMatrices {
    public static int[][] multiplierDeuxMatrices(int[][] A,  int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        // Vérifier si la multiplication est possible
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Le nombre de colonnes de A doit être égal au nombre de lignes de B.");
        }

        // Créer la matrice de résultat
        int[][] result = new int[rowsA][colsB];

        // Multiplication de matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Multiplier les matrices A et B
        int[][] resultat = multiplierDeuxMatrices(A, B);

        // Afficher la matrice de résultat
        System.out.println("Résultat de la multiplication :");
        for (int i = 0; i < resultat.length; i++) {
            for (int j = 0; j < resultat[0].length; j++) {
                System.out.print(resultat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
