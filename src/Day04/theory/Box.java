package Day04.theory;

public class Box<T> {
	private T value;
	public Box(T value) {
		this.value = value;
	}
	public T getValue(){
		return this.value;
	}
}
