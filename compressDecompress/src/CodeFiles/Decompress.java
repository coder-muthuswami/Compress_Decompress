/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeFiles;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author bijja
 */
public class Decompress {
//    public static void method(File file) throws  IOException{
//        String fileDirectory = file.getParent();
//        System.out.println(fileDirectory);
//        
//        FileInputStream fis = new FileInputStream(file);
//        GZIPInputStream gzipIS= new GZIPInputStream(fis);
//        FileOutputStream fos = new FileOutputStream(fileDirectory + "\\decompressed.txt");
//        
//        byte[] buffer = new byte[1024];
//        int len;
//        
//        while ((len=gzipIS.read(buffer)) != -1){
//        fos.write(buffer,0,len);
//    }
//        gzipIS.close();
//        fis.close();
//        fos.close();
//        
//    }
//    public static void main(String[] args) throws IOException{
//        File path= new  File("‪‪C:\\Users\\bijja\\Desktop\\compressFile.gz");
//        method(path);
     public static void method(File file)
        throws IOException
    {
  
        String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "\\Decompressedfile.txt"); 
 
        byte[] buffer = new byte[1024];
  
        int len;
        
        while ((len = gzipIS.read(buffer)) != -1) {
//            System.out.println(len);
            fos.write(buffer, 0, len);
        }
        
        gzipIS.close();
        fos.close();
        fis.close();
  
    }
  
    // Method 2
    // Main driver method
    public static void main(String[] args)
        throws IOException
    {
  
        // Creating an object of File class and
        // providing local directory path of a file
        File path = new File("C:\\Users\\bijja\\Desktop\\Compressedfile.gz");
  
        // Calling the Method1 in main() to
        // convert file to byte array
        method(path);
    }
    
}
