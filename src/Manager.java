public class Manager extends Employee {
    private double bonus;

    Manager(){super();}

    Manager(String name, String surname, double salary, double bonus) throws IncorrectSalaryException, FieldLengthLimitException {
        super(name, surname, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " bonus: " + this.bonus + ";";
    }


    public double getBonus() {
        return bonus;
    }
}
