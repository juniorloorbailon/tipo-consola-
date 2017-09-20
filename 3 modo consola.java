package  ilusimplementee ;

import  javax.swing.JOptionPane ;

Todos los derechos reservados
 *
 * @author junior loor
 * /
public  class  Principal {

    Todos los derechos reservados
     * @param args los argumentos de la línea de comandos
     * /
    public  static  void  main ( String [] args ) {
        ListaSimpleE lista = nuevo  ListaSimpleE ();
        int opcion = 0 ;
        int dato;
        hacer {
        
        
        tratar {
            opcion = Entero . parseInt ( JOptionPane . showInputDialog ( null , " LISTA SIMPLE ENLAZADA   \ n \ n  "
                    +  " 1. Agregar un elemento al inicio de la lista \ n  "
                    +  " 2. Agregar un elemento al Final de la lista \ n  "
                    +  " 3. Eliminar un elemento de la lista de la lista \ n  "
                    +  " 4. Eliminar un elemento del Final de la lista \ n "
                    +  " 5. Mostrar del inicio \ n "
                    +  " 6. Mostrar del fin \ n "
                    +  " 7. Insertar antes del final \ n "
                    +  " 8. Salir " , " Menú de Opciones " , 3 ));
        switch (opcion) {
            
            caso  1 :
                tratar {
                   dato = Entero . parseInt ( JOptionPane . showInputDialog ( nulo , " Ingrese el elemento: " , " Insertando al incicio " , 3 ));
                           // Agregando al Inicio
                            Lista . agregarAlInicio (dato);
                            } catch ( NumberFormatException n) {
                     JOptionPane . showMessageDialog ( null , " Error " + n . getMessage ());
                    }
            
            romper ;
                
            Caso  2 :
                 tratar {
                    dato = Entero . parseInt ( JOptionPane . showInputDialog ( nulo , " Ingrese el elemento: " , " Insertando al Final " , 3 ));
                           // Agregando al Inicio
                            Lista . agregaralFinal (dato);
                            } catch ( NumberFormatException n) {
                     JOptionPane . showMessageDialog ( null , " Error " + n . getMessage ());
                    }
                romper ;
            caso  3 :
                 dato = lista . borrarDelInicio ();
                 JOptionPane . showMessageDialog ( null , " El elemento eliminado es " + dato, " Eliminando Nodo del Inicio " ,
                         JOptionPane . INFORMATION_MESSAGE );
                romper ;
            caso  4 :
                 dato = lista . borrarDelFin ();
                JOptionPane . showMessageDialog ( null , " El elemento eliminado es " + dato, " Eliminando Nodo del Final " ,
                        JOptionPane . INFORMATION_MESSAGE );
                romper ;
            caso  5 :
                Lista . mostrarLista ();
                romper ;
            caso  6 :   
                Lista . mostrarAlFinal ();
                romper ;
            / * * caso 7:
             tratar{
                   dato = Integer.parseInt (JOptionPane.showInputDialog (nulo, "Ingrese el elemento:", "Insertando antes del final", 3));
                           // Agregando al Inicio
                            lista.insertarAntesDelFinal ();
                            } catch (NumberFormatException n) {
                     JOptionPane.showMessageDialog (null, "Error" + n.getMessage ());
                    
            descanso;  * /
                            
            caso  8 :
                  JOptionPane . showMessageDialog ( nulo , " Programa Finalizado " );
                romper ;
                por defecto :
                  JOptionPane . showMessageDialog ( nulo , " Opcion Incorrecta " );
        }
        
        
        } catch ( Excepción e) {
              JOptionPane . showMessageDialog ( null , " Error " + e . getMessage ());
        
        }
        
        } while (opcion ! = 8 );
        
        
    }
    
}