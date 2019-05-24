package Notas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class escribirNotas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		entrada.useDelimiter(";");
		
		System.out.println("Introduce un texto:");
		String texto = entrada.next();
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("notas.txt", true));
			bw.write(texto + "\r\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



