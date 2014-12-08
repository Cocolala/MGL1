package ad.hue1;

public abstract class ComplexCircuit {
	
	protected TreeCircuit right;
	protected TreeCircuit left;
	
	public ComplexCircuit(TreeCircuit left, TreeCircuit right){
		this.left = left;
		this.right = right;
	}

}