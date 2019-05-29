package day_44Constructors;

public class Job {

	private String title;
	private String company;
	private double salary;
	
	public Job() {
		System.out.println("No-args constructor");
		this.title = "undefined";
		this.company = "undefined";
		
	}
	
	public Job(String title) {
		System.out.println("One-args constructor");
		this.title = title;
		this.company = "undefined";


	}
	
	public Job(String title, String company, double salary) {
		System.out.println("Three-args constructor");
		setTitle(title);
		this.salary = salary;
	 
	}
	
	@Override
	public String toString() {
		return "Job [title=" + title + ", company=" + company + ", salary=" + salary + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
}
