package Log4j_Alpha;

import org.apache.logging.log4j.*;

public class Demo {
	private static Logger Log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("I have clicked pn button");
		Log.info("Button is displayed");
		Log.error("Button is not displayed");
		Log.fatal("Button is missing");
	}

}
