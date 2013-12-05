import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardReader {
	BufferedReader reader = null;
	
	public FlashCardReader(){
			try {
				reader = new BufferedReader(new FileReader("Questions.txt"));
			} catch (FileNotFoundException e) {
				System.err.println("Error File not found!");
			}
		}
	
	public String getLine(){
		try {
			return reader.readLine();
		}
		catch (IOException e) {
			return null;
		}
	}
	
	public boolean isReady(){
		boolean ready = false;
		try {
			ready = reader.ready();
		}
		catch (IOException e) {
			System.err.println("Error not ready.");
		}
		return ready;
	}
	
	public ArrayList<FlashCard> getFlashCards(){
		ArrayList<FlashCard> array = new ArrayList<FlashCard>();
		
		while(this.isReady() ==  true){
			String[] full = this.getLine().split(":");
			String question = full[0];
			String answer = full[1];
			FlashCard fc = new FlashCard(question,answer);
			array.add(fc);
		}
		return array;
	}
	
}