package prezooom.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import prezooom.app.Controller.Controller;
import prezooom.app.Controller.StateManager;
import prezooom.app.Controller.exit;
import prezooom.app.Model.Display;
import prezooom.app.Model.Filter;
import prezooom.app.Model.Shape;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.AffineTransform;



public class MainFrame extends javax.swing.JFrame {





 
  
    public MainFrame() {
    	
    	initComponents();
   // 	addslideMouseClicked();
   
  
       
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
       
        Attribute = new javax.swing.JPanel();
        home_panel = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        width = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        width_field = new javax.swing.JTextField();
        height_field = new javax.swing.JTextField();
        color_file = new javax.swing.JLabel();
        addslide = new javax.swing.JLabel();
        aa = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        Icon backb = new ImageIcon("img\\circle.png");
        Icon l = new ImageIcon("img\\line.png");
        line = new javax.swing.JButton(l);
        line.setText("Line");       
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        view_panel = new javax.swing.JPanel();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        sizee = new javax.swing.JLabel();
        outline = new javax.swing.JLabel();
        grid = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        depth = new javax.swing.JLabel();
        orien = new javax.swing.JLabel();
        visibility = new javax.swing.JLabel();
        trans_panel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        presn_panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        edit_panel = new javax.swing.JPanel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        undo = new javax.swing.JLabel();
        redo = new javax.swing.JLabel();
        cutt = new javax.swing.JLabel();
        coppy = new javax.swing.JLabel();
        pastee = new javax.swing.JLabel();
        del = new javax.swing.JLabel();
        dupli = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        file_panel = new javax.swing.JPanel();
        new_file = new javax.swing.JLabel();
        new_file.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		d.clear();
        		repaint();
        		validate();
        		
        		
        	}
        });
        open_file = new javax.swing.JLabel();
 
        save_file = new javax.swing.JLabel();
  
        saveas_file = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        share_file = new javax.swing.JLabel();
        import_file = new javax.swing.JLabel();
        export_file = new javax.swing.JLabel();
        exit_file = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        camera_panel = new javax.swing.JPanel();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        onn = new javax.swing.JLabel();
        fit = new javax.swing.JLabel();
        zoomin = new javax.swing.JLabel();
        zoomout = new javax.swing.JLabel();
        camera = new javax.swing.JLabel();
        crotate = new javax.swing.JLabel();
        w1 = new javax.swing.JLabel();
        hh = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        file_button = new java.awt.Button();
        Icon ps = new ImageIcon("img\\oval.png");
        oval = new javax.swing.JButton(ps);

 
        Icon fsped = new ImageIcon("img\\square.png");
        square = new javax.swing.JButton(fsped);        

        Icon m1= new ImageIcon("img\\move.jpg");
        movee = new javax.swing.JButton(m1);

        jSeparator37 = new javax.swing.JSeparator();
        Icon ds =new ImageIcon("img\\delete.png");
        dslide = new javax.swing.JButton(ds);
        edit_button = new java.awt.Button();
        view_button = new java.awt.Button();
        camera_button = new java.awt.Button();
        trans_button = new java.awt.Button();
        presn_button = new java.awt.Button();
        slides = new javax.swing.JLayeredPane();
        main_slide = new javax.swing.JPanel();
        side_slide = new javax.swing.JPanel();
        
        Icon bksped = new ImageIcon("img\\rect.png");
        rect = new javax.swing.JButton(bksped);
        jProgressBar1 = new javax.swing.JProgressBar();
        searchfield = new javax.swing.JTextField();
        Icon icon = new ImageIcon("img\\search.png");
        search_btn = new javax.swing.JButton(icon);
        circle = new javax.swing.JButton(backb);
 //#######################################################################
