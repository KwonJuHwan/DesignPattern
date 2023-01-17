package home4;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class TimeDisplay extends DisplayDecorator{
	Display display;
	LabelPanel labelPanel;
	JPanel panel;

	@Override
	public JPanel create() {
		panel=new JPanel();
		panel.add(display.create());
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // �ּ� ũ��� ��ȣ�ϴ� ũ�⸦ �����ϰ� ���� �г� �ʺ�� ���̸� ���� ��Ŵ
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        // ���ڿ��� ���� ���̺� ����
        labelPanel = new LabelPanel();
        // �гο� ���̺��� ����. 
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
		return panel;
	}

	@Override
	public void show() {
		display.show();
		labelPanel.updateText(java.time.LocalDateTime.now().toString());
	}
	
	public TimeDisplay(Display display, int width, int height) {
        super(display, width, height);
        this.display = display;
    }
}
