package JakeBenavides;

public class ForBenavides{
    public void ForApellidoB(int size, char symb){

        for (int i = 0; i < size - 1; i++) {
            System.out.print(symb);
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1) {
                    if ((j == size - 1) && i == (size / 2)) {
                        System.out.print(' ');
                    } else {
                        System.out.print(symb);
                    }
                } else if (i == size / 2 && j < size - 2) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < size - 1; i++) {
            System.out.print(symb);
        }
    }
}

