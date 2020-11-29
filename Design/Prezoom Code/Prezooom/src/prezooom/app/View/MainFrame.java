package prezooom.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import diu.swe.habib.JPanelSlider.JPanelSlider;
import prezooom.app.Controller.Controller;
import prezooom.app.Controller.StateManager;
import prezooom.app.Model.Display;
import prezooom.app.Model.Filter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
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
        jSeparator10.setBackground(new Color(0, 0, 0));
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        color_file = new javax.swing.JLabel();
        addslide = new javax.swing.JLabel();
        aa = new javax.swing.JLabel();

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        Icon backb = new ImageIcon("img\\circle.png");
        Icon l = new ImageIcon("img\\line.jpg");
        line = new javax.swing.JButton(l);
        line.setText("");       
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
        jButton3.setBackground(new Color(255, 235, 205));
        jButton3.setFont(new Font("Arial Black", Font.ITALIC, 15));

        presn_panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton1.setForeground(new Color(72, 61, 139));
        jButton1.setFont(new Font("Arial Black", Font.ITALIC, 15));
        jButton1.setBackground(new Color(255, 182, 193));
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
        file_button = new java.awt.Button();
        Icon ps = new ImageIcon("img\\oval.png");
        oval = new javax.swing.JButton(ps);
        oval.setText("oval");

 
        Icon fsped = new ImageIcon("img\\square.png");
        square = new javax.swing.JButton(fsped);        
        square.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });

        Icon m1= new ImageIcon("img\\move.jpeg");
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
        aa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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

        line.setBackground(new Color(255, 192, 203));
        line.setOpaque(false);
        line.setBorder(new LineBorder(new Color(0, 0, 0)));
        line.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Move");

        jLabel2.setText("Delete State");

        jLabel3.setText("AddSlide");

        jLabel4.setText("Color");
		  
		  JSeparator separator = new JSeparator();

        
		
		  javax.swing.GroupLayout home_panelLayout = new
		  javax.swing.GroupLayout(home_panel);
		  home_panelLayout.setHorizontalGroup(
		  	home_panelLayout.createParallelGroup(Alignment.LEADING)
		  		.addGroup(home_panelLayout.createSequentialGroup()
		  			.addGap(19)
		  			.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  				.addComponent(square, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
		  				.addComponent(circle, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
		  			.addGap(32)
		  			.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  				.addGroup(home_panelLayout.createSequentialGroup()
		  					.addGap(79)
		  					.addComponent(jSeparator9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		  				.addGroup(home_panelLayout.createSequentialGroup()
		  					.addPreferredGap(ComponentPlacement.RELATED)
		  					.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  						.addGroup(home_panelLayout.createSequentialGroup()
		  							.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  								.addComponent(oval, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
		  								.addComponent(rect, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
		  							.addGap(18)
		  							.addComponent(line, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
		  							.addGap(8)
		  							.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING, false)
		  								.addGroup(home_panelLayout.createSequentialGroup()
		  									.addGap(177)
		  									.addComponent(jSeparator10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  									.addGap(62)
		  									.addComponent(jSeparator37, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  									.addGap(18))
		  								.addGroup(home_panelLayout.createSequentialGroup()
		  									.addGap(83)
		  									.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  										.addGroup(home_panelLayout.createSequentialGroup()
		  											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		  											.addComponent(movee, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
		  											.addGap(88))
		  										.addGroup(home_panelLayout.createSequentialGroup()
		  											.addGap(45)
		  											.addComponent(jLabel1)
		  											.addPreferredGap(ComponentPlacement.RELATED)))))
		  							.addGroup(home_panelLayout.createParallelGroup(Alignment.TRAILING)
		  								.addGroup(home_panelLayout.createSequentialGroup()
		  									.addComponent(dslide, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
		  									.addPreferredGap(ComponentPlacement.UNRELATED))
		  								.addGroup(home_panelLayout.createSequentialGroup()
		  									.addComponent(jLabel2)
		  									.addGap(30)))
		  							.addComponent(jSeparator11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  							.addPreferredGap(ComponentPlacement.RELATED)
		  							.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  								.addComponent(addslide, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
		  								.addGroup(home_panelLayout.createSequentialGroup()
		  									.addGap(10)
		  									.addComponent(jLabel3)))
		  							.addPreferredGap(ComponentPlacement.UNRELATED)
		  							.addComponent(jSeparator12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  							.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  								.addGroup(home_panelLayout.createSequentialGroup()
		  									.addGap(18)
		  									.addComponent(color_file, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
		  									.addGap(18)
		  									.addComponent(jSeparator13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  									.addPreferredGap(ComponentPlacement.RELATED)
		  									.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  										.addComponent(aa, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
		  										.addGroup(home_panelLayout.createSequentialGroup()
		  											.addGap(40)
		  											.addComponent(jComboBox1, 0, 192, Short.MAX_VALUE)))
		  									.addPreferredGap(ComponentPlacement.UNRELATED)
		  									.addComponent(jComboBox2, 0, 78, Short.MAX_VALUE)
		  									.addGap(18))
		  								.addGroup(home_panelLayout.createSequentialGroup()
		  									.addGap(38)
		  									.addComponent(jLabel4)
		  									.addContainerGap(388, Short.MAX_VALUE))))
		  						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)))))
		  );
		  home_panelLayout.setVerticalGroup(
		  	home_panelLayout.createParallelGroup(Alignment.LEADING)
		  		.addComponent(jSeparator11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  		.addComponent(jSeparator12, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  		.addComponent(jSeparator13, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  		.addComponent(jSeparator37, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  		.addGroup(home_panelLayout.createSequentialGroup()
		  			.addContainerGap()
		  			.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  				.addComponent(jSeparator9, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  				.addGroup(home_panelLayout.createSequentialGroup()
		  					.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  						.addGroup(home_panelLayout.createSequentialGroup()
		  							.addComponent(circle, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
		  							.addGap(18)
		  							.addComponent(square, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
		  						.addGroup(home_panelLayout.createSequentialGroup()
		  							.addComponent(aa, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
		  							.addPreferredGap(ComponentPlacement.RELATED)
		  							.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING, false)
		  								.addComponent(jComboBox1, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
		  								.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		  						.addGroup(home_panelLayout.createSequentialGroup()
		  							.addComponent(rect, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
		  							.addGap(18)
		  							.addComponent(oval, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
		  					.addPreferredGap(ComponentPlacement.UNRELATED)
		  					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		  		.addGroup(home_panelLayout.createSequentialGroup()
		  			.addGap(19)
		  			.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  				.addGroup(home_panelLayout.createSequentialGroup()
		  					.addGap(21)
		  					.addComponent(addslide, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
		  				.addGroup(home_panelLayout.createSequentialGroup()
		  					.addGap(24)
		  					.addComponent(color_file, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
		  				.addGroup(home_panelLayout.createSequentialGroup()
		  					.addGap(19)
		  					.addComponent(dslide, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
		  			.addPreferredGap(ComponentPlacement.UNRELATED)
		  			.addGroup(home_panelLayout.createParallelGroup(Alignment.LEADING)
		  				.addComponent(jLabel3)
		  				.addComponent(jLabel2)
		  				.addComponent(jLabel4))
		  			.addContainerGap(27, Short.MAX_VALUE))
		  		.addGroup(home_panelLayout.createSequentialGroup()
		  			.addGroup(home_panelLayout.createParallelGroup(Alignment.TRAILING)
		  				.addComponent(line, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
		  				.addGroup(home_panelLayout.createSequentialGroup()
		  					.addComponent(jSeparator10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		  					.addGap(18)
		  					.addComponent(movee, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
		  			.addGap(18)
		  			.addComponent(jLabel1)
		  			.addContainerGap(26, Short.MAX_VALUE))
		  );home_panel.setLayout(home_panelLayout);
		 
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

        jButton3.setText("Start Transition");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout trans_panelLayout = new javax.swing.GroupLayout(trans_panel);
        trans_panelLayout.setHorizontalGroup(
        	trans_panelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(trans_panelLayout.createSequentialGroup()
        			.addGap(196)
        			.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(725, Short.MAX_VALUE))
        );
        trans_panelLayout.setVerticalGroup(
        	trans_panelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(trans_panelLayout.createSequentialGroup()
        			.addGap(24)
        			.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(35, Short.MAX_VALUE))
        );
        trans_panel.setLayout(trans_panelLayout);

        Attribute.add(trans_panel, "card6");

        presn_panel.setBackground(new java.awt.Color(255, 255, 255));
        presn_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Start Presentation\r\n");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout presn_panelLayout = new javax.swing.GroupLayout(presn_panel);
        presn_panelLayout.setHorizontalGroup(
        	presn_panelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(presn_panelLayout.createSequentialGroup()
        			.addGap(215)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(702, Short.MAX_VALUE))
        );
        presn_panelLayout.setVerticalGroup(
        	presn_panelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(presn_panelLayout.createSequentialGroup()
        			.addGap(37)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(40, Short.MAX_VALUE))
        );
        presn_panel.setLayout(presn_panelLayout);

        
        
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
		
		  javax.swing.GroupLayout edit_panelLayout = new
		  javax.swing.GroupLayout(edit_panel); edit_panel.setLayout(edit_panelLayout);
		  edit_panelLayout.setHorizontalGroup(
		  edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.
		  LEADING) .addGroup(edit_panelLayout.createSequentialGroup()
		  .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addGroup(edit_panelLayout.createSequentialGroup()
		  .addGap(38, 38, 38) .addComponent(undo, javax.swing.GroupLayout.DEFAULT_SIZE,
		  86, Short.MAX_VALUE) .addGap(35, 35, 35))
		  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		  edit_panelLayout.createSequentialGroup()
		  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		  .addComponent(jLabel5) .addGap(65, 65, 65))) .addComponent(jSeparator14,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE)
		  .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addGroup(edit_panelLayout.createSequentialGroup()
		  .addGap(35, 35, 35) .addComponent(redo, javax.swing.GroupLayout.DEFAULT_SIZE,
		  84, Short.MAX_VALUE) .addGap(35, 35, 35))
		  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		  edit_panelLayout.createSequentialGroup()
		  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
		  javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) .addComponent(jLabel6)
		  .addGap(63, 63, 63))) .addComponent(jSeparator15,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE)
		  .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addGroup(edit_panelLayout.createSequentialGroup()
		  .addGap(35, 35, 35) .addComponent(cutt, javax.swing.GroupLayout.DEFAULT_SIZE,
		  85, Short.MAX_VALUE) .addGap(35, 35, 35))
		  .addGroup(edit_panelLayout.createSequentialGroup() .addGap(66, 66, 66)
		  .addComponent(jLabel7)
		  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
		  javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		  .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE,
		  javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		  .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addGroup(edit_panelLayout.createSequentialGroup()
		  .addGap(35, 35, 35) .addComponent(coppy,
		  javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE) .addGap(35, 35,
		  35)) .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		  edit_panelLayout.createSequentialGroup()
		  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
		  javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) .addComponent(jLabel8)
		  .addGap(60, 60, 60))) .addComponent(jSeparator17,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE)
		  .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addGroup(edit_panelLayout.createSequentialGroup()
		  .addGap(35, 35, 35) .addComponent(pastee,
		  javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE) .addGap(35, 35,
		  35)) .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		  edit_panelLayout.createSequentialGroup()
		  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
		  javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) .addComponent(jLabel9)
		  .addGap(61, 61, 61))) .addComponent(jSeparator18,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE)
		  .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addGroup(edit_panelLayout.createSequentialGroup()
		  .addGap(35, 35, 35) .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE,
		  85, Short.MAX_VALUE) .addGap(35, 35, 35))
		  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		  edit_panelLayout.createSequentialGroup()
		  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
		  javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		  .addComponent(jLabel10) .addGap(60, 60, 60))) .addComponent(jSeparator19,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE)
		  .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addGroup(edit_panelLayout.createSequentialGroup()
		  .addGap(35, 35, 35) .addComponent(dupli,
		  javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE) .addGap(50, 50,
		  50)) .addGroup(edit_panelLayout.createSequentialGroup() .addGap(56, 56, 56)
		  .addComponent(jLabel11)
		  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))) );
		  edit_panelLayout.setVerticalGroup(
		  edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.
		  LEADING) .addComponent(jSeparator14) .addComponent(jSeparator15)
		  .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.TRAILING)
		  .addComponent(jSeparator17) .addComponent(jSeparator18,
		  javax.swing.GroupLayout.Alignment.TRAILING) .addComponent(jSeparator19,
		  javax.swing.GroupLayout.Alignment.TRAILING)
		  .addGroup(edit_panelLayout.createSequentialGroup()
		  .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addGroup(edit_panelLayout.createSequentialGroup()
		  .addGap(21, 21, 21)
		  .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addComponent(redo,
		  javax.swing.GroupLayout.PREFERRED_SIZE, 73,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(cutt,
		  javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE)))
		  .addGroup(edit_panelLayout.createSequentialGroup() .addGap(21, 21, 21)
		  .addComponent(pastee, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE))
		  .addGroup(edit_panelLayout.createSequentialGroup() .addGap(21, 21, 21)
		  .addComponent(dupli, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE))
		  .addGroup(edit_panelLayout.createSequentialGroup() .addGap(21, 21, 21)
		  .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE))
		  .addGroup(edit_panelLayout.createSequentialGroup() .addGap(21, 21, 21)
		  .addComponent(coppy, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE))
		  .addGroup(edit_panelLayout.createSequentialGroup() .addGap(21, 21, 21)
		  .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
		  javax.swing.GroupLayout.PREFERRED_SIZE)))
		  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		  .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addComponent(jLabel6) .addComponent(jLabel9)
		  .addComponent(jLabel11) .addComponent(jLabel7) .addComponent(jLabel5)
		  .addComponent(jLabel8) .addComponent(jLabel10)) .addContainerGap(32,
		  Short.MAX_VALUE)) );
		  
		         
        

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
		
		  javax.swing.GroupLayout file_panelLayout = new
		  javax.swing.GroupLayout(file_panel); file_panel.setLayout(file_panelLayout);
		  file_panelLayout.setHorizontalGroup(
		  file_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.
		  LEADING) .addGroup(file_panelLayout.createSequentialGroup() .addGap(40, 40,
		  40) .addComponent(new_file, javax.swing.GroupLayout.DEFAULT_SIZE, 79,
		  Short.MAX_VALUE) .addGap(22, 22, 22) .addComponent(jSeparator1,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(22, 22, 22)
		  .addComponent(open_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73,
		  Short.MAX_VALUE) .addGap(22, 22, 22) .addComponent(jSeparator2,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(22, 22, 22)
		  .addComponent(save_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73,
		  Short.MAX_VALUE) .addGap(22, 22, 22) .addComponent(jSeparator3,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(22, 22, 22)
		  .addComponent(saveas_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73,
		  Short.MAX_VALUE) .addGap(22, 22, 22) .addComponent(jSeparator4,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(22, 22, 22)
		  .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, 73,
		  Short.MAX_VALUE) .addGap(22, 22, 22) .addComponent(jSeparator5,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(22, 22, 22)
		  .addComponent(share_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73,
		  Short.MAX_VALUE) .addGap(22, 22, 22) .addComponent(jSeparator6,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(22, 22, 22)
		  .addComponent(import_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73,
		  Short.MAX_VALUE) .addGap(22, 22, 22) .addComponent(jSeparator7,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(22, 22, 22)
		  .addComponent(export_file, javax.swing.GroupLayout.DEFAULT_SIZE, 74,
		  Short.MAX_VALUE) .addGap(22, 22, 22) .addComponent(jSeparator8,
		  javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(22, 22, 22)
		  .addComponent(exit_file, javax.swing.GroupLayout.DEFAULT_SIZE, 74,
		  Short.MAX_VALUE) .addGap(40, 40, 40)) ); file_panelLayout.setVerticalGroup(
		  file_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.
		  LEADING) .addComponent(jSeparator1) .addComponent(jSeparator2,
		  javax.swing.GroupLayout.Alignment.TRAILING) .addComponent(jSeparator3)
		  .addComponent(jSeparator4) .addComponent(jSeparator5)
		  .addComponent(jSeparator6) .addComponent(jSeparator7)
		  .addComponent(jSeparator8) .addGroup(file_panelLayout.createSequentialGroup()
		  .addGroup(file_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addGroup(file_panelLayout.createSequentialGroup()
		  .addGap(21, 21, 21)
		  .addGroup(file_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING)
		  .addGroup(file_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.TRAILING)
		  .addGroup(file_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.LEADING) .addComponent(save_file,
		  javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(share_file,
		  javax.swing.GroupLayout.Alignment.TRAILING,
		  javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE)
		  .addGroup(file_panelLayout.createParallelGroup(javax.swing.GroupLayout.
		  Alignment.BASELINE) .addComponent(import_file,
		  javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(open_file,
		  javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(saveas_file,
		  javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(print,
		  javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE))) .addComponent(new_file,
		  javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE)) .addComponent(exit_file,
		  javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE)))
		  .addGroup(file_panelLayout.createSequentialGroup() .addGap(22, 22, 22)
		  .addComponent(export_file, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
		  javax.swing.GroupLayout.PREFERRED_SIZE))) .addContainerGap(52,
		  Short.MAX_VALUE)) );
		 
        Attribute.add(file_panel, "card3");
		/*
		 * ImageIcon onimg = new ImageIcon("img\\on.png"); ImageIcon fitimg = new
		 * ImageIcon("img\\fit.png"); ImageIcon zoomimg = new
		 * ImageIcon("img\\zoomin.png"); ImageIcon zoutimg = new
		 * ImageIcon("img\\zoomout.png"); ImageIcon cimg = new
		 * ImageIcon("img\\camera.png"); ImageIcon crimg = new
		 * ImageIcon("img\\rotate.png"); ImageIcon cwimg = new
		 * ImageIcon("img\\wide.png"); ImageIcon chimg = new
		 * ImageIcon("img\\height.png");
		 */

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
		  slides.setLayout(slidesLayout); slidesLayout.setHorizontalGroup(
		  slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		  .addGroup(slidesLayout.createSequentialGroup() .addContainerGap()
		  .addComponent(side_slide, javax.swing.GroupLayout.PREFERRED_SIZE, 189,
		  javax.swing.GroupLayout.PREFERRED_SIZE)
		  .addGroup(slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.
		  LEADING) .addGroup(slidesLayout.createSequentialGroup() .addGap(62, 62, 62)
		  .addComponent(main_slide, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		  .addGroup(slidesLayout.createSequentialGroup() .addGap(309, 309, 309)
		  .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE,
		  javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) .addGap(242, 242,
		  242))) .addGap(63, 63, 63)) );        
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
        
		  for(int i=0;i<=14;i++) { msg [i]= new JPanel(new BorderLayout());
		  msg[i].setCursor(new Cursor(Cursor.HAND_CURSOR));		  
		  msg[i].setBackground(Color.white);
			  msg[i].setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1) ); sub = new
			  JLabel("",SwingConstants.CENTER); sub.setText("States: " + states);		  
			  sub.setBorder(BorderFactory.createLineBorder(Color.black)); msg[i].add(sub);
			  msg[i].setPreferredSize(new Dimension(140, 100)); msg[i].setMaximumSize(new		  
			  Dimension(140, 100)); box.add(msg[i]); dis[i]=new Display(this);
			  jsp.setPreferredSize(new Dimension(100, 500));
			  side_slide.add(jsp,BorderLayout.CENTER); states++; } for(int i=1;i<=14;i++) {			  
			   msg[i].setVisible(false); }
			msg[0].addMouseListener(new java.awt.event.MouseAdapter() { public void
			mouseClicked(java.awt.event.MouseEvent evt) { current_slide=0; 
					main_slide.removeAll();
					main_slide.add(dis[0]); main_slide.validate(); main_slide.repaint();
					}}); msg[1].addMouseListener(new
					java.awt.event.MouseAdapter() { public void
					mouseClicked(java.awt.event.MouseEvent evt) { current_slide=1; 
					main_slide.removeAll();
			        main_slide.add(dis[1]);
					main_slide.validate(); main_slide.repaint(); 
					}}); 
			msg[2].addMouseListener(new java.awt.event.MouseAdapter() { public void
			mouseClicked(java.awt.event.MouseEvent evt) { current_slide=2; 
			main_slide.removeAll(); main_slide.add(dis[2]);	
			main_slide.validate(); main_slide.repaint(); 
			}}); msg[3].addMouseListener(new java.awt.event.MouseAdapter() { public void				
			mouseClicked(java.awt.event.MouseEvent evt) { current_slide=3; 
			main_slide.removeAll(); main_slide.add(dis[3]);
			main_slide.validate(); main_slide.repaint(); 
			}}); msg[4].addMouseListener(new java.awt.event.MouseAdapter() { public void
			mouseClicked(java.awt.event.MouseEvent evt) { current_slide=4; 			
			main_slide.removeAll(); main_slide.add(dis[4]);
			main_slide.validate(); main_slide.repaint();
			}}); msg[5].addMouseListener(new java.awt.event.MouseAdapter() { public void
			mouseClicked(java.awt.event.MouseEvent evt) {current_slide=5;  
			main_slide.removeAll(); main_slide.add(dis[5]);
			main_slide.validate(); main_slide.repaint(); 
			}}); msg[6].addMouseListener(new java.awt.event.MouseAdapter() { public void
			mouseClicked(java.awt.event.MouseEvent evt) {current_slide=6; 		
     		main_slide.removeAll(); main_slide.add(dis[6]);
			main_slide.validate(); main_slide.repaint(); 
			}}); msg[7].addMouseListener(new java.awt.event.MouseAdapter() { public void
			mouseClicked(java.awt.event.MouseEvent evt) {current_slide=7;  	
			main_slide.removeAll(); main_slide.add(dis[7]);
			main_slide.validate(); main_slide.repaint(); 
			}}); msg[8].addMouseListener(new java.awt.event.MouseAdapter() { public void
			mouseClicked(java.awt.event.MouseEvent evt) { current_slide=8; 	
			main_slide.removeAll(); main_slide.add(dis[8]);
			main_slide.validate(); main_slide.repaint();
			}}); 
			msg[9].addMouseListener(new java.awt.event.MouseAdapter() { public void
			mouseClicked(java.awt.event.MouseEvent evt) { current_slide=9; 
			
			main_slide.removeAll(); main_slide.add(dis[9]);
			main_slide.validate(); main_slide.repaint(); 
				}}); msg[10].addMouseListener(new java.awt.event.MouseAdapter() { public void
				mouseClicked(java.awt.event.MouseEvent evt) { current_slide=10;
				main_slide.removeAll(); main_slide.add(dis[10]);
				main_slide.validate(); main_slide.repaint(); previous_slide=current_slide;
				}}); msg[11].addMouseListener(new java.awt.event.MouseAdapter() { public void
				mouseClicked(java.awt.event.MouseEvent evt) { current_slide=11;
				
				main_slide.removeAll(); main_slide.add(dis[current_slide]);
				main_slide.validate(); main_slide.repaint();
				}});msg[12].addMouseListener(new java.awt.event.MouseAdapter() { public void
			    mouseClicked(java.awt.event.MouseEvent evt) { current_slide=12;	
				main_slide.removeAll(); main_slide.add(dis[current_slide]);
				main_slide.validate(); main_slide.repaint();
			}});msg[13].addMouseListener(new java.awt.event.MouseAdapter() { public void
				mouseClicked(java.awt.event.MouseEvent evt) { current_slide=13;		
			main_slide.removeAll(); main_slide.add(dis[current_slide]);
			main_slide.validate(); main_slide.repaint();
			}});msg[14].addMouseListener(new java.awt.event.MouseAdapter() { public void
			mouseClicked(java.awt.event.MouseEvent evt) { current_slide=14;
			main_slide.removeAll(); main_slide.add(dis[current_slide]);
			main_slide.validate(); main_slide.repaint();
			}});
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
open_file.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ft.loadFile();
        		
        	}
        });

 undo.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		dis[current_slide].undo();
	}
});  
 redo.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		dis[current_slide].redo();
	}
});
save_file.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
           		ft.saveFile(current_state);
        		saved=true;
        	}
        });

jButton1.addMouseListener(new MouseAdapter() {
	@Override
	public void mousePressed(MouseEvent e) {
		dis[0].selectedShape=6;
		control.present(dis[0]);
	}
});

//-------------------------------------------------------------------------------------------------------------------------
jButton3.addMouseListener(new MouseAdapter() {
	@SuppressWarnings("static-access")
	@Override
	public void mouseClicked(MouseEvent e) {

		transition();
	

	}});



new_file.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		if(!saved) {int reply = JOptionPane.showConfirmDialog(null, "File is not saved do you want new File?", "WARNING", JOptionPane.YES_NO_OPTION);
		    if(reply==JOptionPane.YES_OPTION) {
		    	ft.saveFile(current_state);
        		saved=true;
       		clear();        		
		    }
		    else {
		    	saved=false;
		    	clear();   	}
		}
		else
			clear();}


});


dslide.addMouseListener(new MouseAdapter() {
	@Override
	public void mousePressed(MouseEvent e) {	
		dis[current_state].clear();
		if(current_state!=0) 
		msg[current_state].setVisible(false);
		if(current_state==0) {
			current_state=0;}
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
oval.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		dis[current_slide].setShape(1);	}
});

aa.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		dis[current_slide].setShape(5);

	}
});

