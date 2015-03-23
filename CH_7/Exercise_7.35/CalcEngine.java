/**
 * The main part of the calculator doing the calculations.
 * 
 * @author: (none yet)
 * @version 0.1 (incomplete)
 */
public class CalcEngine
{
    private int displayValue;
    private int LHOperand;
    private int RHOperand;
    private char operator;

    /**
     * Create a CalcEngine.
     */
    public CalcEngine()
    {
        clear();
    }

    /**
     * @return The value that should currently be displayed
     * on the calculator display.
     */
    public int getDisplayValue()
    {
        return displayValue;
    }

    /**
     * A number button was pressed.
     * Either start a new operand, or incorporate this number as
     * the least significant digit of an existing one.
     * @param number The number pressed on the calculator.
     */
    public void numberPressed(int number)
    {
        displayValue = (displayValue * 10) + number;
    }

    /**
     * The 'plus' button was pressed. 
     */
    public void plus()
    {
        operator = '+';
        LHOperand = displayValue;
        displayValue = 0;

    }

    /**
     * The 'minus' button was pressed.
     */
    public void minus()
    {
        operator = '-';
        LHOperand = displayValue;
        displayValue = 0;
    }

    /**
     * The '=' button was pressed.
     */
    public void equals()
    {
        if(operator == '+') {
            displayValue += LHOperand;
        } else if(operator == '-') {
            displayValue = LHOperand - displayValue;
        }
        operator = ' ';
    }

    /**
     * The 'C' (clear) button was pressed.
     */
    public void clear()
    {
        displayValue = 0;
        LHOperand = 0;
        RHOperand = 0;
        operator = ' ';
    }

    /**
     * @return The title of this calculation engine.
     */
    public String getTitle()
    {
        return "Calculator Engine";
    }

    /**
     * @return The author of this engine. This string is displayed as it is,
     * so it should say something like "Written by H. Simpson".
     */
    public String getAuthor()
    {
        return "Ricahrd J. Shepard IV";
    }

    /**
     * @return The version number of this engine. This string is displayed as 
     * it is, so it should say something like "Version 1.1".
     */
    public String getVersion()
    {
        return "1.0.0";
    }
}
