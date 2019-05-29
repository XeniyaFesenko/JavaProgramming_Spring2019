package day50_inharitance03;

public class Main {
public static void main(String [] args) {
Employee emp = new Employee ();
FullTimeEmployee ft = new FullTimeEmployee();
Contractor ct = new Contractor();

emp.CalculatePay(40, 40);
ft.CalculatePay(40,45);
ct.CalculatePay(40, 55);
}
}