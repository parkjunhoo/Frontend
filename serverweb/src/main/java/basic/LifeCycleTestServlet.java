package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTestServlet extends HttpServlet {
	public LifeCycleTestServlet() {
		System.out.println("LifeCycleTestServlet객체 생성...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init()...");

	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service()...");
		if(req.getMethod().equals("GET")){
			doGet(req,resp);
		}else {
			doPost(req,resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet()...");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost()...");
	}


	//서블릿 객체가 소멸될때 호출
	// -서블릿 객체가 컴파일될떄
	// -WAS가 reload될때
	// -comtext가 reload될때
	@Override
	public void destroy() {
		System.out.println("destroy()...");
	}


	
}
