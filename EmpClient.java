public class EmpClient {
    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.setEmpId(111);
        emp.setEmpName("Pankaj");
        emp.setEmpSalary(10000.0);
        System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpSalary());
    }
}
