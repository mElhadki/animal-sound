package AnimalSound;
import java.io.File;

public class Main {
	

		 
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Chien chien = new Chien();
		File clap = new File("barks.wav");
		chien.animalSound(clap);
		
  }
}