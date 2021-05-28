package Abstract;

import Entitiy.Customer;

public class BaseCustomerManager implements CustomerService{
	
	public void Save(Customer customer) {
		
		System.out.println("Save to db :" + customer.getFirstName());
		
			}

}
