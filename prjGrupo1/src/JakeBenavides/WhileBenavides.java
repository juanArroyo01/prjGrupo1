package JakeBenavides;

public class WhileBenavides {
    public void WhileApellidoB(int size, char symb){
        int i = 0;
        while (i < size){
            System.out.print(symb);
            i++;
        }
        System.out.println();
        i = 0;
        while (i < size) {
            int j = 0;
            while (j < size) {
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
                j++;
            }
            i++;
            System.out.println();
        }
        i = 0;
        while (i < size - 1){
            System.out.print(symb);
            i++;
        }
    }
}
