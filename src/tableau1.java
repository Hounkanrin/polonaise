
public class tableau1 {

	public static void main(String[] args) {
		
		//int taille_Max=0; 
		/*int [] TableauEntier  = {4,8,7,};//cas de valeurs connues 
		
		//itération
		for(int i=0; i< 3; i++) {
		System.out.println(""+i + "est de" +TableauEntier[i]);
		}
		
		// affiche toute les valeur du tableau 
		
		for (int val: TableauEntier) {
			System.out.println(val);
		}
			
		int [] tab2= new int [5]; 
		
		
		//affectation des valeurs
		
		tab2[0]=4;
		 tab2[4]= 9;
		 tab2[1]=4;
		 tab2[2]= 9;
		
			
		//afficher tableau
    System.out.println( TableauEntier[2]);*/
    
    //comparaison de deux tableaux 
     
    int[] tab1= {10, 11, 14}; 
    int tab3 []= {10,11,14}; 
    
    if(tab1== null||tab3==null ||tab1.length != tab3.length) {
    	System.out.println("les deux tables sont différente"); 
    	    }
    else {
    	int i=0; 
    	while (i<tab1.length && tab1[i]==tab3[i]) {
    		++i;
    	}
    	if (i>= tab1.length) {
    			System.out.println("les deux tables sont egaux");
    }
    	else {System.out.println("les deux tables sont différente");
    	}
    	}
	}

}
