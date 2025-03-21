package Cofrinho;

import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();


    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    public void remover(int tipoMoeda, int quantidade) {
        for(Moeda m : new ArrayList<>(listaMoedas)) {
            if(tipoMoeda == 1 && m instanceof Real ||
            tipoMoeda == 2 && m instanceof Dolar ||
            tipoMoeda == 3 && m instanceof Euro) {
                if(m.valor <= quantidade) {
                    quantidade -= m.valor;
                    listaMoedas.remove(m);
                    if(quantidade == 0) {
                        break;
                    }
                } else {
                    m.valor -= quantidade;
                    break;
                }
            }
        }
    }


    public void listagemMoedas() {
        double totalReais = 0;
        double totalDolares = 0;
        double totalEuros = 0;
        for(Moeda m : listaMoedas) {

            if(m instanceof Real) {
                totalReais += m.valor;
            } else if(m instanceof Dolar) {
                totalDolares += m.valor;
            } else if (m instanceof Euro) {
                totalEuros += m.valor;
            }
        }
        System.out.println("Total de Reais: " + totalReais);
        System.out.println("Total de Dólares: " + totalDolares);
        System.out.println("Total de Euros: " + totalEuros);
    }


    public void totalConvertido() {
        double totalReais = 0;
        double totalDolares = 0;
        double totalEuros = 0;
        for(Moeda m : listaMoedas) {
            if(m instanceof Real) {
                totalReais += m.valor;
            } else if(m instanceof Dolar) {
                totalDolares += m.valor;
            } else if (m instanceof Euro) {
                totalEuros += m.valor;
            }
        }
        double dolarConvertido = totalDolares * 5.66;
        double euroConvertido = totalEuros * 6.14;
        double total = totalReais + dolarConvertido + euroConvertido;

        System.out.println("Valor total convertido em reais: " + total);
    }
}
