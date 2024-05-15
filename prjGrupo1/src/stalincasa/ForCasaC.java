public class ForCasaC {
    public void forApellidoC(int size, char symb) {
        for (int i = 0; i < size - 1; i++) {
            System.out.print(symb);
            for (int j = 1; j < size; j++) {
                if (i == 0 || j == size) {
                    System.out.print(symb);

                } else {
                    System.out.print(" ");
                }
        }
        System.out.println(); 
        } 
        for(int k =0; k < size ; k++) {
            System.out.print(symb); 
        }
        System.out.println(); 
    }
    
}
