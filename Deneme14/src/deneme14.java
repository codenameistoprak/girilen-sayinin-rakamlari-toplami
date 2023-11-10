   import java.util.Scanner;


		public class deneme14 {
		    
		    public static void main(String[] args) {
		        /*
		        do {
		            // Koşul doğru olduğu sürece
		            // whiledan farkı en az bir kere çalışmasının garanti olması.
		        
		        }while(koşul);
		        
		        */
		    	
		    	//Girilen sayının rakamları toplamını yazdırma 
		
	    Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		
		int number = scanner.nextInt();
		int toplam = 0;
		
		do {
			toplam  +=	number % 10;   //sayının 10 ile bölümünden kalanı
			   						   //toplama ekliyoruz.
			number /= 10;              // sayıyı 10 ile bölümüne eşitliyoruz.
			
			System.out.println("Sayı:" + number);  //her döngüde sayının nasıl
			//bir değer aldığını görmek için yazdım...
		
		}while(number>0);
		
		System.out.print("Rakamları toplamı:" + toplam);
		scanner.close();  	
	}

		    
}
