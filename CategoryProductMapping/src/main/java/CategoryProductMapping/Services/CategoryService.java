package CategoryProductMapping.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import CategoryProductMapping.Entity.CategoryEntity;
import CategoryProductMapping.Repository.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public Page<CategoryEntity> getAllCategories(int page, int i) {
		// TODO Auto-generated method stub
        return categoryRepository.findAll(PageRequest.of(page, i));
	}

	public Optional<CategoryEntity> getCategoryById(Long id) {
		// TODO Auto-generated method stub
        return categoryRepository.findById(id);
	}

	public CategoryEntity createCategory(CategoryEntity category) {
		// TODO Auto-generated method stub
        return categoryRepository.save(category);
	}

	public CategoryEntity updateCategory(Long id, CategoryEntity categoryDetails) {
		// TODO Auto-generated method stub
        CategoryEntity category = categoryRepository.findById(id).orElseThrow();
        category.setName(categoryDetails.getName());
        return categoryRepository.save(category);
	}

	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
        categoryRepository.deleteById(id);
	}

}
