import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{
	private int currentIndex;
	private int[] data;

	public ArraySequence(int[] other){
		data = other;
		currentIndex = 0;
	}

	public void reset(){
		currentIndex = 0;
	}
	
	public int length(){
		return data.length;
	}

	public int next(){
		if (!hasNext()){
			throw new NoSuchElementException("There is no next element.");		
		}
		currentIndex++;
		return data[currentIndex-1];
	}

	public boolean hasNext(){
		return currentIndex < data.length;
	}
}
