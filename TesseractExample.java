package Logins;

import net.sourceforge.tess4j.*;
import java.io.*;
public class TesseractExample{
    public String getImgText(String imageLocation) {
      ITesseract instance = new Tesseract();
      try 
      {
         String imgText = instance.doOCR(new File(imageLocation));
         return imgText;
      } 
      catch (TesseractException e) 
      {
         e.getMessage();
         return "Error while reading image";
      }
   }
   public static void main ( String[] args)
   {
      TesseractExample app = new TesseractExample();
      System.out.println(app.getImgText("C:\\Users\\Admin\\Desktop\\abc.jpg"));
   }
}