import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class Test {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    MyBigNumber myBigNumber = new MyBigNumber();

    @org.junit.Test
    public void sum1() {
        System.out.println("Testcase 1: ");
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("123", "456");
        assertEquals("579", s);
    }

    @org.junit.Test
    public void sum2() {
        System.out.println("Testcase 2: ");
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("1235", "856");
        assertEquals("2091", s);
    }

    @org.junit.Test
    public void sum3() {
        System.out.println("Testcase 3: ");
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("100", "900");
        assertEquals("1000", s);
    }

    @org.junit.Test
    public void sum4() {
        System.out.println("Testcase 4: ");
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("999", "111");
        assertEquals("1110", s);
    }

    @org.junit.Test
    public void sum5() {
        System.out.println("Testcase 5: ");
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("999", "1111");
        assertEquals("2110", s);
    }

    @org.junit.Test
    public void sum6() {
        System.out.println("Testcase 6: ");
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("1234567890", "4");
        assertEquals("1234567894", s);
    }

    @org.junit.Test
    public void sum7() {
        System.out.println("Testcase 7: ");
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("", "4");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum8() {
        System.out.println("Testcase 8: ");
        MyBigMain test = new MyBigMain();
        MyBigNumber myBigNumber = new MyBigNumber(test);
        String s = myBigNumber.sum("4", "");
        assertEquals("4", s);
    }

    @org.junit.Test
    public void sum9() {
        try {
            System.out.println("Testcase 9: ");
            MyBigMain test = new MyBigMain();
            MyBigNumber myBignumber = new MyBigNumber(test);
            String s = myBigNumber.sum("12abc", "122");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }
     @org.junit.Test
    public void sum10() {
        try {
            System.out.println("Testcase 10: ");
            MyBigMain test = new MyBigMain();
            MyBigNumber myBignumber = new MyBigNumber(test);
            String s = myBigNumber.sum("12", "122abc");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }
    @org.junit.Test
    public void sum11() {
        try {
            System.out.println("Testcase 11: ");
            MyBigMain test = new MyBigMain();
            MyBigNumber myBignumber = new MyBigNumber(test);
            String s = myBigNumber.sum("-12", "122");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }
    @org.junit.Test
    public void sum12() {
        try {
            System.out.println("Testcase 12: ");
            MyBigMain test = new MyBigMain();
            MyBigNumber myBignumber = new MyBigNumber(test);
            String s = myBigNumber.sum("122", "-13");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }
}
