package alex.demo.entities;

import alex.demo.repositories.DemoEntityRepository;
import com.github.database.rider.core.api.dataset.DataSet;
import com.github.database.rider.junit5.api.DBRider;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@DBRider
@MicronautTest
public class DemoEntityTest {

    @Inject
    DemoEntityRepository demoEntityRepository;

    @DataSet(value = "dataset/seed.json")
    @Test
    void can_load_entity() {
        Long count = demoEntityRepository.count();
        Assertions.assertEquals(1, count);
    }

}
