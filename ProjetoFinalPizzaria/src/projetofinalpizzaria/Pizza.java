/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpizzaria;

import java.util.ArrayList;

/**
 *
 * @author enzoradel
 */
    public class Pizza {

        private String formato;
        private double tamanhoCm;
        private double tamanhoCm2;
        private ArrayList<Sabor> sabor = new ArrayList<>();
        private double preco;
        private boolean doisSabores;

        public void setFormato(String formato) {
            this.formato = formato;
        }

        public void setTamanhoCm(double tamanhoCm) {
            this.tamanhoCm = tamanhoCm;
        }

        public void setTamanhoCm2(double tamanhoCm2) {
            this.tamanhoCm2 = tamanhoCm2;
        }

        public void setSabor(int posicao, Sabor novoSabor) {
            sabor.add(posicao, novoSabor);
        }

        public void setPrecoFinal(double precoFinal) {
            this.preco = precoFinal;
        }

        public void setDoisSabores(boolean doisSabores) {
            this.doisSabores = doisSabores;
        }
        
        public String getFormato() {
            return formato;
        }

        public double getTamanhoCm() {
            return tamanhoCm;
        }

        public double getTamanhoCm2() {
            return tamanhoCm2;
        }

        public String getSabor(int posicao) {
            return sabor.get(posicao).getNome();
        }

        public double getPrecoFinal() {
            return preco;
        }
        
        public boolean getDoisSabores() {
            return doisSabores;
        }
        
    }

