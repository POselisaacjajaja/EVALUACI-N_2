/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_read_text_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isaaczapatto
 */
public class EVA3_9_READ_TEXT_FILES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "/Users/isaaczapatto/Documents/files/prueba.txt";
        try {
            readUsingFiles(ruta);               //LEE EL ARCHIVO COMPLETO, INEFICIENTE PARA ARCHIVOS GRANDES
            readUsingFileReader(ruta);          //OPCIÓN PARA ARCHIVOS DE TEXTO
            readingUsingBufferedReader(ruta);   //COMBINACIÓN DE ARCHIVOS Y BUFFERED READERS
            readUsingScanner(ruta);             //SCANNER ES UNA HERRAMIENTA GENERAL PARA ENTRADAS (INPUTS)
            
        } catch (IOException e) {
            e.printStackTrace(); //imprimir la excepción
        }
        
        
    }
    
public static void readUsingFiles(String ruta) throws IOException, IOException, IOException, IOException{
    Path path = Paths.get(ruta); //Recibimos la ruta en formato de texto, la convertimos a formato Path
    //readAllLines regresa una lista de tipo String
    
    //List<String> contenidoArch = Files.readAllLines(path);
    //System.out.println(contenidoArch.toString());
    //for (int i = 0; i < contenidoArch.size(); i+++){
    //    System.out.println(contenidoArch.get(i));
    //}
    System.out.println("(LECTURA DE ARCHIVOS USANDO FILES)");
    byte[] arregloBytes = Files.readAllBytes(path);
    System.out.println(new String(arregloBytes));
    
    }
    
    public static void readingUsingBufferedReader(String ruta) throws IOException{
        System.out.println("");
        System.out.println("(LECTURA DE ARCHIVOS USANDO BUFFERED READER)");
        File file = new File(ruta);                           //File es la ruta para el archivo
        FileInputStream is = new FileInputStream(file);             //Abre el archivo
        InputStreamReader isReader = new InputStreamReader(is); //Con el archivo abierto, lee el archivo como Bytes
        BufferedReader breader = new BufferedReader(isReader); //Interpreta los bytes como caracteres
        String linea;
        while((linea = breader.readLine()) != null){            //Continua leyendo el archivo hasta que termine (hasta que archivo =null)
            System.out.println(linea);
        }
        breader.close(); //Cerrar el archivo
    }

    public static void readUsingFileReader(String ruta) throws IOException{
        System.out.println("");
        System.out.println("(LECTURA DE ARCHIVOS USANDO FILEREADER)");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader breader = new BufferedReader(fileReader); //Interpreta los bytes como caracteres
        String linea;
        while((linea = breader.readLine()) != null){            //Lee leyendo el archivo hasta que termine (hasta que archivo =null)
            System.out.println(linea);
        }
        breader.close(); //Cerrar el archivo
        fileReader.close(); //Cerrar el archivo
    }
    
    public static void readUsingScanner(String ruta) throws IOException{
        System.out.println("");
        System.out.println("(LECTURA DE ARCHIVOS USANDO SCANNER)");
        Path source = Paths.get(ruta);
        Scanner scanner = new Scanner(source);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close(); //Cerrar el archivo
    }
}

/*

\t tabulación
\n salto de línea (enter)

*/