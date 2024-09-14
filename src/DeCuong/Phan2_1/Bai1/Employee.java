package DeCuong.Phan2_1.Bai1;

abstract class Employee {
    private String name;
    private double wage;

    public Employee(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
      this.wage = wage;
    }

    abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Wage=" + wage +
                '}';
    }

    public void addBonus(double bonus) {
        this.wage += bonus;
    }

    public static void addBonus(Employee[] employees, double bonus) {
        for (Employee employee : employees) {
            employee.addBonus(bonus);
        }
    }
}
