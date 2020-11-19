package prezooom.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import prezooom.app.Controller.exit;
import prezooom.app.Controller.main;
import prezooom.app.Controller.panelinfo;
import prezooom.app.Model.ComponentResizer;
import prezooom.app.Model.ComponentMover;
import prezooom.app.Model.Filefilter;


public class MainFrame extends javax.swing.JFrame {

    private main mn=new main();
    public int count=0;
    
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
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
        fill = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        aa = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        rectangle = new javax.swing.JLabel();
        square = new javax.swing.JLabel();
        oval = new javax.swing.JLabel();
        circle = new javax.swing.JLabel();
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
        presn_panel = new javax.swing.JPanel();
        edit_panel = new javax.swing.JPanel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        undo = new javax.swing.JLabel();
        redo = new javax.swing.JLabel();
        cutt = new javax.swing.JLabel();
        coppy = new javax.swing.JLabel();
        pastee = new javax.swing.JLabel();
        del = new javax.swing.JLabel();
        dupli = new javax.swing.JLabel();
        grop = new javax.swing.JLabel();
        rotat = new javax.swing.JLabel();
        timeline = new javax.swing.JLabel();
        pathh = new javax.swing.JLabel();
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
        home_button = new java.awt.Button();
        edit_button = new java.awt.Button();
        view_button = new java.awt.Button();
        camera_button = new java.awt.Button();
        trans_button = new java.awt.Button();
        presn_button = new java.awt.Button();
        slides = new javax.swing.JLayeredPane();
        main_slide = new javax.swing.JPanel();
        side_slide = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        Icon backb = new ImageIcon("img\\back.png");
        back1 = new javax.swing.JButton(backb);
        Icon bksped = new ImageIcon("img\\bspeed.png");
        bkspeed = new javax.swing.JButton(bksped);
        Icon farwd = new ImageIcon("img\\forward.png");
        forward1 = new javax.swing.JButton(farwd);
        Icon fsped = new ImageIcon("img\\fspeed.png");
        fspeed = new javax.swing.JButton(fsped);
        Icon ps = new ImageIcon("img\\pause.png");
        pastop = new javax.swing.JButton(ps);
        searchfield = new javax.swing.JTextField();
        Icon icon = new ImageIcon("img\\search.png");
        search_btn = new javax.swing.JButton(icon);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prezoom");
        setBackground(new java.awt.Color(204, 204, 255));

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

