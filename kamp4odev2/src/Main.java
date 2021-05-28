import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrotes.NeroCustomerManager;
import Entitiy.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException{
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		 customerManager.Save(new Customer(1,"Mert","ENÝKONU",LocalDate.of(2000,8,1),"123456789"));
	
		System.console();
	}

}
