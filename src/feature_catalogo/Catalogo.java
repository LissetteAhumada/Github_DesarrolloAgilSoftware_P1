package feature_catalogo;

	/**
	 * @author Alejandra Ahumada Castellanos - User B
	 *
	 */
	

	public class Catalogo extends javax.swing.JFrame{
		
		//ATIBUTOS
			private int codigo;
			private int tamaño;
			private int precio;
		        
		        //OVERLOADING DE CONSTRUCTORES
		        public Catalogo (int codigo, int tamaño, int precio){
		        this.codigo = codigo;
		        this.tamaño = tamaño;
		        this.precio = precio;
		        }
		           
			//GETTER Y SETTER
	

		    public int getCodigo() {
		        return codigo;
		    }
	

		    public void setCodigo(int codigo) {
		        this.codigo = codigo;
		    }
		    
		    public int getTamaño() {
		        return tamaño;
		    }
		    
		    public void setTamaño(int tamaño) {
		        this.tamaño = tamaño;
		    }
	

		    public int getPrecio() {
		        return precio;
		    }
	

		    public void setPrecio(int precio) {
		        this.precio = precio;
		    }
		        
		        public void desplegarDatos (String Quien){
		            System.out.println("Nombre del producto:"+Quien);
		            System.out.println( "Ingresar datos del producto:" );
		            System.out.println("Codigo: "+codigo);
		            System.out.println("Tamaño: "+tamaño);
		            System.out.println("Año: "+precio);
		            System.out.println("------------------------------------");
		        }  
		
		public static void main(String[] args) {
			System.out.println("Catalogo Version 1");
			
			Catalogo Producto1 = new Catalogo (00112233, 1, 20);
			Producto1.desplegarDatos(" Pera");
			Catalogo Producto2 = new Catalogo (44556612, 12, 50);
			Producto2.desplegarDatos(" Manzanas Rojas");
			Catalogo Producto3 = new Catalogo (00112233, 3, 30);
			Producto3.desplegarDatos(" Fresa");
			Catalogo Producto4 = new Catalogo (44556612, 36, 50);
			Producto4.desplegarDatos(" Platano");
		}
}
