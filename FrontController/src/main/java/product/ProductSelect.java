package product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fw.Action;

public class ProductSelect implements Action{

	public void run(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("productSelect");
	}

}
