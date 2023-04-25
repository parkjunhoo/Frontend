package fw;

import java.util.HashMap;

import customer.InsertAction;
import customer.LoginAction;
import product.ProductSelect;
import product.ShoppingCart;

public class RequestMapping {
	private HashMap<String, Action> actionDict = new HashMap<String, Action>();
	public RequestMapping() {
		
	}
	
	public Action mapping(String path) {
		
		Action action = null;
		
		if(path.equals("/customer/insert.do")) {
			action = new InsertAction();
		}else if(path.equals("/login.do")) {
			action = new LoginAction();
		}else if(path.equals("/product/list.do")) {
			action = new ProductSelect();
		}else if(path.equals("/product/card.do")) {
			action = new ShoppingCart();
		}
		
		return action;
	}
	
	
	
}
