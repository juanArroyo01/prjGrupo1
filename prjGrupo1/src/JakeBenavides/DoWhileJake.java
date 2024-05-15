package JakeBenavides;

public class DoWhileJake {
    public void DoWhileNombreJ(int size, char symb){
        int i = 0;
        do {
            System.out.print(symb);
            i++;
        } while (i < size);
        System.out.println();

        i = 0;
        do {
            int j = 0;
            do {
                if (j == size / 2) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < size);
            i++;
            System.out.println();
        } while (i < size);
        i = -1;

        do {
            System.out.print(symb);
            i++;
        } while (i < size/2);
    }  
}
