public class WhileStalinCasaSC {
    public void whileNombreApellido (int size , char symb){
        int i = 1;
        while (i <= size) {
            int j = 1;
            while (j <= size) {
                if (i == 1 || i == size || j == 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
        
            System.out.print("   ");
        
            j = 1;
            while (j <= size) {
                if (i == 1 || i == size || i - 1 == size / 2 || j == 1 && i <= size / 2 || j == size && i > size / 2) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
        
            System.out.println();
            i++;
        }
        System.out.println();
    }
    
}
