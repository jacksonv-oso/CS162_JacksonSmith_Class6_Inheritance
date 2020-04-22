/**
 * Inheritance Challenge
 * @author Vernon Jackson Smith
 * @version 1
 */
public class Employee {
    /**
     * Employee.java - Employee Benefits Management
     * @author Kimberly Bryant
     * @version 1
     */
    private String name;
    private String jobTitle;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;
    private int vacationTime;

    /**
     * Parameterless constructor
     */
    public Employee(){
        //TODO use default values
        name = "";
        jobTitle = "";
        baseSalary = 34000.0;
        yearsOfExperience = 0;
        yearsAtCompany = 0;
        vacationTime = 0;
    }

    /**
     * Parameterless constructor
//     *@param TODO A variable of type TODO
//     *@param TODO A variable of type TODO
//     *@param TODO A variable of type TODO
//     *@param TODO A variable of type TODO
     */
    public String Employee(String empName, String empJobTitle, double empSalary, int empYearsOfExperience, int empYearsAtCompany, int empVacationTime) {
        //TODO
        this.name = empName;
        this.jobTitle = empJobTitle;
        this.baseSalary = empSalary;
        this.yearsOfExperience = empYearsOfExperience;
        this.yearsAtCompany = empYearsAtCompany;
        this.vacationTime = empVacationTime;
        return "";
    }

    //TODO Add needed getters and setters

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString() {
        //TODO
        System.out.println("Employee Info: " + name);
        System.out.println("Job Position: " + jobTitle);
        System.out.println("Salary: " + baseSalary);
        System.out.println("Years Of Experience: " + yearsOfExperience);
        System.out.println("Years With Company: " + yearsAtCompany);
        System.out.println("Allotted Vacation Time(Weeks): " + vacationTime);
        return  "";
    }
    /**
     * Returns a generic employee motto
     * @return A valueof data type String
     */
    public String empMotto(){
        return "Motto: ";
    }

    public static void main(String[] args) {
        Employee tw = new TechnicalWriters();
        System.out.println(tw.toString());

        Employee engr = new Engineers();
        System.out.println(engr.toString());

        Employee pM = new ProductManagers();
        System.out.println(pM.toString());

        FailureAnalysisEngineers faEngr = new FailureAnalysisEngineers();
        System.out.println(faEngr.toString());
    }
}
