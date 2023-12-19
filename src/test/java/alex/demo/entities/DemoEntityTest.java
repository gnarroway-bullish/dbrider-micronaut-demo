package alex.demo.entities;

import alex.demo.repositories.DemoEntityRepository;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.api.DBRider;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest(transactional = false)
public class DemoEntityTest {

    @Inject
    DemoEntityRepository demoEntityRepository;

    @DBRider
    @DataSet(value = "dataset/seed.json")
    @Test
    void can_load_entity() {
        Long count = demoEntityRepository.count();
        Assertions.assertEquals(1, count);
    }

    @Test
    void can_assert_saved() {
        DemoEntity entity = DemoEntity.builder()
                .name("test")
                .build();
        demoEntityRepository.save(entity);
        Assertions.assertEquals(1, demoEntityRepository.count());
    }

}
