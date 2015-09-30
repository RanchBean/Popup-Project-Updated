package input.view;

import javax.swing.JOptionPane;
/**
 * This Class provides Popups for input and output.
 * @author ethr5627
 *
 */
public class PopupDisplay
{
	/**
	 * Provides a popup box for asking a question and lets user to input information.
	 * @param input The question in the popup.
	 * @return The users's answer to the Question
	 */
	public String getAnswer(String input)
	{
		String answer = "";
				
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	/**
	 * Show what information was typed into the box.
	 * @param input Shows a dialog box.
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
