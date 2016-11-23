

public class Tree
{
	private String FirstName;
	private String LastName;
	private int Age;
	private Tree LeftTree;
	private Tree RightTree;
	
	public Tree(String FirstName, String LastName, int Age)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
		this.LeftTree = null;
		this.RightTree = null;
	}
	
	public void addTree(String FirstName, String LastName, int Age)
	{
		if (Age <= this.Age)
		{
			if (this.LeftTree == null)
			{
				this.LeftTree = new Tree(FirstName, LastName, Age);
			}
			else
			{
				this.LeftTree.addTree(FirstName, LastName, Age);
			}
		}
		else
		{
			if (this.RightTree == null)
			{
				this.RightTree = new Tree(FirstName, LastName, Age);
			}
			else
			{
				this.RightTree.addTree(FirstName, LastName, Age);
			}
		}
	}
	
	public void display()
	{
		System.out.println(this.FirstName + " " + this.LastName + ": " + this.Age);
	}
	
	public void displayInOrder()
	{
		if (this.LeftTree != null)
		{
			this.LeftTree.displayInOrder();
		}
		this.display();
		if (this.RightTree != null)
		{
			this.RightTree.displayInOrder();
		}
	}
	
	public Tree visitLeft()
	{
		if (this.LeftTree != null)
		{
			return this.LeftTree;
		}
		else
		{
			return null;
		}
	}
	
	public Tree visitRight()
	{
		if (this.RightTree != null)
		{
			return this.RightTree;
		}
		else
		{
			return null;
		}
	}
}

