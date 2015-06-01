package databases;

public interface iUserTable {
	public boolean create(iUser user);
	//public void read();
	public boolean update(iUser user);
	public boolean delete(iUser user);
}