        height_field.setText("jTextField2");
        height_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                height_fieldActionPerformed(evt);
            }
        });

        color_file.setText("color");
        color_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon colorimg = new ImageIcon("img\\color.png");
        color_file.setIcon(colorimg);
        color_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color_fileMouseClicked(evt);
            }
        });

        addslide.setText("addslide");
        addslide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon slideimg = new ImageIcon("img\\addslide.png");
        addslide.setIcon(slideimg);
        addslide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addslideMouseClicked(evt);
            }
        });

        fill.setText("fill");
        fill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon fillimg = new ImageIcon("img\\fill.png");
        fill.setIcon(fillimg);

        text.setText("jTextField2");
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        aa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aa.setText("Aa");
        aa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        rectangle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rectangle.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        ImageIcon rectimg = new ImageIcon("img\\rect.png");
        rectangle.setIcon(rectimg);
        rectangle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rectangleMouseClicked(evt);
            }
        });
        rectangle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rectangleKeyTyped(evt);
            }
        });

        square.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        square.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        ImageIcon sqimg = new ImageIcon("img\\square.png");
        square.setIcon(sqimg);

        oval.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oval.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        ImageIcon ovimg = new ImageIcon("img\\oval.png");
        oval.setIcon(ovimg);

        circle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        circle.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        ImageIcon cirimg = new ImageIcon("img\\circle.png");
        circle.setIcon(cirimg);

        javax.swing.GroupLayout home_panelLayout = new javax.swing.GroupLayout(home_panel);
        home_panel.setLayout(home_panelLayout);
        home_panelLayout.setHorizontalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(width, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(height, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(height_field)
                    .addComponent(width_field))
                .addGap(22, 22, 22)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rectangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oval, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(square, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(circle, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(color_file, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(addslide, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(fill, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(height_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(color_file, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(addslide, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(fill, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jComboBox2)))
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rectangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(square, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(circle, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
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
                .addComponent(sizee, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(outline, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(grid, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(position, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(depth, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(orien, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(visibility, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
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
                .addContainerGap(71, Short.MAX_VALUE))
        );

        Attribute.add(view_panel, "card4");

        trans_panel.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout trans_panelLayout = new javax.swing.GroupLayout(trans_panel);
        trans_panel.setLayout(trans_panelLayout);
        trans_panelLayout.setHorizontalGroup(
            trans_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        trans_panelLayout.setVerticalGroup(
            trans_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        Attribute.add(trans_panel, "card6");

        presn_panel.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout presn_panelLayout = new javax.swing.GroupLayout(presn_panel);
        presn_panel.setLayout(presn_panelLayout);
        presn_panelLayout.setHorizontalGroup(
            presn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        presn_panelLayout.setVerticalGroup(
            presn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
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

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator22.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator23.setOrientation(javax.swing.SwingConstants.VERTICAL);

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

        grop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon grpimg = new ImageIcon("img\\group.png");
        grop.setIcon(grpimg);

        rotat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon rotimg = new ImageIcon("img\\rotate.png");
        rotat.setIcon(rotimg);

        timeline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon timimg = new ImageIcon("img\\timeline.png");
        timeline.setIcon(timimg);

        pathh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pathh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon pathimg = new ImageIcon("img\\path.png");
        pathh.setIcon(pathimg);

        javax.swing.GroupLayout edit_panelLayout = new javax.swing.GroupLayout(edit_panel);
        edit_panel.setLayout(edit_panelLayout);
        edit_panelLayout.setHorizontalGroup(
            edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(undo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(redo, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cutt, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coppy, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pastee, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dupli, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grop, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotat, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timeline, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pathh, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
        edit_panelLayout.setVerticalGroup(
            edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator14)
            .addComponent(jSeparator15)
            .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator17)
            .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator20, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator21, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator22)
            .addComponent(jSeparator23, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(edit_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(undo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cutt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coppy, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pastee, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dupli, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grop, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotat, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeline, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pathh, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
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
        new_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_fileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                new_fileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                new_fileMouseExited(evt);
            }
        });

        open_file.setBackground(new java.awt.Color(51, 255, 51));
        open_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        open_file.setText("open");
        open_file.setToolTipText("Open");
        open_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon openimg = new ImageIcon("img\\open1.png");
        open_file.setIcon(openimg);
        open_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                open_fileMouseClicked(evt);
            }
        });

        save_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save_file.setText("save");
        save_file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImageIcon saveimg = new ImageIcon("img\\save1.png");
        save_file.setIcon(saveimg);
        save_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_fileMouseClicked(evt);
            }
        });

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
                .addComponent(new_file, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(open_file, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(save_file, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(saveas_file, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(share_file, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(import_file, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(export_file, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(exit_file, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
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
                .addContainerGap(70, Short.MAX_VALUE))
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
                .addComponent(onn, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(camera_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(w1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hh, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(camera_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(fit, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(zoomin, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(zoomout, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(camera, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crotate, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
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
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Attribute.add(camera_panel, "card5");

        file_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        file_button.setLabel("File");
        file_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                file_buttonMouseClicked(evt);
            }
        });
        file_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_buttonActionPerformed(evt);
            }
        });

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
        camera_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                camera_buttonMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout main_slideLayout = new javax.swing.GroupLayout(main_slide);
        main_slide.setLayout(main_slideLayout);
        main_slideLayout.setHorizontalGroup(
            main_slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        main_slideLayout.setVerticalGroup(
            main_slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );

        side_slide.setBackground(new java.awt.Color(255, 255, 255));
        side_slide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout side_slideLayout = new javax.swing.GroupLayout(side_slide);
        side_slide.setLayout(side_slideLayout);
        side_slideLayout.setHorizontalGroup(
            side_slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        side_slideLayout.setVerticalGroup(
            side_slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );

        back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bkspeed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        forward1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forward1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forward1ActionPerformed(evt);
            }
        });

        fspeed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pastop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        slides.setLayer(main_slide, javax.swing.JLayeredPane.DEFAULT_LAYER);
        slides.setLayer(side_slide, javax.swing.JLayeredPane.DEFAULT_LAYER);
        slides.setLayer(jProgressBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        slides.setLayer(back1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        slides.setLayer(bkspeed, javax.swing.JLayeredPane.DEFAULT_LAYER);
        slides.setLayer(forward1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        slides.setLayer(fspeed, javax.swing.JLayeredPane.DEFAULT_LAYER);
        slides.setLayer(pastop, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout slidesLayout = new javax.swing.GroupLayout(slides);
        slides.setLayout(slidesLayout);
        slidesLayout.setHorizontalGroup(
            slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slidesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(side_slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(slidesLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(main_slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(152, 152, 152))
                    .addGroup(slidesLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(slidesLayout.createSequentialGroup()
                                .addComponent(back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(bkspeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(pastop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(fspeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(forward1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(277, 277, 277))))
        );
        slidesLayout.setVerticalGroup(
            slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slidesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(side_slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(slidesLayout.createSequentialGroup()
                        .addComponent(main_slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(slidesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(back1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bkspeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fspeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(forward1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pastop, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGap(7, 7, 7)))
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
                .addComponent(Attribute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slides))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void presn_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presn_buttonActionPerformed
        // TODO add your handling code here:
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

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_buttonActionPerformed
        // TODO add your handling code here:
          if (evt.getSource()==home_button){
            file_panel.setVisible(false);
            home_panel.setVisible(true);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }//GEN-LAST:event_home_buttonActionPerformed

    private void file_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_file_buttonMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==file_button){
            file_panel.setVisible(true);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }//GEN-LAST:event_file_buttonMouseClicked

    private void view_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_buttonMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==view_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(true);
            camera_panel.setVisible(false);
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }//GEN-LAST:event_view_buttonMouseClicked

    private void camera_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_camera_buttonMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==camera_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
            camera_panel.setVisible(true);
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }//GEN-LAST:event_camera_buttonMouseClicked

    private void trans_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trans_buttonMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==trans_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            view_panel.setVisible(false);
            edit_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(false);
            trans_panel.setVisible(true);
        }
    }//GEN-LAST:event_trans_buttonMouseClicked

    private void presn_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presn_buttonMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==presn_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(false);
            view_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(true);
            trans_panel.setVisible(false);
        }
    }//GEN-LAST:event_presn_buttonMouseClicked

    private void edit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_buttonMouseClicked
        // TODO add your handling code here:
        if (evt.getSource()==edit_button){
            file_panel.setVisible(false);
            home_panel.setVisible(false);
            edit_panel.setVisible(true);
            view_panel.setVisible(false);
            camera_panel.setVisible(false);
            presn_panel.setVisible(false);
            trans_panel.setVisible(false);
        }
    }//GEN-LAST:event_edit_buttonMouseClicked

    private void new_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_fileMouseClicked
            System.out.print("work");
    }//GEN-LAST:event_new_fileMouseClicked

    private void new_fileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_fileMouseEntered
        // TODO add your handling code here:
               
		
    }//GEN-LAST:event_new_fileMouseEntered

    private void new_fileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_fileMouseExited
        // TODO add your handling code here: 
     
    }//GEN-LAST:event_new_fileMouseExited

    private void exit_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_fileMouseClicked
        new exit();
        System.exit(0);
    }//GEN-LAST:event_exit_fileMouseClicked

    private void height_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_height_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_height_fieldActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        // TODO add your handling code here:
     //System.out.println(mn.getfont());
     String value = jComboBox1.getSelectedItem().toString();
     mn.setfont(value);
     System.out.println(value);
     
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_textActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        
     String value = jComboBox2.getSelectedItem().toString();
     int i=Integer.parseInt(value);
     mn.setsize(i);
     System.out.println(i);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void color_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color_fileMouseClicked
        // TODO add your handling code here:
            Color c=JColorChooser.showDialog(this,"Choose",null); 
            mn.setcolor(c);

    }//GEN-LAST:event_color_fileMouseClicked

    private void forward1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forward1ActionPerformed
        // TODO add your handling code here:
        
        //jPanelSlider3.nextPanel(40,jPanel2,jPanelSlider1.right);
    }//GEN-LAST:event_forward1ActionPerformed

    private void addslideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addslideMouseClicked
        // TODO add your handling code here:
        
        //addpanel p=addpanel.instant();
        //addpanel p=new addpanel(side_slide);
       // p.add(side_slide);
       
       panelinfo pi;
            JPanel mainList;     
            side_slide.setLayout(new BorderLayout());
          
            mainList = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.weightx = 1;
            gbc.weighty = 1;
            mainList.add(new JPanel(), gbc);

            side_slide.add(new JScrollPane(mainList));
            pi=panelinfo.instance();
           
            int i=pi.total_p();
            System.out.println(i);
  
            JPanel j[] = new JPanel[1000];
            j[i]=new JPanel();
                    
            JPanel panel = new JPanel();
              panel.add(new JLabel("Hello"));
            panel.add(j[i]);
            // j[i].setText("Label"+i);
                   
            panel.setBorder(new MatteBorder(3, 3, 3, 3, Color.GRAY));
            GridBagConstraints gb = new GridBagConstraints();
            gb.gridwidth = GridBagConstraints.REMAINDER;
            gb.weightx = 1;
            gb.fill = GridBagConstraints.HORIZONTAL;
            mainList.add(panel, gb, 0);
            side_slide.add(mainList);

            pi.addpanel();
            i++;
            side_slide.validate();
            side_slide.repaint();
   
    
    }//GEN-LAST:event_addslideMouseClicked

    private void rectangleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectangleMouseClicked
        // TODO add your handling code here:        
    ComponentResizer cr = new ComponentResizer();
    ComponentMover cm = new ComponentMover();
    JTextArea a=new JTextArea();
    JTextField b=new JTextField();
    
    cr.registerComponent(a);
    cm.registerComponent(a);
   
    a.setBackground(Color.red);
 
    b.setBounds(50, 50, 150, 150);
      main_slide.add(b);
    }//GEN-LAST:event_rectangleMouseClicked

    private void open_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_open_fileMouseClicked
        // TODO add your handling code here:
        Filefilter fl=new Filefilter();
        fl.loadFile();
    }//GEN-LAST:event_open_fileMouseClicked

    private void save_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_fileMouseClicked
        // TODO add your handling code here:
        
        Filefilter fl=new Filefilter();
        fl.saveFile("new file.txt");
    }//GEN-LAST:event_save_fileMouseClicked

    private void rectangleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rectangleKeyTyped
    ComponentMover cm = new ComponentMover();
    ComponentResizer cr = new ComponentResizer();
    JTextArea a=new JTextArea();
    JTextField b=new JTextField();
    b.setFont(new Font(mn.getfont(),Font.PLAIN,mn.getsize()));
    
    cr.registerComponent(a);
    cm.registerComponent(a);
   
    a.setBackground(Color.red);
    a.setForeground(mn.getcolor());
    main_slide.add(b);
    b.setBounds(50, 50, 150, 150);
      main_slide.add(b);        // TODO add your handling code here:
    }//GEN-LAST:event_rectangleKeyTyped

    private void file_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_file_buttonActionPerformed

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Attribute;
    private javax.swing.JLabel aa;
    private ImageIcon aimg;
    private javax.swing.JLabel addslide;
    private ImageIcon slideimg;
    private javax.swing.JButton back1;
    private javax.swing.JButton bkspeed;
    private javax.swing.JLabel camera;
    private ImageIcon cimg;
    private java.awt.Button camera_button;
    private javax.swing.JPanel camera_panel;
    private javax.swing.JLabel circle;
    private ImageIcon cirimg;
    private javax.swing.JLabel color_file;
    private ImageIcon colorimg;
    private javax.swing.JLabel coppy;
    private ImageIcon copyimg;
    private javax.swing.JLabel crotate;
    private ImageIcon crimg;
    private javax.swing.JLabel cutt;
    private ImageIcon cutimg;
    private javax.swing.JLabel del;
    private ImageIcon delimg;
    private javax.swing.JLabel depth;
    private ImageIcon depimg;
    private javax.swing.JLabel dupli;
    private ImageIcon dupliimg;
    private java.awt.Button edit_button;
    private javax.swing.JPanel edit_panel;
    private javax.swing.JLabel exit_file;
    private ImageIcon exitimg;
    private javax.swing.JLabel export_file;
    private ImageIcon exportimg;
    private java.awt.Button file_button;
    private javax.swing.JPanel file_panel;
    private javax.swing.JLabel fill;
    private ImageIcon fillimg;
    private javax.swing.JLabel fit;
    private ImageIcon fitimg;
    private javax.swing.JButton forward1;
    private javax.swing.JButton fspeed;
    private javax.swing.JLabel grid;
    private ImageIcon gimg;
    private javax.swing.JLabel grop;
    private ImageIcon grpimg;
    private javax.swing.JLabel height;
    private ImageIcon heightimg;
    private javax.swing.JTextField height_field;
    private javax.swing.JLabel hh;
    private ImageIcon chimg;
    private java.awt.Button home_button;
    private javax.swing.JPanel home_panel;
    private javax.swing.JLabel import_file;
    private ImageIcon importimg;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
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
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel main_slide;
    private javax.swing.JLabel new_file;
    private ImageIcon img;
    private javax.swing.JLabel onn;
    private ImageIcon onimg;
    private javax.swing.JLabel open_file;
    private ImageIcon openimg;
    private javax.swing.JLabel orien;
    private ImageIcon oreimg;
    private javax.swing.JLabel outline;
    private ImageIcon outimg;
    private javax.swing.JLabel oval;
    private ImageIcon ovimg;
    private javax.swing.JLabel pastee;
    private ImageIcon pasteimg;
    private javax.swing.JButton pastop;
    private javax.swing.JLabel pathh;
    private ImageIcon pathimg;
    private javax.swing.JLabel position;
    private ImageIcon posimg;
    private java.awt.Button presn_button;
    private javax.swing.JPanel presn_panel;
    private javax.swing.JLabel print;
    private ImageIcon printimg;
    private javax.swing.JLabel rectangle;
    private ImageIcon rectimg;
    private javax.swing.JLabel redo;
    private ImageIcon redoimg;
    private javax.swing.JLabel rotat;
    private ImageIcon rotimg;
    private javax.swing.JLabel save_file;
    private ImageIcon saveimg;
    private javax.swing.JLabel saveas_file;
    private ImageIcon saveas;
    private javax.swing.JButton search_btn;
    private Icon icon;
    private javax.swing.JTextField searchfield;
    private javax.swing.JLabel share_file;
    private ImageIcon shareimg;
    private javax.swing.JPanel side_slide;
    private javax.swing.JLabel sizee;
    private ImageIcon sizeimg;
    private javax.swing.JLayeredPane slides;
    private javax.swing.JLabel square;
    private ImageIcon sqimg;
    private javax.swing.JTextField text;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private javax.swing.JLabel timeline;
    private ImageIcon timeimg;
    private java.awt.Button trans_button;
    private javax.swing.JPanel trans_panel;
    private javax.swing.JLabel undo;
    private ImageIcon undoimg;
    private java.awt.Button view_button;
    private javax.swing.JPanel view_panel;
    private javax.swing.JLabel visibility;
    private ImageIcon visimg;
    private javax.swing.JLabel w1;
    private ImageIcon cwimg;
    private javax.swing.JLabel width;
    private ImageIcon widthimg;
    private javax.swing.JTextField width_field;
    private javax.swing.JLabel zoomin;
    private ImageIcon zoomimg;
    private javax.swing.JLabel zoomout;
    private ImageIcon zoutimg;
    // End of variables declaration//GEN-END:variables
}
