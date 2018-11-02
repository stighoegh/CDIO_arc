package boundary;

import entity.MatadorRafleBaeger;
import entity.Spiller;


public class Out {
	private Screen s;
	public Out() {
		s = new Screen();
	}

	public void linieSkift(){
		s.println(" ");
	}
	
	public void spilstarter(){
		s.println("Spillet starter ");
		s.println(" ");
		
	}
	
	
    public void startInfo(Spiller [] p){
		for (int i=0; i<p.length;i++){	
			s.println("Spiller nr:"+ (i+1) + " Navn: " +p[i].getNavn()+" Saldo: " + p[i].getSaldo()+ " ");
		}
		s.println(" ");
	}
    public void venterPaaSlag(int pNr){
		s.println("***");
		s.println("Venter på spiller " + (pNr+1) + ". Tast ENTER for at fortsætte");
	}
    public void visSlag(MatadorRafleBaeger rafle){
		s.println(rafle.toString());
	}

    public void visSpilStatus (Spiller [] p){
    	s.print("Status: ");
    	for(int j = 0; j < p.length; j++){		
			s.print("Spiller " + (j+1) + ": " + p[j].getSaldo() + " *** "); 
		}
		s.println("");
	}
	
    public void visSlaaIgen(int pNr){
		s.println("Spiller " + (pNr) + ": Slog to ens tillykke. Du må slå igen");
	}
	
	
	public void visSlutInfo(int pNr,Spiller [] p){
		s.println("");s.println("Spillet er slut. " + p[pNr].getNavn() + " vandt");
	
		
	}	
}
