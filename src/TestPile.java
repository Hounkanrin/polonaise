
public class TestPile {

	public static void main(String[] args) {
		System.out.println("Test de PileEnt (TP2 PRG2)");
		PileEnt pile = new PileEnt(10);
		for (int i = 0; i < args.length; i++)
		{ 
			if (args[i].equals("e")) { 
				i++; 
				pile.empiler(Integer.parseInt(args[i])); 
			} 
			else if (args[i].equals("d"))
			{
				pile.depiler() ;
			}
			else if (args[i].equals("dp")) { 
				pile.dump(); 
			} 
			else 
				System.out.println("commande incorrecte " + args[i]);
		}
	}

}


