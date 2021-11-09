
public class Tree {

	double heightFt;
	double trunkDiameterInches;
	TreeType treeType;
	
	//Constructor tree(It has same name as Class, and does not have return value )
	Tree(double heightFt, double trunkDiameterInches, TreeType treeType){
		
		this.heightFt=heightFt;
		this.trunkDiameterInches=trunkDiameterInches;
		this.treeType=treeType;
	}
	
	
	
// Behaviour of Tree.
	
	public double grow() {
		this.heightFt= this.heightFt + 10;
		
		return this.heightFt;

		 
	}
	
	public double grow1() {
		
		this.trunkDiameterInches=this.trunkDiameterInches + 1;
		return trunkDiameterInches;

		 
	}
	
	void display() {
		
		System.out.println("The mango tree has " + this.heightFt  + " It has " + this.trunkDiameterInches + " and I's a " +this.treeType);
	}
	
	
	
	void announceTallTree() {
		if(this.heightFt < 100) {
			
			System.out.println(this.treeType + " tree is a short tree.");
			
		}
		else {
			System.out.println(this.treeType + " tree is tall tree." );
		}
		
	}
}
