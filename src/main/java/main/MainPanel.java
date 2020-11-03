package main;

import javax.swing.JPanel;

public class MainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static MainPanel mainPanel = null;

	private MainPanel() {
		super();
	}

	public static MainPanel getUniqInstance() {
		if (MainPanel.mainPanel == null)
			MainPanel.mainPanel = new MainPanel();
		return MainPanel.mainPanel;
	}

}
