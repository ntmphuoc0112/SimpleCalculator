package Project;

import javax.swing.*;

import java.awt .event.  *;
import java.awt.*;

public class Simple_Calculator extends JFrame implements ActionListener{
	private JButton bt1, bt2, bt3, bt4;
	private JTextField tf1, tf2, tf3;
	private double result;
	private Container cont;
	private JPanel panel1, panel2;
	
	public Simple_Calculator(String s) {
		super(s);
		// Lấy lớp ContentPane để đặt các đối tượng để hiển thị
		cont = this.getContentPane();
		
		// Tạo các thành phần trên giao diện
		JLabel num1 = new JLabel("Number1: ");
		tf1 = new JTextField();
		JLabel num2 = new JLabel("Number2: ");
		tf2 = new JTextField();
		JLabel Result = new JLabel("Result: ");
		tf3 = new JTextField();
		// TextField chứa kết quả không được phép sử dụng dữ liệu
		tf3.setEditable(false);
		
		// Panel1 chứa 3 Textfield
		panel1 = new JPanel();
		// tạo Layout gồm 3 hàng 2 cột
		panel1.setLayout(new GridLayout(3, 2));
		panel1.add(num1);
		panel1.add(tf1);
		panel1.add(num2);
		panel1.add(tf2);
		panel1.add(Result);
		panel1.add(tf3);
		// tạo 4 nút biểu diễn 4 phép toán
		bt1 = new JButton("+");
		bt2 = new JButton("-");
		bt3 = new JButton("*");
		bt4 = new JButton("/");
		// Panel2 chứa 4 nút
		panel2 = new JPanel();
		panel2.add(bt1);
		panel2.add(bt2);
		panel2.add(bt3);
		panel2.add(bt4);
		
		// đặt 2 panel vào ContentPane
		cont.add(panel1);
		cont.add(panel2, "South");
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		// thiết lập kích thước hiển thị
		this.pack();
		this.setVisible(true);
	}
	
	// định nghĩa các hàm tính toán
	public void Plus() {
		result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}
	
	public void Minus() {
		result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}
	
	public void Mult() {
		result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}
	
	public void Div() {
		result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}
	
	// Định nghĩa lại hàm xử lý khi người dùng ấn các phép toán
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand() == "+")
    	   Plus();
       if(e.getActionCommand() == "-")
    	   Minus();
       if(e.getActionCommand() == "*")
    	   Mult();
       if(e.getActionCommand() == "/")
    	   Div();

    }
	public static void main(String args[]) {
		// tạo giao diện chương trình
		Simple_Calculator simpleCal = new Simple_Calculator("SimpleCalculator");
		simpleCal.setLocationRelativeTo(null);
		
	}


}
