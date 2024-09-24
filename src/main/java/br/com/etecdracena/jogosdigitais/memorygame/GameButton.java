/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.etecdracena.jogosdigitais.memorygame;

import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author Marcelo Vieira
 */
public class GameButton extends JButton {
    
    private Icon imageDefault;
    private Icon imageButton;
    
    public GameButton (Icon imageDefault, Icon ImageButton) {
        this.imageDefault = imageDefault;
        this.imageButton = imageButton;
        setImageButton();
    }
    
    public void setImageDefault() {
        this.setIcon(imageDefault);
    }
    
    public void setImageButton() {
        this.setIcon(imageButton);
    }
    
    public Icon getImageButton() {
        return this.imageButton;
    }
}


