package br.com.wellington.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//OutputStream fis = new FileOutputStream("teste2.txt");
		//Writer isr = new OutputStreamWriter(fis);
		//BufferedWriter bw = new BufferedWriter(isr);
		
		FileWriter fw = new FileWriter("teste2.txt");
		
		fw.write("Entre mágoas sombrias,");
		fw.write(System.lineSeparator());
		fw.write("momentâneos lampejos:");
		
		fw.close();
	}

}
