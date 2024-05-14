package marlonchimarro;

public class forMarlonM {
    public void formarlonm(int size, char symb) {

        System.out.println("Impresion '" + symb + "' patron:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size || (i + j == size + 1 && i <= size / 2 + 1) || (i == j && i <= size / 2)) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}