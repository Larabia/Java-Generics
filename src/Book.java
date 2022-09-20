
public class Book implements RetriveAndReplace {
	
	private String name;
	
	
	//Constructor
	public Book(String name) {
	  this.name = name;
	}
	
    public String toString() {
	  return "Book(name = \""
	  + this.name 
	  + "\")";
	}

	@Override
	public Object retrieveData() {
		return this.name;
	}

	@Override
	public void replace(Object data) {
		this.name = (String) data;
		
	}

}
