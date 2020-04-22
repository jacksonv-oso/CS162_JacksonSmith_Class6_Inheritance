public class Engineers extends Employee {
    /**
     * @param passes new arguments from Engineers class to the super class, Employee.
     * @return
     */

    public String toString(){
        String Engineer = super.Employee("Moira","Engineer",34000.0*1.5,1,1,2);
        String Engineer1 = super.toString();
        return super.empMotto()+ "To the optimist, the glass is half full. To the pessimist, the glass is half empty. To the engineer, the glass is twice as big as it needs to be."+ "\n";
    }
}
