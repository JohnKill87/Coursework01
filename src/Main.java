public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Носатов Алексей Юрьевич", 1, 30_000),
                new Employee("Александр Сергей Иванович", 2, 45_000),
                new Employee("Грамов Григорий Иванович", 3, 65_000),
                new Employee("Копыткин Руслан Александрович", 4, 75_000),
                new Employee("Румин Владислав Алексеевич", 5, 40_000),
                new Employee("Янкин Илья Александрович", 1, 50_000),
                new Employee("Романов Борис Николаевич", 2, 80_000),
                new Employee("Юкутова Наталья Анатольевна", 3, 35_000),
                new Employee("Ломара Людмила Ивановна", 4, 60_000),
                new Employee("Брагина Анастасия Людмиловна", 5, 90_000)
        };
    }
//    (Данные всех сотрудников)
    public static void allEmployee(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

//    (Общаяя сумма затрат на зарплаты)
    public static int allEmployeeSalary(Employee[] employees) {
        int sum = 0;
        for (Employee e : employees) {
            sum += e.getSalary();
        }
        return sum;
    }
//    (Сотрудник с минимальной зарплатой)
    public static Employee employeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = e;
            }
        }
        return employeeWithMinSalary;
    }
//    (Сотрудник с максимальной заплатой)
    public static Employee employeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = e;
            }
        }
        return employeeWithMaxSalary;
    }
//    (Среднее значение зарплат)
    public static double employeeAverageSalary(Employee[] employees) {
        return (double) allEmployeeSalary(employees) / employees.length;
    }
//    (ФИО Всех сотрудников)
    public static void printAllEmployeeName(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.getFullName());
        }
    }
}