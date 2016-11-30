package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Tag;

/**
 * Created by Danny on 30.11.2016 г..
 */
public interface TagRepository extends JpaRepository<Tag,Integer> {
    Tag findByName(String name);
}