circle.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	dis[current_slide].setShape(0); 
        	
        	} });
rect.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        dis[current_slide].setShape(3);  	
        	}});
movee.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		dis[current_slide].setShape(-1);          		
	}});

square.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		dis[current_slide].setShape(3);   
	}});

line.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent e) {
		dis[current_slide].setShape(4);
	}
});

        pack();
    }
    
 private void presn_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource()==presn_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
            presn_panel.setVisible(true);
            trans_panel.setVisible(false);
        }
    }
private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {
          if (evt.getSource()==home_button){
            file_panel.setVisible(false);
            home_panel.setVisible(true);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
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
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }
    @SuppressWarnings("unused")
	private void camera_buttonMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource()==camera_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
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
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }
 

   
    private void exit_fileMouseClicked(java.awt.event.MouseEvent evt) {
    	
    if(!saved) {ft.saveFile(current_state);
        System.exit(0);
    }
        else
        System.exit(0);
    }
 
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
     String value = jComboBox1.getSelectedItem().toString();
     System.out.println(value);
     control.ft.setfont(value);
    }
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
     String value = jComboBox2.getSelectedItem().toString();
     int i=Integer.parseInt(value);
     control.ft.setsize(i);
     System.out.println(i);
    }

    private void color_fileMouseClicked(java.awt.event.MouseEvent evt) {
            @SuppressWarnings("unused")
			Color c=JColorChooser.showDialog(this,"Choose",null); 
            control.ft.setcolor(c);
       

    }

    public void addslideMouseClicked() {

         this.msg[states]=control.getAdd(states);   
         msg[states].setCursor(new Cursor(Cursor.HAND_CURSOR));        
         box.add(msg[states]);
         jsp.setPreferredSize(new Dimension(100, 500));
         display[states]=control.getMain(states);          
         side_slide.validate();
         this.validate();
         states++;

    }
 public void addshape(JPanel p) {
             dis[current_state].add(p);
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

public JPanel getPanel(int index) {
	dis[index].selectedShape=6;
	return dis[index];
}
public Display getDisplay(int index) {
	
	return dis[index];
}

public int state()
{
  return current_state;	
}
public void error() {
	JOptionPane.showMessageDialog(this,
		    "",
		    "warning",
		    JOptionPane.WARNING_MESSAGE);	
}
public void clear() {
	for(int i=0;i<=current_state;i++) {
		dis[i].clear();
		if(i!=0) 
		msg[i].setVisible(false);
	}
	current_state=0;
}
public void addDisplay(int indi,Display d) {
	msg[indi].setVisible(true);
	dis[indi]=d;
	current_state++;
}


 public void transition() {
if(tran==0) {
	JPanel p=dis[current_slide];
	current_slide++;
	JPanel p3=dis[current_slide];
	JPanel p2=new JPanel();
	p2.setBackground(Color.red);
		main_slide.removeAll();
		main_slide.add(jp);	
		jp.add(p);
		jp.add(p3);
		jp.nextPanel(50,p3, jp.right);
		
		tran++;
		}
else {
    jp.removeAll();
    main_slide.remove(jp);
    main_slide.repaint();
    main_slide.revalidate(); 
    main_slide.add(dis[current_slide]);
    tran=0;
}
 }

     public int index=0;
	 public  int current_state=0;
	 public int previous=-1;
	 Display d=new Display(this);	 
	 Controller control=new Controller(this,d);    
	 public JPanel msg[] = new JPanel[1000];
	 JPanel display[]=new JPanel[1000];	 
	 Display dis[]=new Display[100];
	 Display p1=new Display(this);	 
	 public int current_slide=0;
	 public int previous_slide=0;	 
	 public JPanel main_slide;
     public int states=0;
	 JLabel sub = null;
	 Box box = new Box(BoxLayout.Y_AXIS);
	 JScrollPane jsp = new JScrollPane(box);
	 StateManager sm=new StateManager();
     private javax.swing.JPanel Attribute;
    private javax.swing.JLabel aa;
    private javax.swing.JLabel addslide;
    private java.awt.Button camera_button;
    private javax.swing.JButton circle;
    private javax.swing.JLabel color_file;
    private javax.swing.JLabel coppy;
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
    private javax.swing.JLabel grid;
    private java.awt.Button home_button;
    private javax.swing.JPanel home_panel;
    private javax.swing.JLabel import_file;
    private javax.swing.JButton jButton1;
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
    private java.awt.Button trans_button;
    private javax.swing.JPanel trans_panel;
    private javax.swing.JLabel undo;
    private java.awt.Button view_button;
    private javax.swing.JPanel view_panel;
    private javax.swing.JLabel visibility;
	public boolean saved=false;
    Filter ft=new Filter(d,control,this);
    Timer time;
	JPanelSlider jp=new JPanelSlider();
    int tran=0;
}
