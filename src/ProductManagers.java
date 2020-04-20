public class ProductManagers extends Employee {
    /**
     * @param Passes new arguments from ProductManagers class to the super class, Employee.
     * @return
     */
    public String toString(){
        String ProductManagers = super.Employee("Mark", "Product Manager", 34000.0*2,1,1,3);
        String pM = super.toString();
        return pM + ProductManagers + "\nThere is nothing so useless as doing efficiently that which should not be done at all.";
    }
}
