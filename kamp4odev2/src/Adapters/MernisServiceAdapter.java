package Adapters;

import java.rmi.RemoteException;
import Abstract.CustomerCheckService;
import Entitiy.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		 KPSPublicSoapProxy Proxy = new KPSPublicSoapProxy();
		try {
			return Proxy.TCKimlikNoDogrula(customer.getNatiolnalityId() + customer.getFirstName() + customer.getLastName() + customer.getDateOfBirth());
		} catch (RemoteException e) {
		
			System.out.println("Hata ALýndý.");
			e.printStackTrace();
		}
		return false;
		
	}

}
