package repo;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import model.Person;


public class PersonRepo {
	ArrayList<Person> personList;


	public static void main(String[] args){
	
		PersonRepo pr = new PersonRepo();
	}

	public PersonRepo(){
		personList = new ArrayList<Person>();
		buildPersonList();
	}
	
	public ArrayList<Person> getPersonList(){
		return personList;
	}
	
	public void buildPersonList(){
			Connection  connection;
	}
}
