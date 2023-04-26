class Freelancer extends Employee {
    int hourlyRate;
    int hoursWorkedPerMonth;

    public Freelancer(String firstName, String surName,int age, int hourlyRate,int hoursWorkedPerMonth) {
        super(firstName, surName, age, 0);
        this.hourlyRate = hourlyRate;  // часовая тарифная ставка
        this.hoursWorkedPerMonth = hoursWorkedPerMonth; // отработано часов в месяц
    }

    @Override
    public double calculateSalary() {
        salary = hourlyRate*hoursWorkedPerMonth;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Полных лет %d; Тарифная ставка %d; " +
                        "Часов в месяц %d; " +
                        "Заработано за мес: %.2f",
                surName, firstName, age, hourlyRate,hoursWorkedPerMonth, calculateSalary());
    }
}