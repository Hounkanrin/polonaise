	
public class polonaise {

	public static void main(String[] args) {
		
		System.out.println("Test de PileEnt (TP2 PRG2)");
		PileEnt pile1 = new PileEnt(10);
		for (int i = 0; i < args.length; i++)
		{ 
			if (args[i].equals("plus")) { 
				int x=pile1.sommet();
				pile1.depiler();
			int y= pile1.sommet();
			pile1.depiler();
			if (x+y<0) {
				pile1.empiler(-(x+y));
			}
			else { pile1.empiler(x+y);
			}
		} 
			else if (args[i].equals("moins")) {
			 int x=pile1.sommet();
			 pile1.depiler() ;
			 int y= pile1.sommet();
				pile1.depiler();
				if (x-y<0) {
					pile1.empiler(-(x-y));
				}
				else { pile1.empiler(x-y);
				}
			}
			
			else if (args[i].equals("mul")) { 
				 int x=pile1.sommet();
				 pile1.depiler() ;
				 int y= pile1.sommet();
					pile1.depiler();
						pile1.empiler(x*y);	
					} 
			else {
				pile1.empiler(Integer.parseInt(args[i])); }
				
				//System.out.println("commande incorrecte " + args[i]);
			
		}
		pile1.dump();
			}
	}

