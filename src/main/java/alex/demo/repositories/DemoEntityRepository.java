package alex.demo.repositories;

import alex.demo.entities.DemoEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface DemoEntityRepository extends CrudRepository<DemoEntity, Long> {
}
