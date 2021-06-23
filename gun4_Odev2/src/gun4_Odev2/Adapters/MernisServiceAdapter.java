package gun4_Odev2.Adapters;
import java.rmi.RemoteException;

import gun4_Odev2.Abstract.CustomerCheckService;
import gun4_Odev2.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealCustomer(Customer customer) {
		
		KPSPublicSoap client =new KPSPublicSoapProxy();
		
		boolean result=true;
		try {
			result=client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
