package DeCuong.Phan2_1.Bai1;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, double Wage, double bonus) {
        super(name, Wage);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return getWage() + getBonus();
    }
}
