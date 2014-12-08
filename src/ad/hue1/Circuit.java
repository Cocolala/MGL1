package ad.hue1;

/**
 * Instanzen implementierender Klassen repraesentieren Schaltkreise.
 * Schaltkreise sind einfache ohmsche Widerstaende oder parallel bzw. seriell
 * zusammengeschaltete Schaltkreise.
 * 
 * Ein Unterschaltkreis kann durch einen einfachen Pfad-Ausdruck angesprochen
 * werden:
 * <ul>
 * <li>"/" ist ein Pfadausdruck und bezeichnet die Wurzel,d.h. den gesamten
 * Schalkreis.
 * <li>pfad/i bezeichnet den i-ten Unterschaltkreis des durch pfad angegebenen
 * Schaltkreises. Die Zaehlung beginnt dabei mit 0. Beispielsweise ist mit "/0"
 * der erste Unterschaltkreis des gesamten Schaltkreises gemeint. Mit"/1/0"der
 * erste Unterschaltkreis des zweiten Unterschaltkreises.
 * 
 * <ul>
 * 
 * @author Julia Ackermann, Daniela Raddatz & Sarah Hublitz
 * 
 */
public interface Circuit {
	/**
	 * Schaltkreis-Typen. Ein Schaltkreis ist
	 * <ul>
	 * <li>ein ohmscher Widerstand (RESISTOR),
	 * <li>eine serielle Verschaltung von Schaltkreisen (SERIAL_CIRCUIT), oder
	 * <li>eine parallele Verschaltung von Schaltkreisen (PARALLEL_CIRCUIT)
	 * </ul>
	 */
	 public enum CircuitType{RESISTOR, SERIAL_CIRCUT, PARALLEL_CIRCUIT};

	/**
	 * Textuelle Darstellung des Schaltkreises inclusive aller
	 * Unterschaltkreise.
	 */
	public String toString();

	/**
	 * Schaltkreis unter Spannung setzen.
	 * 
	 * @post Sorgt fuer eine Neuberechnung aller Spannungen und Stroeme.
	 * 
	 * @param U
	 *            Spannung in Volt
	 */
	public void setVoltage(double U);

	/**
	 * Liefert den Typ des Schaltkreises.
	 * 
	 * @return Typ des Schaltkreises
	 */
	CircuitType getType();

	/**
	 * Liefert den Widerstand des Schaltkreises.
	 * 
	 * @return Widerstand in Ohm des Schaltkreises
	 */
	double getR();

	/**
	 * Liefert die Spannung, die am Schaltkreis anliegt.
	 * 
	 * @return Spannung in Volt am Schaltkreis.
	 */
	double getU();

	/**
	 * Liefert den Strom, der durch den Schaltkreis fliesst.
	 * 
	 * @return Strom in Ampere, der durch den Schaltkreis fliesst.
	 */
	double getI();

	/**
	 * Liefert den Typ des durch den Pfad angegebenen Unterschaltkreises.
	 * 
	 * @param pathExpr
	 *            der Pfad zum (Unter-) Schaltkreis
	 * @return Typ des Schaltkreises oder eines Unterschaltkreises.
	 */
	CircuitType getType(String pathExpr);

	/**
	 * Liefert den Widerstand des durch den Pfad angegebenen Unterschaltkreises.
	 * 
	 * @param pathExpr
	 *            der Pfad zum (Unter-) Schaltkreis
	 * @return Widerstand in Ohm des Schaltkreises oder eines
	 *         Unterschaltkreises.
	 * 
	 */
	double getR(String pathExpr);

	/**
	 * Liefert die Spannung, die an dem durch den Pfad angegebenen
	 * Unterschaltkreis anliegt.
	 * 
	 * @param pathExpr
	 *            der Pfad zum (Unter-) Schaltkreis
	 * @return Spannung in Volt am Schaltkreis oder einem Unterschaltkreis.
	 */
	double getU(String pathExpr);

	/**
	 * Liefert den Strom, der durch den durch den Pfad angegebenen
	 * Unterschaltkreis fliesst.
	 * 
	 * @param pathExpr
	 *            der Pfad zum (Unter-) Schaltkreis
	 * @return Strom in Ampere der durch den Schaltkreis oder den
	 *         Unterschaltkreis fliesst.
	 * 
	 */
	double getI(String pathExpr);

}
