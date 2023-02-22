import org.junit.Assert;
import org.junit.Test;


import static org.example.PhoneBook.add;
import static org.example.PhoneBook.findByNumber;

public class PhoneBookTest {
    @Test
    public void addTestOne() {
        int expected = add("Катя", "+7-944-333-22-11");
        expected++;
        Assert.assertEquals(expected, add("Федя", "+7-955-333-22-11"));
    }
    @Test
    public void addTestTwo(){
        int expected = add("Катя", "+7-944-333-22-11");
        add("Федя", "+7-955-333-22-11");
        add("Катя", "+7-977-333-22-11");
        expected++;
        Assert.assertEquals(expected, add("Федя", "+7-955-333-22-11"));

    }

    @Test
    public void phoneNumberTestOne(){
        add("Федя", "+7-955-333-22-11");
        add("Катя", "+7-977-333-22-11");
        String expected = "Катя";
        Assert.assertEquals(expected, findByNumber("+7-977-333-22-11"));
    }
    @Test
    public void phoneNumberTestTwo(){
        add("Федя", "+7-955-333-22-11");
        add("Катя", "+7-977-333-22-11");
        add("Ира", "+7-977-333-22-11");

        String expected = "Ира";
        Assert.assertEquals(expected, findByNumber("+7-977-333-22-11"));
    }

}
