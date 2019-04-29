
public class NameAgeModel {
	String name;
	String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "NameAgeModel [name=" + name + ", age=" + age + "]";
	}
	public NameAgeModel(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public NameAgeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
