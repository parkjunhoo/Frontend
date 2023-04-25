package customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fw.Action;

public class LoginAction implements Action{

	@Override
	public void run(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("customer login");
	}

}
