package data;

import models.aGame;

public interface iGameRepository {
	boolean create(aGame game);
	aGame get(int gameID);
	boolean update(aGame game);
	boolean delete(aGame game);
}
