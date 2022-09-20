

//Generic class with Type Parameter
public class Container <T> {
	
	private T data;
	
	//Constructor
	public Container( T data) {
		this.data = data;
		
	}
	
	
	//Getters and setters
	public void setData(T data) {
		    this.data = data;
	 }

	public T getData() {
		    return this.data;
	 }
	
	

}
