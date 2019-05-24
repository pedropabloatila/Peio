package Notas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LeerNotas {

public static void main(String[] args) {
		
		try {
			leerFichero("notas.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
public static void leerFichero(String fichero) throws IOException {
	
	BufferedReader br = new BufferedReader(new FileReader(fichero));
	
	String linea = "";
	
	while((linea = br.readLine()) != null) {
		System.out.println(linea);
	}
}

}

