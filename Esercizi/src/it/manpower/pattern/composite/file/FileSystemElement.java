package it.manpower.pattern.composite.file;

public abstract class FileSystemElement {

	private String name;
	private Folder parent;
	
	public FileSystemElement(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Folder getParent() {
		return parent;
	}
	void setParent(Folder parent) {
		this.parent = parent;
	}
	
	public abstract void printElement();
	public abstract boolean addElement(FileSystemElement e);
	public abstract boolean removeElement(FileSystemElement e);
	public abstract FileSystemElement getElement(int index);
}
