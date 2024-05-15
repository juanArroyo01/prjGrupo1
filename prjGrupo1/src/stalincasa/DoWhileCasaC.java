public class DoWhileCasaC{
    public void doWhileApellidoC (int size,char symb){
        int i = 0;
        do {
            System.out.print(symb);
        
            int j = 1;
            do {
                if (i == 0 || j == size) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < size);
        
            System.out.println();
            i++;
        } while (i < size - 1);
        
        int k = 0;
        do {
            System.out.print(symb);
            k++;
        } while (k < size);
        System.out.println();
    }
    
}
