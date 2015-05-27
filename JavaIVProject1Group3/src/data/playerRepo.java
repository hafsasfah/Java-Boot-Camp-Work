package data;

import models.AbstractPlayer;

public abstract class playerRepo implements IPlayerRepo{

	@Override
	public boolean create(AbstractPlayer player) {
		return false;
	}

	@Override
	public AbstractPlayer get(int playerId) {
		return null;
	}

	@Override
	public boolean update(AbstractPlayer player) {
		return false;
	}

	
}
