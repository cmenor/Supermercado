/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Supermercado {
    
    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    
    static ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public static void inicializarEstrcutura() {
        Producto p;
        Bebida b;
        BebidaAlcholica ba;
        ProductoCaduca pc;
        Empleado e;
        for (int i = 0; i < 10; i++) {
            e = new Empleado();
            e.setNombre("Pedro");
            e.setEdad(i + 80);
            empleados.add(e);
        }
        for (int i = 0; i < 10; i++) {
            p = new Producto();
            p.setCodigo("COD" + i);
            productos.add(p);
        }
        for (int i = 0; i < 10; i++) {
            b = new Bebida();
            b.setCodigo("COD");
            b.setFecha_cad("Lunes");
            b.setAzucar(i);
            productos.add(b);
        }
        for (int i = 0; i < 10; i++) {
            ba = new BebidaAlcholica();
            ba.setCodigo("COD");
            ba.setFecha_cad("Martes");
            ba.setAzucar(i);
            ba.setGraducacion(i);
            productos.add(ba);
        }
        for (int i = 0; i < 10; i++) {
            pc = new ProductoCaduca();
            pc.setCodigo("COD");
            pc.setFecha_cad("Martes");
            productos.add(pc);
        }
    }
    
    public static void mostrarTodosLosProductos() {
        for (Producto productos : productos) {
            System.out.println(productos.getCodigo());
        }
    }
    
    public static void mostrarAzucarDeTodasLasBebidas() {
        for (Producto productos : productos) {
            if (productos instanceof Bebida) {
                System.out.println(((Bebida) productos).getAzucar());
            }
        }
    }
    
    public static void mostrarAzucarBebidaNoAlcholicas() {
        for (int i = 0; i < productos.size(); i++) {
            if ((productos.get(i) instanceof Bebida)) {
                 //&& (!(productos.get(i) instanceof BebidaAlcholica()));
                System.out.println((Bebida) productos.get(i));
            }
        }
    }
    
    public static void mostrarTodaLasBebidas() {
        
    }
    
    public static void mostrarMediaGraduacionBebidas() {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //inicializarEstrcutura();
        //mostrarTodosLosProductos();
        //mostrarAzucarDeTodasLasBebidas();
        //mostrarTodaLasBebidas();
        //mostrarMediaGraduacionBebidas();
    }
    
}
