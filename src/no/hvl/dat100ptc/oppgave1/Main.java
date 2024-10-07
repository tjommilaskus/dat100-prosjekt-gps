package no.hvl.dat100ptc.oppgave1;

public class Main {

	public static void main(String[] args) {
		
		GPSPoint x = new GPSPoint(1, 2, 3, 4);
		
		x.getTime();
		x.setTime(2);
		
		String p = x.toString();
		
		System.out.println(p);
		
	}

}
