package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteUtil {

	public static void main(String[] args) {
		
		
		Double numero = 3.2;
		System.out.println(numero);
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        System.out.println(lista.size());
        
        Conta cc3 = new ContaCorrente(23, 131);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(232, 232);
        lista.add(cc4);
        
        for(Conta conta : lista) {
        	System.out.println(conta);
        }

        
	}

}
