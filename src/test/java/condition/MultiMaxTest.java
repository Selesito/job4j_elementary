package test.java.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(7, 4, 2);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenThirdMax9() {
        int result = MultiMax.max(8, 4, 9);
        assertThat(result, is(9));
    }
}