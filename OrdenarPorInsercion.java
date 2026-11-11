public class OrdenarPorInsercion {

    public static void main(String[] args) {
        int[] A = {905, 210, 550, 102, 443};

        System.out.print("Arreglo original: ");
        imprimirArreglo(A);

        ordenarPorInsercion(A);

        System.out.print("Arreglo ordenado: ");
        imprimirArreglo(A);
    }

    public static void ordenarPorInsercion(int[] A) {
        int N = A.length;

        for (int i = 1; i <= N - 1; i++) {
            int clave = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > clave) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = clave;
        }
    }

    public static void imprimirArreglo(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}