package JakeBenavides;

public class ForJakeBenavides {
   public void ForNombreApellidoJB(int size, char symb){
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            if (j == size / 2 || (i == size - 1 && j <= size / 2)) {
                System.out.print(symb);
            } 
            else if(i == 0 && j <= size){
                System.out.print(symb);
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        
        for (int j = 0; j < size ; j++) {
            if (j == 0 || j == size -1 || (i == 0 || i == size / 2 || i == size - 1) && j < size -1) {
                System.out.print(symb);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
   }  
}
