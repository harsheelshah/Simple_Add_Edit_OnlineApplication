package simple_add_edit_online_application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListApplications
 */
@WebServlet("/Homework1/ListApplications")
public class ListApplications extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListApplications() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

		super.init(config);
		ArrayList<Application> app = new ArrayList<Application>();

		Application a1 = new Application(1, "John Doe", new Date("10/21/2015"),
				"3.1", "Pending Review");
		Application a2 = new Application(2, "Jane Doe", new Date("3/21/2016"),
				"", "Application Incomplete");
		Application a3 = new Application(3, "Amy Smith", new Date("3/1/2014"),
				"3.3", "Accepted");

		app.add(a1);
		app.add(a2);
		app.add(a3);

		Collections.sort(app, Application.AppNameComparator);

		getServletContext().setAttribute("application", app);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<Application> app = (List<Application>) getServletContext()
				.getAttribute("application");
		getServletContext().setAttribute("application", app);
		Collections.sort(app, Application.ApprecComparator);

		request.getRequestDispatcher("ListApplications.jsp").forward(request,
				response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
