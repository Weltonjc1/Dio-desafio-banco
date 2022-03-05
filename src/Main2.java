import java.util.Scanner;



public class Main2 {
	public static void main(String[] args) {
	    Scanner input =new Scanner(System.in);
	    int b;
	    char c;
	    //int d=0,e=0,f=0,i,t;
	    int totalCoelhos=0, totalRatos=0, totalSapos=0, Quantia=0, totalCobaias=0;
	    System.out.println("Digite o total de cobaias:");
	    int a=input.nextInt();
	    
	        
	        for(int i = 0; i<= a -1; i++){
	        	System.out.println("Digite o total de experimentos:");
		        Quantia=input.nextInt();
	        	System.out.println("Digite o tipo da cobaia:");
	            c=input.next().toUpperCase().charAt(0);
	          
	         
	          switch (c) {
		    		case 'C': totalCoelhos += Quantia; break;
		    		case 'R': totalRatos += Quantia; break;
		    		case 'S': totalSapos += Quantia; break;
	    		}    	 
	          totalCobaias+=Quantia;
	        }
	        
	        System.out.println("Total: " + totalCobaias+"cobaias");
  		   	System.out.println("Total de coelhos:" + totalCoelhos);
  		   	System.out.println("Total de ratos:" + totalRatos);
  		   	System.out.println("Total de sapos:" + totalSapos);
  		   	
  		   	float pcoelho = (float)totalCoelhos/totalCobaias;
  		   	float pratos = (float)totalRatos/totalCobaias;
  		   	float psapos = (float)totalSapos/totalCobaias;
  		   	
  		   	System.out.printf("Percentual de coelhos: %.2f %% %n", pcoelho * 100 );
  		   	System.out.printf("Percentual de ratos: %.2f %% %n", pratos *100);
  		   	System.out.printf("Percentual de sapos: %.2f %% %n", psapos * 100);
		
		
	}
}

	
	
	

