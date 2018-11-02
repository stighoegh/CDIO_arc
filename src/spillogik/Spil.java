package spillogik;

import entity.Spiller;


public class Spil {
	
	public static void CDIO1_simpel(int[] terninger, Spiller p){
		// summen af terningernes v�rdier l�gges til ens point. Vinderen er den der opn�r 40 point
		int MAX_POINTS = 40;
		p.setSaldo(p.getSaldo() + terninger[0] + terninger[1]);
		if (p.getSaldo() > MAX_POINTS)
			p.setVinder(true);
	}
	
	public static void CDIO1_udvidet(int[] terninger, Spiller p){
		int MAX_POINTS = 40;
		if (p.getSaldo() > MAX_POINTS)
			p.setVinderPending(true);
		else 
			p.setSaldo(p.getSaldo() + terninger[0] + terninger[1]);
		
		if ((terninger[0] == terninger[1]))
		{

			// 4. Skal sl� to ens for at vinde spillet, efter at man har opn�et 40 point.
			
			if (p.isVinderPending())
				p.setVinder(true);
			else {

				// 2. F�r en ekstra tur hvis man sl�r to ens.
				p.setSlaaIgen(true);
				
				// 1. Mister alle sine point hvis man sl�r to 1'ere.
				if ((terninger[0] == 1 && terninger[1]==1))
					p.setSaldo(0);
				
				// 3. Vinder spillet ved at sl� to 6'ere, hvis man ogs� i forrige kast slog to 6'ere 
				// uanset om det er p� ekstrakast eller i forrige tur.
				if ((terninger[0] == 6 && terninger[1]==6))
					if (p.getAntal6ere()==1)
						p.setVinder(true);
					else
						p.setAntal6ere(p.getAntal6ere()+1);
			}
		}
		else {
			p.setSlaaIgen(false);
			p.setAntal6ere(0);
		}
	}	
}




