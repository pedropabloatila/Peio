package Notas;

import java.util.Scanner;

public class teclearNotas {
	private String nota;
	private String fechaCreacion;
	private String texto;
	private String categoria;
	
	public teclearNotas(String Nota,String Fechacreacion,String Texto,String Categoria) {
		this.nota=Nota;
		this.fechaCreacion=Fechacreacion;
		this.texto=Texto;
		this.categoria=Categoria;
	}
	public void setNota(String Nota) {
		 this.nota=Nota;
	}
	public String getNota() {
		return this.nota;
	}
	public void setFechacreacion(String Fechacreacion) {
		 this.fechaCreacion=Fechacreacion;
	}
	public String getFechacreacion() {
		return this.fechaCreacion;
	}
	public void setTexto(String Texto) {
		 this.texto=Texto;
	}
	public String getTexto() {
		return this.texto;
	}
	public void setCategoria(String Categoria) {
		int opcionElegida=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1 Urgente");
		System.out.println("2 Importante");
		System.out.println("3 Normal");
		
		System.out.println("Elige opción");
		opcionElegida = entrada.nextInt();
		switch (opcionElegida) {
		case 1:
			Categoria="Urgente";
			break;
		case 2:
			Categoria="Importante";
			break;
		case 3:
			Categoria="Normal";
			break;
		default:
			break;
	}	
		 this.categoria=Categoria;
	}
	public String getCategoria() {
		return this.categoria;
	}
}
