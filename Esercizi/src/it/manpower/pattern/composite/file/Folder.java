package it.manpower.pattern.composite.file;

import java.util.LinkedList;
import java.util.List;

public class Folder extends FileSystemElement {

	private List<FileSystemElement> children;
	
	public Folder(String name) {
		super(name);
		children = new LinkedList<>();
	}
	
	@Override
	public void printElement() {
		System.out.println(getName());
		for(FileSystemElement e : children) {
			e.printElement();
		}
	}

	@Override
	public boolean addElement(FileSystemElement e) {
		if( !children.add(e) ) {
			return false;
		}
		
		e.setParent(this);
		return true;
	}

	@Override
	public boolean removeElement(FileSystemElement e) {
		return children.remove(e);
	}

	@Override
	public FileSystemElement getElement(int index) {
		return children.get(index);
	}

}
