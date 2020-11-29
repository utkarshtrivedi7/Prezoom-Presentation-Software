package prezooom.app.Model;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.Container;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import java.awt.CardLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JPanelSlider extends JPanel
{
    public static final boolean left = false;
    public static final boolean right = true;
    
    @SuppressWarnings("unused")
	public JPanelSlider() {
        this.setLayout(new CardLayout());
        this.setBorder(BorderFactory.createEtchedBorder());
        final Dimension dimension = new Dimension(this.getWidth(), this.getHeight());
    }
    
    @SuppressWarnings("unused")
	public void nextPanel(final Component panel) {
        final Component currentComp = this.getCurrentComponent(this);
        final Rectangle b = currentComp.getBounds();
        panel.setVisible(true);
        final JPanelSlidingListener sl = new JPanelSlidingListener(10, currentComp, panel, true);
        final Timer t = new Timer(40, sl);
        (sl.timer = t).start();
    }
    
    public void nextPanel(final int panelSpeed, final Component panel, final boolean direction) {
        final Component comp = this.getCurrentComponent(this);
        comp.getBounds();
        panel.setVisible(true);
        final JPanelSlidingListener jsl = new JPanelSlidingListener(panelSpeed, comp, panel, direction);
        final Timer t = new Timer(40, jsl);
        (jsl.timer = t).start();
    }
    
    public void nextPanel(final int panelSpeed, final int timeSpeed, final Component panel, final boolean direction) {
        final Component comp = this.getCurrentComponent(this);
        comp.getBounds();
        panel.setVisible(true);
        final JPanelSlidingListener jsl = new JPanelSlidingListener(panelSpeed, comp, panel, direction);
        final Timer t = new Timer(timeSpeed, jsl);
        (jsl.timer = t).start();
    }
    
    public Component getCurrentComponent(final Container parent) {
        Component comp = null;
        for (int count = parent.getComponentCount(), i = 0; i < count; ++i) {
            comp = parent.getComponent(i);
            if (comp.isVisible()) {
                return comp;
            }
        }
        return comp;
    }
    
    public String getCurrentComponentShow(final Container parent) {
        String panelName = null;
        Component comp = null;
        for (int count = parent.getComponentCount(), i = 0; i < count; ++i) {
            comp = parent.getComponent(i);
            if (comp.isVisible()) {
                panelName = comp.getName();
                return panelName;
            }
        }
        return panelName;
    }
    
    public void refresh() {
        this.revalidate();
        this.repaint();
    }
    
    public class JPanelSlidingListener implements ActionListener

    {
        Component hidePanel;
        Component showPanel;
        int steps;
        int step;
        Timer timer;
        boolean isNext;
        
        public JPanelSlidingListener(final int steps, final Component hidePanel, final Component panel, final boolean isNext) {
            this.step = 0;
            this.steps = steps;
            this.hidePanel = hidePanel;
            this.showPanel = panel;
            this.isNext = isNext;
        }
        
        @Override
        public void actionPerformed(final ActionEvent e) {
            final Rectangle bounds = this.hidePanel.getBounds();
            final int shift = bounds.width / this.steps;
            if (!this.isNext) {
                this.hidePanel.setLocation(bounds.x - shift, bounds.y);
                this.showPanel.setLocation(bounds.x - shift + bounds.width, bounds.y);
            }
            else {
                this.hidePanel.setLocation(bounds.x + shift, bounds.y);
                this.showPanel.setLocation(bounds.x + shift - bounds.width, bounds.y);
            }
            JPanelSlider.this.repaint();
            ++this.step;
            if (this.step == this.steps) {
                this.timer.stop();
                this.hidePanel.setVisible(false);
            }
        }
    }



}
