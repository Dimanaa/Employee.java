package com.company;

import java.util.ArrayList;
import java.util.List;

public class PrintingPress  {
    private final String name;
    private double expenses;
    private double income;
    private final double incomeforbonus;
    List<Employee> employeeList = new ArrayList<>();
    List<PrintingMachine> printingMachines = new ArrayList<>();

    public PrintingPress(String name, double incomeforbonus) {
        this.name = name;
        this.incomeforbonus = incomeforbonus;
    }

    public void addEmployee(Employee employee) {
        expenses += employee.getSalary();
        employeeList.add(employee);
    }

    public void addPrintingMachine(PrintingMachine machine) {
        printingMachines.add(machine);
    }

    private double priceperPublication(Publication publication, boolean discount) {
        double income;
        if (discount) {
            income = publication.getPrice()*90/100;
        } else {
            income = publication.getPrice();
        }
        return income;
    }

    public void printPublications(Publication publication, int amount, PrintingMachine machine) throws EmptyPrintingMachineException {
        boolean discount=false;
        if (machine.getLoadedpaper() >= (publication.getNumberofpages() * amount)) {

            PrintingThread thread1 = new PrintingThread(machine, publication, amount);
            Thread t = new Thread(thread1);
            t.start();

            if (amount > 50) {
                discount = true;
                System.out.println("You are using 5% discount, because you are printing " + amount + " publications.");
            }
            double priceperPublication = priceperPublication(publication, discount);

            for (int i = amount; i > 0; i--) {
                expenses += publication.getPrice();
                income += priceperPublication;
            }
            incomeBonus();
            System.out.println(amount + " publications of " + publication.getTitle() + " for the price of " + (amount * priceperPublication) + " will be printed.");

        } else {
            throw new EmptyPrintingMachineException(machine);
        }
    }

    public void incomeBonus() {
        if (income > incomeforbonus) {
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getType() == "Manager") {
                    employeeList.get(i).setFinalsalary(10);
                    expenses += employeeList.get(i).getSalary() * 10 / 100;
                    System.out.println("Manager " + employeeList.get(i).getName() + " received a bonus of 10%, his salary is " + employeeList.get(i).getFinalsalary() + " now.");
                }
            }
        }
    }

    public void printExpenses() {
        System.out.println("The expenses of " + name + " are in total: " + expenses);
    }

    public void printIncome() {
        System.out.println("The income of " + name + " is in total: " + income);
    }


}