//########################################################################

        
//#############################################################################


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prezoom");
        setBackground(new java.awt.Color(204, 204, 255));
        file_button.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		file_buttonMouseClicked(e);
            	
        	}
        });
        
  
        
 
        
        

        home_button = new java.awt.Button();
        Attribute.setBackground(new java.awt.Color(255, 204, 204));
        Attribute.setLayout(new java.awt.CardLayout());

        home_panel.setBackground(new java.awt.Color(255, 255, 255));
        home_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);

        width.setText("width");
        ImageIcon widthimg = new ImageIcon("img\\wide.png");
        width.setIcon(widthimg);

        height.setText("heigth");
        ImageIcon heightimg = new ImageIcon("img\\height.png");
        height.setIcon(heightimg);

        color_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon colorimg = new ImageIcon("img\\color.png");
        color_file.setIcon(colorimg);
        color_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color_fileMouseClicked(evt);
            }
        });



        aa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aa.setText("Aa");
        aa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ImageIcon aimg = new ImageIcon("img\\Aa.png");
        aa.setIcon(aimg);

        String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(fontNames));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        String[] fontSize=new String[30];
        for(int j=0; j<30; j++){
            fontSize[j]=new String(10+j*2+"");
        }
        jComboBox2.setFont(new java.awt.Font("Calibri Light", 0, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(fontSize));
        jComboBox2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        circle.setBackground(Color.WHITE);
        circle.setOpaque(false);
        circle.setBorder(null);
        circle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rect.setBackground(Color.WHITE);
        rect.setOpaque(false);
        rect.setBorder(null);
        rect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        oval.setBackground(Color.WHITE);
        oval.setOpaque(false);
        oval.setBorder(null);
        oval.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        square.setBackground(Color.WHITE);
        square.setOpaque(false);
        square.setBorder(null);
        square.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));


        movee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movee.setBackground(Color.WHITE);
        movee.setOpaque(false);
        movee.setBorder(null);


        jSeparator37.setOrientation(javax.swing.SwingConstants.VERTICAL);

        dslide.setBackground(Color.WHITE);
        dslide.setOpaque(false);
        dslide.setBorder(null);
        dslide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        line.setBackground(Color.WHITE);
        line.setOpaque(false);
        line.setBorder(null);
        line.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Move");

        jLabel2.setText("Delete State");

        jLabel3.setText("AddSlide");

        jLabel4.setText("Color");

        javax.swing.GroupLayout home_panelLayout = new javax.swing.GroupLayout(home_panel);
        home_panel.setLayout(home_panelLayout);
        home_panelLayout.setHorizontalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(width, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(height, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(width_field, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(height_field))
                .addGap(22, 22, 22)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(circle, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(oval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rect, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(square, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(movee, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)))
                .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addComponent(dslide, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)))
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addslide, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(color_file, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aa, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, 0, 64, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        home_panelLayout.setVerticalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator10)
            .addComponent(jSeparator11)
            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(home_panelLayout.createSequentialGroup()
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(width_field, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(height_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jComboBox2)))
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rect, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(circle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oval, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 19, Short.MAX_VALUE))
            .addComponent(jSeparator37, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(home_panelLayout.createSequentialGroup()
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(home_panelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addslide, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(movee, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(home_panelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(color_file, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(home_panelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(dslide, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Attribute.add(home_panel, "card2");

        view_panel.setBackground(new java.awt.Color(255, 255, 255));
        view_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator24.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator25.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator26.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator27.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator28.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator29.setOrientation(javax.swing.SwingConstants.VERTICAL);

        sizee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon sizeimg = new ImageIcon("img\\size.png");
        sizee.setIcon(sizeimg);

        outline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon outimg = new ImageIcon("img\\outline.png");
        outline.setIcon(outimg);

        grid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon gimg = new ImageIcon("img\\grid.png");
        grid.setIcon(gimg);

        position.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon posimg = new ImageIcon("img\\position.png");
        position.setIcon(posimg);

        depth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon depimg = new ImageIcon("img\\depth.png");
        depth.setIcon(depimg);

        orien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon oreimg = new ImageIcon("img\\orientation.png");
        orien.setIcon(oreimg);

        visibility.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon visimg = new ImageIcon("img\\eye.png");
        visibility.setIcon(visimg);

        javax.swing.GroupLayout view_panelLayout = new javax.swing.GroupLayout(view_panel);
        view_panel.setLayout(view_panelLayout);
        view_panelLayout.setHorizontalGroup(
            view_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_panelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(sizee, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(outline, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(grid, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(position, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(depth, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(orien, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(visibility, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );
        view_panelLayout.setVerticalGroup(
            view_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator24)
            .addComponent(jSeparator25, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator26, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator27, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator28, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator29, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(view_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(view_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sizee, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outline, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depth, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orien, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visibility, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        Attribute.add(view_panel, "card4");

        trans_panel.setBackground(new java.awt.Color(255, 255, 255));
        trans_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("jButton3");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout trans_panelLayout = new javax.swing.GroupLayout(trans_panel);
        trans_panel.setLayout(trans_panelLayout);
        trans_panelLayout.setHorizontalGroup(
            trans_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trans_panelLayout.createSequentialGroup()
                .addGap(503, 503, 503)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
        );
        trans_panelLayout.setVerticalGroup(
            trans_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trans_panelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        Attribute.add(trans_panel, "card6");

        presn_panel.setBackground(new java.awt.Color(255, 255, 255));
        presn_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("jButton1");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setText("jButton2");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout presn_panelLayout = new javax.swing.GroupLayout(presn_panel);
        presn_panel.setLayout(presn_panelLayout);
        presn_panelLayout.setHorizontalGroup(
            presn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(presn_panelLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        presn_panelLayout.setVerticalGroup(
            presn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(presn_panelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(presn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        Attribute.add(presn_panel, "card7");

        edit_panel.setBackground(new java.awt.Color(255, 255, 255));
        edit_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator19.setOrientation(javax.swing.SwingConstants.VERTICAL);

        ImageIcon undoimg = new ImageIcon("img\\undo.png");
        undo.setIcon(undoimg);
        undo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        undo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ImageIcon redoimg = new ImageIcon("img\\redo.png");
        redo.setIcon(redoimg);
        redo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        redo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ImageIcon cutimg = new ImageIcon("img\\cut.png");
        cutt.setIcon(cutimg);
        cutt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cutt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        coppy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coppy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon copyimg = new ImageIcon("img\\copy.png");
        coppy.setIcon(copyimg);

        pastee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pastee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon pasteimg = new ImageIcon("img\\paste.png");
        pastee.setIcon(pasteimg);

        del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon delimg = new ImageIcon("img\\delete.png");
        del.setIcon(delimg);

        dupli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dupli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon dupliimg = new ImageIcon("img\\duplicate.png");
        dupli.setIcon(dupliimg);

        jLabel5.setText("Undo");

        jLabel6.setText("Redo");

        jLabel7.setText("Cut");

        jLabel8.setText("Copy");

        jLabel9.setText("Paste");

        jLabel10.setText("Delete");

        jLabel11.setText("Duplicate");

        javax.swing.GroupLayout edit_panelLayout = new javax.swing.GroupLayout(edit_panel);
        edit_panel.setLayout(edit_panelLayout);
        edit_panelLayout.setHorizontalGroup(
            edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_panelLayout.createSequentialGroup()
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(undo, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(65, 65, 65)))
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(redo, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(63, 63, 63)))
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(cutt, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(coppy, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(60, 60, 60)))
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pastee, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(61, 61, 61)))
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(60, 60, 60)))
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(dupli, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGap(50, 50, 50))
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        edit_panelLayout.setVerticalGroup(
            edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator14)
            .addComponent(jSeparator15)
            .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator17)
            .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(edit_panelLayout.createSequentialGroup()
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cutt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(pastee, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(dupli, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(coppy, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Attribute.add(edit_panel, "card8");

        file_panel.setBackground(new java.awt.Color(255, 255, 255));
        file_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        new_file.setBackground(new java.awt.Color(51, 51, 255));
        new_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_file.setText("new");
        new_file.setToolTipText("Add File");
        new_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon img = new ImageIcon("img\\addfile2.png");
        new_file.setIcon(img);


        open_file.setBackground(new java.awt.Color(51, 255, 51));
        open_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        open_file.setText("open");
        open_file.setToolTipText("Open");
        open_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon openimg = new ImageIcon("img\\open1.png");
        open_file.setIcon(openimg);


        save_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save_file.setText("save");
        save_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon saveimg = new ImageIcon("img\\save1.png");
        save_file.setIcon(saveimg);


        saveas_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveas_file.setText("saveas");
        saveas_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon saveas = new ImageIcon("img\\saveas1.png");
        saveas_file.setIcon(saveas);

        print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print.setText("print");
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon printimg = new ImageIcon("img\\print.png");
        print.setIcon(printimg);

        share_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        share_file.setText("share");
        share_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon shareimg = new ImageIcon("img\\share.png");
        share_file.setIcon(shareimg);

        import_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        import_file.setText("import");
        import_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon importimg = new ImageIcon("img\\import1.png");
        import_file.setIcon(importimg);

        export_file.setBackground(new java.awt.Color(255, 255, 255));
        export_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        export_file.setText("export");
        export_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon exportimg = new ImageIcon("img\\export1.png");
        export_file.setIcon(exportimg);

        exit_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_file.setText("exit");
        exit_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon exitimg = new ImageIcon("img\\exit1.png");
        exit_file.setIcon(exitimg);
        exit_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_fileMouseClicked(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout file_panelLayout = new javax.swing.GroupLayout(file_panel);
        file_panel.setLayout(file_panelLayout);
        file_panelLayout.setHorizontalGroup(
            file_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(file_panelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(new_file, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(open_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(save_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(saveas_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(share_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(import_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(export_file, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(exit_file, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        file_panelLayout.setVerticalGroup(
            file_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addComponent(jSeparator6)
            .addComponent(jSeparator7)
            .addComponent(jSeparator8)
            .addGroup(file_panelLayout.createSequentialGroup()
                .addGroup(file_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(file_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(file_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(file_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(file_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(save_file, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(share_file, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(file_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(import_file, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(open_file, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(saveas_file, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(new_file, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(exit_file, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(file_panelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(export_file, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        Attribute.add(file_panel, "card3");

        camera_panel.setBackground(new java.awt.Color(255, 255, 255));
        camera_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator30.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator31.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator32.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator33.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator34.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator35.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator36.setOrientation(javax.swing.SwingConstants.VERTICAL);

        onn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon onimg = new ImageIcon("img\\on.png");
        onn.setIcon(onimg);

        fit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon fitimg = new ImageIcon("img\\fit.png");
        fit.setIcon(fitimg);

        zoomin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zoomin.setToolTipText("");
        ImageIcon zoomimg = new ImageIcon("img\\zoomin.png");
        zoomin.setIcon(zoomimg);

        zoomout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon zoutimg = new ImageIcon("img\\zoomout.png");
        zoomout.setIcon(zoutimg);

        camera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon cimg = new ImageIcon("img\\camera.png");
        camera.setIcon(cimg);

        crotate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon crimg = new ImageIcon("img\\rotate.png");
        crotate.setIcon(crimg);

        w1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon cwimg = new ImageIcon("img\\wide.png");
        w1.setIcon(cwimg);

        hh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageIcon chimg = new ImageIcon("img\\height.png");
        hh.setIcon(chimg);

        textField1.setText("textField1");

        textField2.setText("textField2");

        javax.swing.GroupLayout camera_panelLayout = new javax.swing.GroupLayout(camera_panel);
        camera_panel.setLayout(camera_panelLayout);
        camera_panelLayout.setHorizontalGroup(
            camera_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camera_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(onn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(camera_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(w1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hh, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(camera_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(fit, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(zoomin, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(zoomout, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(camera, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crotate, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        camera_panelLayout.setVerticalGroup(
            camera_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator30, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator31, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator32, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator33, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator34)
            .addComponent(jSeparator35, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator36, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(camera_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(camera_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(onn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zoomin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zoomout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camera, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crotate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(camera_panelLayout.createSequentialGroup()
                        .addGroup(camera_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(camera_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(camera_panelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(camera_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Attribute.add(camera_panel, "card5");

        file_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        file_button.setLabel("File");


        home_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home_button.setLabel("Home");
        home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_buttonActionPerformed(evt);
            }
        });

        edit_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_button.setLabel("Edit");
        edit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_buttonMouseClicked(evt);
            }
        });

        view_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_button.setLabel("View");
        view_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_buttonMouseClicked(evt);
            }
        });

        camera_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        camera_button.setLabel("Camera");
  

        trans_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trans_button.setLabel("Transitions");
        trans_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trans_buttonMouseClicked(evt);
            }
        });

        presn_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        presn_button.setLabel("Presentation");
        presn_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presn_buttonMouseClicked(evt);
            }
        });
        presn_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presn_buttonActionPerformed(evt);
            }
        });

        slides.setBackground(new java.awt.Color(204, 204, 255));

        main_slide.setBackground(new java.awt.Color(255, 255, 255));
        main_slide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        main_slide.setLayout(new java.awt.BorderLayout());

        side_slide.setBackground(new java.awt.Color(255, 255, 255));
        side_slide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        side_slide.setLayout(new javax.swing.BoxLayout(side_slide, javax.swing.BoxLayout.Y_AXIS));

        slides.setLayer(main_slide, javax.swing.JLayeredPane.DEFAULT_LAYER);
        slides.setLayer(side_slide, javax.swing.JLayeredPane.DEFAULT_LAYER);
        slides.setLayer(jProgressBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout slidesLayout = new javax.swing.GroupLayout(slides);
        slides.setLayout(slidesLayout);
        slidesLayout.setHorizontalGroup(
            slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slidesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(side_slide, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(slidesLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(main_slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(slidesLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(242, 242, 242)))
                .addGap(63, 63, 63))
        );
        slidesLayout.setVerticalGroup(
            slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slidesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(side_slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(slidesLayout.createSequentialGroup()
                        .addComponent(main_slide, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        searchfield.setText("Search...");

        search_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(file_button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(home_button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(edit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(view_button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(camera_button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(trans_button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(presn_button, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(searchfield)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Attribute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addComponent(slides, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(file_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camera_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trans_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(presn_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(search_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchfield, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Attribute, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slides))
        );
        
        
//#######################################################################################################################################################################

  //-------------------------------------------------------------------------------------------      

//-------------------------------------------------------------------------------------------------

open_file.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ft.loadFile();
        		
        	}
        });
        
save_file.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ft.saveFile();
        		saved=true;
        	}
        });

main_slide.addMouseWheelListener(new MouseAdapter() {
	
	public void mouseWheelMoved(MouseWheelEvent e) {

	    zoomer = true;

	    //Zoom in
	    if (e.getWheelRotation() < 0) {
	        zoomFactor *= 1.1;
	        repaint();
	    }
	    //Zoom out
	    if (e.getWheelRotation() > 0) {
	        zoomFactor /= 1.1;
	        repaint();
	    }
	}
	
	
});
        
 ///--------------------------------
for(int i=0;i<14;i++) {
    msg [i]= new JPanel(new BorderLayout());
    msg[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
    msg[i].setBackground(Color.white);
    msg[i].setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1) );
    sub = new JLabel("",SwingConstants.CENTER);
    sub.setText("States: " + states);
    sub.setBorder(BorderFactory.createLineBorder(Color.black));
    msg[i].add(sub);
    msg[i].setPreferredSize(new Dimension(140, 100));     
    msg[i].setMaximumSize(new Dimension(140, 100));         
    box.add(msg[i]);

    
    jsp.setPreferredSize(new Dimension(100, 500)); 
    side_slide.add(jsp,BorderLayout.CENTER);
    
    
    states++;
}     
for(int i=1;i<14;i++) {
	msg[i].setVisible(false);
}

dslide.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		display[0].removeAll();
		display[0].revalidate();
		main_slide.validate();		
		if(current_state!=0)
		msg[current_state].setVisible(false);
		if(current_state==0)
			current_state=0;
		else
		current_state--;
	}
});


addslide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
ImageIcon slideimg = new ImageIcon("img\\addslide.png");
addslide.setIcon(slideimg);
addslide.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
    	
        msg[current_state].setVisible(true);
        current_state++;
    }
});

display[0]=new JPanel();
display[1]=new JPanel();


msg[0].addMouseListener(new java.awt.event.MouseAdapter() { public void mouseClicked(java.awt.event.MouseEvent evt) {

addshape(display[0]);



}});

msg[1].addMouseListener(new java.awt.event.MouseAdapter() { public void mouseClicked(java.awt.event.MouseEvent evt) {


addshape(display[0]);

}});


oval.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		
		d.selectedShape=ELLIPSE;
		display[0]=d;
		
	}
});

 
 circle.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
      
        	d.selectedShape=CIRCLE;
        	display[0]=d;
        	

      	
        	}
        });
        

rect.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	
        d.selectedShape=RECTANGLE;
        addshape(d);
        display[0]=d;
      
            		
  
        	
        	}
        });
movee.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
 
      		d.selectedShape=NOSHAPE;
      	  	//addshape(d);

      		
	}
});

square.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		d.selectedShape=SQUARE;
		
	}
});



/////////////////////////////////


 

      
        pack();
    }
//####################################################################################################################################
    
    
    
    
    
    
    
    private void presn_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource()==presn_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(true);
            trans_panel.setVisible(false);
        }
    }//GEN-LAST:event_presn_buttonActionPerformed

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {
          if (evt.getSource()==home_button){
            file_panel.setVisible(false);
            home_panel.setVisible(true);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }
   // @SuppressWarnings("unused")
	private void file_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource()==file_button){
            file_panel.setVisible(true);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }

    private void view_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource()==view_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(true);
            camera_panel.setVisible(false);
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }
    private void camera_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource()==camera_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
            camera_panel.setVisible(true);
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }
    private void trans_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource()==trans_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            view_panel.setVisible(false);
            edit_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(false);
            trans_panel.setVisible(true);
        }
    }
    private void presn_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource()==presn_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(true);
            trans_panel.setVisible(false);
        }
    }
    private void edit_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource()==edit_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(true);
            view_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }
 

   
    private void exit_fileMouseClicked(java.awt.event.MouseEvent evt) {
    	
        if(!saved) {ft.saveFile();}
        else
        System.exit(0);
    }
 
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
     String value = jComboBox1.getSelectedItem().toString();
     System.out.println(value);
     
    }
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
     String value = jComboBox2.getSelectedItem().toString();
     int i=Integer.parseInt(value);
     System.out.println(i);
    }

    private void color_fileMouseClicked(java.awt.event.MouseEvent evt) {
            @SuppressWarnings("unused")
			Color c=JColorChooser.showDialog(this,"Choose",null); 
       

    }

    public void addslideMouseClicked() {

         this.msg[states]=control.getAdd(states);   
         msg[states].setCursor(new Cursor(Cursor.HAND_CURSOR));
         
         box.add(msg[states]);
         jsp.setPreferredSize(new Dimension(100, 500));
         display[states]=control.getMain(states);          
         //side_slide.add(jsp,BorderLayout.CENTER);
         side_slide.validate();
         this.validate();
         states++;

    }

 public void addshape(JPanel p) {
main_slide.add(p);
validate();
 }


public void deleteslide() {
	if(states-1>0) {
	//JPanel p=msg[states-1];
	JPanel p=control.getDelete(states);
	p.setVisible(false);
    side_slide.remove(p);
	states--;
	side_slide.validate();
	side_slide.repaint();
	}
	
}

public void paint(Graphics g) {
    super.paint(g);

    Graphics2D g2 = (Graphics2D) g;

    if (zoomer) {
        AffineTransform at = new AffineTransform();

        double xRel = MouseInfo.getPointerInfo().getLocation().getX() - getLocationOnScreen().getX();
        double yRel = MouseInfo.getPointerInfo().getLocation().getY() - getLocationOnScreen().getY();

        double zoomDiv = zoomFactor / prevZoomFactor;

        xOffset = (zoomDiv) * (xOffset) + (1 - zoomDiv) * xRel;
        yOffset = (zoomDiv) * (yOffset) + (1 - zoomDiv) * yRel;

        at.translate(xOffset, yOffset);
        at.scale(zoomFactor, zoomFactor);
        prevZoomFactor = zoomFactor;
        g2.transform(at);
        zoomer = false;
    }
}





	 public  int current_state=0;
	 public int previous=0;

	 Display d=new Display(this);

	 
	 Controller control=new Controller(this,d);    
	 public JPanel msg[] = new JPanel[1000];
	 public Shape shpe;
	 JPanel display[]=new JPanel[1000];

	 public  int selected_shape=0;
	 Display p1=new Display(this);
    
	 public int state=0;
	 
	 public JPanel main_slide;
     public int states=0;
	JLabel sub = null;
	Box box = new Box(BoxLayout.Y_AXIS);
	JScrollPane jsp = new JScrollPane(box);
	StateManager sm=new StateManager();
    private javax.swing.JPanel Attribute;
    private javax.swing.JLabel aa;
    private javax.swing.JLabel addslide;
    private javax.swing.JLabel camera;
    private java.awt.Button camera_button;
    private javax.swing.JPanel camera_panel;
    private javax.swing.JButton circle;
    private javax.swing.JLabel color_file;
    private javax.swing.JLabel coppy;
    private javax.swing.JLabel crotate;
    private javax.swing.JLabel cutt;
    private javax.swing.JLabel del;
    private javax.swing.JLabel depth;
    private javax.swing.JButton dslide;
    private javax.swing.JLabel dupli;
    private java.awt.Button edit_button;
    private javax.swing.JPanel edit_panel;
    private javax.swing.JLabel exit_file;
    private javax.swing.JLabel export_file;
    private java.awt.Button file_button;
    private javax.swing.JPanel file_panel;
    private javax.swing.JLabel fit;
    private javax.swing.JLabel grid;
    private javax.swing.JLabel height;
    private javax.swing.JTextField height_field;
    private javax.swing.JLabel hh;
    private java.awt.Button home_button;
    private javax.swing.JPanel home_panel;
    private javax.swing.JLabel import_file;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton line;
    private javax.swing.JButton movee;
    private javax.swing.JLabel new_file;
    private javax.swing.JLabel onn;
    private javax.swing.JLabel open_file;
    private javax.swing.JLabel orien;
    private javax.swing.JLabel outline;
    private javax.swing.JButton oval;
    private javax.swing.JLabel pastee;
    private javax.swing.JLabel position;
    private java.awt.Button presn_button;
    private javax.swing.JPanel presn_panel;
    private javax.swing.JLabel print;
    private javax.swing.JButton rect;
    private javax.swing.JLabel redo;
    private javax.swing.JLabel save_file;
    private javax.swing.JLabel saveas_file;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField searchfield;
    private javax.swing.JLabel share_file;
    private javax.swing.JPanel side_slide;
    private javax.swing.JLabel sizee;
    private javax.swing.JLayeredPane slides;
    private javax.swing.JButton square;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.Button trans_button;
    private javax.swing.JPanel trans_panel;
    private javax.swing.JLabel undo;
    private java.awt.Button view_button;
    private javax.swing.JPanel view_panel;
    private javax.swing.JLabel visibility;
    private javax.swing.JLabel w1;
    private javax.swing.JLabel width;
    private javax.swing.JTextField width_field;
    private javax.swing.JLabel zoomin;
    private javax.swing.JLabel zoomout;
    public JPanel dis[]=new JPanel[100];
	public final static int NOSHAPE = -1;
	public final static int CIRCLE = 0;
	public final static int ELLIPSE = 1;
	public final static int SQUARE = 2;
	public final static int RECTANGLE = 3;
	public final static int LINE=4;
	public final static String DEFAULT_WIDTH = "100";
	public final static String DEFAULT_HEIGHT = "50";
	public int DEFAULT_SHAPE = ELLIPSE;
	public final static Color DEFAULT_COLOR = Color.blue;
	public final static boolean DEFAULT_FILLED = false;
	public boolean saved=false;
    Filter ft=new Filter(d,this);
    private double zoomFactor = 1;
    private double prevZoomFactor = 1;
    private boolean zoomer;
    private boolean dragger;
    private boolean released;
    private double xOffset = 0;
    private double yOffset = 0;
    private int xDiff;
    private int yDiff;
    private Point startPoint;

}
