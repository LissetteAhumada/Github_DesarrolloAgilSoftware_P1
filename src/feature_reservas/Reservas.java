package feature_reservas;
	

	/**
	 * @author Lissette Ahumada Castellanos - User A
	 *
	 */
	

	public class Reservas extends javax.swing.JFrame{
		
		//ATIBUTOS
			private byte dia;
			private byte mes;
			private int anio;
		        
		        //OVERLOADING DE CONSTRUCTORES
		        public Reservas (byte dia, byte mes, int anio){
		        this.dia = dia;
		        this.mes = mes;
		        this.anio = anio;
		        }
		           
			//GETTER Y SETTER
	

		    public byte getDia() {
		        return dia;
		    }
	

		    public void setDia(byte dia) {
		        this.dia = dia;
		    }
		    
		    public byte getMes() {
		        return mes;
		    }
		    
		    public void setMes(byte mes) {
		        this.mes = mes;
		    }
	

		    public int getAnio() {
		        return anio;
		    }
	

		    public void setAnio(int anio) {
		        this.anio = anio;
		    }
		        
		        public void desplegarDatos (String Quien){
		            System.out.println("Datos de la reserva hecha por:"+Quien);
		            System.out.println( "Ingresar fecha de reserva:" );
		            System.out.println("Dia: "+dia);
		            System.out.println("Mes: "+mes);
		            System.out.println("Año: "+anio);
		            System.out.println("--------------------------------");
		        }  
		
		public static void main(String[] args) {
			System.out.println("Reservas Version 1");
			
			Reservas Reserva1 = new Reservas ((byte)17, (byte)11, 2017);
			Reserva1.desplegarDatos(" Lissette Ahumada Castellanos");
			Reservas Reserva2 = new Reservas ((byte)1, (byte)12, 2017);
			Reserva2.desplegarDatos(" Alejandra Ahumada Castellanos");
			Reservas Reserva3 = new Reservas ((byte)30, (byte)11, 2017);
			Reserva3.desplegarDatos(" Lissette Ahumada Castellanos");
			Reservas Reserva4 = new Reservas ((byte)24, (byte)12, 2017);
			Reserva4.desplegarDatos(" Alejandra Ahumada Castellanos");
		}
}
