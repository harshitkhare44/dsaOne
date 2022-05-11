package wt.lab11;

public class fifth extends Applet
{
public void init()
{
setBackground(Color.CYAN);
}
public void paint(Graphics g)
{
g.drawArc(50, 50, 200, 200, 0, 360);
g.setColor(Color.yellow);
g.fillArc(50, 50, 200, 200, 0, 360);
g.drawArc(100, 100, 20, 20, 0, 360);
g.setColor(Color.black);
g.fillArc(100, 100, 20, 20, 0, 360);
g.drawArc(175, 100, 20, 20, 0, 360);
g.setColor(Color.black);
g.fillArc(175, 100, 20, 20, 0, 360);
g.drawArc(100, 110, 100, 100, 0, -180);
}
}