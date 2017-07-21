package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yahoo.search.ImageSearchRequest;
import com.yahoo.search.ImageSearchResult;
import com.yahoo.search.ImageSearchResults;
import com.yahoo.search.SearchClient;

public class SearchServlet extends HttpServlet {

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
		request.setCharacterEncoding("UTF-8");
		String word = request.getParameter("word");
		System.out.println("word= " +word);
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		
		out.println("<form action='"+request.getRequestURI()+"' method ='get'>");
		out.println("<input type='text' name='word' value='"+ word+ "'style='width:300px;'>");
	    out.println("<input type='submit' value = 'yhaoo������ search' style='width:100px;'>");
	    out.println("</form>");
	    
	    //SearchClient client = new SearchClient("javasdktest");
	    SearchClient client = new SearchClient("");
	    try{
	    	//ImageSearchRequest searchRequest = new ImageSearchRequest(URLEncoder.encode(word,"UTF-8"));
	    	ImageSearchRequest searchRequest = new ImageSearchRequest(word);
	    	searchRequest.setAdultOk(true);
	    	searchRequest.setResults(20);
	    	searchRequest.setStart(BigInteger.valueOf(0));
	    	
	    	ImageSearchResults results = client.imageSearch(searchRequest);
	    	for(ImageSearchResult result:results.listResults()){
	    		out.println("<img width=160 height=120 src=\""+result.getThumbnail().getUrl()+"\" border='0'>");
	    	}
	    	
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		
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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}