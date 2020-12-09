package AnimalSound;

import java.io.File;

public class Chien extends Sauvage{
	
	String name;
   
	
	public Chien(int id ,int age,String color,String name) {
		super (id , age, color);
		this.name=name;
		
	}
	
	public Chien() {
		
	}
	
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    @Override
	
	public void animalSound(File Sound)
	{
		// TODO Auto-generated method stub
		
		super.animalSound(Sound);
		System.out.println("Dog bark");
	}
		
	 

}
