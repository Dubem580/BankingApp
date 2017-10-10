package com.lesson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("UBA");

        if (bank.addBranch("Enugu")){
            System.out.println("Enugu branch created");
        }

        bank.addCustomer("Enugu", "Dubem", 50.00);
        bank.addCustomer("Enugu", "Onyii", 500.00);
        bank.addCustomer("Enugu", "Chisom", 350.00);

        bank.addBranch("Anambra");
        bank.addCustomer("Anambra", "Okose", 300.00);

        bank.addCustomerTransaction("Enugu","Dubem", 44.22);
        bank.addCustomerTransaction("Enugu","Bodos", 20.20);
        bank.addCustomerTransaction("Enugu","James", 10.22);

        bank.listCustomers("Enugu", true);
        bank.listCustomers("Anambra", true);

        //bank.addBranch("New York");

        if (!bank.addCustomer("New York", "Brian",5.53)){
            System.out.println("error new york does not exist");
        }
        if (!bank.addBranch("Enugu")){
            System.out.println("Enugu branch exists");
        }

        if (!bank.addCustomerTransaction("Enugu", "Ferges", 52.33)){
            System.out.println("customer does not exist");
        }

        if (!bank.addCustomer("Enugu", "Dubem", 20)){
            System.out.println("customer already exists");
        }
    }
}
