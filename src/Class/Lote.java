package Class;

import java.util.Date;

public class Lote {
    private int qtd;
    private String datav;
    private Produto prod;

    public Lote(int qtd, String datav, Produto prod) {
        this.qtd = qtd;
        this.datav = datav;
        this.prod = prod;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDatav() {
        return datav;
    }

    public void setDatav(String datav) {
        this.datav = datav;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }
}