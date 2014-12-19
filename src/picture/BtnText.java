package picture;

import javax.swing.*;
import java.awt.*;

public class BtnText extends JButton // panel definition
{
    private Color c;
    private String sName;

    public BtnText(String _sName, Color _c) {
        sName = _sName;
        c = _c;
        
        this.setText(sName);
    }
    
    public Color getColour(){
        return c;
        
    }
}