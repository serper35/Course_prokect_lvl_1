public class Main {
    public static void main(String[] args) {

        Employee[] worker = new Employee[10];
        worker[0] = new Employee("Vladislav", "Nikolaevich", "Volkov", 1, 160_000);
        worker[1] = new Employee("Anna", "Petrovna", "Ivanova", 2, 50_000);
        worker[2] = new Employee("Maksim", "Petrovich", "Sorokin", 3, 100_000);
        worker[3] = new Employee("Vladimir", "Semenovich", "Shilov", 4, 80_000);
        worker[4] = new Employee("Pavel", "Pavlovich", "Pavlov", 5, 25_000);
        worker[5] = new Employee("Ignat", "Ignatovich", "Ignatov", 1, 120_000);
        worker[6] = new Employee("Oleg", "Fomich", "Petrov", 2, 150_000);
        worker[7] = new Employee("Ivan", "Ivanovich", "Ivanov", 3, 90_000);
        worker[8] = new Employee("Maria", "Ivanovna", "lok", 4, 140_000);
        worker[9] = new Employee("Irina", "Andreevna", "Stok", 5, 111_000);

        listEmployee(worker);
        printMinSalary(worker);
        printMaxSalary(worker);
        printTotalSalary(worker);
        printAverageSalary(worker);
        printFullNameEmp(worker);


    }

    public static void listEmployee(Employee[] worker) {
        for (Employee allEmp : worker) {
            System.out.println(allEmp + "\n------------------------");
        }
    }

    public static Employee getMinSalary(Employee[] worker) {
        int index = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getSalary() < worker[index].getSalary()) {
                index = i;
            }
        }
        return worker[index];
    }

    public static void printMinSalary(Employee[] worker) {
        Employee empMinSalary = getMinSalary(worker);
        System.out.println("\nМинимальная зарплата - " + empMinSalary.getSalary() + " рублей " + " у сотрудника " + empMinSalary.getFullName() + "\n------------------------");
    }

    public static Employee getMaxSalary(Employee[] worker) {
        int index = 0;
        for (int i = 0; i < worker.length; i++) {
            if (worker[i].getSalary() > worker[index].getSalary()) {
                index = i;
            }
        }
        return worker[index];
    }

    public static void printMaxSalary(Employee[] worker) {
        Employee empMaxSalary = getMaxSalary(worker);
        System.out.println("\nМаксимальная зарплата - " + empMaxSalary.getSalary() + " рублей " + " у сотрудника " + empMaxSalary.getFullName() + "\n------------------------");
    }

    public static double getTotalSalary(Employee[] worker) {
        double totalSalary = 0;
        for (int i = 0; i < worker.length; i++) {
            totalSalary += worker[i].getSalary();
        }
        return totalSalary;
    }

    public static void printTotalSalary(Employee[] worker) {
        System.out.println("\nВсего затрат на зарплаты " + getTotalSalary(worker) + " рублей.\n------------------------");
    }

    public static double getAverageSalary(Employee[] worker) {
        return getTotalSalary(worker)/ worker.length;
    }

    public static void printAverageSalary(Employee[] worker) {
        System.out.println("\nСреднее значение зарплат - " + getAverageSalary(worker) + "рублей.\n------------------------");
    }

    public static void printFullNameEmp(Employee[] worker) {
        for (int i = 0; i < worker.length; i++) {
            System.out.println("\nСотрудник №" +worker[i].getId() + "\n" + worker[i].getFullName() + "\n------------------------");
        }
    }


}