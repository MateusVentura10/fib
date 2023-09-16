package poo;
import javax.swing.JOptionPane;

public class Exercicio {
	public static void main (String[] args) {
		float[] numeros = new float[10];
		float media = 0;
		float maior = Float.MIN_VALUE;
		float menor = Float.MAX_VALUE;
		float soma = 0;
		String resposta = "";
		
		for(int i = 0; i < 10; i++) {
			float number = Float.parseFloat(JOptionPane.showInputDialog("Digite um número"));
			numeros[i] = number;
		}
		
		for(Float numero : numeros) {
			if(numero < menor) menor = numero;
			if(numero > maior) maior = numero;
			
			soma += numero;
			resposta += numero + "\n";
		}
		
		media = soma/10;

		resposta += "Maior número: " + maior + "\n";
		resposta += "Menor número: " + menor + "\n";
		resposta += "Média: " + media + "\n";
		
		JOptionPane.showMessageDialog(null, resposta);

	}
}


