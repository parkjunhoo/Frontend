package dao;

public class Test {

	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAOImpl();
		dao.login("jimin", "1234");
	}

}
