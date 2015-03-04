/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serilizationn;

import java.io.*;

/*
 * @author zhr
 */
public class Serilizationn 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Serileştirme
      /*   try
        {
           Data veri=new Data("zehra","özer",22); // nesnemizi oluşturduk
           
           FileOutputStream fout=new FileOutputStream("veri.out"); // dosya oluşturuldu., nesnemizi serileştdikten sonra fiziksel olarak üzerinde saklayacağımız dosyayı oluşturduk
           
           ObjectOutputStream outt=new ObjectOutputStream(fout); // serileştirme için nesneyi oluşturduk
        
           outt.writeObject(veri);//nesne dosyaya yazıldı -- > serileştirme yapıldı. 
      
           outt.close(); // stream kapatıldı. 
        }
        catch(Exception e)
        {
         System.out.println("error in serialization process..");
         e.printStackTrace();
                 
        }
        */

        
        // diserilization
        try
        {
              Data d; //Nesnemizi tanımladık

             FileInputStream fIn=new FileInputStream("veri.out"); //Dosyamızı okumak üzere açtık
              ObjectInputStream in=new ObjectInputStream(fIn); //Nesnemizi okuyacak olan sınıfın örneğini oluşturduk
              d=(Data)in.readObject(); //nesnemize okuduğumuz nesneyi atadık
              System.out.println("DATA OF OBJECT");
              System.out.println(d.getName()+" "+d.getSurname()+" "+d.getAge());

              System.out.println("Process ends...");
        }
         catch(Exception e)
        {
              System.out.println("Error in serializtion process!\n");
           e.printStackTrace();
        }
                
        
    }
    
}
