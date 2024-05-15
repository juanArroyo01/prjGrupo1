package JakeBenavides;

public class DoWhileJakeBenavides {
    public void DoWhileNombreApellidoJB(int size, char symb){
        int i  = 0;
        
        do {
            int j = 0;
            do {
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
            } while (j < size);
            System.out.print(" ");
            j = 0;

            do {
            if (j == 0 || j == size -1 || (i == 0 || i == size / 2 || i == size - 1) && j < size -1) {
                System.out.print(symb);
            } else {
                System.out.print(" ");
            }
                j++;
            } while (j < size);
            System.out.println();
            i++;
        } while (i < size);
        
    }
}
