import java.util.Scanner;

import antonelacasa.DoWhileAntonela;
import antonelacasa.DoWhileAntonelaCasa;
import antonelacasa.DoWhileCasa;
import antonelacasa.ForAntonela;
import antonelacasa.ForAntonelaCasa;
import antonelacasa.ForCasa;
import antonelacasa.WhileAntonela;
import antonelacasa.WhileAntonelaCasa;
import antonelacasa.WhileCasa;
import juanarroyo.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        /* 
         * ForCasa fc = new ForCasa();
         * ForAntonela fa= new ForAntonela();
         * ForAntonelaCasa fac= new ForAntonelaCasa();
         * WhileCasa wc= new WhileCasa();
         * WhileAntonela wa= new WhileAntonela();
         * WhileAntonelaCasa wac= new WhileAntonelaCasa();
         * DoWhileCasa dwc= new DoWhileCasa();
         * DoWhileAntonela dwa= new DoWhileAntonela();
         * DoWhileAntonelaCasa dwac= new DoWhileAntonelaCasa();
        */
        
        

        /*
         * ForJuan fj = new ForJuan();
         * ForArroyo fa = new ForArroyo();
         * ForJuanArroyo fja = new ForJuanArroyo();
         * WhileJuan wj = new WhileJuan();
         * WhileArroyo wa = new WhileArroyo();
         * WhileJuanArroyo wja = new WhileJuanArroyo();
         * DoWhileJuan dwj = new DoWhileJuan();
         * DoWhileArroyo dwa = new DoWhileArroyo();
         * DoWhileJuanArroyo dwja = new DoWhileJuanArroyo();
         */

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

        char symb;
        String auxString;
        int size = 0;
        boolean isCorrect = false;

        System.out.println("\n--> Taller 1 <--\n");

        while (true) {
            System.out.print("-> Ingrese un tamaño definido mayor a 4: ");
            auxString = keyboard.nextLine();

            for (int i = 0; i < auxString.length(); i++) {
                if (!Character.isDigit(auxString.charAt(i))) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
            }

            if (isCorrect) {
                size = Integer.valueOf(auxString);
                if (size <= 4) {
                    System.out.println("\nHa ingresado un bajo del limite, ingrese nuevamente...\n");
                } else {
                    break;
                }
            } else {
                System.out.println("\nHa ingresado un valor no numérico, ingrese nuevamente...\n");
                size = -1;
            }
        }

        isCorrect = false;

        do {
            System.out.print("\n-> Ingrese un caracter: ");
            auxString = keyboard.nextLine();
            if (!auxString.isEmpty()) {
                symb = auxString.charAt(0);
                isCorrect = true;
            } else {
                System.out.println("\nHa ingresado un valor vacío, ingrese nuevamente...\n");
                symb = ' ';
                isCorrect = false;
            }
        } while (!isCorrect);

        /*
         * Al crear su clase objeto y haber implementado, acontinuacion deben realizar:
         * ja.forNombre(size, symb);
         * 
         * Y se imprimira su letra
         */

        /*
         * System.out.println("For - Juan Arroyo");
         * fj.forNombreJ(size, symb);
         * System.out.println("\n");
         * fa.forApellidoA(size, symb);
         * System.out.println("\n");
         * fja.forNombreApellidoJA(size, symb);
         * System.out.println("\n\nWhile - Juan Arroyo");
         * wj.whileNombreJ(size, symb);
         * System.out.println("\n");
         * wa.whileApellidoA(size, symb);
         * System.out.println("\n");
         * wja.whileNombreApellidoJA(size, symb);
         * System.out.println("\n\nDo While - Juan Arroyo");
         * dwj.doWhileNombreJ(size, symb);
         * System.out.println("\n");
         * dwa.doWhileApellido(size, symb);
         * System.out.println("\n");
         * dwja.doWhileNombreApellidoJA(size, symb);
         */


        /* 
         * fc.forCasac(size, symb);
         * fa.forAntonelaA(size, symb);
         * fac.forAntonelaCasaAC(size, symb, symb);
         * wc.whileCasaC(size, symb);
         * wa.whileAntonelaA(size, symb);
         * wac.whileAntonelaCasaAC(size, symb, symb);
         * dwc.dowhileCasaC(size, symb);
         * dwa.dowhileAntonelaA(size, symb);
         * dwac.dowhileAntonelaCasaAC(size, symb, symb);
        */
        

        keyboard.close();
    }
}
