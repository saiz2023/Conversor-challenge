import javax.swing.JOptionPane;

public class moneda {
	public void convercion(String seletMoneda ) {
		api api=new api();
		double valor=0;
		int f=1;
		String moneda = null;
		while(f!=0) {
			try {
				valor =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor para covertir "+seletMoneda)) ;
				f=0;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Valor no valido");
				f=1;
			}
		}
		switch (seletMoneda) {
		case "De pesos Colombianos a Dolares": {
			valor=api.get("COP","USD",valor);
			moneda=" Dolares";
			break;
			}
		case "De pesos Colombianos a Euros":{
			valor=api.get("COP","EUR",valor);
			moneda=" Euros";
			break;
		}
		case "De pesos Colombianos a Libras Esterlinas":{
			valor=api.get("COP","GBP",valor);
			moneda=" Libras Esterlinas";
			break;
			}
		case "De pesos Colombianos a Yen Japones":{
			valor=api.get("COP","JPY",valor);
			moneda=" Yen Japones";
			break;
			}
		case "De pesos Colombianos a Won Surcoreano":{
			valor=api.get("COP","KRW",valor);
			moneda=" Wones Surcoreanos";
			break;
		}
		case "De Dolares a Pesos Colombianos":{
			valor=api.get("USD","COP",valor);
			moneda=" Pesos Colombianos";
			break;
		}
		case "De euros a Pesos Colombianos":{
			valor=api.get("EUR","COP",valor);
			moneda=" Pesos Colombianos";
			break;
		}
		case "De Libras Esterlinas a Pesos Colombianos":{
			valor=api.get("GBP","COP",valor);
			moneda=" Pesos Colombianos";
			break;
		}
		case "De Yen Japones a Pesos Colombianos":{
			valor=api.get("JPY","COP",valor);
			moneda=" Pesos Colombianos";
			break;
		}
		case "De Won Surcoreano a Pesos Colombianos":{
			valor=api.get("KRW","COP",valor);
			moneda=" Pesos Colombianos";
			break;
		}
		}
		
		JOptionPane.showMessageDialog(null,"Tienes $"+ valor+moneda);

		
	}
}
