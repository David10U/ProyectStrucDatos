/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Menu;

import Modulo1.NodosP;
import Modulo1.Producto;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author DAVID
 */
public class MenuPrincipal {

    //variables estaticas
    static Producto pruebaPila = new Producto();
    static NodosP productoSeleccionado = new NodosP();
    
    
    public static void main(String[] args) {
        /*MAIN MENU*/
        menuPrincipal();
         //variables
        
    }

    public static void menuPrincipal() {
        String[] opcionesMenu = {"1 - Productos", "2 - Clientes", "3 - Carrito", "4 - Facturacion", "5 - Reportes", "6 - Salir"};

        //el opciones es el arreglo de opciones que tenemos y el opciones[0] es el default si el usuario presiona enter 
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Menú principal", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesMenu, opcionesMenu[0]);
        switch (seleccion) {
            case 0: //productos
            {
                SubMenuProductos();

                break;
            }
            case 1: // Clientes
            {
                break;
            }
            case 2: //Carrito
            {
                break;
            }
            case 3: //Facturacion
            {
                break;
            }
            case 4: //reportes
            {
                break;
            }
            default: //salir
            {
                System.exit(0);
            }
        }
    }

    private static void SubMenuProductos() {

        String[] opciones = {"1 - Agregar Productos", "2 - Ver Productos Disponibles", "3 - Seleccionar Productos", "4 - Regresar"};
        System.out.println("TEST");
        int seleccionProd = JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Menú principal", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        
        
        
        switch (seleccionProd) {
            case 0: {
                
                int resp;
                do
                {
                    pruebaPila.push();
                     resp= JOptionPane.showOptionDialog(null,"Agregar Otro producto?" ,"Confirmacion" ,JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE ,null ,new Object[]{"Si","No"} ,"Si" );
                }while (resp!=JOptionPane.NO_OPTION );
                SubMenuProductos();
                break;
            }
            case 1: 
            {
                
                pruebaPila.recorridoPila();
                SubMenuProductos();
                break;
            }
            case 2: 
            {
                
                //productoSeleccionado = pruebaPila.pop();
                break;
            }
            default: {
                menuPrincipal();
                break;
            }
        }

    }

}
