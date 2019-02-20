import java.util.*;
import java.io.*;

public class Staff  {
    private Formatter f;
    Methods m = new Methods();
    Scanner s = new Scanner(System.in);
    String a="staff.txt";
                  String id="";
	String name="";
                  String surname="";
	String job="";
                  String gender="";
                  
   public void Staff(){
         Scanner s1= new Scanner(System.in);
        int secim2;
        int id2;
        System.out.println("1-Staff bilgisi ekle:");
        System.out.println("2-Staff bilgisi getir:"); // menu
        System.out.println("3-Staff bilgisi guncelle:");
        System.out.println("0-Geri gel:");
        secim2=s1.nextInt();
        switch(secim2){
            case 1:
                m.createFile(a);
                addStaff();
                break;
            case 2:
                System.out.println("Staff id'sini giriniz:(Tum listeyi gormek icin id'yi 0 girin)");
                id2=s1.nextInt();
                getStaff(id2);
            break;
            case 3:
                updateStaff();
                break;
            case 0:
                break;
    }
    }
    
    
    
    public void addStaff(){  // staff ekleme
    
        // date() ekle
        
        System.out.println("Staff id'sini giriniz:");
     
        id=s.next();
        m.writeFile(id, a);
        
        System.out.println("Staff ismini giriniz:(sadece isim)");
        name=s.next();
        m.writeFile(name, a);
      
       System.out.println("Staff soyismini giriniz:");
       surname=s.next();
       m.writeFile(surname, a);
       
        System.out.println("Staff meslegini giriniz:(bosluk yerine - kullanınız)");
       job=s.next();
       m.writeFile(job, a);
     
        System.out.println("Hastanin cinsiyetini giriniz:(kadin?erkek");
        gender=s.next();
        m.writeFile(gender+"\n", a);
        
    }
    public  void getStaff(int idd)
    {
       m.openFile("staff.txt");  // staff bilgisi cekme
        m.readFile(idd);
        m.closeFile();
    
    }
    public  void updateStaff()
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
                                surname=s.next();
                               m.list2.add(surname);
                               m.writeFile(m.list2.get(2), a);
                               System.out.println("yeni meslek");
                                job=s.next();
                               m.list2.add(job);
                               m.writeFile(m.list2.get(3), a);
                               System.out.println("yeni gender:");
                                gender=s.next();
                               m.list2.add(gender+"\n");
                               m.writeFile(m.list2.get(4),a);                  
    }
    }
    
    
}
