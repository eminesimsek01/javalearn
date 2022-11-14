package SalaryCalculation;

public class Runner {
    public static void main(String[] args) {
        Employee employee =new Employee("Drake",1000,41,2020);
        System.out.println("Ödenecek Vergi :" +employee.tax()+ "$");
        System.out.println("employee.bonus() = " + employee.bonus());
        System.out.println("Maaş Artışı: " + employee.raiseSalary() + "₺");
    }


}
