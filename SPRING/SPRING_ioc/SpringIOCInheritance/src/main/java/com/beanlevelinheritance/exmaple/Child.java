package com.beanlevelinheritance.exmaple;

public class Child extends Parent {

	private String badHabbits;
	private String knowledge;

	public String getBadHabbits() {
		return badHabbits;
	}

	public void setBadHabbits(String badHabbits) {
		this.badHabbits = badHabbits;
	}

	public String getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}

	@Override
	public String toString() {
		return "Child [badHabbits=" + badHabbits + ", knowledge=" + knowledge
				+ ", getMoney()=" + getMoney() + ", getPropDocs()="
				+ getPropDocs() + ", getDiseases()=" + getDiseases()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
