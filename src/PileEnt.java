
public class PileEnt implements SpecifPileEnt {
	
	private int taille; 
	private int [] pile;
	
	
	// constructeur
	
	public PileEnt(int taille_max) {
		taille=0;
		pile= new int [taille_max]; 
	}
	//accesseeur 
	public int getTaille() {
		return this.getTaille();
			
	}
	

	@Override
	public boolean estVide() {
		if (pile[taille]==0) {
					}
		return true;
			}

	@Override
	public void empiler(int nblu) {
		pile[taille]=nblu; 
		taille++;
			}

	@Override
	public int sommet() {
		int val; 
		val=pile[taille-1];
		return val;
	}

	@Override
	public void depiler() {
		if(estVide()) {
			taille--;
		}
		
			}

	@Override
	public void dump() {
		
		for(int i=0; i < taille; i++) {
			System.out.println("" + pile[i]);
		}
		
		System.out.println("----");
		
	}
	

}
