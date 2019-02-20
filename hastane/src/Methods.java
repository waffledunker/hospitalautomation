
import java.io.*;
import java.util.*;

 // tum methodlar burada bulunuyor!!!!
public class Methods { // degiskenler ve nesneler
Formatter f2=new Formatter();
    BufferedWriter bw =null;
    List<String> list1= new ArrayList<>();
    List<String> list2= new ArrayList<>();
   private Scanner s;
   private Scanner s2 = new Scanner(System.in);
   String id;
   String name;
   String surname;
   String staff;
   String diagnose;
   String gender;
   String billing;
   
    
    
    
    
     public void closeFile(){ // dosya,islem bitince bellek tasarrufu icin kapatılır.
        f2.close();
    }
    
     
        public void writeFile(String input,String adres){ //dosyaya append true yapılarak yazım islemi yapılır.
            String cumle=" "+input;
      try{
        FileOutputStream f=new FileOutputStream(adres,true) ;
        PrintStream yaz=new PrintStream(f);
        yaz.print(cumle);
      }
      catch(IOException e){   
          System.out.println("error: "+e);
      }
        }
 
     
     public  void createFile(String adres){ // dosya olusturulur veya onceden var mı kontrol edilir.
         if(adres.isEmpty()){
        try {
          f2 = new Formatter(adres);
        
        }
        catch(FileNotFoundException e){
            System.out.println("error"+e);
        }
    }
     }
     
     public void openFile(String address){  // dosyayı acma(okuma,yazma vb islemleri icin acmak gerek.
         
         try{
             s=new Scanner(new File(address));
             
         }
         catch(FileNotFoundException e){
             System.out.println("error "+e);
         }
         
     }
     
     public void readFile(int input){  // girilen id ye gore arama yapma ve dosyanın ciktisini alma
         
         String a=String.valueOf(input);
         
    while (s.hasNext()){
            
        if(input==0){
              id=s.next();
         name=s.next();
         surname = s.next();
         diagnose = s.next();
         gender = s.next();
        System.out.printf("%s ^^^ %s ^^^ %s ^^^%s ^^^%s ^^^   \n",id,name,surname,diagnose,gender); 
        }
        else if(input!=0 || input>0){
            id=s.next();
            if(a.equals(id)){ 
         name=s.next();
         surname = s.next();
         diagnose = s.next();
         gender = s.next();
        System.out.printf("%s ^^^ %s ^^^ %s ^^^%s ^^^%s ^^^   \n",id,name,surname,diagnose,gender); 
        break;
        }
        }  
        if(input<0){
            System.out.println("Boyle bir id yer almamaktadır.");
            break;
        }
    }
    
     }

     
     public int appendFile(String adres){   // dosyayı guncelleme
         int secim;
         String temp="temp.txt";
         String temp2=" ";
         Scanner k=new Scanner(System.in);
         int secim3;
         String secim4;
         openFile(adres);//istenen dosyayi ac
         System.out.printf("%s"+" dosyası acildi.",adres);
         do{
             System.out.println("Hangi islemi yapmak istersiniz:");
             System.out.println("1-Varolan bilgiyi degistirmek:");//menu
             System.out.println("2-Varolan bilgiyi silmek:");
             System.out.println("3-Cikis:");
            secim= k.nextInt();
             switch(secim){
                 case 1:  // yanlis id girilince hata dondurmeyi hallet !!!!
                     System.out.println("Bilgisini degistirmek istediginiz seyin idsini giriniz:");
                     secim3=k.nextInt();
                     secim4=String.valueOf(secim3); //int,stringe aktarılır.(kıyas yapma kolay olsun diye ama cok gerekli de degil)


                         while(s.hasNext()){  // dosya taranır girilen inputa gore veri aranır
                             if(secim3==0 || secim3<0){  //  idye gore secim yapılır.yanlis girisler onlenir.
                            System.out.println("Yanlis giris.");
                            return 1;
                           }
                             id=s.next();
                             if(!secim4.matches(id) && s.hasNext()==false){ // olup olmama kontrolu
                                 System.out.println("id bulunamadı.");
                                 return 1;
                             }
                             
                              if(secim3>0){
                                id=s.next(); 

                          if(secim4.matches(id)){  // input ile tarama sonucu bulunan id eslesiyorsa sonuc yansıtılır.
                                System.out.println("Aradıgınız id,sistemdekiyle eslesti.\n");
                                list1.add(id); // bilgileri liste aktarma
                                name=s.next();
                                list1.add(name);
                                surname = s.next();
                                list1.add(surname);
                                diagnose = s.next();
                                list1.add(diagnose);
                                gender = s.next();
                                list1.add(gender);  
                              for(int y=0;y<list1.size();y++){
                                      System.out.printf("%s-- ",list1.get(y));// bulunan id'yi listeye aktarıp ekrana yazdırdık. 
                                      
                                } 
                                        list1.clear();// list1 temizlenir.
                                      System.out.println("\n\n");                                
                             } 
                             
                         }      
                              return 0;
                     }
                     break;
                case 2://silme // CALISMIYOR !!!!!!!!!!!!!!!!!!!!!!!
                    s.reset();
                     System.out.println("Bilgisini silmek istediginiz bilginin idsini giriniz:");
                     secim3=k.nextInt();
                     secim4=String.valueOf(secim3); //int,stringe aktarılır.(kıyas yapma kolay olsun diye ama cok gerekli de degil)
                            openFile(adres);
                            id=s.next(); 
                         while(s.hasNext()){  // dosya taranır girilen inputa gore veri aranır
                             if(secim3==0 || secim3<0){  //  idye gore secim yapılır.yanlis girisler onlenir.
                            System.out.println("Yanlis giris.");
                            return 1;
                           }
                              if(secim3>0){  // id bulunamaz ise;
                                
                                if(!s.hasNext() && !secim4.matches(id)){
                                    System.out.println("Id bulunamadı.");
                                    return 1;
                                }
                             }
                                   
                             if(secim4.matches(id)){
                              System.out.println("Aradıgınız id,sistemdekiyle eslesti.\n");
                              id=s.next();
                              list1.add(id);
                              name=s.next();
                              list1.add(name);
                              surname=s.next();
                              list1.add(surname);
                              diagnose=s.next();
                              list1.add(diagnose);
                              gender=s.next();
                              list1.add(gender);
                              for(int y=0;y<list1.size();y++){
                                         System.out.printf("%s-- ",list1.get(y));// bulunan id'yi listeye aktarıp ekrana yazdırdık. 
                                      
                                } 
                              return 1;
                              }
                              if(!secim4.matches(id)){    
                                  File ff = new File(temp);
                                  File ff2 = new File(adres);
                                  id=s.next();
                              while(s.hasNext()){  // yeni dosya olusturulup bilgileri diger dosyaya aktararak bilgiyi silme islemi.!!!!!!!!!!!!
                                  temp2=s.next();
                                  writeFile(temp2,temp);   
                              }
                              ff.renameTo(ff2);
                              return 1;
                         }
                             
                         }
                  break;
                case 3:
                     break;
                 default:
                     System.out.println("Yanlis giris!");  
                     return 1;
             
                         // duzenlemek istedigini yaz.
         // dosyanın en sonuna duzenleneni ekle ve eski bilgiyi sil.(id yi -1 yapabiliriz veya komple satiri silebiliriz.)
         }
          
         }while(secim==3);
         return 1;
         }
}




        

