package Concrotes;

import Abstract.CustomerCheckService;
import Entitiy.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
