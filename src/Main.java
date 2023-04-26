import java.util.Random;
import java.util.Arrays;


public class Main {

    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};


        int salary = random.nextInt(900, 1500);
        int salaryIndex = random.nextInt(100, 120);
        int hoursWorkedPerMonth = random.nextInt(120, 160);
        int age = random.nextInt(18, 60);
        int rnd = random.nextInt(0, 2);
        if (rnd == 1)
            return
                 new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], age,salary * salaryIndex);
            else return
                new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], age, salary, hoursWorkedPerMonth);
    }


    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());
//      Arrays.sort(employees, new SurNameComparator());
//      Arrays.sort(employees, new SalaryComparator());

        System.out.println("\n*** Отсортированный список сотрудников по возрасту***\n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
