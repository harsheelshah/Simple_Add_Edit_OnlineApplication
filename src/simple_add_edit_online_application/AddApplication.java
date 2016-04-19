package simple_add_edit_online_application;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddApplication
 */
@WebServlet("/Homework1/AddApplication")
public class AddApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("AddApplication.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<Application> app = (List<Application>) getServletContext()
				.getAttribute("application");

		Application a = new Application();

		String Applicant = request.getParameter("Applicant");
		String AppRec = request.getParameter("AppRec");
		String GPA = request.getParameter("GPA");
		String Status = request.getParameter("Status");

		SimpleDateFormat format = new SimpleDateFormat("M/d/yyyy");
		Date date = null;

		try {
			date = format.parse(AppRec);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		a.setId(app.size() + 1);
		a.setApplicant(Applicant);
		a.setApplicationReceived(date);
		a.setGpa(GPA);
		a.setStatus(Status);
		app.add(a);

		// request.getRequestDispatcher("ListApplications").forward(request,
		// response);
		response.sendRedirect("ListApplications");
	}

}
