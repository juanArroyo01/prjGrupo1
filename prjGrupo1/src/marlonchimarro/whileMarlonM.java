package marlonchimarro;

public class whileMarlonM {
    public void whilemarlonm(int size, char symb) {
        System.out.println("Impresion '" + symb + "' patron:");

        int i = 1;
        while (i <= size) {
            int j = 1;
            while (j <= size) {
                if (j == 1 || j == size || (i + j == size + 1 && i <= size / 2 + 1) || (i == j && i <= size / 2)) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}