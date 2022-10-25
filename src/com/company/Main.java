package com.company;

public class Main {

    public static void main(String[] args) {
        PrintingPress Press = new PrintingPress("Press", 100);
        Manager ivan = new Manager("Manager", "Ivan Ivanov");
        MachineOperator nikolay = new MachineOperator("MachineOperator", "Nikolay Nikolov");
        Press.addEmployee(ivan);
        Press.addEmployee(nikolay);

        Publication publication1 = new Publication("Spiderman", 10, PageSize.A1, PageType.NEWSPAPER);

        PrintingMachine machine1 = new PrintingMachine(200, 50, PaperColor.BLACK);
        PrintingMachine machine2 = new PrintingMachine(150, 20, PaperColor.COLOR);
        Press.addPrintingMachine(machine1);
        Press.addPrintingMachine(machine2);
        machine1.loadPaper(100);
        machine2.loadPaper(150);

        try {
            Press.printPublications(publication1, 5, machine1);
        } catch (EmptyPrintingMachineException e) {
            e.printStackTrace();
        }

        try{
            Press.printPublications(publication1, 5, machine2);
        }catch (EmptyPrintingMachineException e){
            e.printStackTrace();
        }

        Press.printExpenses();
        Press.printIncome();

        System.out.println(ivan.getFinalsalary());
        System.out.println(nikolay.getFinalsalary());


    }
}
