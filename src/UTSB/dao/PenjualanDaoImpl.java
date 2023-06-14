/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSB.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import UTSB.model.Penjualan;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USER
 */
public class PenjualanDaoImpl {

    public PenjualanDaoImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PenjualanDaoImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PenjualanDaoImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void insert(Connection con, Penjualan penjualan) throws Exception {
        String sql = "insert into penjualan values(?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, penjualan.getKodepesanan());
        ps.setString(2, penjualan.getTanggal());
        ps.setString(3, penjualan.getNamapemesan());
        ps.setString(4, penjualan.getTotalbayar());
        ps.setString(5, penjualan.getOngkoskirim());
        ps.setString(6, penjualan.getDiskon());
        ps.setString(7, penjualan.getTotal());
        ps.executeUpdate();
    }
    

    public void update(Connection con,Penjualan penjualan) throws Exception {
        String sql = "update anggota set namapemesan=?, tanggal=?, totalbayar=?,  ongkoskirim=?, diskon=?, total=? where kodepesanan=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, penjualan.getKodepesanan());
        ps.setString(2, penjualan.getTanggal());
        ps.setString(3, penjualan.getNamapemesan());
        ps.setString(4, penjualan.getTotalbayar());
        ps.setString(5, penjualan.getOngkoskirim());
        ps.setString(6, penjualan.getDiskon());
        ps.setString(7, penjualan.getTotal());
        ps.executeUpdate();
    }
    
    
    public void delete(Connection con, Penjualan penjualan) throws Exception {
        String sql = "delete from penjualan where kodepesanan=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, penjualan.getKodepenjualan());
        System.err.println("Kode   "+penjualan.getKodepenjualan());
        ps.executeUpdate();
    }
    

    public Penjualan getPenjualan(Connection con,String kode) throws Exception {
        String sql = "select * from penjualan where kodepesanan=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Penjualan penjualan = null;
        if (rs.next()){
            penjualan = new Penjualan();
            penjualan.setKodepenjualan(rs.getString(1));
            penjualan.setTanggal(rs.getString(2));
            penjualan.setNamapemesan(rs.getString(3));
            penjualan.setTotalbayar(rs.getString(4));
            penjualan.setOngkoskirim(rs.getString(5));
            penjualan.setDiskon(rs.getString(6));
            penjualan.setTotal(rs.getString(7));
        }
         return penjualan;
    }
    
    
    public List<Penjualan> getAllPenjualan(Connection con) throws Exception {
        String sql = "select * from penjualan";
        PreparedStatement ps = con.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        List<Penjualan> list = new ArrayList<>();
        Penjualan penjualan = null;
        while (rs.next()){
        penjualan = new Penjualan();
        penjualan.setKodepenjualan(rs.getString(1));
        penjualan.setTanggal(rs.getString(2));
        penjualan.setNamapemesan(rs.getString(3));
        penjualan.setTotalbayar(rs.getString(4));
        penjualan.setOngkoskirim(rs.getString(5));
        penjualan.setDiskon(rs.getString(6));
        penjualan.setTotal(rs.getString(7));
        list.add(penjualan);
        }
         return list;
   
    }
    
}
