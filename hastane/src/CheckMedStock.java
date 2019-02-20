import java.util.*;
import java.lang.*;
import java.io.*;

public class CheckMedStock  {
    private Formatter f;
    Methods m = new Methods();
    Scanner s = new Scanner(System.in);
     String a="medicine.txt";
     
                  String id="";
	String name="";
	String stock="";
                  String illness="";
                  String cost="";
   public void CheckMedStock(){
    Scanner s2= new Scanner(System.in);
        int secim2;
        int id3;
        System.out.println("1-Ilac  ekle:");
        System.out.println("2-Ilac bilgisi getir:"); // menu
        System.out.println("3-Ilac bilgisi guncelle:");
        System.out.println("0-Geri gel:");
        secim2=s2.nextInt();
        switch(secim2){
            case 1:
                m.createFile("medicine.txt");
                addMed();
                break;
            case 2:
                System.out.println("Ilac id'sini giriniz:(Tum listeyi gormek icin id'yi 0 girin)");
                id3=s2.nextInt();
                getMed(id3);
            break;
            case 3:
                updateMed();
                break;
            case 0:
                break;
}
    }
    

    public void addMed()  // ilac bilgisi ekleme
    {
        
        System.out.println("ilac id'sini giriniz:");
     
        id=s.next();
        m.writeFile(id, a);
        
        System.out.println("ilacin ismini giriniz:(bosluk yerine - kullanınız)");
        name=s.next();
        m.writeFile(name, a);
      
       System.out.println("ilacin kac adet oldugunu giriniz:");
       stock=s.next();
       m.writeFile(stock, a);
       
       System.out.println("Ilacın en sık kullanıldıgı hastalik:");
        illness=s.next();
       
        System.out.println("ilacin fiyatini giriniz:");
       cost=s.next();
       m.writeFile(cost+"\n", a);
     
        
        
    }
    
    public void getMed(int idd)
    {
        
       m.openFile("medicine.txt");
        m.readFile(idd);  // ilac bilgisi cekme
         m.closeFile();
    }
    
    public  void updateMed()  // ilac bilgisi guncelleme
    {
        int temp;
                      temp=  m.appendFile( a);   // dosya update (append)
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
                                stock=s.next();
                               m.list2.add(stock);
                               m.writeFile(m.list2.get(2), a);
                               System.out.println("yeni hastalık teshisi");
                                illness=s.next();
                               m.list2.add(illness);
                               m.writeFile(m.list2.get(3), a);
                               System.out.println("yeni gender:");
                                cost=s.next();
                               m.list2.add(cost+"\n");
                               m.writeFile(m.list2.get(4),a);                  
                
                      }
    }
}
    

    

