package day_44Constructors;
import java.util.*;
public class Dice {
	public static void main(String[] args) {
		Job job1 = new Job();
		Job job2 = new Job("Java Developer");
		Job job3 = new Job("SDET","Amazon", 130_000.0);
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
	
	//Create a list of Job s.
		
		// and add 5 different jobs, with company, salary, title
		
	List<Job> jobsList = new ArrayList<>();
	jobsList.add(job3);
	jobsList.add(new Job("Scrum", "Google", 123000));
	jobsList.add(new Job("SDET", "FreddieMac", 100000));
	jobsList.add(new Job("BA", "Leidos", 89000));
	jobsList.add(new Job("Senior QA Tester", "Delata", 150_000));

	System.out.println(jobsList);
	
	//find the hightst paying and print toString for that
	double maxSalary = 0; 
	int highestIndex = -1;
	for(int i=0; i < jobsList.size(); i++) {
		if (jobsList.get(i).getSalary()>maxSalary) {
			maxSalary= jobsList.get(i).getSalary();
			highestIndex = i;
		}
	}
	System.out.println("Highest Salary:"+ jobsList.get(highestIndex));
	
	}

}
