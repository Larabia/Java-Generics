
public class JavaGenerics {
	
	public static void main(String[] args) {
		
		String myWord = "Hello";
	    Book myBook = new Book("My Book");
	    
	    String bookTitle = "Summertime sadness";
	    
	    //using RetriveAndReplace @Override method to replace data
	    myBook.replace(bookTitle);

	    
	    // Create `Container` references and print statement below...
	    Container<String> wordContainer = new Container<>(myWord);
	    Container<Book> bookContainer = new Container<>(myBook);

	    System.out.println("Word Container Data: "+ wordContainer.getData());
	    System.out.println("Book Container Data: "+ bookContainer.getData());  
	    
	    //Raw types 
	    // Using the generic class Box, we’ve created a raw type Box and passed "My String" as an argument.
	    Container raw1 = new Container<>("My String");  // raw type box
        
	    //We called getData() again and typecast the result in String s2. This has no error because we are explicitly down casting to String.
        String s1 = (String) raw1.getData();  // no incompatible type error
        System.out.println("s1 is: "+ s1);

        //We call getData() and store the result in String s1. 
        //We get an Incompatible type error as getData() returns an Object type and we are trying to implicitly downcast to a String.
        // String s2 = raw1.getData();  // incompatible type error

       Container<String> stringContainer = new Container<>("Not raw");
       Container raw2 = stringContainer; //this is a raw container because raw2 does not have a Type argument
    
       raw2.setData("new string");// Unchecked warning produced
	    
	   
       
	   // Create `RetriveAndReplace` references and print statement below...
	   int myNumber = 24;
	   String bookName = "Hello Book!";
	    
	   RetriveAndReplace<String> bookRetriever = new Book(bookName);

	   System.out.println("Book retrieved data: " + bookRetriever.retrieveData());
	  }	

}
