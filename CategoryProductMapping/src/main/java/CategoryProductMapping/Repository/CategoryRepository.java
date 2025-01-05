package CategoryProductMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CategoryProductMapping.Entity.CategoryEntity;



@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{

}
