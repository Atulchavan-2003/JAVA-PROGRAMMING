
class Plant{
	int plant_Id;
	String name;
	String species;
	
	
	Plant() { //default constructor
		this.plant_Id =0;
		this.name ="not given";
		this.species ="not given";
	}
	Plant(int plant_Id, String name, String species) {// parameterised constructor
		this.plant_Id = plant_Id;
		this.name = name;
		this.species = species;
	}
	int getPlant_Id() {
		return plant_Id;
	}
	void setPlant_Id(int plant_Id) {
		this.plant_Id = plant_Id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getSpecies() {
		return species;
	}
	void setSpecies(String species) {
		this.species = species;
	}
	
	void display()
	{
		System.out.println("plant id is "+this.plant_Id);
		System.out.println("plant name is "+this.name);
		System.out.println("plant species is"+this.species);
	}
}//class plant end here
class Flowering_plant extends Plant 
	{
	String color;
	String season;
	
	
	Flowering_plant() {
		this.color = "not given";
		this.season = "not given";
	}


	Flowering_plant(int plant_Id, String name, String species,String color, String season) {
		super(plant_Id, name, species);
		this.color = color;
		this.season = season;
	}


	String getColor() {
		return color;
	}


	void setColor(String color) {
		this.color = color;
	}


	String getSeason() {
		return season;
	}


	void setSeason(String season) {
		this.season = season;
	}
	
	void display()
	{
		super.display();
		System.out.println("colour of flower "+this.color);
		System.out.println("season for plant is "+this.season);
	}
}//class  Flowering_plant end here

class Medicinal_Plant{
	
}



class TestPlan {

		public static void main(String [] a) {
			 Plant  p1=new Plant(01,"hebiscus","indian");
			 p1.display();
			p1= new Flowering_plant(02,"rose","indian","red","all season");
			
			
			System.out.println();
			p1.display();
		}
}




















