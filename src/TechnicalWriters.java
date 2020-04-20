public class TechnicalWriters extends Employee {
    /**
     * @param Passes new arguments from TechnicalWriters class to the super class, Employee.
     * @return
     */
    public String toString(){
        String technicalWriter = super.Employee("Ron","Technical Writer",34000.0,1,1,1);
        String technicalWriter1 = super.toString();
        return technicalWriter1 + technicalWriter + "\nYou can always edit a bad page. You can't edit a blank page.";
    }
}
