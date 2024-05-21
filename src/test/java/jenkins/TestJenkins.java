package jenkins;

import org.testng.annotations.Test;

public class TestJenkins {

    @Test
    public void pro()
    {
        String env=System.getProperty("environment");
        String browser=System.getProperty("browser");

        System.out.println(env);
        if (browser.equals("chrome")){
        System.out.println("chrome browser execution");
        } else if (browser.equals("firefox")) {
            System.out.println("firefox execution");
        }
    }
}
