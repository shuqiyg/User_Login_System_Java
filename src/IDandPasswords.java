import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("CallMeDaddy","pantyhose");
		logininfo.put("CryptoHead","btcethxrp");
		logininfo.put("Porsche911","gt3");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}

