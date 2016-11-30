package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Category;

/**
 * Created by Danny on 29.11.2016 г..
 */
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
