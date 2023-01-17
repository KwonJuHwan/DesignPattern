package HIghHomework5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainWindow extends FrameWindow {
    private static final String MAIN_TITLE = "Main Window";
    private static final String TEXTFIELD_WINDOW_TITLE = "TextField Window";
    private static final String LABEL_WINDOW_TITLE = "Label Window";
    private static final String TEXTFIELD_OBSERVER_BUTTON_TITLE = "Update TextField Window Observer";
    private static final String LABEL_OBSERVER_BUTTON_TITLE = "Update Label Window Observer";
    private static final String STOP_THREAD_BUTTON_TITLE = "Stop Generating Prime Number";
    private static final int X = 250;
    private static final int Y = 100;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 100;
    private static final int GAP = 50;

    private ArrayList<String> displayList;
    private JFrame frame;

    public JFrame createWindow(String title, int x, int y, int width, int height) {
        JFrame frame;
        // ��ü ȭ���� ���븦 ������ (������ Ʋ�� �������)
        frame = new JFrame(title);
        // ȭ�� ũ�� ���� (������ ȭ���� �ʺ�� ���̴� �Ű� ������ ���޵�)
        frame.setBounds(x, y, width, height);
        
        // createPanel() �Լ��� ȣ���ؼ� ���Ͽ��� ���� ���÷��� ���� ��ҿ� ���� ���÷��̸� �����ϰ�, ��ü ���÷��̸� �����ϴ� �г��� ���� ����
        // �������� ȭ�� ������ createPanel()�Լ����� �Ͼ
        JPanel panel = createPanel(width, height);
        
        // �����쿡 ��ü �г��� ����        
        frame.getContentPane().add(panel);
        frame.pack();
        
        // �����츦 ȭ�鿡 ���̰� ����
        frame.setVisible(true);
        return frame;
    }

    public void closeWindow() {
        frame.setVisible(false);
        frame.dispose();
    }

    public MainWindow(String title, ArrayList<String> list) {
        displayList = list;
        // ���� �������� ũ��� �־��� �ʺ�� ���� * (���÷��� ���� ��� + 1)      
        // ���� ȭ�� ������ createWindow() �Լ����� ó����
        frame = createWindow(title, X, Y, WIDTH, HEIGHT * (displayList.size() + 1));
/*        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeWindow();
                System.exit(0);
            }
        });*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel createPanel(int width, int height) {
        // ���� ������ ���� �г� ����
        JPanel panel = new JPanel();
        // �г��� ���̾ƿ��� BoxLayout.Y_AXIS ���·� ����. �гο� ���� �Ǵ� �ٸ� �г��� �߰��ϸ�, ������ �������� �߰�(add)�� ������� ������
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // �г��� ��ü ũ�� ����
        panel.setMinimumSize(new Dimension(width, height));
        panel.setPreferredSize(new Dimension(width, height));

        // �⺻ ������Ʈ ����. HudDisplay�� ���� �⺻���� ���÷��� ������Ұ� ��
        Display display = new HudDisplay(WIDTH, HEIGHT);
        
        // ����Ʈ�� �ִ� ������ �������� ��� �߰��ϱ�. ����� �߰��ϴ� ���� ������� ������ ���÷��� �г��� ���� �� �ִ� ���ο� �г��� �����ϰ�,
        // �� �ȿ� ���±��� ������� �гΰ� �۾��� �� �� �ִ� LabelPanel�� �߰���
        // ���ο� ����� �߰��� ������ ���ο� �г��� �����ǰ�, �� �ȿ� ���� �г��� �߰���(add)
        for (String name : displayList) {
            if (name.equals("speed")) {
                // display ������ �����ϴ� ���� ���÷��̿� �ӵ��� ���÷��̸� �� ����
                display = new SpeedometerDisplay(display, WIDTH, HEIGHT);
            }
            else if (name.equals("time")) {
                // display ������ �����ϴ� ���� ���÷��̿� �ð� ���÷��̸� �� ����
                display = new TimeDisplay(display, WIDTH, HEIGHT);
            }
            else if (name.equals("weather")) {
                // display ������ �����ϴ� ���� ���÷��̿� ���� ���÷��̸� �� ����
                display = new WeatherDisplay(display, WIDTH, HEIGHT);
            }
        }
        // ����� ��� ������ ���� ���÷��� �г��� �����ϵ��� ��. ��� �гε��� �����ϴ� ���� �г��� ���������, �̰��� ���ο� �гο� ���� ��Ŵ
        panel.add(display.create());

        // ���̸� ���
        System.out.println("disply.height = " + display.getHeight());

        // ���÷��̸��� ������ ������ ȭ�鿡 ����
        display.show();
        return panel;
    }

    public static void main(String[] args) {
        final String displayFileName = "displays.txt";
        ArrayList<String> list;
        LoadHudDisplays loadDisplay = new LoadHudDisplays(displayFileName);
        list = loadDisplay.load();
        System.out.printf("display.size() = %d\n", list.size());
        for (String s : list) {
            System.out.println(s);
        }

        MainWindow mainWindow = new MainWindow(MainWindow.MAIN_TITLE, list);
    }
}
