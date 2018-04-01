package it.manpower.pattern.composite.file;

public class File extends FileSystemElement {

	private String content;
	
	public File(String name, String content) {
		super(name);
		this.content = content;
	}

	@Override
	public void printElement() {
		System.out.println(getName() + " " + content);
	}

	@Override
	public boolean addElement(FileSystemElement e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeElement(FileSystemElement e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public FileSystemElement getElement(int index) {
		throw new UnsupportedOperationException();
	}

}
