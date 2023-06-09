package Program.Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manuntencao extends Tela implements ActionListener {

    JButton MTPF = new JButton();
    JButton MTPJ = new JButton();
    JButton voltar = new JButton();

    public Manuntencao() {
        setTitle("Tela de Manutenção");
        setIconImage(icone.getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(31, 42, 51));
        panel2.setVisible(true);
        panel2.setBounds(0, 320, 1000, 40);
        this.add(panel2);

        JLabel labelMTPF = new JLabel();
        labelMTPF.setText("Pesquisar PF");
        labelMTPF.setForeground(corLabel1);
        labelMTPF.setBounds(180, 60, 100, 100);
        labelMTPF.setFont(new Font("Arial Black", Font.PLAIN, 12));
        this.add(labelMTPF);

        JLabel labelMTPJ = new JLabel();
        labelMTPJ.setText("Pesquisar PJ");
        labelMTPJ.setForeground(corLabel1);
        labelMTPJ.setBounds(180, 170, 250, 100);
        labelMTPJ.setFont(new Font("Arial Black", Font.PLAIN, 12));
        this.add(labelMTPJ);

        MTPF.setBounds(70, 70, 75, 75);
        MTPF.setIcon(iconPF);
        MTPF.addActionListener(this);
        this.add(MTPF);

        MTPJ.setBounds(70, 190, 75, 75);
        MTPJ.setIcon(iconPJ);
        MTPJ.addActionListener(this);
        this.add(MTPJ);

        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == MTPF) {
            this.dispose();
            new TelaTablePF();
        }
        if (e.getSource() == MTPJ) {
            this.dispose();
            new TelaTablePJ();
        }
        if (e.getSource() == voltar) {
            this.dispose();
            new main();
        }
    }
}
