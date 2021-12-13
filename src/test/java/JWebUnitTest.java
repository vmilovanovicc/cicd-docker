import org.junit.Before;
import org.junit.Test;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

public class JWebUnitTest {
    @Before
    public void prepare() {
       // setBaseUrl("http://localhost:8081/webapp");
         setBaseUrl("http://localhost:8081/devops/");
        //setBaseUrl("http://webapp-env.eba-ptnmqh8m.eu-west-1.elasticbeanstalk.com/");
    }
    @Test
    public void testLoginPage() {
        beginAt("index.jsp");
        assertTitleEquals("Login");
        assertLinkPresent("home");
        clickLink("home");
        assertTitleEquals("Home");
    }

    @Test
    public void testHomePage() {
        beginAt("home.jsp");
        assertTitleEquals("Home");
        assertLinkPresent("login");
        clickLink("login");
        assertTitleEquals("Login");
    }
}
