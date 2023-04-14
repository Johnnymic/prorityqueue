package service.implentation;

import model.Applicants;
import model.Cashier;
import model.Manager;
import model.Stores;
import service.Managerservice;

public class ManagerImplementation implements Managerservice {




    @Override
    public String hireApplicant(Stores stores, Manager manager, Applicants applicant) {
        stores.setApplicant_required_maxAge(25);
        stores.setApplicant_required_minAge(16);
        if (applicant.getAge() >= stores.getApplicant_required_minAge() && applicant.getAge() <= stores.getApplicant_required_maxAge()) {
            return (applicant.getName() + " congratulation!!! ,you have been hire by Mr. " + manager.getName());
        }
        return (applicant.getName() + " WE ARE SORRY TO INFORM YOU, THAT YOU CANNOT BE HIRE FOR THIS POSITION");
    }

    @Override
    public String fireCashier(Manager manager, Cashier cashier) {
        for (Cashier c : manager.getCashiers()){
            if (c.getName().equals(cashier.getName())) {
                return (cashier.getName() + "with the ID " + cashier.getId() + " has been fired");
            }

        }
        return (cashier.getName() + " with the ID " + cashier.getId() + " has been fired");
    }

    @Override
    public double checkBalance(Stores stores) {
        return stores.checkBalance();
    }


    public void updateBalance(Stores stores, double amount) {
        stores.upDateBalance(amount);
        System.out.println("Current balance update for " + stores.getStore_name() + ": #" + stores.checkBalance() + " ,after the  customer has paid the item");
        System.out.println();

    }



}