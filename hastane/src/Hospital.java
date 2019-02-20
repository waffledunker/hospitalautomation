import java.util.*;
import java.io.*;
import java.lang.*;


public class Hospital extends Abstract{
    
    public static void main(String args[])
    {
            
        Methods m=new Methods();
        int secim;
        
                    welcome();
              do{   
                    System.out.println("\nYapmak istediginiz islemi seciniz:");
                    System.out.println("1-Hasta Kaydı veya Güncelleme");
                    System.out.println("2-Hastane Calisani Kaydi veya Güncellemesi");
                    System.out.println("3-Randevu Alma");
                    System.out.println("4-Ilac Stogu Sorgulama");
                    System.out.println("5-Ucret Kaydi Ekleme/Sorgulama");
                    System.out.println("6-Cikis:");
                    Scanner cin =new Scanner(System.in);
                    secim=cin.nextInt();
                    switch(secim)
                    {
                        case 1:
                            Patient p1 =new Patient();
                           p1.Patient();
                           m.closeFile();
                           done();
                           break;
                        case 2:
                            Staff p2=new Staff();
                            p2.Staff();
                            m.closeFile();
                            done();
                            break;
                        case 3:
                            Appointment p3= new Appointment();
                            p3.Appointment();
                            m.closeFile();
                            done();
                            break;
                        case 4:
                            CheckMedStock p4 = new CheckMedStock();
                            p4.CheckMedStock();
                            m.closeFile();
                            done();
                            break;
                        case 5:
                            Billing p5 = new Billing();
                            p5.Billing();
                            m.closeFile();
                            done();
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Yanlis giris!");
                    }
                }while(secim!=6);
    }
    
}
