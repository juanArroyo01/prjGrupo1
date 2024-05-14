package marlonchimarro;

public class doWhileMarlonChimarroMC {
    public void dowhilemarlonchimarromc(int size, char symb) {

        // Impresion de ambas letras
        System.out.println("Printing Patterns:");
        int i = 1;
        do {
            // Letra M
            int j = 1;
            do {
                if (j == 1 || j == size || (i + j == size + 1 && i <= size / 2 + 1) || (i == j && i <= size / 2)) {
                    System.out.print(symb + " ");
                } else {
                    System.out.print("  ");
                }
                j++;
            } while (j <= size);

            // Separador
            System.out.print("  ");

            // Letra C
            j = 1;
            do {
                if (i == 1 || i == size || j == 1) {
                    System.out.print(symb + " ");
                } else {
                    System.out.print("  "); 
                }
                j++;
            } while (j <= size);

            System.out.println(); // Siguiente linea
            i++;
        } while (i <= size);

    }
}