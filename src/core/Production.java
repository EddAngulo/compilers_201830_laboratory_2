package core;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus K555L
 */
public class Production {
    
    private ArrayList<Symbol> prod;

    public Production() {
        this.prod = new ArrayList<>();
    }
    
    public void addSymbol(Symbol symb){
        prod.add(symb);
    }

    public ArrayList<Symbol> getProd() {
        return prod;
    }
    
    public Symbol getSymbol(int index){
        return prod.get(index);
    }
    
    public Symbol getFirst(){
        return prod.get(0);
    }
    
    public Symbol getLast(){
        return prod.get(prod.size() - 1);
    }
    
    @Override
    public String toString(){
        String data = "";
        for (Symbol prod1 : prod) {
            data += prod1.getSymb();
        }
        return data;
    }
    
}
