package hw;

/**
 * Hello world!
 *
 */
public class SimpleWindow extends JFrame implements ActionListener {
    JFrame frame;
    JPanel buttonPane, fieldsPanel;
    JLabel message;
    JTextField messageField;
    JButton ok;

    private SimpleWindow() {
        frame = new JFrame("еху");
        buttonPane = new JPanel();
        fieldsPanel = new JPanel();
        message = new JLabel("message");
        messageField = new JTextField("");
        ok = new JButton("OK");

        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.PAGE_AXIS));
        buttonPane.setLayout(new FlowLayout());
        ok.addActionListener(this);

        fieldsPanel.add(message);
        fieldsPanel.add(messageField);
        buttonPane.add(ok);

        frame.add(fieldsPanel, BorderLayout.PAGE_START);
        frame.add(buttonPane, BorderLayout.PAGE_END);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print("sdf");
    }
}

