
public class Records
{
	Tree rootPR;
	
	public Records()
	{
		this.rootPR = null;
	}
	
	public void addPRecord(String FirstName, String LastName, int Age)
	{
		if (this.rootPR == null)
		{
			this.rootPR = new Tree(FirstName, LastName, Age);
		}
		else
		{
			this.rootPR.addTree(FirstName, LastName, Age);
		}
	}
	
	public void displayInOrder()
	{
		this.rootPR.displayInOrder();
	}
	
	public Tree getLowerLeftPatient()
	{
		Tree currTree = this.rootPR;
		while (currTree.visitLeft() != null)
		{
			currTree = currTree.visitLeft();
		}
		return currTree;
	}
	
	public Tree getLowerRightPatient()
	{
		Tree currTree = this.rootPR;
		while (currTree.visitRight() != null)
		{
			currTree = currTree.visitRight();
		}
		return currTree;
	}
	
	public Tree getRoot()
	{
		return this.rootPR;
	}
}
