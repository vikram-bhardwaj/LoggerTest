import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLogger
{
	private static Logger logger = LogManager.getLogger(MyLogger.class.getName());
	public static void main(String[] args)
	{
		logger.error("hello");
		logger.info("hello");
		logger.debug("hello");
		logger.error("hello");
		logger.info("hello");
		logger.debug("hello");
	}
}