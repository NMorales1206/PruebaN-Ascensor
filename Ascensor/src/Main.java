import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
	static Scanner tec = new Scanner (System.in);
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int opc = 0,sott=0,tt=0,ptt = 0,pt=0,mv=0,opc3=0,ps=0,pact=1;	
		
		do {
		
			
			System.out.println("BIENVENIDO");
			System.out.println("MENÚ");
			System.out.println("1 - Ingresar informacion del Ascensor");
			System.out.println("2 - Pisos del Ascensor");
			System.out.println("3 - Movimiento del Ascensor");
			System.out.println("4 - SALIR");
			opc = tec.nextInt();
			
			
         switch(opc) {
          case 1:
	
        	  sott=0;
        	  tt=0;
        	  ptt = 0;
        	  pt=0;
        	  
             Ascensor ascensor = new Ascensor();
	         System.out.println("Ingrese Total de pisos");
	         ascensor.setTpisos(tec.nextInt());
        
	         System.out.println("Ingrese total de sótanos");
	         ascensor.setTsotanos(tec.nextInt());
		
	      do {
	    	  
			 sott= sott-1;
			 list.add(sott);
			 tt++;
			  
	         }while(tt!=ascensor.getTsotanos());
		 
	      do {
		 
		     ptt = ptt+1;
		     list.add(ptt);
		     pt++;
		  
	         }while(pt!=ascensor.getTpisos());
	 
	         Collections.sort(list);   
	    
	      break;    
	  
          case 2:
	
        	if(list.size()==0) {
        		
        		System.out.println("No se encuentran registros de un Ascensor");
        		
        	}else if (list.size()==1) {
        		
        		System.out.println("El edificio solo cuenta con un piso");
        		
        	}else {
        		
             System.out.println("El Ascensor cuenta con "+list.size()+" pisos");
             System.out.println("y estos se encuentran repartidos en "+pt+" pisos y "+tt+" sótanos.");
             System.out.println("");
             System.out.println(list);
             System.out.println("");
        	}
          break;
          
         case 3:
        	
       
        	 System.out.println("Actualmente nos encontramos en el piso 1");  
        	 
          do {
        		
        	
         	 System.out.println("Desea subir o bajar?");
         	 System.out.println("1 = Subir");
         	 System.out.println("2 = Bajar");
         	 opc3=tec.nextInt();
         	 
          switch (opc3) {
          case 1:
        		 
             System.out.println("Cuantos pisos desea subir?");
        	 ps=tec.nextInt();
        		 
        	 while(pt<ps+1){
                	 tec.nextLine();
                     System.out.println("No es posible subir esa cantidad de pisos");
                     System.out.println("Ingrese un piso valido");
                     ps =tec.nextInt();
      
             }
             
             if (pt<=pact) {
             do{
                    
                     System.out.println("Ya nos encontramos en el piso mas alto");
                     System.out.println("Solo puede descender o salir");   
                     System.out.println("0 = salir he intentar otra opción");
                     ps=tec.nextInt();
             }while(ps!=0);
             
             
             
          }
             
             pact=pact+ps;
             
             if(pact==0) {
             
              pact=pact+1;
              
             }
             
              System.out.println("Piso actual = "+pact);
             
        	  System.out.println("Desea cambiar de piso? Si = 1 | No = 0");
        	  mv=tec.nextInt();
          break;
        	
          case 2:
        	  
        	  System.out.println("Nos encontramos en el piso "+pact);
        	  System.out.println("cuantos pisos desea bajar");
        	  ps=tec.nextInt();
        	    
        	  while((pact-ps)<(tt*-1)){
             	 tec.nextLine();
                  System.out.println("No es posible bajar esa cantidad de pisos");
                  System.out.println("Ingrese un piso valido");
                  ps =tec.nextInt();
             }

        	  if((pact-ps)==(tt*-1)) {
        		  
        	  do {
        		  System.out.println("Ya nos encontramos en el piso mas bajo");
                  System.out.println("Solo puede descender o salir");   
                  System.out.println("0 = salir he intentar otra opción");
                  ps=tec.nextInt();
        	  }while(ps!=0);  
        	  }
        	  
        	  pact=pact-ps;
        	  
        	  if(pact<=0) {
        		  pact=pact-1;
        	  }
        	  
        	  System.out.println("Piso actual = "+pact);
              
          	  System.out.println("Desea cambiar de piso? Si = 1 | No = 0");
          	   mv=tec.nextInt();
        	  
          break;
        	
        	}
        	}while(mv!=0);
        	
        	
        	  
         break;
	    
        }	    
		}while(opc!=4) ;  

}
}

