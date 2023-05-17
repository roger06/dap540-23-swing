import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    BottomPanel bottomPanel;
    JPanel centrePanel;
    JLabel mainLabel;

    public MainFrame() {

        JFrame myFrame = new JFrame("My jfunky GUI");
//        todo remove as is a JFrame

        myFrame.setSize(400,400);

        myFrame.setLayout(new BorderLayout());

        System.out.println("I am going to open a window");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocation(110, 110 );

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.BLUE);
        topPanel.setPreferredSize(new Dimension(100, 80));

        bottomPanel = new BottomPanel();
        bottomPanel.setBackground(Color.GREEN);
        bottomPanel.setPreferredSize(new Dimension(100, 80));
        bottomPanel.myBtn.addActionListener(this);


//        JPanel leftPanel = new JPanel();
//        leftPanel.setBackground(Color.RED);
//        leftPanel.setPreferredSize(new Dimension(50,0));


        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.ORANGE);
        rightPanel.setPreferredSize(new Dimension(50,0));

        centrePanel = new JPanel();
        centrePanel.setBackground(Color.WHITE);
        mainLabel = new JLabel("Hello world!!!");
        centrePanel.add(mainLabel);


        myFrame.add(topPanel, BorderLayout.NORTH);
        myFrame.add(bottomPanel, BorderLayout.SOUTH);
//        myFrame.add(leftPanel, BorderLayout.WEST);
        myFrame.add(rightPanel, BorderLayout.EAST);
        myFrame.add(centrePanel, BorderLayout.CENTER);

       myFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bottomPanel.myBtn ){
            this.mainLabel.setText("sdkfhksjdhfkj");
        }
    }
}
