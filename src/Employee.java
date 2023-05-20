public class Employee {
    private int id;
    private String fullName;
    private int department;
    private int salary;
    private static int counter = 1;
    public Employee(String fullName, int department, int salary) {
        this.id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "id - " + id + ", ФИО сотрудника - " + this.fullName + ", Отдел - " + this.department + ", Зарплата - " + this.salary + " рублей";
    }
}
