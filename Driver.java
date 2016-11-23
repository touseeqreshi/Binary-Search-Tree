

public class Driver {

	public static void main(String[] args)
	{
		data name = new data();
		Records aRecord = new Records();
		for (int i = 0; i < 100; i++)
		{
			aRecord.addPRecord(name.getOneFirstName(), name.getOneLastName(), 1 + (int)(Math.random() * 85));
		}
		System.out.println("The left most binary tree Patient Record:");
		aRecord.getLowerLeftPatient().display();
		
		System.out.println("The binary tree Root Patient Record:");
		aRecord.getRoot().display();
		
		System.out.println("The Right most binary tree Patient Record:");
		aRecord.getLowerRightPatient().display();
	}

}
