package org.elektro.factucloud;
import java.io.IOException;
import javax.servlet.http.*;


public class FactucloudServlet extends HttpServlet
{
private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
