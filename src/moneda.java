import javax.swing.JOptionPane;

public class moneda {
	public void convercion(String seletMoneda ) {
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
			valor*=0.00024;
			moneda=" Dolares";
			break;
			}
		case "De pesos Colombianos a Euros":{
			valor*=0.00022;
			moneda=" Euros";
			break;
		}
		case "De pesos Colombianos a Libras Esterlinas":{
			valor*=0.00019;
			moneda=" Libras Esterlinas";
			break;
			}
		case "De pesos Colombianos a Yen Japones":{
			valor*=0.035;
			moneda=" Yen Japones";
			break;
			}
		case "De pesos Colombianos a Won Surcoreano":{
			valor*=0.32;
			moneda=" Wones Surcoreanos";
			break;
		}
		case "De Dolares a Pesos Colombianos":{
			valor*=4155.22;
			moneda=" Pesos Colombianos";
			break;
		}
		case "De euros a Pesos Colombianos":{
			valor*=4536.01;
			moneda=" Pesos Colombianos";
			break;
		}
		case "De Libras Esterlinas a Pesos Colombianos":{
			valor*=5279.82;
			moneda=" Pesos Colombianos";
			break;
		}
		case "De Yen Japones a Pesos Colombianos":{
			valor*=28.79;
			moneda=" Pesos Colombianos";
			break;
		}
		case "De Won Surcoreano a Pesos Colombianos":{
			
			valor*=3.16;
			moneda=" Pesos Colombianos";
			break;
		}
		}
		
		JOptionPane.showMessageDialog(null,"Tienes $"+ (Math.round(valor * 10000.0) / 10000.0)+moneda);

		
	}
}
