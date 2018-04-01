package it.manpower.pattern.main;

import it.manpower.pattern.composite.file.File;
import it.manpower.pattern.composite.file.FileSystemElement;
import it.manpower.pattern.composite.file.Folder;

public class CompositeExampleMain {

	public static void main(String[] args) {
		FileSystemElement f = new Folder("folder");
		FileSystemElement f2 = new File("file.txt", "prova");
		f.addElement(f2);
		
		f.printElement();
	}
	
}
