package userapis;

import java.util.ArrayList;

public class Root{
	private ArrayList<User> users;
	private Info info;
	public ArrayList<User> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
}
