package CategoryProductMapping.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import CategoryProductMapping.Entity.ProductEntity;
import CategoryProductMapping.Repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Page<ProductEntity> getAllProducts(int page, int i) {
		// TODO Auto-generated method stub
        return productRepository.findAll(PageRequest.of(page, i));	
    }

	public Optional<ProductEntity> getProductById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}

	public ProductEntity createProduct(ProductEntity product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	public ProductEntity updateProduct(Long id, ProductEntity productDetails) {
		// TODO Auto-generated method stub
		ProductEntity product = productRepository.findById(id).orElseThrow();
        product.setName(productDetails.getName());
        product.setCategory(productDetails.getCategory());
        return productRepository.save(product);
	}

	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
        productRepository.deleteById(id);
	}
	
}
