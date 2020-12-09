package AnimalSound;
import java.io.File;

public class Main {
	

		 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Chien chien = new Chien();
		File barks = new File("dog.wav");
		chien.animalSound(barks);
		
  }
}