package entities;

public class Comment {
	private String text;

	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/
	// - - - - - - - - C O N S T R U C T O R - - - - - - - - - -    
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	public Comment(String text) {
		this.text = text;
	}

	// *\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/*\/ 
	// - - - - - -  G E T T E R S / S E T T E R S  - - - - - - - - 
	// - - - - - - -  E N C A P S U L A T I O N  - - - - - - - - -  
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}	
}
