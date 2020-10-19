package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		golesMarcados=289;dorsal=7;
		// TODO Auto-generated constructor stub
	}

	public Jugador(String nom, int ed, String pos,short goles,byte dor) {
		super(nom, ed, pos);
		golesMarcados=goles; dorsal=dor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}

	public String toString() {
		return "El futbolista "+ this.getNombre() +" tiene "+ this.getEdad()+ ", y juega de "+ this.getPosicion()
				+ " con el dorsal "+ this.dorsal + ".Ha marcado " + this.golesMarcados;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return  this.getEdad() - ((Jugador) o).getEdad();
	}

}
