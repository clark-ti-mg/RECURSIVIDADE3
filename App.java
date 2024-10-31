public class App {

    public static boolean busca(int x, int[] v, int primeiro, int ultimo) {
        if (primeiro > ultimo) {
            return false;
        } else {
            int meio = (ultimo + primeiro) / 2;
            if (x < v[meio]) {
                return busca(x, v, primeiro, meio - 1);
            } else if (x > v[meio]) {
                return busca(x, v, meio + 1, ultimo);
            } else {
                return true;
            }

        }
    }

    public static void main(String[] args) throws Exception {
        int[] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        if (busca(-1, v, 0, v.length - 1)) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}
