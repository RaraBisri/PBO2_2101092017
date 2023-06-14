/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSB.controller;

import java.sql.Connection;
import UTSB.dao.PenjualanDao;
import UTSB.dao.Koneksi;
import UTSB.model.Penjualan;
import UTSB.view.FormPenjualan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import UTSB.controller.PenjualanController;
import UTSB.dao.PenjualanDaoImpl;
import UTSB.view.FormPenjualan;

/**
 *
 * @author USER
 */
public class PenjualanController {
    private FormPenjualan formPenjualan;
    private Penjualan penjualan;
    private PenjualanDao penjualanDao;
    private Connection con;
    private Koneksi k;
    
    public PenjualanController(FormPenjualan formPenjualan){
        try {
            this.formPenjualan = formPenjualan;
            penjualanDao = (PenjualanDao) new PenjualanDaoImpl();
            k = new UTSB.dao.Koneksi();
            con = k.getKoneksi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void clearForm(){
        formPenjualan.getTxtTanggal().setText("");
        formPenjualan.getTxtKodepesanan().setText("");
        formPenjualan.getTxtNamapemesan().setText("");
        formPenjualan.getTxtTotalbayar().setText("");
        formPenjualan.getTxtNamapemesan().setText("");
        formPenjualan.getTxtOngkoskirim().setText("");
        formPenjualan.getTxtDiskon().setText("");
    }
}
