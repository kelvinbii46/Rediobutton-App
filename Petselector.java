import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Petselector extends JFrame implements ActionListener {
    private JLabel petLabel;
    private JRadioButton birdButton;
    private JRadioButton catButton; 
    private JRadioButton dogButton; 
    private JRadioButton rabbitButton; 
    private JRadioButton pigButton;
    private ButtonGroup group;

    public Petselector() {
        setTitle("Pet Selector");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create label to display selected pet
        petLabel = new JLabel("Select a pet", SwingConstants.CENTER);
        petLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(petLabel, BorderLayout.CENTER);

        // Panel for radio buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1));

        // Create radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Add action listeners
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Group radio buttons
        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Add buttons to panel
        buttonPanel.add(birdButton);
        buttonPanel.add(catButton);
        buttonPanel.add(dogButton);
        buttonPanel.add(rabbitButton);
        buttonPanel.add(pigButton);

        add(buttonPanel, BorderLayout.WEST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == birdButton) {
            petLabel.setText("Bird selected");
        } else if (e.getSource() == catButton) {
            petLabel.setText("Cat selected");
        } else if (e.getSource() == dogButton) {
            petLabel.setText("Dog selected");
        } else if (e.getSource() == rabbitButton) {
            petLabel.setText("Rabbit selected");
        } else if (e.getSource() == pigButton) {
            petLabel.setText("Pig selected");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Petselector selector = new Petselector();
            selector.setVisible(true);
        });
    }
}
