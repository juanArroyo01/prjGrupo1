package JakeBenavides;

public class WhileJakeBenavides {
    public void WhileNombreApellidoJB(int size, char symb){
        int i  = 0;
        while (i < size) {
            int j = 0;
            while (j < size) {
                if (j == size / 2 || (i == size - 1 && j <= size / 2)) {
                    System.out.print(symb);
                } 
                else if(i == 0 && j <= size){
                    System.out.print(symb);
                }
                else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.print(" ");
            j = 0;

            while (j < size) {
                if (j == 0 || j == size -1 || (i == 0 || i == size / 2 || i == size - 1) && j < size -1) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
