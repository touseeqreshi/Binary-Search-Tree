
public class data
{
	private String[] FNames;
	private String[] LNames;	
	
	public data()
	{
		this.FNames = new String[] {"Touseeq","Rasool","Reshi","abdul","Noah","Mason","Litman","Robin","Jacob","Logan",
				"bilal","Sumera","Yasmeen","Jaan","Michael","Benjamin","Alexander","James","Jayce","Caleb","Connor","William",
				"Carter","Ryan","Oliver","Matthew","Daniel","Ghulam","Henry","Owen","Grayson","Dylan","Landon","Isaac","Nicholas",
				"Wyatt","Nathan","Andrew","Humera","Dominic","Joshua","Eli","Sebastian","Hunter","Brayden","David","Samuel","Evan",
				"Gavin","Rwoof","Sophia","Emma","Olivia","Ava","Isabella","Mia","Zoe","Lily","Emily","Madelyn","Madison","Chloe",
				"Charlotte","Aubrey","Avery","Nousheen","Kaylee","Amreen","Harper","Ella","Amelia","Arianna","Riley","Aria","Hailey",
				"Hannah","Aaliyah","Evelyn","Addison","Mackenzie","Adalyn","Ellie","Brooklyn","Nora","Scarlett","Grace","Anna","Isabelle",
				"Natalie","Kaitlyn","Lillian","Sarah","Audrey","Elizabeth","Leah","Annabelle","Kylie","Mila","Claire","Victoria"};
		this.LNames = new String[] {"RESHI","AHMAD","BABA","KHAN","BHAT","DAR","MILLER","WILSON","MOORE",
				"TAYLOR","ANDERSON","KAKAR","JACKSON","WHITE","GUPTA","MARTIN","THOMPSON","MAHAJAN","MARTINEZ","ROBINSON",
				"CLARK","RODRIGUEZ","WALL","LEE","WALKER","RAINA","ALLEN","YOUNG","HERNANDEZ","KING","WRIGHT","LOPEZ",
				"HILL","SCOTT","GREEN","ADAMS","BAKER","GONZALEZ","NELSON","SHIKH","MITCHELL","PEREZ","ROBERTS","TURNER",
				"PHILLIPS","CAMPBELL","JAIN","EVANS","PARRAY","COLLINS","LOAN","SANCHEZ","MORRIS","ROGERS","REED",
				"COOK","MORGAN","BELL","MURPHY","BAILEY","RIVERA","COOPER","RICHARDSON","COX","HOWARD","WARD","TORRES",
				"PETERSON","GRAY","RAMIREZ","KOHL","WATSON","BROOKS","KELLY","KAKA","PRICE","BENNETT","WOOD","BARNES",
				"ROSS","ABDULLA","COLEMAN","JENKINS","PATAIL","POWELL","SING","PATTERSON","HUGHES","FLORES","WASHINGTON",
				"BUTLER","SIMMONS","FOSTER","GONZALES","BRYANT","CHOUDHARY","RUSSELL","GRIFFIN","DIAZ","HAYES"};
	}
	
	public String getOneFirstName() 
	{
		return this.FNames[(int)(Math.random() * 100)];
	}
	
	public String getOneLastName()
	{
		return this.LNames[(int)(Math.random() * 100)];
	}
}
