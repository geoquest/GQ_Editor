/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtestapplication1;

import javafx.scene.control.TextField;

/**
 *
 * @author Gregor
 */
public class TextualTextField extends TextField
{
    @Override
    public void replaceText(int start, int end, String text)
    {
        if(text.matches("[A-Za-z]") || text.equalsIgnoreCase(""))
        {
            super.replaceText(start, end, text);
        }
    }
    
    @Override
    public void replaceSelection(String text)
    {
        if(text.matches("[A-Za-z]") || text.equalsIgnoreCase(""))
        {
            super.replaceSelection(text);
        }
    }
}
