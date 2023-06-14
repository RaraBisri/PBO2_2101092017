/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSB.model;

/**
 *
 * @author USER
 */
public class Penjualan {
    private String kodepesanan;
    private String tanggal;
    private String namapemesan;
    private String totalbayar;
    private String ongkoskirim;
    private String diskon;
    private String total;
    
    
    public Penjualan(){
        
    }
    
    public Penjualan(String kodepesanan, String tanggal, String namapemesan, String totalbayar, String ongkoskirim, String diskon, String total) {
        this.kodepesanan = kodepesanan;
        this.tanggal = tanggal;
        this.namapemesan = namapemesan;
        this.totalbayar = totalbayar;
        this.ongkoskirim = ongkoskirim;
        this.diskon = diskon;
        this.total = total;
    }

    public String getKodepesanan() {
        return kodepesanan;
    }

    public void setKodepesanan(String kodepesanan) {
        this.kodepesanan = kodepesanan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNamapemesan() {
        return namapemesan;
    }

    public void setNamapemesan(String namapemesan) {
        this.namapemesan = namapemesan;
    }

    public String getTotalbayar() {
        return totalbayar;
    }

    public void setTotalbayar(String totalbayar) {
        this.totalbayar = totalbayar;
    }

    public String getOngkoskirim() {
        return ongkoskirim;
    }

    public void setOngkoskirim(String ongkoskirim) {
        this.ongkoskirim = ongkoskirim;
    }

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String Namapemesan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getKodepenjualan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setKodepenjualan(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNamapesanan(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
