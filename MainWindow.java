package home3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends FrameWindow implements ActionListener {
    private static final String MAIN_TITLE = "Main Window";
    private static final String TEXTFIELD_WINDOW_TITLE = "TextField Window";
    private static final String LABEL_WINDOW_TITLE = "Label Window";
    private static final String REGISTER_TEXTFIELD_OBSERVER_BUTTON_TITLE = "Register TextField Window Observer";
    private static final String UNREGISTER_TEXTFIELD_OBSERVER_BUTTON_TITLE = "Unregister TextField Window Observer";
    private static final String REGISTER_LABEL_OBSERVER_BUTTON_TITLE = "Register Label Window Observer";
    private static final String UNREGISTER_LABEL_OBSERVER_BUTTON_TITLE = "Unregister Label Window Observer";
    private static final String STOP_THREAD_BUTTON_TITLE = "Stop Generating Prime Number";
    private static final int X = 250;
    private static final int Y = 100;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 200;
    private static final int GAP = 50;
    private static final int NUM_BUTTONS = 3;

    private boolean textFieldWindowRegistered;
    private boolean labelWindowRegistered;
    private JButton stopButton;
    private JButton updateTextFieldObserverButton;
    private JButton updateLabelObserverButton;
    private PrimeObservableThread primeThread;
    private TextFieldWindow textFieldWindow;
    private LabelWindow labelWindow;

    public MainWindow(String title) {
        super(title, X, Y, WIDTH, HEIGHT);
        textFieldWindow = new TextFieldWindow(TEXTFIELD_WINDOW_TITLE, X, Y + HEIGHT + GAP, WIDTH, HEIGHT);
        labelWindow = new LabelWindow(LABEL_WINDOW_TITLE, X, Y + (HEIGHT + GAP) * 2, WIDTH, HEIGHT);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                primeThread.stopRunning();
                textFieldWindow.closeWindow();
                labelWindow.closeWindow();
                System.exit(0);
            }
        });

        primeThread = new PrimeObservableThread(); // 媛앹껜 �깮�꽦
        primeThread.registerObserver(textFieldWindow);
        textFieldWindowRegistered = true;
        primeThread.registerObserver(labelWindow);
        labelWindowRegistered = true;
        primeThread.run();  // �냼�닔 �깮�꽦 �떆�옉. �씠 �븿�닔媛� �떎�뻾�맂 �썑�뿉�뒗 stopButton�씠 �닃由ш린 �쟾源뚯� 臾댄븳 諛섎났�맖
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(width, height));
        updateTextFieldObserverButton = createButton(UNREGISTER_TEXTFIELD_OBSERVER_BUTTON_TITLE, this, width, height);
        panel.add(updateTextFieldObserverButton);
        updateLabelObserverButton = createButton(UNREGISTER_LABEL_OBSERVER_BUTTON_TITLE, this, width, height);
        panel.add(updateLabelObserverButton);
        stopButton = createButton(STOP_THREAD_BUTTON_TITLE, this, width, height);
        panel.add(stopButton);
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == updateTextFieldObserverButton) {
//            textFieldWindow.updateText("" + primeThread.getPrimeNumber());
            if (textFieldWindowRegistered) {
                primeThread.unregisterObserver(textFieldWindow);
                textFieldWindowRegistered = false;
                updateTextFieldObserverButton.setText(REGISTER_TEXTFIELD_OBSERVER_BUTTON_TITLE);
            }
            else {
                primeThread.registerObserver(textFieldWindow);
                textFieldWindowRegistered = true;
                updateTextFieldObserverButton.setText(UNREGISTER_TEXTFIELD_OBSERVER_BUTTON_TITLE);
            }
        }
        else if (e.getSource() == updateLabelObserverButton) {
//            labelWindow.updateText("" + primeThread.getPrimeNumber());
            if (labelWindowRegistered) {
                primeThread.unregisterObserver(labelWindow);
                labelWindowRegistered = false;
                updateLabelObserverButton.setText(REGISTER_LABEL_OBSERVER_BUTTON_TITLE);
            }
            else {
                primeThread.registerObserver(labelWindow);
                labelWindowRegistered = true;
                updateLabelObserverButton.setText(UNREGISTER_LABEL_OBSERVER_BUTTON_TITLE);
            }
        }
        else if (e.getSource() == stopButton) {
            primeThread.stopRunning();
        }
    }

    private JButton createButton(String text, ActionListener listener, int width, int height) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        Dimension buttonDimension = new Dimension(width, height / NUM_BUTTONS);
        button.setMaximumSize(buttonDimension);
        button.setMinimumSize(buttonDimension);
        button.setPreferredSize(buttonDimension);
        return button;
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow(MainWindow.MAIN_TITLE);
    }
}
