import java.util.*;
import java.lang.*;
import java.io.*;

public class Billing {
    private Formatter f;
    Methods m = new Methods();
    Scanner s = new Scanner(System.in);
    String a="billing.txt";
    
                  String id="";
                  String date = "";
                  String medicine ="";
                  String docname="";
                  String total = "";
                  
    
   public void Billing(){
        Scanner s1= new Scanner(System.in);
        int secim2;
        int id2;
        System.out.println("1-Fatura ekle:");
        System.out.println("2-Fatura bilgisi getir:");//menu
        System.out.println("0-Geri gel:");
        secim2=s1.nextInt();
        switch(secim2){
            case 1:
                m.createFile(a);
                addBilling();
                break;
            case 2:
                System.out.println("Hasta id'sini giriniz:(Tum listeyi gormek icin id'yi 0 girin)");
                id2=s1.nextInt();
                getBilling(id2);
            break;   // billingde update yok cunku guvenli olmazdı. 
            case 0:
                break;
            
    }
    }
    
    
    public  void addBilling()  // fatura ekleme
    {
        
        System.out.println("Hasta id'sini giriniz:");
     
        id=s.next();
        m.writeFile(id, a);
      
       
       System.out.println("islemin bitis tarihini giriniz:(gun-ay-yıl-saat seklinde)");
       date=s.next();
       m.writeFile(date, a);
     
        System.out.println("Hastaya verilen(eger varsa) ilac adlarını giriniz:(ilac1-ilac2 seklinde/yoksa -yok- yazınız.)");
        medicine=s.next();
        m.writeFile(medicine, a);
        
        
        System.out.println("Ilgilenen doktor ve bolum adı:(araya - koyarak yazınız");
        docname=s.next();
        m.writeFile(docname, a);
        
        
        System.out.println("Hesaplanan toplam tutarı yaziniz:");
        total=s.next();
        m.writeFile(total+"\n", a);
    
    }
    
    public void getBilling(int idd)  // fatura bilgisi cekme
    {
        
       m.openFile("billing.txt");
        m.readFile(idd);
         m.closeFile();
    }
    
    
    }
    

