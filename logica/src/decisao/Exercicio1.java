package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		String regiao = JOptionPane.showInputDialog("Regiao").toUpperCase();
		short fidelidade = Short.parseShort(JOptionPane.showInputDialog("Fidelidade (anos"));
		float valorInvestido = Float.parseFloat(JOptionPane.showInputDialog("Valor Investido"));
		float valorAtual=0;
		
		if (regiao.equals("SUL") || regiao.equals("SUDESTE")) {
			fidelidade = (short) (fidelidade * 1.20);
			//fidelidade *= (short) 1.2;
		}
		
		if (valorInvestido<1000) {
			valorAtual = valorInvestido * (float) 1.015;
		}else if (valorInvestido>5000) {
			valorAtual = valorInvestido * (float) 1.03;
		}else {
			valorAtual = valorInvestido * (float) 1.02;
		}

		if (fidelidade>5) {
			valorAtual = valorAtual * (float) 1.01;
		}
		System.out.println("Cliente: " + nome + " da regiao: " + regiao);
		System.out.println("Valor atual: " + valorAtual);
		System.out.printf("Valor atual: %.2f\n", valorAtual);
		System.out.println("Diferença: " + (valorAtual - valorInvestido));
		System.out.printf("Diferença: %.2f\n", (valorAtual-valorInvestido));
		
		System.out.printf("Sr %s, sua regiao %s, gerou um rendimento de %.2f\n", nome, regiao, valorAtual);
		
		// Lista 2 (GitHub - https://github.com/humbertosousa/gama_material)
		// Exercicios: 1, 3 e 4. (recomendação)
		
	}

}
