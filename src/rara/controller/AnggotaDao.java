/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rara.controller;

import java.sql.Connection;
import java.util.List;
import rara.model.Anggota;

/**
 *
 * @author USER
 */

public interface AnggotaDao {
    public void insert(Connection con, Anggota anggota) throws Exception;
    public void update(Connection con, Anggota anggota) throws Exception;
    public void delete(Connection con, Anggota anggota) throws Exception;
    public Anggota getAnggota(Connection con, String kode) throws Exception;
    public List<Anggota> getAllAnggota(Connection con) throws Exception;
   
} 

