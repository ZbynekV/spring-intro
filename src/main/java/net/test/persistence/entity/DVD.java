package net.test.persistence.entity;

public class DVD extends Record {

	public DVD(String title) {
		super(title);
	}

	@Override
	public String toString() {
		return "DVD [title=" + getTitle() + "]";
	}
}