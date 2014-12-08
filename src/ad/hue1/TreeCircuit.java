package ad.hue1;

/**
 * Instanzen dieser Klassen implementieren den Typ Circuit mit Hilfe einer
 * baumartigen Datenstruktur.
 *
 * @author Julia Ackermann(), Daniela Raddatz() & Sarah Hublitz(5039746)
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
	 * Erzeugt einen Schaltkreis aus Unterschaltkreisen.
	 * 
	 * @param type
	 *            der Typ des Schaltkreies (Parallel oder in Serie)
	 * @param subCircuits
	 */
	public TreeCircuit(CircuitType type, TreeCircuit... subCircuits) {

	}

	/**
	 * Erzeugt einen Schaltkreis aus einer textuellen Beschreibung.
	 * <ul>
	 * <li>double-Wert: Schaltkreis aus einem Widerstand
	 * <li>"(" Schaltkreis-1 "-" Schaltkreis-2 - ... ")" serielle Verschaltung
	 * von Schaltkreis-1 ... zu einem neuen Schaltkreis
	 * <li>"(" Schaltkreis-1 "|" Schaltkreis-2 | ... ")" parallele Verschaltung
	 * von Schaltkreis-1 ... zu einem neuen Schaltkreis
	 * </ul>
	 * 
	 * @param str
	 *            der String der den zu erstellenden Schaltkreis repraesentiert
	 */
	public TreeCircuit(String str) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hausuebung_1.Circuit#setVoltage(double)
	 */
	@Override
	public void setVoltage(double U) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hausuebung_1.Circuit#getType(java.lang.String)
	 */
	@Override
	public CircuitType getType(String pathExpr) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hausuebung_1.Circuit#getR(java.lang.String)
	 */
	@Override
	public double getR(String pathExpr) {
		return 0;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hausuebung_1.Circuit#getU(java.lang.String)
	 */
	@Override
	public double getU(String pathExpr) {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hausuebung_1.Circuit#getType()
	 */
	@Override
	public CircuitType getType() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hausuebung_1.Circuit#getI(java.lang.String)
	 */
	@Override
	public double getI(String pathExpr) {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hausuebung_1.Circuit#getR()
	 */
	@Override
	public double getR() {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hausuebung_1.Circuit#getU()
	 */
	@Override
	public double getU() {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see hausuebung_1.Circuit#getI()
	 */
	@Override
	public double getI() {
		return 0;
	}
}