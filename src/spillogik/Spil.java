package spillogik;

import entity.Spiller;


public class Spil {
	
	public static void CDIO1_simpel(int[] terninger, Spiller p){
		// summen af terningernes værdier lægges til ens point. Vinderen er den der opnår 40 point
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

			// 4. Skal slå to ens for at vinde spillet, efter at man har opnået 40 point.
			
			if (p.isVinderPending())
				p.setVinder(true);
			else {

				// 2. Får en ekstra tur hvis man slår to ens.
				p.setSlaaIgen(true);
				
				// 1. Mister alle sine point hvis man slår to 1'ere.
				if ((terninger[0] == 1 && terninger[1]==1))
					p.setSaldo(0);
				
				// 3. Vinder spillet ved at slå to 6'ere, hvis man også i forrige kast slog to 6'ere 
				// uanset om det er på ekstrakast eller i forrige tur.
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




