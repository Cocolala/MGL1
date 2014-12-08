package ad.hue1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircuitTest {

	@Test
	public void test() {
Circuit circuit = new TreeCircuit("(10 - (30 | 20))");
		
		String expected = 
		    "([R=22.0, U=220.0, I=10.0]: "
				+ "[R=10.0, U=100.0, I=10.0]"
				+ " - ([R=12.0, U=120.0, I=10.0]:"
				+      " [R=30.0, U=120.0, I=4.0]"
				+      " | [R=20.0, U=120.0, I=6.0]"
				+    ")"
		 + ")";
		
		circuit.setVoltage(220);
		
		assertEquals(expected, circuit.toString());
		
		assertEquals(22.0,  circuit.getR(), 0.01);
		assertEquals(220.0, circuit.getU(), 0.01);
		assertEquals(10.0,  circuit.getI(), 0.01);
		
		assertEquals(22.0,  circuit.getR("/"), 0.01);
		assertEquals(220.0, circuit.getU("/"), 0.01);
		assertEquals(10.0,  circuit.getI("/"), 0.01);
		
		assertEquals(10.0,  circuit.getR("/0"), 0.01);
		assertEquals(100.0, circuit.getU("/0"), 0.01);
		assertEquals(10.0,  circuit.getI("/0"), 0.01);
		
		assertEquals(12.0,  circuit.getR("/1"), 0.01);
		assertEquals(120.0, circuit.getU("/1"), 0.01);
		assertEquals(10.0,  circuit.getI("/1"), 0.01);
		
		assertEquals(30.0,  circuit.getR("/1/0"), 0.01);
		assertEquals(120.0, circuit.getU("/1/0"), 0.01);
		assertEquals(4.0,   circuit.getI("/1/0"), 0.01);
		
		assertEquals(20.0,  circuit.getR("/1/1"), 0.01);
		assertEquals(120.0, circuit.getU("/1/1"), 0.01);
		assertEquals(6.0,   circuit.getI("/1/1"), 0.01);

		TreeCircuit c_1_0 = new TreeCircuit(30.0);
		TreeCircuit c_1_1 = new TreeCircuit(20.0);
		
		TreeCircuit c_0   = new TreeCircuit(10.0);
		TreeCircuit c_1   = new TreeCircuit(CircuitType.PARALLEL_CIRCUIT, c_1_0, c_1_1);
		
		Circuit c     	  = new TreeCircuit(CircuitType.SERIAL_CIRCUIT, c_0, c_1);

		c.setVoltage(220);
		
		assertEquals(c.toString(), circuit.toString());
		
		
		assertEquals(22.0,  circuit.getR("/"), 0.01);
		assertEquals(220.0, circuit.getU("/"), 0.01);
		assertEquals(10.0,  circuit.getI("/"), 0.01);
		
		assertEquals(10.0,  circuit.getR("/0"), 0.01);
		assertEquals(100.0, circuit.getU("/0"), 0.01);
		assertEquals(10.0,  circuit.getI("/0"), 0.01);
		
		assertEquals(12.0,  circuit.getR("/1"), 0.01);
		assertEquals(120.0, circuit.getU("/1"), 0.01);
		assertEquals(10.0,  circuit.getI("/1"), 0.01);
		
		assertEquals(30.0,  circuit.getR("/1/0"), 0.01);
		assertEquals(120.0, circuit.getU("/1/0"), 0.01);
		assertEquals(4.0,   circuit.getI("/1/0"), 0.01);
		
		assertEquals(20.0,  circuit.getR("/1/1"), 0.01);
		assertEquals(120.0, circuit.getU("/1/1"), 0.01);
		assertEquals(6.0,   circuit.getI("/1/1"), 0.01);
	}

}
