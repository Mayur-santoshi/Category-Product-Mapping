package CategoryProductMapping.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	@JsonBackReference
	private CategoryEntity category;
	
	
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductEntity(Long id, String name, CategoryEntity category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}

	@Override
	public String toString() {
		return "ProductEntity [id=" + id + ", name=" + name + ", category=" + category + "]";
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

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	
	
	
}
