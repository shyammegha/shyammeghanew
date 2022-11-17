package genericUtility;
 

 
import java.util.Set;

public class WebDriverUtility extends BaseClass
{
public static void switchingWindow(Set<String> allId) {
	for (String id : allId)
	{
		driver.switchTo().window(id);
	}
}
public static void switchingBackwindow(String Id) {
	driver.switchTo().window(Id);
}
public static void switchToFrame(String FrameRef) {
	try {
		driver.switchTo().frame(FrameRef);
	}catch(Exception demo) {
		int index = Integer.parseInt(FrameRef);
		 
		driver.switchTo().frame(index);
	}
}
}
