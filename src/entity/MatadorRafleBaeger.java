package entity;
import java.util.Random;

public class MatadorRafleBaeger {
		protected int terning1, terning2;
		 Random rand;
		
		//Konstruktøren til raflebægeret initialiserer blot random objektet, til brug når bægeret skal rystes.
		public MatadorRafleBaeger()	{
			rand = new Random();
		}

		//rollDice metoden kaster med begge terninger, og returnerer et array som angiver hvad hver terning slog.
		public void rollDice()	{
			
			terning1 = rand.nextInt(6) + 1;
			terning2 = rand.nextInt(6) + 1;
		}

		public int[] getTerninger()	{
			int[] result = {terning1, terning2};
		return result;
		}

		//Returnerer summen af terningernes øjne
		public int getSum()	{
			int sum = terning1 + terning2;
			return sum;
		}

		//Returnerer en boolean som angiver om terningernes øjne var ens (true) eller forskellige (false)
		public boolean getEns()	{
			return (terning1 == terning2);	
		}
		
		public int terning1()	{
			int sum = terning1;
			return sum;
		}

		public int terning2()	{
			return terning2;
		}

		public String toString(){
			return "Terning 1: " + terning1 + ", Terning 2: " + terning2;
			
		}
		
	}
