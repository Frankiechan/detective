package detective.webdriver.browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.grid.common.GridRole;
import org.openqa.grid.common.RegistrationRequest;
import org.openqa.grid.internal.utils.SelfRegisteringRemote;

public class Server {

  public static void main(String[] args) throws Exception{
    System.setProperty("webdriver.chrome.driver", "/Users/bglcorp/git/detective/core/core/src/main/resources/chromedrivers/mac/chromedriver");
    System.setProperty(org.openqa.selenium.phantomjs.PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/Users/bglcorp/git/detective/core/core/src/main/resources/phantomjs/phantomjs-1.9.7-macosx/bin");
     
    org.openqa.selenium.server.SeleniumServer.main(new String[] {""});
  }
  
  public static void mainHelp(String[] args) throws Exception{
    
    org.openqa.selenium.server.SeleniumServer.main(new String[] {"-h"});
  }
  
  
}
