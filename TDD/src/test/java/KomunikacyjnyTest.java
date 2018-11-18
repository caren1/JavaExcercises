import Person.Person;
import org.junit.Assert;
import org.junit.Test;

public class KomunikacyjnyTest {

    @Test
    public void shouldAssignDiscountForKid() {
        //given
        Person person = new Person((byte) 6);

        //when
        person.assignDiscount(person);
        boolean result = person.isDiscount();

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldNotAssignDiscountOver6() {
        Person person = new Person((byte) 7);
        person.assignDiscount(person);
        boolean result = person.isDiscount();
        Assert.assertFalse(result);
    }

    @Test
    public void shouldAssignDiscountForSenior() {
        Person person = new Person((byte) 65);
        person.assignDiscount(person);
        boolean result = person.isDiscount();
        Assert.assertTrue(result);
    }

    @Test
    public void shouldNotAssignDiscountOver65() {
        Person person = new Person((byte) 64);
        person.assignDiscount(person);
        boolean result = person.isDiscount();
        Assert.assertFalse(result);
    }

    @Test
    public void shouldNotAssignWhenEmpty() {
        Person person = new Person();
        person.assignDiscount(person);
        boolean result = person.isDiscount();
        Assert.assertFalse(result);
    }
}

