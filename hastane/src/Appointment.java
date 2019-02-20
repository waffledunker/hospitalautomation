import java.util.*;
import java.io.*;

public class Appointment {
    private Formatter f;
    Methods m = new Methods();
    Scanner s=new Scanner(System.in);
     String a="appointment.txt";
     
    String id="";
    String name="";
    String surname="";
    String fromwho="";
    String date="";
    
   public void Appointment(){
        
        int secim2;
        int id2;
        System.out.println("1-Randevu ekle:");
        System.out.println("2-Randevu bilgisi getir:");
        System.out.println("3-Randevu bilgisi guncelle:");
        System.out.println("0-Geri gel:");
        secim2=s.nextInt();
        switch(secim2){
            case 1:
                addAppointment();
                break;
            case 2:
                System.out.println("Randevu id'sini giriniz:(Tum listeyi gormek icin id'yi 0 girin)");
               id2=s.nextInt();
                getAppointment(id2);
            break;
            case 3:    
                updateAppointment();
                break;
            case 0:
                break;
    }
    }
    
    
    
    public void addAppointment()
    {
       
        System.out.println("Randevu id'sini giriniz:");
     
        id=s.next();
        m.writeFile(id, a);
        
        System.out.println("Randevu alanın ismini giriniz:(sadece isim)");
        name=s.next();
        m.writeFile(name, a);
      
       System.out.println("Randevu alanın soyismini giriniz:");
       surname=s.next();
       m.writeFile(surname, a);
       
        System.out.println("Kimden randevu alınacak:(dr.?/bölum)");
       fromwho=s.next();
       m.writeFile(fromwho, a);
     
        System.out.println("randevunun tarihini giriniz:(gun-ay-yıl-saat)");
        date=s.next();
        m.writeFile(date+"\n", a);
    }
    
    public void getAppointment(int idd)
    {
        m.openFile("patient.txt");
        m.readFile(idd);
         m.closeFile();
    }
    public  void updateAppointment()
    {
        int temp;
                           temp= m.appendFile( a);   // dosyaya yazdırma (append)
                           if(temp==0){
                                System.out.println("yeni id:");
                                id=s.next();
                               m.list2.add(id);
                               m.writeFile(m.list2.get(0),a);
                               System.out.println("yeni isim:");
                                name=s.next();
                               m.list2.add(name);
                               m.writeFile(m.list2.get(1), a);
                               System.out.println("yeni soyisim:");
                                surname=s.next();
                               m.list2.add(surname);
                               m.writeFile(m.list2.get(2), a);
                               System.out.println("Yeni randevu kimden alınacak:");
                                fromwho=s.next();
                               m.list2.add(fromwho);
                               m.writeFile(m.list2.get(3), a);
                               System.out.println("yeni randevu tarihi:");
                                date=s.next();
                               m.list2.add(date+"\n");
                               m.writeFile(m.list2.get(4),a);  
                               m.closeFile();
    }
    }
}
