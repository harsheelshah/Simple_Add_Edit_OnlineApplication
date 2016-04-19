package simple_add_edit_online_application;

import java.util.Comparator;
import java.util.Date;

public class Application {

	public Integer id;
	public String Applicant;
	public Date ApplicationReceived;
	public String Gpa;
	public String Status;

	public Application() {
		super();
	}

	public Application(Integer id, String applicant, Date applicationReceived,
			String gpa, String status) {
		super();
		this.id = id;
		Applicant = applicant;
		ApplicationReceived = applicationReceived;
		Gpa = gpa;
		Status = status;
	}

	public Application(String applicant, Date applicationReceived, String gpa,
			String status) {
		super();
		Applicant = applicant;
		ApplicationReceived = applicationReceived;
		Gpa = gpa;
		Status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApplicant() {
		return Applicant;
	}

	public void setApplicant(String applicant) {
		Applicant = applicant;
	}

	public Date getApplicationReceived() {
		return ApplicationReceived;
	}

	public void setApplicationReceived(Date applicationReceived) {
		ApplicationReceived = applicationReceived;
	}

	public String getGpa() {
		return Gpa;
	}

	public void setGpa(String gpa) {
		Gpa = gpa;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public static Comparator<Application> AppNameComparator = new Comparator<Application>() {

		public int compare(Application s1, Application s2) {
			String Applicant1 = s1.getApplicant().toUpperCase();
			String Applicant2 = s2.getApplicant().toUpperCase();

			// ascending order
			return Applicant1.compareTo(Applicant2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};

	public static Comparator<Application> StatusComparator = new Comparator<Application>() {

		public int compare(Application s1, Application s2) {
			String Status1 = s1.getStatus().toUpperCase();
			String Status2 = s2.getStatus().toUpperCase();

			// ascending order
			return Status1.compareTo(Status2);

			// descending order
			// return Status2.compareTo(Status1);
		}
	};

	public static Comparator<Application> GPAComparator = new Comparator<Application>() {

		public int compare(Application s1, Application s2) {
			String GPA1 = s1.getGpa().toUpperCase();
			String GPA2 = s2.getGpa().toUpperCase();

			// ascending order
			// return GPA1.compareTo(GPA2);

			// descending order
			return GPA2.compareTo(GPA1);
		}
	};

	public static Comparator<Application> ApprecComparator = new Comparator<Application>() {

		public int compare(Application s1, Application s2) {
			Date Apprec1 = s1.getApplicationReceived();
			Date Apprec2 = s2.getApplicationReceived();

			// ascending order
			// return Apprec1.compareTo(Apprec2);

			// descending order
			return Apprec2.compareTo(Apprec1);
		}
	};

}
