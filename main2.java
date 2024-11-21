import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		int i = 0;
		SeperateChainingHashSymbolTable<MyString, Integer> hst = new SeperateChainingHashSymbolTable();
		try (Scanner sc = new Scanner(new File("lab6-2in.txt"))) {
			String line = sc.nextLine();
			String[] letters = line.split(" ");
			for (String letter : letters) {
				MyString myLetter = new MyString(letter);
				hst.put(myLetter, i);
				i++;
			}
			
			hst.keys();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
