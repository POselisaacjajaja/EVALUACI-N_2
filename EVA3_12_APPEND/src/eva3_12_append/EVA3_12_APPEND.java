/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_append;

import java.io.BufferedWriter;
import java.io.File;
import static java.io.FileDescriptor.out;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isaaczapatto
 */
public class EVA3_12_APPEND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "/Users/isaaczapatto/Documents/files/prueba";
        try {
            writeUsingBufferedWriter(ruta, "Prueba de APPEND");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_APPEND.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta + "ArchivoBufferedWriter.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) { //Escribimos 10 líneas al archivo
            bufWriter.write((i + 1) + " " + datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        fileWriter.close();
    }
}
