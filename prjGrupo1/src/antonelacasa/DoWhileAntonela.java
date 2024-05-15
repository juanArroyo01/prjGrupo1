package antonelacasa;

public class DoWhileAntonela {
    public void dowhileAntonelaA(int size, char symb){
        // Primer bucle
        int i = 0;
        do {
            System.out.print(symb);
            i++;
        } while (i < size);
        System.out.println();
        
        // Segundo bucle
        int j = 0;
        do {
            // Bucle interno
            int k = 0;
            do {
                if (k == 0 || k == size - 1 || j == (size / 2) - 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(' ');
                }
                k++;
            } while (k < size);
            System.out.println();
            j++;
        } while (j < size);
    }
}

