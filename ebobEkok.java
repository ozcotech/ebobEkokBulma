import java.util.Scanner;
/**
 * ebobEkok
 */
public class ebobEkok {

  public static void main(String[] args) {
    int n1, n2, ebob = 1, ekok = 1;
    Scanner input = new Scanner(System.in);

    System.out.print("Birinci Sayıyı Giriniz: ");
    n1 = input.nextInt();

    System.out.print("İkinci Sayıyı Giriniz: ");
    n2 = input.nextInt();

    int i, j;

    // ebob bulma: 

    if (n1 < n2){ // birinci sayı ikinci sayıdan küçük olduğunda;
      i = n1;
      while (i >= 1){
         
        if (n1 % i == 0 && n2 % i == 0){
          
          ebob = i;
          break;

        }
        
        i--;
        
      }
      System.out.println("Ebob: " + ebob);

     
    }
    else if (n2 < n1){ // ikinci sayı birinci sayıdan küçük olduğunda;
      j = n2;
      while (j >= 1){
         
        if (n1 % j == 0 && n2 % j == 0){
          
          ebob = j;
          break;
        }
       
        j--;
        
      }
      System.out.println("Ebob: " + ebob);
      
    }
    /*
    else { // girilen sayılar aynı ise hata veriyor
      System.out.println("Lütfen Farklı Sayı Girerek Tekrar Deneyiniz.");
      }
      */
      
      // ekok bulma:
      /*
      int k= 1;
      while (k <= (n1 * n2)){
        if (k % n1 == 0 && k % n2 ==0){
          ekok = k;
          System.out.println("Ekok: " + ekok);
          break;
        }
        k++;
        
      }
      */
      //veya ekok bulma2:
      if(n1!= n2){
      ekok = (n1 * n2) / ebob;
      System.out.println("Ekok: " + ekok);
      }
      else{
         // girilen sayılar aynı ise hata veriyor
          System.out.println("Lütfen Farklı Sayı Girerek Tekrar Deneyiniz.");   
      }

    input.close();
    }
   
}
