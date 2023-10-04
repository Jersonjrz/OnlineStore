/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import config.Conexion;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bartsam
 */
public class ProductoDAO {
     Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    //Método para listar todos los productos creados en el SQL
    public List listar() {
        List<Producto> productos = new ArrayList();
        String sql = "select * from producto";
        System.out.println("Pasa por SQL");
        try {
            con = (Connection) cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(rs.getInt(1));
                p.setNombreProducto(rs.getString(2));
                p.setFotoProducto(rs.getBinaryStream(3));
                p.setDescProducto(rs.getString(4));
                p.setPrecioProducto(rs.getDouble(5));
                p.setStockProducto(rs.getInt(6));
                productos.add(p);
            }

        } catch (Exception e) {
        }

        return productos;
    }

    public void listarImg(int id, HttpServletResponse response) {
        String sql = "select * from producto whre idProducto=" + id;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            outputStream = response.getOutputStream();
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();    
            if(rs.next()){
                inputStream = rs.getBinaryStream("Foto");
             }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            int i = 0;
            while((i = bufferedInputStream.read()) != -1){
                bufferedOutputStream.write(i);
            }
        } catch (Exception e) {
        }

    }
}
