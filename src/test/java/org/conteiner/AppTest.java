package org.conteiner;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void addTest()
    {
        IntArray test = new IntArray();
        test.add(1);
        Assert.assertEquals(1, test.intAt(0));
    }

    @Test
    public void addMoreTest()
    {
        IntArray test = new IntArray();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        for(int i = 0; i < 15; ++i)
        {
            test.add(i);
            expected.add(i);
        }
        for(int i = 0; i < 15; ++i)
            actual.add(test.intAt(i));
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void deleteTest()
    {
        IntArray test = new IntArray();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();

        for(int i = 0; i < 7; ++i)
        {
            test.add(i);
            expected.add(i);
        }
        expected.remove(6);
        test.delete(6);

        for(int i = 0; i < test.getLength(); ++i)
            actual.add(test.intAt(i));
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void intAtTest(){
        IntArray test = new IntArray();
        for(int i = 0; i < 15; ++i)
            test.add(i);
        Assert.assertEquals(14, test.intAt(test.getLength() - 1));
    }
}
