package br.com.colecoes.teste;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DBA");	
		lista.add("ANALISTA");
		lista.add("ESTAGIARIO");
		lista.add("GERENTE");
		System.out.println(lista);
		//System.out.println(lista.get(1));
		//Collections.sort(lista);
		System.out.println(lista.contains("DBA"));

	}

}
