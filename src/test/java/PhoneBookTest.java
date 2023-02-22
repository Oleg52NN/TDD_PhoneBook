import org.junit.Assert;
import org.junit.Test;

import static org.example.PhoneBook.*;

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
    public void findByNumberTestOne(){
        add("Федя", "+7-955-333-22-11");
        add("Катя", "+7-977-333-22-11");
        String expected = "Катя";
        Assert.assertEquals(expected, findByNumber("+7-977-333-22-11"));
    }
    @Test
    public void findByNumberTestTwo(){
        add("Федя", "+7-955-333-22-11");
        add("Катя", "+7-977-333-22-11");
        add("Ира", "+7-977-333-22-11");

        String expected = "Ира";
        Assert.assertEquals(expected, findByNumber("+7-977-333-22-11"));
    }
    @Test
    public void findByNameTestOne(){
        add("Ираида", "+7-955-333-22-11");
        add("Ира", "+7-922-333-22-11");
        add("Илона", "+7-933-333-22-11");
        add("Изольда", "+7-988-333-22-11");

        String expected = "+7-988-333-22-11";
        Assert.assertEquals(expected, findByName("Изольда"));
    }


}
