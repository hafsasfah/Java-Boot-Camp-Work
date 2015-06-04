package data;

import java.sql.*;
import models.aGame;

public interface iGameRepository {
	boolean create(aGame game);
	aGame getGame(int gameID);
	int getGameID(String name);
	boolean update(aGame game);
	boolean delete(aGame game);
}
