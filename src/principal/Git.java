package principal;

public class Git extends javax.swing.JFrame{
	
	//ATIBUTOS
		private byte dia;
		private byte mes;
		private int anio;
	        
	        //OVERLOADING DE CONSTRUCTORES
	        public Git (byte dia, byte mes, int anio){
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
	            System.out.println("Datos de:"+Quien);
	            System.out.println( "Ingresar fecha de nacimiento:" );
	            System.out.println("Dia: "+dia);
	            System.out.println("Mes: "+mes);
	            System.out.println("Año: "+anio);
	            System.out.println("--------------------------------");
	            
	        }  
	
	public static void main(String[] args) {
		System.out.println("Git Version 2");
		
		Git MyBirthDay = new Git ((byte)17, (byte)02, 1991);
		MyBirthDay.desplegarDatos(" Mi fecha de nacimiento");
	}
}
