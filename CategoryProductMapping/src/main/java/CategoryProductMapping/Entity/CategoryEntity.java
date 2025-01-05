package CategoryProductMapping.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="categories")
public class CategoryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<ProductEntity> product;
	

	public CategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoryEntity(Long id, String name, List<ProductEntity> product) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
	}

	@Override
	public String toString() {
		return "CategoryEntity [id=" + id + ", name=" + name + ", product=" + product + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductEntity> getProduct() {
		return product;
	}

	public void setProduct(List<ProductEntity> product) {
		this.product = product;
	}

	
}
