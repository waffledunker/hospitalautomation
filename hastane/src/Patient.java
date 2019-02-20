import java.util.*;
import java.lang.*;
import java.io.*;


public class Patient  {
   Formatter f=new Formatter();
    Scanner s= new Scanner(System.in);
    Methods m = new Methods();
    String a="Patient.txt";

                  String id="";
	String name="";
                  String surname="";
	String diagnose="";
                  String gender="";
                  
   
                  
      
   public void Patient(){
        
        int secim2;
        int id2;
        System.out.println("1-Hasta bilgisi ekle:");
        System.out.println("2-Hasta bilgisi getir:");
        System.out.println("3-Hasta bilgisi guncelle:");
        System.out.println("0-Geri gel:");
        secim2=s.nextInt();
        switch(secim2){
            case 1:
                
                m.createFile("patient.txt");
                addPatient();
                break;
            case 2:
                System.out.println("Hasta id'sini giriniz:(Tum listeyi gormek icin id'yi 0 girin)");
                id2=s.nextInt();
                getPatient(id2);
            break;
            case 3: 
                updatePatient();
                break;      
            case 0:
                break;
        }   
    }
    
    
        
    public void addPatient() { 
     
        
        System.out.println("Hasta id'sini giriniz:");
     
        id=s.next();
        m.writeFile(id, a);
        
        System.out.println("Hastanın ismini giriniz:(sadece isim)");
        name=s.next();
        m.writeFile(name, a);
      
       System.out.println("Hastanın soyismini giriniz:");
       surname=s.next();
       m.writeFile(surname, a);
       
        System.out.println("Hastanın sikayetini giriniz:(bosluk yerine - kullanınız)");
       diagnose=s.next();
       m.writeFile(diagnose, a);
     
        System.out.println("Hastanin cinsiyetini giriniz:(kız?erkek))");
        gender=s.next();
        m.writeFile(gender+"\n", a);
     
    } 

    public  void getPatient(int idd) {

       m.openFile("patient.txt");
        m.readFile(idd);
        m.closeFile();
        
    }
    public  void updatePatient() {
                int temp;
                           // dosyaya yazdırma (append)
                        temp= m.appendFile(a);
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
                               System.out.println("yeni hastalık teshisi");
                                diagnose=s.next();
                               m.list2.add(diagnose);
                               m.writeFile(m.list2.get(3), a);
                               System.out.println("yeni gender:");
                                gender=s.next();
                               m.list2.add(gender+"\n");
                               m.writeFile(m.list2.get(4),a);  
                               m.list2.clear();// list2 temizlenir.
        }
    }
    
    }
        
    
    
  
    
    
    
    
    
