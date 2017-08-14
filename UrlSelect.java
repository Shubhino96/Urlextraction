import javax.swing.*;    
import java.awt.event.*;
import java.awt.*;
public class UrlSelect {
	JFrame f;
	UrlSelect()
	{
		f=new JFrame("Image Urls");
		JLabel label = new JLabel();
		label.setSize(400,100);
		String blgtyp[]={"chinese-food","american-food","indian-food"};
		final JComboBox cb=new JComboBox(blgtyp);
		cb.setBounds(50, 100,90,20);
		JLabel txt=new JLabel();
		txt.setText("Select the type of Topic for knowing image sources");
		JButton b=new JButton("Select");
		f.add(txt);
		f.add(cb);  f.add(b);
		f.add(label);
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s="";
				String data=(String) cb.getItemAt(cb.getSelectedIndex());
				Urlext ux=new Urlext();
				String[] urls=new String[5];
				urls=ux.imgext(data);
				for(int i=0;i<5;i++){
					s=urls[i]+"\n";
				}
				label.setText(s);
			}
		});
	}
	public static void main(String args[])
	{
		new UrlSelect();
	}
}
