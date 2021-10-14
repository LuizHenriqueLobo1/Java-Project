package main;

import java.util.ArrayList;

public class Form {

	private ArrayList<People> peoples = new ArrayList<>();
	
	public void registerPeople(People people) {
		this.peoples.add(people);
		System.out.println("New people added");
	}
	
	public int getNumberOfPeoples() {
		return this.peoples.size();
	}
	
	private ArrayList<People> getPeoples() {
		return this.peoples;
	}
	
	public String getLastPeople() {
		return this.getPeoples().get(getNumberOfPeoples()-1).getName() + " ; "
				+ this.getPeoples().get(getNumberOfPeoples()-1).getAge() + " ; "
				+ this.getPeoples().get(getNumberOfPeoples()-1).getGender();
	}
	
}
