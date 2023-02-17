package tacos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Taco implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Size(min=5, message="Name must be at least 5 char long")
	private String name;
	
	@NotNull
	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<Ingredient> ingredients;
	
	public Taco() {}
	
	public Taco(String name, List<Ingredient> ingredients) {
	
		this.name = name;
		this.ingredients = ingredients;
	}
	@Override
	public String toString() {
		return "Taco [name=" + name + ", ingredients=" + ingredients + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ingredients, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Taco other = (Taco) obj;
		return Objects.equals(ingredients, other.ingredients) && Objects.equals(name, other.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
}
