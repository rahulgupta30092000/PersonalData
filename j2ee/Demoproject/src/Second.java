

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Second")
public class Second extends HttpServlet {
	
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
	      
		String firstNumber=request.getParameter("n1");
		String secondNumber=request.getParameter("n2");
		String choice=request.getParameter("ch");
		
		int a=Integer.parseInt(firstNumber);
		int b=Integer.parseInt(secondNumber);
		
		switch(choice){
		case "add":
			out.println("Addition is "+(a+b));
			break;
		case "sub":
			out.println("Subtraction is "+(a-b));
			break;
		case "mul":
			out.println("Multiplication is "+(a*b));
			break;
			
		case "div":
			try{
			out.println("Division is "+(a/b));
			}catch(Exception e){
				out.println("Oops,can't divide by 0");
				break;
			}
		}
		
    }
    
    }

