import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Employee {
    String name;
    int salary;

    public Employee(){

    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void print(){
        NumberFormat salaryFormat= NumberFormat.getNumberInstance(Locale.US);
        System.out.println("Employee Name: "+name+"\n"+"Employee Salary: "+salaryFormat.format(salary));
    }
}
class Vendor extends Employee{
    int hoursWorked;

    public Vendor(){

    }

    public Vendor(String name,int hoursWorked){
        super(name);
        this.hoursWorked=hoursWorked;

    }

    public void print(){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        System.out.println("VolunteerName :"+name+"\n"+"HoursWorked :"+hoursWorked);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Chimaka");
        employee.setSalary(3000);
        employee.print();
        System.out.println();
        Employee vendor= new Vendor("Ifeanyi",12);
        vendor.print();
    }


}
