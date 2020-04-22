public class ProductManagers extends Employee {
    /**
     * @param passes new arguments from ProductManagers class to the super class, Employee.
     * @return
     */
    public String toString(){
        String ProductManagers = super.Employee("Mark", "Product Manager", 34000.0*2,1,1,3);
        String pM = super.toString();
        return super.empMotto()+ "There is nothing so useless as doing efficiently that which should not be done at all." + "\n";
    }
}
