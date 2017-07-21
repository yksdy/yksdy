package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8")
		;
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>InitParam Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		
		out.println("<form action='"+request.getRequestURI()+" 'method='post'>");
		out.println("�˺� : <input type='text' name='username' </br>");
		out.println("���� : <input type='password' name='password' </br></br>");
		out.println("<input type='submit' value=' ��¼ '>");
		out.println("</form>");
		
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	//	request.getRequestDispatcher("/WEB-INF/notice.html").forward(request, response);
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		Enumeration params = this.getInitParameterNames();
		while(params.hasMoreElements()){
			String userParam = (String)params.nextElement();
			String passParam = this.getInitParameter(userParam);
			if(userParam.equalsIgnoreCase(name)&&passParam.equalsIgnoreCase(password)){
				request.getRequestDispatcher("/WEB-INF/notice.html").forward(request, response);
				System.out.print("bb");
				return;
			}
		}
		System.out.print("aa");
		this.doGet(request, response);		
	}

}