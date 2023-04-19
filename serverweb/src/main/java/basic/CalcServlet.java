package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException{
		//req.setCharacterEncoding("UTF-8");
		double num1 = Double.parseDouble(req.getParameter("num1"));
		double num2 = Double.parseDouble(req.getParameter("num2"));
		String method = req.getParameter("method");
		
		double result = 0;
		switch(method) {
			case "+":{
				result = num1+num2;
				break;
			}
			case "-":{
				result = num1-num2;
				break;
			}
			case "*":{
				result = num1*num2;
				break;
			}
			case "/":{
				result = num1/num2;
				break;
			}
			default:
		}
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = res.getWriter();
		
		pw.write("<h1>계산결과</h1><hr>");
		String resData = String.format("num1의 %f과 num2의 %f를 연산한 결과는 %f입니다.", num1, num2 , result);
		pw.write("<h2>"+resData+"</h2>");
	}

}
