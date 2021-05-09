package gameProject.mernis;

import java.rmi.RemoteException;
import java.time.ZoneId;

import gameProject.abstracts.UserCheckService;
import gameProject.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisSystem implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean results=false;
			
			try 
			{
				results = kpsPublicSoapProxy.TCKimlikNoDogrula
						(
								Long.parseLong(gamer.getNationalityId()) , 
								gamer.getFirstName().toUpperCase(), 
								gamer.getLastName().toUpperCase(), 
								gamer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
								);
			} 
			catch (RemoteException e)
			{
				System.out.println("Mernis bulunmuyor");
			}

			return results;
			
		
	}

}
