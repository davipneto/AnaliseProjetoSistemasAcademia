/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademia;

/**
 *
 * @author davip
 */
class ItemFichaFrequencia {
    
    private String horIni;
    private String horFim;
    private String data;

    public ItemFichaFrequencia(String horIni, String horFim, String data) {
        this.horIni = horIni;
        this.horFim = horFim;
        this.data = data;
    }

    public String getHorIni() {
        return horIni;
    }

    public void setHorIni(String horIni) {
        this.horIni = horIni;
    }

    public String getHorFim() {
        return horFim;
    }

    public void setHorFim(String horFim) {
        this.horFim = horFim;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
