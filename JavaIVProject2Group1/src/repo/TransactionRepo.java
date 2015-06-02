package repo;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import model.Transactions;

public class TransactionRepo {

	ArrayList<Transactions> transactionList;
	
	public static void main(String[] args){
		
			TransactionRepo tr = new TransactionRepo();
		}

	public TransactionRepo(){
			transactionList = new ArrayList<Transactions>();
			buildTransactionList();
		}
	
	public ArrayList<Transactions> getTransactionList(){
			return transactionList;
		}
	
	public void buildTransactionList(){
				Connection  connection;
		}
}