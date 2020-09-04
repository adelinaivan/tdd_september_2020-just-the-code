package ro.endava.tdd.unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.fail;

public class JunitBasicsExampleTest {

    private static Logger log = LoggerFactory.getLogger(JunitBasicsExampleTest.class);

    @BeforeClass
    public static void setupAll() {
        log.info("@BeforeClass");
    }

    @Before
    public void setup() {
        log.info("- @Before each test");
    }

    @After
    public void tearDown() {
        log.info("- @After each test");
    }

    @AfterClass
    public static void tearDownAll() {
        log.info("@AfterClass");
    }

    @Test
    public void anEmptyUnitTest() {
        log.info("-- running THE test");
    }


    @Test(expected = RuntimeException.class)
    public void aTestWithAnExpectedException() {
        log.info("-- running a test with an exception");
        throw new RuntimeException("This was expected");
    }

    @Ignore
    @Test
    public void anIgnoredUnitTest() {
        log.info("-- running the IGNORED test ???");

        // use this for marking the test as failed
        fail();
    }
}
