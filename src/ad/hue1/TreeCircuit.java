package ad.hue1;

/**
 * Instanzen dieser Klassen implementieren den Typ Circuit mit Hilfe einer
 * baumartigen Datenstruktur.
 *
 * @author <hier Ihr Name und Ihre Matrikelnummer!>
 *
 */
public final class TreeCircuit implements Circuit {

	private CircuitA root;

	/**
	 * Erzeugt einen Schaltkreis der nur aus einem Widerstand besteht.
	 * 
	 * @param resistance
	 *            Widerstandswert in Ohm
	 */
	public TreeCircuit(double resistance) {

	}

	/**
	 * Erzeugt einen Schaltkreis aus Unterschaltkreisen. der Typ des
	 * Schaltkreies (Parallel oder in Serie)
	 * 
	 * @param type
	 * @param subCircuits
	 *            die Unterschaltkreise
	 *
	 */
	public TreeCircuit(CircuitType parallelCircuit, TreeCircuit c_1_0,
			TreeCircuit c_1_1) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Erzeugt einen Schaltkreis aus einer textuellen Beschreibung.
	 * <ul>
	 * <li>double-Wert: Schaltkreis aus einem Widerstand
	 * <li>"(" Schaltkreis-1 "-" Schaltkreis-2 "-" ... ) serielle Verschaltung
	 * von Schaltkreis-1 ... zu einem neuen Schaltkreis
	 *
	 * <li>"(" Schaltkreis-1 "|" Schaltkreis-2 "|" ... ) parallele Verschaltung
	 * von Schaltkreis-1 ... zu einem neuen Schaltkreis
	 *
	 * </ul>
	 * 
	 * @param str
	 *            der String der den zu erstellenden Schaltkreis repraesentiert
	 */
	public TreeCircuit(String str) {

	}

	

	@Override
	public void setVoltage(double U) {
		// TODO Auto-generated method stub

	}

	@Override
	public CircuitType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getR() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getU() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getI() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CircuitType getType(String pathExpr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getR(String pathExpr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getU(String pathExpr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getI(String pathExpr) {
		// TODO Auto-generated method stub
		return 0;
	}
}