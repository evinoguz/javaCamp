package gun4_Odev3.Adapters;

import java.rmi.RemoteException;

import gun4_Odev3.Abstract.PersonCheckService;
import gun4_Odev3.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService{

	@Override
	public boolean checkIfRealCustomer(Gamer gamer) {
		KPSPublicSoap client =new KPSPublicSoapProxy();
		boolean result=true;
		try {
			result=client.TCKimlikNoDogrula(
					Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), 
					gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
