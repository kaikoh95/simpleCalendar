package scheduler.cal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Calendar {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar window = new Calendar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calendar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 658, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 626, 386);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton prevMonth = new JButton("<<<");
		prevMonth.setBounds(0, 0, 93, 41);
		panel.add(prevMonth);
		
		JButton nextMonth = new JButton(">>>");
		nextMonth.setBounds(533, 0, 93, 41);
		panel.add(nextMonth);
		
		JLabel currMonth = new JLabel("JULY");
		currMonth.setHorizontalAlignment(SwingConstants.CENTER);
		currMonth.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		currMonth.setBounds(119, 0, 192, 41);
		panel.add(currMonth);
		
		JLabel currYear = new JLabel("2018");
		currYear.setHorizontalAlignment(SwingConstants.CENTER);
		currYear.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		currYear.setBounds(315, 0, 192, 41);
		panel.add(currYear);
		
		JLabel lblSun = new JLabel("SUN");
		lblSun.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSun.setHorizontalAlignment(SwingConstants.CENTER);
		lblSun.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		lblSun.setBounds(50, 52, 50, 50);
		panel.add(lblSun);
		
		JLabel label = new JLabel("MON");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		label.setBounds(130, 52, 50, 50);
		panel.add(label);
		
		JLabel label_1 = new JLabel("TUE");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		label_1.setBounds(210, 52, 50, 50);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("WED");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		label_2.setBounds(290, 52, 50, 50);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("THU");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		label_3.setBounds(370, 52, 50, 50);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("FRI");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		label_4.setBounds(450, 52, 50, 50);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("SAT");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		label_5.setBounds(530, 52, 50, 50);
		panel.add(label_5);
		
		nextMonth.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (currMonth.getText() != "DECEMBER") {
					
					if (currMonth.getText() == "JANUARY") {
						currMonth.setText("FEBRUARY");
					} else if (currMonth.getText() == "FEBRUARY") {
						currMonth.setText("MARCH");
					} else if (currMonth.getText() == "MARCH") {
						currMonth.setText("APRIL");
					} else if (currMonth.getText() == "APRIL") {
						currMonth.setText("MAY");
					} else if (currMonth.getText() == "MAY") {
						currMonth.setText("JUNE");
					} else if (currMonth.getText() == "JUNE") {
						currMonth.setText("JULY");
					} else if (currMonth.getText() == "JULY") {
						currMonth.setText("AUGUST");
					} else if (currMonth.getText() == "AUGUST") {
						currMonth.setText("SEPTEMBER");
					} else if (currMonth.getText() == "SEPTEMBER") {
						currMonth.setText("OCTOBER");
					} else if (currMonth.getText() == "OCTOBER") {
						currMonth.setText("NOVEMBER");
					} else if (currMonth.getText() == "NOVEMBER") {
						currMonth.setText("DECEMBER");
					} 

				} else {
					if (currYear.getText() == "2018") {
						currMonth.setText("JANUARY");
						currYear.setText("2019");
					}
				}
				
			}
		});
		
		prevMonth.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (currMonth.getText() != "JANUARY") {
					
					if (currMonth.getText() == "DECEMBER") {
						currMonth.setText("NOVEMBER");
					} else if (currMonth.getText() == "FEBRUARY") {
						currMonth.setText("JANUARY");
					} else if (currMonth.getText() == "MARCH") {
						currMonth.setText("FEBRUARY");
					} else if (currMonth.getText() == "APRIL") {
						currMonth.setText("MARCH");
					} else if (currMonth.getText() == "MAY") {
						currMonth.setText("APRIL");
					} else if (currMonth.getText() == "JUNE") {
						currMonth.setText("MAY");
					} else if (currMonth.getText() == "JULY") {
						currMonth.setText("JUNE");
					} else if (currMonth.getText() == "AUGUST") {
						currMonth.setText("JULY");
					} else if (currMonth.getText() == "SEPTEMBER") {
						currMonth.setText("AUGUST");
					} else if (currMonth.getText() == "OCTOBER") {
						currMonth.setText("SEPTEMBER");
					} else if (currMonth.getText() == "NOVEMBER") {
						currMonth.setText("OCTOBER");
					} 

				} else {
					if (currYear.getText() == "2019") {
						currMonth.setText("DECEMBER");
						currYear.setText("2018");
					}
				}
			}
		});
		
		
	}
}
