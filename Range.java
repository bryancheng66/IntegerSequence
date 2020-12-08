import java.util.NoSuchElementException;

public class Range implements IntegerSequence{
	private int start,end,current;

	public Range(int start, int end){
		this.start = start;
		this.end = end;
		this.current = start;
	}

	public void reset(){
		current = start;
	}

	public int length(){
		return end - start + 1;
	}

	public boolean hasNext(){
		return current >= start && current <= end;
	}

	public int next(){
		if (!hasNext()){
			throw new NoSuchElementException("There is no element after " + current + ".");
		}
		int prevCurrent = current;
		current++;
		return prevCurrent;
	}
}
