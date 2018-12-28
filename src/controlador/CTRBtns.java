/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Usuario
 */
public class CTRBtns implements MouseListener {

    private JButton btn;

    public CTRBtns(JButton btn) {
        this.btn = btn;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        btn.setBackground(new Color(86, 171, 96));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        btn.setBackground(new Color(86, 171, 96));
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        btn.setBackground(new Color(86, 171, 96));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        btn.setBackground(new Color(77, 98, 94));
    }

}
