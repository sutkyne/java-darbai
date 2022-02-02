package lt.vtmc.exercises;

import org.junit.Test;

import java.util.List;

import static lt.vtmc.exercises.Joining.namesToString;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class JoiningSpec {

    @Test
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, viktor, eva);
        assertThat(namesToString(collection))
                .isEqualTo("Names: Sara, Viktor, Eva.");
    }

}
