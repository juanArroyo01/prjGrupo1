package antonelacasa;

public class ForAntonela {
    public void forAntonelaA(int size, char symb) {

        // Imprime linea superior horizontal de la A
        for (int i = 0; i < size; i++) {
            System.out.print(symb);
        }
        System.out.println();
        // Imprime lineas laterales y de en medio 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1) {
                    System.out.print(symb);
                } else if (i == (size / 2) - 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
