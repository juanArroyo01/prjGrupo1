public class WhileStalinS {
    public void whileNombreS(int size , char symb){
         int i = 0;
        while (i < size) {
            int j = 0;
            while (j < size) {
                if (i == 0 || i == size - 1 || i == size / 2) {
                    System.out.print(symb);
                } else if (i < size / 2 && j == 0) {
                    System.out.print(symb);
                } else if (i > size / 2 && j == size - 1) {
                    System.out.print(symb);
                } else {
                    System.out.print(' ');
                }
                j++;
            }
            System.out.println();
            i++;
        }
        

    }
}
