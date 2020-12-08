package AnimalSound;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Animal {
	
	int id;
	int age;
	String color;
	
  
 	public Animal(int id ,int age,String color) {
 		
		this.id=id;
		this.age=age;
		this.color=color;
		
	}
 	
 	public Animal() {
 		    
 	 }
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public static void animalSound(File Sound) 
	 
    {
	 
	   try {
		   
		   
		   Clip clip = AudioSystem.getClip();
		   clip.open(AudioSystem.getAudioInputStream(Sound));
		   clip.start();
		   System.out.println(Sound + " sound is start ! ");
		   System.out.println("s : " + clip.isActive());
			while (clip.isActive()) {
				 System.out.println("Animal Sound "+Sound);
			}
			clip.close();
			System.out.println(Sound + " sound is end ! ");
		   
		   
	   }
	   
	   catch(Exception e){
		   
	   }
	

  }
}



