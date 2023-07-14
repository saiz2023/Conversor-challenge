import javax.swing.JOptionPane;

public class temperatura {
	
	public void converdorTemperatura(String seletTemperatura) {
		double valor=0;
		int f=1;
		String temperatura = null;
		while(f!=0) {
			try {
				valor =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor para covertir "+seletTemperatura)) ;
				f=0;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Valor no valido");
				f=1;
			}
		}
		switch (seletTemperatura) {
		case "De Celsius a Fahrenheit": {
			valor=valor*9/5+32;
			temperatura=" Fahrenheit";
			break;
			}
		case "De Celsius a Kelvin":{
			valor+=273.15;
			temperatura=" Kelvin";
			break;
		}
		case"De Celsius a Rankine":{
			valor =valor*9/5+491.67;
			temperatura=" Rankine";
			break;
		}
		case"De Fahrenheit a Celsius":{
			valor=(valor-32)/1.8;
			temperatura=" Celsius";
			break;
		}
		case "De Fahrenheit a Kelvin":{
			valor=(valor+459.67)*((double)5/9);
			System.out.println(valor);
			temperatura=" Kelvin";
			break;
		}
		case "De Fahrenheit a Rankine":{
			valor+=456.67;
			temperatura=" Rankine";
			break;
		}
		case "De Kelvin a Celsius":{
			valor-=273.15;
			temperatura=" Celsius";
			break;
		}
		case "De Kelvin a Fahrenheit":{
			valor=valor*9/5-459.67;
			temperatura=" Fahrenheit";
			break;
		}
		case "De Kelvin a Rankine":{
			valor=((double)9/5)*valor;
			temperatura=" Rankine";
			break;
		}
		case "De Rankine a Celsius":{
			valor=(double)5/9*(valor-491.67);
			temperatura=" Celsius";
			break;
		}
		case "De Rankine a Fahrenheit":{
			valor=valor-459.67;
			temperatura=" Fahrenheit";
			break;
		}
		case "De Rankine a Kelvin":{
			valor=valor*5/9;
			temperatura=" Kelvin";
			break;
		}
		}
		JOptionPane.showMessageDialog(null,"Temperatura= "+(Math.round(valor * 10000.0) / 10000.0) +temperatura);
	}
	

}
