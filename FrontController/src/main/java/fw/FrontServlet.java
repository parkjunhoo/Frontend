package fw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontServlet
 */
@WebServlet({"*.jsp" , "*.java","*.do","*.html"})
public class FrontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String context = req.getContextPath();
		String uri = req.getRequestURI();
		String path = uri.substring(context.length());
		
		//2. 추출한 요청 path로 등록된 클래스를 찾아서 가져오는 작업
		//=> requestMapping 객체에 의뢰
		//=> requestMapping 객체의 메소드를 호출하면
		//실제 실행할 객체를 찾아서 리턴
		RequestMapping mapObj = new RequestMapping();
		Action action = mapObj.mapping(path);
		System.out.println(path);
		//3. Action 객체의 run 메소드 호출
		action.run(req, res);
		
		//4. run메소드 실행결과를 받아서 응답할 view를 찾는다.
		
		//5. 응답view를 찾아서 forward하고 redirect 하도록 정의
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	


}
