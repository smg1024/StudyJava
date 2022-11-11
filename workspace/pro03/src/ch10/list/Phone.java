package ch10.list;

// this, 생성자, object, java.lang
// source -> generate toString()

	public class Phone {
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + ", tel=" + tel + "]";
	}
	
	
	}
