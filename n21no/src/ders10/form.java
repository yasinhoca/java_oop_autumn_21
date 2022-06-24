package ders10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	private JPanel contentPane;
	private JTextField fiyat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
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
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00FCr");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(12, 13, 52, 40);
		contentPane.add(lblNewLabel);
		
		JComboBox tur = new JComboBox();
		tur.setModel(new DefaultComboBoxModel(new String[] {"Bilgisayar", "Tablet", "Telefon"}));
		tur.setFont(new Font("Tahoma", Font.BOLD, 24));
		tur.setBounds(139, 15, 163, 36);
		contentPane.add(tur);
		
		JLabel lblFiyat = new JLabel("Fiyat");
		lblFiyat.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblFiyat.setBounds(12, 60, 93, 40);
		contentPane.add(lblFiyat);
		
		fiyat = new JTextField();
		fiyat.setFont(new Font("Tahoma", Font.BOLD, 24));
		fiyat.setBounds(139, 64, 163, 32);
		contentPane.add(fiyat);
		fiyat.setColumns(10);
		
		JLabel lbltv = new JLabel("\u00D6TV");
		lbltv.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbltv.setBounds(12, 113, 93, 40);
		contentPane.add(lbltv);
		
		JComboBox otv = new JComboBox();
		otv.setModel(new DefaultComboBoxModel(new String[] {"0", "22", "35", "45"}));
		otv.setFont(new Font("Tahoma", Font.BOLD, 24));
		otv.setBounds(139, 109, 163, 36);
		contentPane.add(otv);
		
		JLabel lblKdv = new JLabel("KDV");
		lblKdv.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblKdv.setBounds(12, 166, 93, 40);
		contentPane.add(lblKdv);
		
		JComboBox kdv = new JComboBox();
		kdv.setModel(new DefaultComboBoxModel(new String[] {"1", "8", "18"}));
		kdv.setFont(new Font("Tahoma", Font.BOLD, 24));
		kdv.setBounds(139, 158, 163, 36);
		contentPane.add(kdv);
		
		JButton btnNewButton = new JButton("FATURA");
		
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(139, 215, 163, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("SONU\u00C7");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(12, 276, 451, 32);
		contentPane.add(lblNewLabel_1);
		
		//Urun u = new Urun(); abstract sýnýflarýn nesnesi oluþturulamaz
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(tur.getSelectedItem().toString().equals("Bilgisayar")) {
					float f = Float.parseFloat(fiyat.getText());
					float o = Float.parseFloat(otv.getSelectedItem().toString())/100;
					float k = Float.parseFloat(kdv.getSelectedItem().toString())/100;
					BilgisayarHesapla bh = new BilgisayarHesapla();
					lblNewLabel_1.setText(Float.toString(bh.fatura(f, o, k)));
				} else if(tur.getSelectedItem().toString().equals("Tablet")) {
					float f = Float.parseFloat(fiyat.getText());
					float o = Float.parseFloat(otv.getSelectedItem().toString())/100;
					float k = Float.parseFloat(kdv.getSelectedItem().toString())/100;
					TabletHesapla th = new TabletHesapla();
					lblNewLabel_1.setText(Float.toString(th.fatura(f, o, k)));
				} else if(tur.getSelectedItem().toString().equals("Telefon")) {
					float f = Float.parseFloat(fiyat.getText());
					float o = Float.parseFloat(otv.getSelectedItem().toString())/100;
					float k = Float.parseFloat(kdv.getSelectedItem().toString())/100;
					TelefonHesapla teh = new TelefonHesapla();
					lblNewLabel_1.setText(Float.toString(teh.fatura(f, o, k)));
				}
			}
		});
		
	}
}
