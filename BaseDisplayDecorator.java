package HIghHomework5;
import javax.swing.*;
import java.awt.*;

public abstract class BaseDisplayDecorator extends DisplayDecorator {
    JPanel panel;
    LabelPanel labelPanel;
    Display display;

    public BaseDisplayDecorator(Display display, int width, int height) {
        super(display, width, height);
        this.display = display;
    }

    /* create() �Լ����� �������� ��� ���÷��� �г��� ������. ���⼭ �����Ǵ� �г��� ���ڷ����� ������ �⺻ ���̽��� �ش��.
       ������ ���·� ���ڷ����Ϳ��� ���Ǵ� �г��� �����ǰ�, �ش� �г��� �Ϻη� ���⼭ �����Ǵ� �г��� ���Ե�. �Ŀ�����Ʈ �׸� ���� */
    @Override
    public JPanel create() {
        // ���̺��� ���� �г� ����
        panel = new JPanel();
        // ���̺� �Ǵ� �ٸ� �г��� �߰��� �� ���� �������� �����ǵ��� ���̾ƿ� ����
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // �ּ� ũ��� ��ȣ�ϴ� ũ�⸦ �����ϰ� ���� �г� �ʺ�� ���̸� ���� ��Ŵ
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        JPanel subpanel = display.create();
        // �гο� ���̺��� ����.
        panel.add(subpanel);
        // ���ڿ��� ���� ���̺� ����
        labelPanel = new LabelPanel();
        panel.add(labelPanel.createPanel(super.getWidth(), super.getHeight()));
        return panel;
    }

    @Override
    public void show() {
        display.show();
        // �гο� ���� ���ڿ�
        labelPanel.updateText(getText());
    }

    @Override
    public int getHeight() {
        return display.getHeight() + super.getHeight();
    }

    public abstract String getText();
}

