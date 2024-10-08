package com.iutblagnac.r303trace;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test the return with empty parameter
     */
    public void testHelloEmptyParameter()
    {
        assertEquals("Hello World!", App.hello());
    }

    /**
     * Test the return with a parameter
     */
    public void testHelloParameter()
    {
        assertEquals("Hello JMB!", App.hello("Hello JMB!"));
    }

    /**
     * Test le return sans parametre
     */
    public void testBonjourSansParametre()
    {
        assertEquals("Bonjour monde", App.bonjour());
    }

    /**
     * Test the return with a parameter
     */
    public void testBonjourParametre()
    {
        assertEquals("Bonjour JMB!", App.hello("Bonjour JMB!"));
    }
}
