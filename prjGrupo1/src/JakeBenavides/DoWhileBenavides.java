package JakeBenavides;

public class DoWhileBenavides {
    public void DoWhileApellidoB(int size, char symb){
        int i  = 0;
        do {
            System.out.print(symb);
            i++;
        } while (i < size);
        System.out.println();
        i = 0;

        do {
            int j = 0;
            do {
                if (j == 0 || j == size - 1) {
                    if ((j == size - 1) && i == (size / 2)) {
                        System.out.print(' ');
                    } else {
                        System.out.print(symb);
                    }
                } 
                else if (i == size / 2 && j < size - 2) {
                    System.out.print(symb);
                }
                else {
                    System.out.print(" ");
                }
                j++;
            } while (j < size);
            i++;
            System.out.println();
        } while (i < size);
        i= 0;

        do {
            System.out.print(symb);
            i++;
        } while (i < size -1);
    }   
}
