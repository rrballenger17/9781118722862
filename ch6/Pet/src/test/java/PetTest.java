
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetTest {

    @Test
    public void legalBuild() {
        final Pet.Builder builder = new Pet.Builder();
        final Pet pet = builder
                .withAnimal("Cat")
                .withPetName("Squidge")
                .withOwnerName("Simon Smith")
                .withAddress("123 High Street")
                .withTelephone("07777777770")
                .withEmailAddress("simon@email.com")
                .build();
        // test pass - no exception thrown

        assertEquals("Squidge", pet.getPetName());

    }

}
