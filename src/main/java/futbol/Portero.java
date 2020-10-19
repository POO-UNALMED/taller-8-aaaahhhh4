package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;

	public Portero(String nom, int ed, short gol,byte dor) {
		super(nom, ed, "Portero");
		golesRecibidos=gol;dorsal=dor;
		// TODO Auto-generated constructor stub
	}
	public short getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	public String toString() {
		return "El futbolista "+ this.getNombre() +" tiene "+ this.getEdad() +", y juega de posicion"+ this.getPosicion()
				+ " con el dorsal "+ dorsal+ ". Le han marcado "+ golesRecibidos;
	}
	public int compareTo(Portero f) {
		return this.golesRecibidos - f.golesRecibidos;
	}
	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 	this.golesRecibidos - ((Portero)o).golesRecibidos;
	}

}
