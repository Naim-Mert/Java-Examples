package Concrotes;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entitiy.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	private CustomerCheckService iCustomerCheckService;
	
	

	public StarbucksCustomerManager(CustomerCheckService iCustomerCheckService) {

		this.iCustomerCheckService = iCustomerCheckService;
	}




	@Override
	public void Save(Customer customer) {
		if(iCustomerCheckService.checkIfRealPerson(customer)) {
		super.Save(customer);
	}
		else {
			System.out.println("not a valid person");
				}
		}

	}
	


