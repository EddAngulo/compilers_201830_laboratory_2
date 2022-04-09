package core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus K555L
 */
public class Symbol {
    
    private String symb;
    private boolean noTerm;

    public Symbol(String symb, boolean noTerm) {
        this.symb = symb;
        this.noTerm = noTerm;
    }

    public String getSymb() {
        return symb;
    }
    
    public boolean getNoTerm(){
        return noTerm;
    }

    public void setNoTerm(boolean noTerm) {
        this.noTerm = noTerm;
    }
    
    @Override
    public String toString(){
        return symb;
    }
    
}
