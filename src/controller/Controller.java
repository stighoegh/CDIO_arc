package controller;

import boundary.Keyboard;
import boundary.Out;
import entity.MatadorRafleBaegerAutoTest;
import entity.Spiller;
import entity.Spillist;
import spillogik.Spil;


public class Controller {
	private int SPILLERE; 
	private MatadorRafleBaegerAutoTest rafle;
	private Keyboard keyb;
	private Out out;
	private Spillist spillist;

	public Controller(int antal) {
		SPILLERE = antal;
		rafle = new MatadorRafleBaegerAutoTest(0);
		spillist=new Spillist(antal);
		keyb = new Keyboard();
		out = new Out();
	}

	public void gamecontrol(){
		// her kunne man lave en dialog, der beder brugeren om at indtaste oplysninger på spillere
		spillist.addspiller(SPILLERE);
		out.startInfo(spillist.getSpillere());
		out.visSpilStatus(spillist.getSpillere());
		out.linieSkift();
		out.spilstarter();
		int pNr=0; 
		Spiller s;
		
		while(true) {
			out.venterPaaSlag(pNr);
			keyb.waitForEnter();
			rafle.rollDice();
			out.visSlag(rafle);
			s = spillist.getSpiller(pNr);
			
			// spil logik
			
			// simpelt spil
			Spil.CDIO1_simpel(rafle.getTerninger(),s);			
			
			// udvidet spil
			//Spil.CDIO1_udvidet(rafle.getTerninger(),s);			
						
			// er der en vinder?
			if (spillist.isVinder()) { 
				break;
			}
		
			// ekstra slag?
			if (s.isSlaaIgen())  
				out.visSlaaIgen(pNr);
			else {
				pNr=spillist.naesteSpiller(pNr);
				
			}
			out.visSpilStatus(spillist.getSpillere());
		
		out.linieSkift();	
		}	
		out.visSlutInfo(pNr,spillist.getSpillere());
	}
}