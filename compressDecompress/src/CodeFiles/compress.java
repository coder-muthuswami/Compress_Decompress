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
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author bijja
 */
public class compress {
//    public static void method(File file) throws  IOException{
//        String fileDirectory = file.getParent();
//        System.out.println(fileDirectory);
//        FileInputStream fis  = new FileInputStream(file);
//        FileOutputStream fos = new FileOutputStream(file+"\\compressFile.gz");
//        GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
////        
//        byte [] buffer= new byte[1024];
//        int len;
////        
//        while((len=fis.read(buffer))!= -1){
//          gzipOS.write(buffer,0,len);
//          System.out.print(len);
//        }
//        
//        fis.close();
//        gzipOS.close();
//        fos.close();
//    }
//    public static void main(String[] args) throws  IOException{
//        File path= new File ("‪‪‪D:\\INFO DOCS\\aadgar back.jpg");
//
//        method(path);
    
    public static void method(File file)
        throws IOException
    {
  
        String fileDirectory = file.getParent();
        System.out.println(fileDirectory);
       

 FileInputStream fis = new FileInputStream(file);
//       System.out.println(fileDirectory);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "\\Compressedfile.gz");    
        GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
  
        byte[] buffer = new byte[1024];
//  
        int len;
//  
        while ((len = fis.read(buffer)) != -1) {
//  
            gzipOS.write(buffer, 0, len);
        }
        gzipOS.close();
        fos.close();
        fis.close();
  
    }
    public static void main(String[] args)
        throws IOException
    {
  
        File path = new File("C:\\Users\\bijja\\Desktop\\sample.txt");
        method(path);

    }
}
