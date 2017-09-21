//package name
package monster.view;
//imports java options
import javax.swing.JOptionPane;
//class name
public class monsterDisplay 
{

	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null,  textToDisplay);
	}
	
	public String getResponse(String questionAsked)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, questionAsked);
		
		return response;
	}
	
}
