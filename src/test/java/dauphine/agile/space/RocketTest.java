package dauphine.agile.space;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dauphine.agile.space.Astronaut;
import dauphine.agile.space.Engine;
import dauphine.agile.space.Rocket;
import junit.framework.TestCase;

/**
 * The test class RocketTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RocketTest extends TestCase
{
    /**
     * Default constructor for test class RocketTest
     */
    public RocketTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


    @Test
    public void testTakeOff()
    {
        Rocket ariane9 = new Rocket();
        ariane9.takeOff();
        assertEquals(0, ariane9.speed());
    }

    @Test
    public void testWithPilot() {
    	Rocket ariane12 = new Rocket();
    	Astronaut philippe = new Astronaut();
    	ariane12.enter(philippe);
    	assertEquals("the pilot is not philippe", philippe, ariane12.pilot());
    }
    
    @Test
    public void testTakeOffWithPilot()
    {
        Rocket ariane11 = new Rocket();
        Astronaut philippe = new Astronaut();
        ariane11.enter(philippe);
        ariane11.fill(20);
        ariane11.takeOff();
        assertEquals("sick", philippe.state());
        assertEquals("wrong fuel", 10, ariane11.fuel());
        assertEquals("wrong speed", 10, ariane11.speed());
    }
    
    @Test
    public void testEngineAddSimple() {
    	Rocket rocket = new Rocket();
    	Engine engine = new Engine();
    	rocket.addEngine(engine);
    	assertTrue(rocket.engines().contains(engine));
    }
    
    @Test
    public void testEngineAddComplicated() {
    	Rocket rocket = new Rocket();
    	Engine engine = new Engine();
    	rocket.addEngine(engine);
    	rocket.addEngine(engine);
    	assertTrue(rocket.engines().contains(engine));
    	rocket.removeEngine(engine);
    	assertFalse(rocket.engines().contains(engine));
    }
    
    @Test
    public void testEngineRemoveSimple() {
    	Rocket rocket = new Rocket();
    	Engine engine = new Engine();
    	rocket.addEngine(engine);
    	rocket.removeEngine(engine);
    	assertFalse(rocket.engines().contains(engine));
    }
    
    @Test
    public void testComplicated() {
    	Rocket rocket1 = new Rocket();
    	Rocket rocket2 = new Rocket();
    	
    	Engine engine = new Engine();
    	rocket1.addEngine(engine);
    	rocket2.addEngine(engine);

    	assertFalse(rocket1.engines().contains(engine));
    	assertTrue(rocket2.engines().contains(engine));
 
    }
    
    @Test
    public void testEscapePod() {
    	Rocket rocket = new Rocket();
    	EscapePod escapePod = new EscapePod();
    	Astronaut pilot = new Astronaut();
    	
    	rocket.enter(pilot);
    	rocket.setEscapePod(escapePod);
    	rocket.takeOff();
    	rocket.eject();
    	assertNull("the escape pod is still attached to the rocket", rocket.getEscapePod());
    	assertEquals("the pilot is not in the escape pod", pilot,escapePod.getPilot());
    }
}



