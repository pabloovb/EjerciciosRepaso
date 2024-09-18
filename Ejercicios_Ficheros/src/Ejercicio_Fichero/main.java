package Ejercicio_Fichero;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
			
	public static void ejercicio1(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ejercicio 1");
		
		System.out.println("Dime un directorio");
		String directorio = teclado.next();
		File archivo = new File(directorio);
		System.out.println("Directorio: " + directorio);
	}
	
	public static void ejercicio2(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ejercicio 2");
		System.out.println("Dime un directorio");
		String directorio = teclado.next();
		System.out.println("Dime el nombre de algun archivo");
		String nombre = teclado.next();
		System.out.println("Dime el tamaño del directorio");
		String tamano = teclado.next();
		File archivo = new File(directorio);
		System.out.println("Directorio: " + directorio + "  Nombre archivo: " + nombre +  "  Tamaño directorio: " + tamano);
	}
	
	public static void ejercicio3(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un directorio");
		String directorio = teclado.next();
		File archivo = new File(directorio);
		System.out.println("Directorio: " + directorio);
		if (archivo.exists()) {
            if (archivo.isDirectory()) {
                String rutaAbsoluta = archivo.getAbsolutePath();
                System.out.println("Directorio proporcionado: " + directorio);
                System.out.println("Ruta absoluta: " + rutaAbsoluta);
            }
		} else System.out.println("No existe");
		
	}
	
	public static void ejercicio4(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		

		
		System.out.println("Dime un directorio");
		String directorio = teclado.next();
		File archivo = new File(directorio);
		System.out.println("Directorio: " + directorio);
		if (archivo.exists()) {
            if (archivo.isDirectory()) {
                String rutaAbsoluta = archivo.getAbsolutePath();
                System.out.println("Directorio proporcionado: " + directorio);
                System.out.println("Ruta absoluta: " + rutaAbsoluta);
            }
		} else System.out.println("No existe");
		
	}
	
	public static void ejercicio5(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un directorio");
		String directorio = teclado.next();
		System.out.println("Dime una extensión");
		String extension = teclado.next();
		File archivo = new File(directorio);
		System.out.println("Directorio: " + directorio);
		
		Filtro Filtro = new Filtro(extension);
		
		
		File[] ficherosFiltro = archivo.listFiles();
		
		for (File filtros2 : ficherosFiltro) {
			if(Filtro.accept(filtros2)) {
				System.out.println(filtros2.getName());
			}
            
        }
    }
	
	
		
		
	

	public static void ejercicio6(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		

		
		System.out.println("Dime un directorio");
		String directorio = teclado.next();
		
		File archivo = new File(directorio);
		System.out.println("Directorio: " + directorio);
		
		
		
		
		File[] ficherosFiltro = archivo.listFiles();
		
		for (File filtros2 : ficherosFiltro) {
			
				System.out.println(filtros2.getName());
			
            
        }
	
	}

	public static void ejercicio7(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un directorio");
		String directorio = teclado.next();
		System.out.println("¿Cuantos tipo de extensiones vas a poner?");
		int numeroex = teclado.nextInt();
		
		for(int i = 1; i <= numeroex; i++ ) {
			
		
		System.out.println("Dime una extensión");
		String extension = teclado.next();
		File archivo = new File(directorio);
		System.out.println("Directorio: " + directorio);
		
		Filtro Filtro = new Filtro(extension);
		
		
		File[] ficherosFiltro = archivo.listFiles();
		
		for (File filtros2 : ficherosFiltro) {
			if(Filtro.accept(filtros2)) {
				System.out.println(filtros2.getName());
			}
            
        }
		
		}
	
	}
	
	public static void ejercicio8(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		
		

		
		
		System.out.println("Elige el ejercio");
		
		int eleccion = teclado.nextInt();
		
		switch (eleccion) {
		case 1: {
			ejercicio1(args);
		}
		case 2: {
			ejercicio2(args);
		}
		case 3: {
			ejercicio3(args);
		}
		case 4: {
			ejercicio4(args);
		}
		case 5: {
			ejercicio5(args);
		}
		case 6: {
			ejercicio6(args);
		}
		case 7: {
			ejercicio7(args);
		}
		case 8: {
			ejercicio8(args);
		}
		
		
		
	
		}
	}
}
