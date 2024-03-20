package org.conteiner;


/**
 * The type App is Console
 */
public class App
{

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main( String[] args )
    {
        IntArray array = new IntArray();
        for(int i = 0; i < 50; ++i)
            array.add(i);
        System.out.println(array.getLength());
        array.delete(0);
        for(int i = 0; i < array.getLength(); ++i)
            System.out.println(array.intAt(i));
    }
}