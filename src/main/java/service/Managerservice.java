package service;

import model.Applicants;
import model.Cashier;
import model.Manager;
import model.Stores;

public interface Managerservice {

  public String hireApplicant(Stores stores, Manager manager, Applicants applicant);
   public String fireCashier(Manager manager, Cashier cashier);

    public  double checkBalance(Stores stores);

    public  void updateBalance(Stores stores, double amount);
}
