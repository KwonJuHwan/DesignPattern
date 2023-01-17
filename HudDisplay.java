package HIghHomework5;
import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class HudDisplay extends Display {
    JPanel panel;
    LabelPanel labelPanel;

    HudDisplay(int width, int height) {
        super(width, height);
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
        // ���ڿ��� ���� ���̺� ����
        labelPanel = new LabelPanel();
        // �гο� ���̺��� ����. 
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        return panel;
    }

    @Override
    public void show() {
        // �гο� ���� ���ڿ�
        labelPanel.updateText("Hud Display");
    }
}
