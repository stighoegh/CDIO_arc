package entity;

public class Spillist {
	private Spiller[] spillere;
	
	public Spillist(int antal ) {
		spillere= new Spiller[antal];
		for (int i = 0;i < antal;i++)
			spillere[i]=new Spiller();
	} 
	
	public void addspiller(int antal){
		String[] navne = {"Peter ","Lene  ","Jan   ","Tobias","Jytte ","Lone  "};
		for (int i=0; i<antal;i++){
			spillere[i].setNavn(navne[i]);
			spillere[i].setColor(i);
		}	
	}	

	public Spiller[] getSpillere(){
		return spillere;
	}

	public Spiller getSpiller(int index){
		return spillere[index];
	}
	
	public boolean isVinder(){
		for (int i=0;i<spillere.length;i++){
			if (spillere[i].isVinder())
				return true;
		}		
		return false;
	}

	public int naesteSpiller(int index){
		do { 
		index = ++index % spillere.length;
		} while (spillere[index].isDeath());
		return index;
	}
}
