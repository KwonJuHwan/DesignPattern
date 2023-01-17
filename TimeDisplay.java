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
        // 최소 크기와 선호하는 크기를 동일하게 만들어서 패널 너비와 높이를 고정 시킴
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        // 문자열을 보일 레이블 생성
        labelPanel = new LabelPanel();
        // 패널에 레이블을 붙임. 
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
