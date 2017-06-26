package studentSystem;

public class GeneratorId {
	static int currentId = 1000;
	
	public static int nextId(){
		return currentId++;
	}
}
