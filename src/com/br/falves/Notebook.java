/**
 * @author falvesmac
 */

package com.br.falves;

/**
 * Classe que representa um Notebook e suas propriedades
 */
public class Notebook {
    private String modelo;
    private String marca;
    private String cor;
    private int numeroSerie;
    private int porcentagemBateria;

    /**
     * Getters and Setters
     */
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public int getPorcentagemBateria() {
        return porcentagemBateria;
    }
    public void setPorcentagemBateria(int porcentagemBateria) {
        this.porcentagemBateria = porcentagemBateria;
    }

    // Criando o construtor do objeto
    public Notebook(String modelo, String marca, String cor, int numeroSerie, int porcentagemBateria) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.numeroSerie = numeroSerie;
        this.porcentagemBateria = porcentagemBateria;
    }

    // Função que imprime as informações do modelo
    public void infos() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Numero Serie: " + numeroSerie);
        System.out.println("Porcentagem Bateria: " + porcentagemBateria + "%");
    }

    // Função que abre o notebook
    public void abrirNotebook() {
        System.out.println("Abrindo Notebook " + modelo);
    }

    // Função que liga o Notebook
    public void ligarNotebook() {
        System.out.println("Ligando o notebook " + modelo);
    }

    // Função que confere a porcentagem de bateria
    public void necessitaBateria() {
        if (porcentagemBateria <= 30) {
            System.out.println("Conectando carregador no " + modelo + ", pois está com " + porcentagemBateria + "%");
        } else {
            System.out.println("Bateria suficiente para uso, pois está com " + porcentagemBateria + "%");
        }
    }

    // Função que usa o notebook
    public void usarNotebook() {
        System.out.println("Usando notebook " + modelo);
    }

    // Função que imprime um divisor no terminal
    public void divisor() {
        System.out.println("************************");
    }

    // Método que cria o objeto
    public static void main(String[] args) {
        Notebook meuNotebook = new Notebook("Air M1", "Apple", "Prata", 12345678, 20);
        meuNotebook.infos();
        meuNotebook.abrirNotebook();
        meuNotebook.ligarNotebook();
        meuNotebook.necessitaBateria();
        meuNotebook.usarNotebook();
        meuNotebook.divisor();
        Notebook notebookPai = new Notebook("Air M2", "Apple", "Prata", 12345678, 60);
        notebookPai.infos();
        notebookPai.abrirNotebook();
        notebookPai.ligarNotebook();
        notebookPai.necessitaBateria();
        notebookPai.usarNotebook();
    }
}