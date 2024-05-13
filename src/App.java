
import java.io.File;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        File fichero = new File("Prueba.txt");

        Scanner sc = new Scanner(fichero);

        String cadena = "";

        while (sc.hasNextLine()) {
            cadena+="\n"+sc.nextLine();
        }

        System.out.println("El nombre de fichero es " + fichero.getName() +" con su ruta relativa "+ fichero.getAbsolutePath() + "\nContiene:" + cadena);
        
   
    }


    
   
}