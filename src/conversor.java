import javax.swing.JOptionPane;


public class conversor {
	public static void main(String[] args) {
		moneda moneda =new moneda();
		opciones op =new opciones();
		temperatura temp =new temperatura();
		double f=0;
		String seletConversor,seletMoneda,seletTemperatura ;
		
		while(f==0) {
			seletConversor=op.tipoDeConversion();
			System.out.println(seletConversor);
			if(seletConversor=="Coversor de moneda") {
				seletMoneda=op.tipoDeMoneda();	
				moneda.convercion(seletMoneda);	
			}
			if(seletConversor=="Converosr de temperatura") {
				seletTemperatura=op.tipoDeTemperatura();
				temp.converdorTemperatura(seletTemperatura);
			}
			f=JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		
		}
	
		JOptionPane.showMessageDialog(null,"Programa finalizado");

	}

}
