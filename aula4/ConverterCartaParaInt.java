
public class ConverterCartaParaInt {
	
	public int converteCartaParaInt(String carta) {
		int valorCarta = -1;
		if(carta.equals("A") || carta.equals("a")) valorCarta = 1;
		if(carta.equals("2")) valorCarta = 2;
		if(carta.equals("3")) valorCarta = 3;
		if(carta.equals("4")) valorCarta = 4;
		if(carta.equals("5")) valorCarta = 5;
		if(carta.equals("6")) valorCarta = 6;
		if(carta.equals("7")) valorCarta = 7;
		if(carta.equals("8")) valorCarta = 8;
		if(carta.equals("9")) valorCarta = 9;
		if(carta.equals("10")) valorCarta = 10;
		if(carta.equals("J") || carta.equals("j")) valorCarta = 11;
		if(carta.equals("Q") || carta.equals("q")) valorCarta = 12;
		if(carta.equals("K") || carta.equals("k")) valorCarta = 13;		
		
		return valorCarta;
	}
	
}
