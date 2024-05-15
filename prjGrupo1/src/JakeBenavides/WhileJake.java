package JakeBenavides;

public class WhileJake {
    public void WhileNombreJ(int size, char symb){
        int i = 0;
        while (i < size) {
            System.out.print(symb);
            i++;
        }
        i = 0;
        System.out.println();

        while (i < size) {
            int j = 0;
            while (j < size) {
                if (j == size / 2) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        i = 0;

        while (i <= size/2) {
            System.out.print(symb);
            i++;
        }
    }
}
