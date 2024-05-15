package antonelacasa;

public class WhileAntonela {
    public void whileAntonelaA(int size, char symb ){
        int i = 0;
        while (i < size) {
            System.out.print(symb);
            i++;
        }
        System.out.println();
        
        i = 0;
        while (i < size) {
            int j = 0;
            while (j < size) {
                if (j == 0 || j == size - 1 || i == (size / 2) - 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(' ');
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    }
    

