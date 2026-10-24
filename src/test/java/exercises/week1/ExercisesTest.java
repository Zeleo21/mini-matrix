package exercises.week1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesTest {

        private List<String> prepareDuplicatesArray(int size, boolean hasDuplicates) {
        List<String> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(String.valueOf(i));
            if (hasDuplicates && i % 2 == 0){
               array.add(String.valueOf(i));
            }
        }
        return array;
    }

    @Test
    @DisplayName("should return true if there is indeed a duplicate")
    void hasDuplicates() {
        List<String> idsWithDuplicates = this.prepareDuplicatesArray(5, true);

        boolean res = Exercises.hasDuplicates(idsWithDuplicates);
        assertTrue(res);
    }

    @Test
    @DisplayName("should return false if there are no duplicates")
    void noDuplicates() {
        List<String> idsWithoutDuplicates = this.prepareDuplicatesArray(5, false);

        boolean res = Exercises.hasDuplicates(idsWithoutDuplicates);
        assertFalse(res);
    }
}