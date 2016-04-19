package simple_add_edit_online_application;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditApplication
 */
@WebServlet("/Homework1/EditApplication")
public class EditApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditApplication() {
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

		Integer id = Integer.parseInt(request.getParameter("id"));
		/*
		 * String applicant = request.getParameter("applicant"); String apprec =
		 * request.getParameter("apprec"); String gpa =
		 * request.getParameter("gpa"); String status =
		 * request.getParameter("status");
		 */

		List<Application> app = (List<Application>) getServletContext()
				.getAttribute("application");
		Application a = new Application();

		for (Application a1 : app) {
			if (a1.getId() == id) {

				a.setId(a1.getId());
				a.setApplicant(a1.getApplicant());
				a.setApplicationReceived(a1.getApplicationReceived());
				a.setGpa(a1.getGpa());
				a.setStatus(a1.getStatus());
			}
		}

		// SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		// Date date = null;
		//
		// try {
		// date = format.parse(apprec);
		// } catch (ParseException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// System.out.println(date);

		ServletContext context = this.getServletContext();
		context.setAttribute("a", a);

		/*
		 * request.setAttribute("id", id); request.setAttribute("applicant",
		 * applicant); request.setAttribute("apprec", date);
		 * request.setAttribute("gpa", gpa); request.setAttribute("status",
		 * status);
		 */

		request.getRequestDispatcher("EditApplication.jsp").forward(request,
				response);
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

		Integer id = Integer.parseInt(request.getParameter("id"));
		String applicant = request.getParameter("applicant");
		String apprec = request.getParameter("apprec");
		String gpa = request.getParameter("gpa");
		String status = request.getParameter("status");

		// System.out.println(apprec);

		SimpleDateFormat format = new SimpleDateFormat("M/d/yyyy");
		Date date = null;

		try {
			date = format.parse(apprec);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Application a1 : app) {
			if (a1.getId() == id) {

				a1.setApplicant(applicant);
				a1.setApplicationReceived(date);
				a1.setGpa(gpa);
				a1.setStatus(status);
			}
		}

		response.sendRedirect("ListApplications");
	}

}
