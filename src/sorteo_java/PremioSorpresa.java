package sorteo_java;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




public class PremioSorpresa extends JFrame implements ActionListener {
	JLabel l1, l2, l3;
	JLabel lnumero, lsorteo, lresultado;
	JButton bsube, bbaja, bsorteo;
	JButton salir;
	private JMenuBar mb;
    private JMenu menu1,menu2,menu3;
    private JMenuItem mi1,mi2,mi3,mi4, mi5;

	public PremioSorpresa() {
		setLayout(null);
		setBackground(new Color(255, 255, 0));
		mb=new JMenuBar();
		setJMenuBar(mb);
		menu1 = new JMenu("Opciones");
		mb.add(menu1);
		menu2 = new JMenu("Tamaño de la ventana");
		menu1.add(menu2);
		menu3 = new JMenu("Color de fondo");
		menu1.add(menu3);
		mi1 = new JMenuItem("640*480");
		menu2.add(mi1);
		mi1.addActionListener(this);
		mi2 = new JMenuItem("1024*768");
		menu2.add(mi2);
		mi2.addActionListener(this);
		mi3 = new JMenuItem("Rojo");
		menu3.add(mi3);
		mi3.addActionListener(this);
		mi4 = new JMenuItem("Verde");
		menu3.add(mi4);
		mi4.addActionListener(this);
		mi5 = new JMenuItem("Gris");
		menu3.add(mi5);
		mi5.addActionListener(this);
		l1 = new JLabel("Seleccion de numero");
		l1.setBounds(10, 100, 150, 30);
		lnumero = new JLabel("1");
		lnumero.setBounds(10, 150, 100, 30);
		lnumero.setBackground(Color.red);
		bsube = new JButton("^");
		bsube.setBounds(130, 130, 50, 30);
		bbaja = new JButton("v");
		bbaja.setBounds(130, 170, 50, 30);
		bsorteo = new JButton("Sortear");
		bsorteo.setBounds(300, 130, 150, 30);
		l2 = new JLabel("Numero sorteado:");
		l2.setBounds(300, 170, 140, 30);
		lsorteo = new JLabel("");
		lsorteo.setBackground(Color.red);
		lsorteo.setBounds(410, 170, 80, 30);
		l3 = new JLabel("Acerto ?");
		l3.setBounds(300, 230, 80, 30);
		lresultado = new JLabel("");
		lresultado.setBounds(410, 230, 80, 30);
		lresultado.setBackground(Color.green);
		salir = new JButton("Salir");
		salir.setBounds(10, 230, 100, 30);
		bsube.addActionListener(this);
		bbaja.addActionListener(this);
		bsorteo.addActionListener(this);
		salir.addActionListener(this);
		add(l1);
		add(l2);
		add(l3);
		add(bsube);
		add(bbaja);
		add(bsorteo);
		add(lsorteo);
		add(lresultado);
		add(lnumero);
		add(salir);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==mi1) {
            setSize(640,480);
        }
        if (e.getSource()==mi2) {
            setSize(1024,768);
        }
        if (e.getSource()==mi3) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource()==mi4) {
            getContentPane().setBackground(new Color(0,255,0));
        }
        if (e.getSource()==mi5) {
            getContentPane().setBackground(new Color(192,192,192));
        }
		if (bsube == e.getSource()) {
			int x;
			x = Integer.parseInt(lnumero.getText());
			x++;
			if (x <= 10)
				lnumero.setText(String.valueOf(x));
		}
		if (bbaja == e.getSource()) {
			int x;
			x = Integer.parseInt(lnumero.getText());
			x--;
			if (x >= 1)
				lnumero.setText(String.valueOf(x));
		}
		if (bsorteo == e.getSource()) {
			int ale;
			ale = 1 + (int) (Math.random() * 10);
			lsorteo.setText(String.valueOf(ale));
			if (ale == Integer.parseInt(lnumero.getText())) 
				lresultado.setText("Si");					
			else
				lresultado.setText("No");
		}
		if (salir == e.getSource())
			System.exit(0);
	}
	


	public static void main(String[] args) {
		PremioSorpresa s = new PremioSorpresa();
		s.setBounds(0, 0, 540, 320);
		s.setVisible(true);
	}

}
