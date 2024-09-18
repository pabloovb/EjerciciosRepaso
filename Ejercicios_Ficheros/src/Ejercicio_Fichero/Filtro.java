package Ejercicio_Fichero;

import java.io.File;
import java.io.FileFilter;

public class Filtro implements FileFilter {
	
	private String ext;

	
	public Filtro(String extension) {
		super();
		this.ext = extension;
	}

	@Override
	public boolean accept(File archivo) {
		if(archivo.getName().endsWith(ext)) {
			return true;
		}
		return false;
		
	}

	

}
