

package Notas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class test {
	
	/*public static void main(String[] args){
		String sep = File.separator;
		Path path = Paths.get(sep+"Users"+sep+"1819ANDROID401"+sep+"eclipse-workspace"+sep+"Notas"+sep+"notas.txt");
		//leerArchivo(sep+"Users"+sep+"1819ANDROID401"+sep+"eclipse-workspace"+sep+"Notas"+sep+"notas.txt");
		
		//crearArchivo(path);
		//borrarArchivo(path.toString());
	}*/
	
	public static void crearArchivo(Path path){
		try{
			Files.createDirectories(path.getParent());
			Files.createFile(path);
			
			System.out.println("El fichero fue creado.");
		}catch(Exception e){
			System.out.println("Error, el fichero existe. "+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		/*try{
			PrintWriter writer = new PrintWriter(new FileWriter(path,true));
			writer.append(to_append);
			writer.close();
			
			System.out.println("Se escribió correctamente en el archivo.");
		}catch(Exception e){
			System.out.println("Error añadiendo datos al fichero");
		}*/
		try {
			
	         String content = "Nueva linea";

	        File file = new File("C:\\Users\\1819ANDROID401\\eclipse-workspace\\Notas\\notas.txt");

	        // if file doesnt exists, then create it
	        if (!file.exists()) {
	            file.createNewFile();
	        }

	        FileWriter fw = new FileWriter(file.getAbsoluteFile());
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(content);
	        bw.close();

	        System.out.println("Hecho");

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
	public static String leerArchivo(String path){
		try{
			FileReader reader = new FileReader(path);
			BufferedReader buffer = new BufferedReader(reader);
			
			String linea = buffer.readLine();
			String texto = linea;
			while(linea != null){
				System.out.println(linea);
				linea = buffer.readLine();
				if(linea!= null)
					texto = texto + linea+"\n";
			}
			
			return texto;
		}catch(Exception e){
			System.out.println("Hubo un error leyendo el archivo." +e.getMessage());
		}
		return null;
	}
	
	public static void borrarArchivo(String path){
		File file = new File(path);
		if(file.exists()){
			if(file.delete()){
				System.out.println("Se eliminó el fichero");
			}
		}else{
			System.out.println("El fichero no existe.");
		}
	}
	
}


