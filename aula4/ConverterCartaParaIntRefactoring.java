
public class ConverterCartaParaIntRefactoring {
	
	public int converteCartaParaInt(String carta) {
		
		int valorCarta = -1;
		
		if(carta.toUpperCase().equals("A")) 
			valorCarta = 1;
		else if(carta.toUpperCase().equals("J"))
			valorCarta = 11;
		else if(carta.toUpperCase().equals("Q"))
			valorCarta = 12;
		else if(carta.toUpperCase().equals("K"))
			valorCarta = 13;
		else if(Integer.parseInt(carta) > 0 && Integer.parseInt(carta) <= 13) 
			valorCarta = Integer.parseInt(carta);
		
		return valorCarta;
	}
	
}
