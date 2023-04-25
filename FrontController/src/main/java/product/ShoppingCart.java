package product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fw.Action;

public class ShoppingCart implements Action {

	@Override
	public void run(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("장바구니 추가하기 기능을 수행");
	}

}
