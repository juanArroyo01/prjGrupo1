import java.util.Scanner;
import niurkayupanqui.*;

public class App {
    static Scanner  keyboard = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int     size=0;
        String  symb="*";
        
        // ForJuan fj = new ForJuan();
        // ForArroyo fa = new ForArroyo();
        // ForJuanArroyo fja = new ForJuanArroyo();
        ForNiurka fn = new ForNiurka();
        ForYupanqui fy = new ForYupanqui();
        ForNiurkaYupanqui fny = new ForNiurkaYupanqui();
        WhileN wn = new WhileN();
        WhileY wy = new WhileY();
        WhileNY  wny = new WhileNY();
        DoWhileN dwn = new DoWhileN();
        DoWhileY dwy = new DoWhileY();
        DoWhileNY dwny = new DoWhileNY();
        System.out.print("-> Ingrese un tamaño de la letra  (mayor a 4): ");
        size = keyboard.nextInt();

        System.out.print("-> Ingrese un caracter: ");
        symb = keyboard.next();
        
        fn.forN(size, symb);
        System.out.println();
        fy.forY(size, symb);
        System.out.println();
        fny.NY(size, symb);
        System.out.println();
        wn.whileN(size, symb.charAt(0));
        System.out.println("");
        wy.whileY(size, symb.charAt(0));
        System.out.println("");
        wny.whileNY (size, symb.charAt(0));
        System.out.println("");
        dwn.doWhileN(size,symb.charAt(0));
        System.out.println("");
        dwy.doWhileY(size, symb.charAt(0));
        System.out.println("");
        dwny.doWhileNY(size, symb.charAt(0));
        


        /*
         * ForJuan ja = new ForJuan();
         * 
         * De esta forma se crea el objeto clase.
         * 
         * Para llamar al metodo de aquella clase es:
         * ja.forNombre(parametro 1, parametro 2);
         * 
         * Y de esa forma ya se ejecuta el codigo ingresdo dentro de aquel metodo.
         */

        // char symb;
        // String auxString;
        // int size = 0;
        // boolean isCorrect = false;

        // System.out.println("\n--> Taller 1 <--\n");

        // while (true) {
        //     System.out.print("-> Ingrese un tamaño definido mayor a 4: ");
        //     auxString = keyboard.nextInt();

        //     for (int i = 0; i < auxString.length(); i++) {
        //         if (!Character.isDigit(auxString.charAt(i))) {
        //             isCorrect = false;
        //         } else {
        //             isCorrect = true;
        //         }
        //     }

        //     if (isCorrect) {
        //         size = Integer.valueOf(auxString);
        //         if (size <= 4) {
        //             System.out.println("\nHa ingresado un bajo del limite, ingrese nuevamente...\n");
        //         } else {
        //             break;
        //         }
        //     } else {
        //         System.out.println("\nHa ingresado un valor no numérico, ingrese nuevamente...\n");
        //         size = -1;
        //     }
        // }

        // isCorrect = false;

        // do {
        //     System.out.print("\n-> Ingrese un caracter: ");
        //     auxString = keyboard.nextLine();
        //     if (!auxString.isEmpty()) {
        //         symb = auxString.charAt(0);
        //         isCorrect = true;
        //     } else {
        //         System.out.println("\nHa ingresado un valor vacío, ingrese nuevamente...\n");
        //         symb = ' ';
        //         isCorrect = false;
        //     }
        // } while (!isCorrect);

        /*
         * Al crear su clase objeto y haber implementado, acontinuacion deben realizar:
         * ja.forNombre(size, symb);
         * 
         * Y se imprimira su letra
         */

        // fj.forNombreJ(size, symb);
        // System.out.println("\n");
        // fa.forApellidoA(size, symb);
        // System.out.println("\n");
        // fja.forNombreApellidoJA(size, symb);

        keyboard.close();
    }
}
