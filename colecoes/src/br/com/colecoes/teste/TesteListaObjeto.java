package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.modelo.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		//Cargo objeto = new Cargo();
		//objeto.setNome(JOptionPane.showInputDialog("Cargo"));
		//objeto.setNivel(JOptionPane.showInputDialog("Nivel"));
		//objeto.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario")));
		//lista.add(objeto);
		//System.out.println(lista.get(0).getAll());

		do {
			lista.add(new Cargo(
				JOptionPane.showInputDialog("Nome do Cargo"),
				JOptionPane.showInputDialog("N�vel"),
				Float.parseFloat(JOptionPane.showInputDialog("Sal�rio"))
				));
		}while(JOptionPane.showConfirmDialog
				(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		
		List<Cargo> nova = new ArrayList<Cargo>();
		double total=0;
		int qtdej=0;
		int qtdes=0;
		for (Cargo obj : lista) {
			System.out.println(obj.getAll());
			total+=obj.getSalario();
			if (obj.getNivel().equals("JR")) {
				qtdej++;
			}else if(obj.getNivel().equals("SR")) {
				qtdes++;
			}
			if (obj.getSalario()>5000) {
				nova.add(obj);
			}
		}
		System.out.println("Total: " + total);
		System.out.println("Total de Jr: " + qtdej);
		System.out.println("Total de Sr: " + qtdes);
		
		System.out.println("Salarios maiores que 5000.... ");
		for (Cargo obj : nova) {
			System.out.println(obj.getAll());
		}
		
	}

}
