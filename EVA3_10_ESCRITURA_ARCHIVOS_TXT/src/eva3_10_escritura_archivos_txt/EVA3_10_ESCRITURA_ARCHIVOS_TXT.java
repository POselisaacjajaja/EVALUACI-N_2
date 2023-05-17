/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_escritura_archivos_txt;
//Users/isaaczapatto/Documents/files

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
public class EVA3_10_ESCRITURA_ARCHIVOS_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "/Users/isaaczapatto/Documents/files/prueba";
        try {
            writeUsingFiles(ruta, "Prueba de escritura de archivos usando CLASE FILES xdxdxddd voyareprobarcálculo:(");
            writeUsingFileWriter(ruta, "Prueba de escritura de archivos usando CLASE FILEWRITER XD enseriovoyareprobarcálculoayúdenme");
            writeUsingBufferedWriter(ruta, "Prueba de escritura de archivos usando CLASE BUFFERED WRITER XD yanoséquéhacerconmigomismo");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRITURA_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
        //Si el archivo no existe, lo crea.
        //Si el archivo existe, lo sobreescribe.
        Path path = Paths.get(ruta + "archivoFiles.txt");
        Files.write(path, datos.getBytes());
    }
    public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta + "ArchivoFileWriter.txt");
        FileWriter filewriter = new FileWriter(file);
        filewriter.write(datos);
        filewriter.close();
    }
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        Path path = Paths.get(ruta + "ArchivoBufferedWriter.txt");
        OutputStream out = Files.newOutputStream(path);
        OutputStreamWriter osWriter = new OutputStreamWriter(out);
        BufferedWriter bufWriter = new BufferedWriter(osWriter);
        for (int i = 0; i < 10; i++) { //Escribimos 10 líneas al archivo
            bufWriter.write((i + 1) + " " + datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        osWriter.close();
    }
}

