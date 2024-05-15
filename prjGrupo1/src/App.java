import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        ForCasaC fc = new ForCasaC();
        ForStalinS fs= new ForStalinS();
        ForStalinCasaSC fcs = new ForStalinCasaSC();
        WhileCasaC wc= new WhileCasaC();
        WhileStalinS ws= new WhileStalinS();
        WhileStalinCasaSC wsc = new WhileStalinCasaSC();


        /*
         * ForJuan ja = new ForJuan();
         * 
         * De esta forma se crea el objeto clase.
         * 
         * Para llamar al metodo de aquella clase es:
         * ja.forNombre(parametro 1, parametro 2);
         * 
         * Y de esa forma ya se ejecuta el codigo ingresdo dentro de aquel metodo.
         * //
         */
        
        


        char aux, symb;
        String auxString;
        int size = 0;
        boolean isCorrect = false;

        System.out.println("\n--> Taller 1 <--\n");
        

        do {
            System.out.print("-> Ingrese un tamaño definido mayor a 3: ");
            aux = keyboard.nextLine().charAt(0);

            if (((int) aux - '0') < 4) {
                System.out.println("\nHa ingresado un bajo del limite, ingrese nuevamente...\n");
            } else if (Character.isDigit(aux) && ((int) aux - '0') >= 4) {
                size = aux - '0';
            } else {
                System.out.println("\nHa ingresado un valor no numérico, ingrese nuevamente...\n");
                size = -1;
            }
        } while (size < 4);

        do

        {
            System.out.print("\n-> Ingrese un caracter: ");
            auxString = keyboard.nextLine();
            if (!auxString.isEmpty()) {
                symb = auxString.charAt(0);
                isCorrect = true;
            } else {
                System.out.println("\nHa ingresado un valor vacío, ingrese nuevamente...\n");
                symb = '.';
                isCorrect = false;
            }
        } while (!isCorrect);
        
        /*
         * Al crear su clase objeto y haber implementado, acontinuacion deben realizar:
         * ja.forNombre(size, symb);
         * 
         * Y se imprimira su letra
         */
        
        System.out.println("Size: " + size + ", Symb: " + symb);
       /*  fc.forApellidoC(size, symb);
        fs.forNombreS(size,symb);
        fcs.imprimirIniciales(size,symb);
        wc.whileApellidoC(size, symb);
        wsc.whileNombreApellido(size,symb);
        */
        ws.whileNombreS(size,symb);
        

        keyboard.close();
    }
}
