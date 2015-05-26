package com.MonopolyGame;

public interface IPropertyRepository {

	boolean create( AbstractProperty property );
	AbstractProperty get( int nameOfProperty );
	boolean update( AbstractProperty property );
	boolean delete( AbstractProperty property );
}
