package tralipa.urations;

public class Label {

	private String name;
	private String value;
	
	public Label() {
		
	}
	
	public Label(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String toHashableString() {
		return name + value;
	}
	
	
}
