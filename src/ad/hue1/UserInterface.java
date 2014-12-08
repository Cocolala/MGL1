package ad.hue1;

public class UserInterface {

	public static void main(String[] args) {
		Circuit circuit_A = new TreeCircuit("(10 - (30 | 20))");
		// Schaltkreise aus einem ohmschem widerstand:
		TreeCircuit c_1_0 = new TreeCircuit(30.0);
		TreeCircuit c_1_1 = new TreeCircuit(20.0);
		TreeCircuit c_0 = new TreeCircuit(10.0);
		// Schaltkreise aus anderen Schaltkreisen:
		TreeCircuit c_1 = new TreeCircuit(CircuitType.PARALLEL_CIRCUIT, c_1_0,c_1_1);
		Circuit c_B = new TreeCircuit(CircuitType.SERIAL_CIRCUIT, c_0, c_1);
	}

}
