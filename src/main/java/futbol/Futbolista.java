package futbol;

public abstract class Futbolista implements Comparable<Object>{
		private String nombre;
		private int edad;
		private final String posicion;
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getPosicion() {
			return posicion;
		}

		public Futbolista(String nom, int ed, final String pos){
			posicion = pos;
			edad=ed;
			nombre=nom;
		}
		public Futbolista(){
			this("Maradona",30,"delantero");
		}
		public String toString() {
			return  "El futbolista "+this.nombre+" tiene "+this.edad+", y juega de " + this.posicion;
		}
		public boolean equals(Futbolista f) {
				return this==f;
		}
		
		abstract public boolean jugarConLasManos();
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return  this.getEdad() - ((Futbolista) o).getEdad();
		}

}
