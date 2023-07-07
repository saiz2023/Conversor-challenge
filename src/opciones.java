import javax.swing.JOptionPane;

public class opciones {
	
	Object [] OPconversor = {"Coversor de moneda","Converosr de temperatura" };
	Object [] OPmoneda= {"De pesos Colombianos a Dolares","De pesos Colombianos a Euros","De pesos Colombianos a Libras Esterlinas",
			"De pesos Colombianos a Yen Japones","De pesos Colombianos a Won Surcoreano","De Dolares a Pesos Colombianos","De euros a Pesos Colombianos",
			"De Libras Esterlinas a Pesos Colombianos","De Yen Japones a Pesos Colombianos","De Won Surcoreano a Pesos Colombianos"};
	Object [] OPtemperatura= {"De Celsius a Fahrenheit","De Celsius a Kelvin","De Celsius a Rankine","De Fahrenheit a Celsius",
			"De Fahrenheit a Kelvin","De Fahrenheit a Rankine","De Kelvin a Celsius","De Kelvin a Fahrenheit","De Kelvin a Rankine"
			,"De Rankine a Celsius","De Rankine a Fahrenheit","De Rankine a Kelvin"};

	@SuppressWarnings("unused")
	public String tipoDeConversion() {
		String seletConversor;
		return seletConversor =(String) JOptionPane.showInputDialog(null,"Selecione un conversor","Conversor",JOptionPane.QUESTION_MESSAGE,null,OPconversor,OPconversor[0]);

	}

	public String tipoDeMoneda() {
		String seletMoneda = null;
		int f=1;
		while(f!=0) {
			seletMoneda =(String) JOptionPane.showInputDialog(null,"Selecione una moneda","Moneda",JOptionPane.QUESTION_MESSAGE,null,OPmoneda,OPmoneda[0]);
			if(seletMoneda==null)
				JOptionPane.showMessageDialog(null,"Valor no valido");
			else
				f=0;
			}
		return seletMoneda;
		}
		
		
		
	
	public String tipoDeTemperatura() {
		String seletTemperatura = null;
		int f=1;
		while(f!=0) {
			seletTemperatura =(String) JOptionPane.showInputDialog(null,"Selecione una moneda","Moneda",JOptionPane.QUESTION_MESSAGE,null,OPtemperatura,OPtemperatura[0]);
			if(seletTemperatura==null)
				JOptionPane.showMessageDialog(null,"Valor no valido");
			else
				f=0;
			}
		
		
		return seletTemperatura;
		
	}
}
