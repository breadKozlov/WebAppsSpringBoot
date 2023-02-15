package tacos;

import java.io.Serializable;
import java.util.Objects;

public class Ingredient implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Type type;
	
	public enum Type {
		WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
	}
	
	public Ingredient() {};
	
	public Ingredient(String id, String name, Type type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingredient other = (Ingredient) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && type == other.type;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
	
}
