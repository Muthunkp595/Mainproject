
package Project;
import java.awt .*;
import javax.swing.JPanel;
import java.beans.*;
public class Mybtton2 extends JPanel {
    Color first,second;
    public Mybtton2(){
    setContentAreaFilled(false);
    setCursor(new Cursor(Cursor.HAND_CURSOR));
    
    
  }
    private String Color1="#000000";
    public String getColor1(){
        return Color1;
    }
    public void setcolor1(String Color1){
        this.Color1=Color1;
        
        
    }
      private String Color2="#ffffff";
    public String getColor2(){
        return Color2;
    }
    public void setcolor2(String Color2){
        this.Color2=Color2;
    
    }
    private int radius=0;
    public int getRadius(){
        return radius;
        
    }
    public void setRadius (int radius){
        this.radius=radius;
    }
     public void PaintComponent(Graphics g){
        

        first=Color.decode(Color1);
        second=Color.decode(Color2);
        Graphics2D gg=(Graphics2D)g;
        gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp=new GradientPaint(0,0,first,getWidth(),getWidth(),second);
      
        gg.setPaint(gp);
        gg.fillRoundRect(0,0,getWidth(),getHeight(),radius,radius);
        super.paintComponent(g);
        
    }

    private void setContentAreaFilled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
