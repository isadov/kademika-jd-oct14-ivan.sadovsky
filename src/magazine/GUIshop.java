package magazine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUIshop {

	Customer customer;
	private Shop productshop;
	private Stock stock;
	private JFrame jframe;
	private JTextField jtf;
	private JTextField jtf1;
	private List<JRadioButton> arrayRButton;
	private JPanel mainPanel;
	private ButtonGroup group;
	private JPanel radioPanel;
	private JPanel attributePanel;
	private JPanel quantPanel;
	private JPanel basePanel;
	private JLabel labelColumn1;
	private JLabel labelColumn2;
	private JLabel labelColumn3;
	private JPanel panel;

	public GUIshop(Shop productshop, Stock stock) {
		this.productshop = productshop;
		this.stock = stock;
		jframe = new JFrame("Best Product Shop");

	}

	public JPanel createPanel() {
		panel = new JPanel();
		panel.setLayout(new GridBagLayout());

		JLabel label = new JLabel("Name Of Customer: ");
		panel.add(label, new GridBagConstraints(1, 0, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, GridBagConstraints.NONE,
				new Insets(0, 0, 10, 0), 0, 0));

		jtf = new JTextField();
		jtf.setColumns(10);
		panel.add(jtf, new GridBagConstraints(2, 0, 1, 1, 0, 0,
				GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 10, 0), 0, 0));

		group = new ButtonGroup();
		radioPanel = new JPanel(new GridLayout(
				stock.getNumberTypesOfStock() + 1, 1, 1, 3));
		attributePanel = new JPanel(new GridLayout(
				stock.getNumberTypesOfStock() + 1, 1, 1, 9));
		quantPanel = new JPanel(new GridLayout(
				stock.getNumberTypesOfStock() + 1, 1, 1, 9));

		labelColumn1 = new JLabel("Name Of Product");
		labelColumn1.setFont(new Font("Arial", Font.BOLD, 14));
		radioPanel.add(labelColumn1);

		labelColumn2 = new JLabel("Brand Of Product");
		labelColumn2.setFont(new Font("Arial", Font.BOLD, 14));
		attributePanel.add(labelColumn2);

		labelColumn3 = new JLabel("In Storage");
		labelColumn3.setFont(new Font("Arial", Font.BOLD, 14));
		quantPanel.add(labelColumn3);

		arrayRButton = new ArrayList<>();
		for (int i = 0; i < stock.getNumberTypesOfStock(); i++) {
			arrayRButton.add(i, new JRadioButton(stock.getName(i), false));
			group.add(arrayRButton.get(i));
			radioPanel.add(arrayRButton.get(i));
			attributePanel.add(new JLabel(stock.getAttribute(i)));
			quantPanel.add(new JLabel(Integer.toString(stock.getQuantity(i))));

		}

		basePanel = new JPanel(new GridBagLayout());
		basePanel.add(radioPanel,
				new GridBagConstraints(0, 0, 1, 1, 0, 0,
						GridBagConstraints.LINE_START, 0,
						new Insets(0, 0, 0, 0), 25, 0));
		basePanel.add(attributePanel,
				new GridBagConstraints(1, 0, 1, 0, 0, 0,
						GridBagConstraints.LINE_START, 0,
						new Insets(0, 0, 0, 0), 25, 0));
		basePanel.add(quantPanel,
				new GridBagConstraints(2, 0, 1, 1, 0, 0,
						GridBagConstraints.LINE_START, 0,
						new Insets(0, 0, 0, 0), 25, 0));
		panel.add(basePanel,
				new GridBagConstraints(0, 1, 3, 1, 0, 0,
						GridBagConstraints.LINE_START, 0,
						new Insets(0, 0, 0, 0), 25, 0));
		basePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

		JLabel label1 = new JLabel("You can choose product HERE !");
		label1.setFont(new Font("Arial", Font.PLAIN, 11));
		panel.add(label1,
				new GridBagConstraints(0, 2, 3, 1, 0, 0,
						GridBagConstraints.LINE_START, 0, new Insets(0, 0, 10,
								0), 0, 0));
		
		//115
		
		
		
		return attributePanel;

	}
}
