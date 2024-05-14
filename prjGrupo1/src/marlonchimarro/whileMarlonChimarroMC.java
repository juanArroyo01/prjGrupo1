package marlonchimarro;

public class whileMarlonChimarroMC {
    public void whilemarlonchimarromc(int size, char symb) {

        // Impresion de letras MC
        System.out.println("Imprimiendo letras:");
        int i = 1;
        while (i <= size) {
            // Letra M
            int j = 1;
            while (j <= size) {
                if (j == 1 || j == size || (i + j == size + 1 && i <= size / 2 + 1) || (i == j && i <= size / 2)) {
                    System.out.print(symb + " ");
                } else {
                    System.out.print("  "); // Espacio
                }
                j++;
            }

            // Separador
            System.out.print(" ");

            // Letra C
            j = 1;
            while (j <= size) {
                if (i == 1 || i == size || j == 1) {
                    System.out.print(symb + " ");
                } else {
                    System.out.print("  "); 
                }
                j++;
            }

            System.out.println(); // Siguiente linea
            i++;
        }

    }
}