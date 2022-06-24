package ders08;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class regexGen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regexGen frame = new regexGen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public regexGen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 591, 206);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 26));
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 26));
		textField.setBounds(12, 231, 591, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAra = new JButton("ARA");
		
		btnAra.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAra.setBounds(250, 293, 115, 37);
		contentPane.add(btnAra);
		
		JLabel lblNewLabel = new JLabel("SONU\u00C7");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(153, 338, 306, 35);
		contentPane.add(lblNewLabel);
		
		btnAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = textArea.getText();
				String p = textField.getText();
				Pattern iz = Pattern.compile(p);
				Matcher m = iz.matcher(s);
				
				int sayac=0;
				
				while(m.find()) sayac++;				

				lblNewLabel.setText(Integer.toString(sayac)+" adet iz bulundu.");
			}
		});
		
	}
}
