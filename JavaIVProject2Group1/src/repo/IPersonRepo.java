package repo;

import java.util.ArrayList;

import model.Person;

public interface IPersonRepo {
	ArrayList<Person> getPersonList();
	void buildPersonList();

}
