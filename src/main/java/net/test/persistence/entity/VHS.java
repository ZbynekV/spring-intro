package net.test.persistence.entity;

public class VHS extends Record {

	public VHS(String title) {
		super(title);
	}
	
	@Override
	public String toString() {
		return "VHS [title=" + getTitle() + "]";
	}
}
