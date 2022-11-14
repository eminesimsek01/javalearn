package SalaryCalculation;

public class Employee {

        String name;
        int salary;
        int workhours;
        int year;

    public Employee(String name, int salary, int workhours, int year) {
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.year = year;
    }
    public double tax(){
        double payment0fTax=0;

        if(salary<10000){
            payment0fTax=0;
        }
        else {
            payment0fTax=salary*0.03;
        }
        return 0;
    }
    public int bonus (){
        int payment0fBonus =0;
        int additionalBonus=0;

        if(workhours>40)
            payment0fBonus=(workhours-40)*additionalBonus;
            return 0;
    }
    public double raiseSalary() {
        int time0fYear=2021;
        double raising=0;
        int sum0fYear=time0fYear-year;
        if(sum0fYear<5){
            raising=(salary+tax())*0.05;
        }
        else if (sum0fYear<15){
            raising=(salary+tax())*0.1;
        }
        else
            raising=(salary+tax())*0.2;
        return raising;
    }

    }


