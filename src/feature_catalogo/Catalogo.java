package feature_catalogo;

	/**
	 * @author Alejandra Ahumada Castellanos - User B
	 *
	 */
	

	public class Catalogo extends javax.swing.JFrame{
		
		//ATIBUTOS
			private int codigo;
			private int tama�o;
			private int precio;
		        
		        //OVERLOADING DE CONSTRUCTORES
		        public Catalogo (int codigo, int tama�o, int precio){
		        this.codigo = codigo;
		        this.tama�o = tama�o;
		        this.precio = precio;
		        }
		           
			//GETTER Y SETTER
	

		    public int getCodigo() {
		        return codigo;
		    }
	

		    public void setCodigo(int codigo) {
		        this.codigo = codigo;
		    }
		    
		    public int getTama�o() {
		        return tama�o;
		    }
		    
		    public void setTama�o(int tama�o) {
		        this.tama�o = tama�o;
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
		            System.out.println("Tama�o: "+tama�o);
		            System.out.println("A�o: "+precio);
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
