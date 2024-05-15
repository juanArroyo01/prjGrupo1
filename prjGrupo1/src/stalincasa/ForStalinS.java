public class ForStalinS {
    public void forNombreS(int size, char symb) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || i == size/2) {
                    System.out.print(symb);
                } else if (i < size/2 && j==0) {
                    System.out.print(symb);
                } else if (i > size /2 && j == size - 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
        System.out.println();
    }
    
}
