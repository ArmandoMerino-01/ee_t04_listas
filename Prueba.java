package ee_t04_listas;

import javax.swing.JOptionPane;

/**
 *
 *
 * @author Armando1
 */
public class Prueba {

    public static void main(String[] args) {
        Lista<Integer> lista1 = new Lista<Integer>();
        int menu = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int m = 0;
        
    do {
         try{
            menu = Integer.parseInt(JOptionPane.showInputDialog("---------------LISTA SIMPLEMENTE LIGADA---------------"
                    + "\n\n********METODOS DE INSERCCION********\n1.Insertar  inicio\n2.Insertar al Final\n3.Insertar Antes De\n4.Insertar Dato Despues De"
                    + "\n\n********METODOS DE ELIMINAR********\n5.Eliminar el Primer Dato\n6.Eliminar el Ultimo Dato\n7.Eliminar Despues De"
                    + "\n\n********METODOS DE BUSQUEDA********\n8.Busqueda Desordenada\n9.Busqueda Recursivo"
                    + "\n\n********METODOS DE RECORRER********\n10.Recorrer Recursivo\n11.Recorrer Iterativo\n12.Inserta Ordenado\n13.salir"));
            switch (menu) {
                case 1:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                    lista1.InsertarInicio(a);
                    System.out.println(lista1 + "\n-------------------------------");
                    break;

                case 2:
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
                    lista1.InsertarFinal(b);
                    System.out.println(lista1 + "\n-------------------------------");
                    break;
                case 3:
                    c = Integer.parseInt(JOptionPane.showInputDialog("insertamos antes de " + a + " digite un numero"));
                    lista1.InsertarAntesDe(c);
                    System.out.println(lista1 + "\n-------------------------------");
                    break;
                case 4:
                    d = Integer.parseInt(JOptionPane.showInputDialog("insertamos despues de " + a + " digite un numero"));
                    lista1.InsertarDespuesDe(d, a);
                    System.out.println(lista1 + "\n-------------------------------");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Eliminamos el primer dato");
                    lista1.EliminarPrimero();
                    System.out.println(lista1 + "\n-------------------------------");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Eliminamos el ultimo dato");
                    lista1.EliminarUltimo();
                    System.out.println(lista1 + "\n-------------------------------");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Eliminamos Despues De " + a);
                    lista1.EliminarDespuesDe(a);
                    System.out.println(lista1 + "\n-------------------------------");
                    break;
                case 8:
                    e = Integer.parseInt(JOptionPane.showInputDialog("Busqueda Desordenada"));
                    lista1.busquedaDesordenada(e);
                    System.out.println(lista1 + "\n-------------------------------");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Busqueda Recursiva");
                     m=Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar"));
                    lista1.busquedaRecursiva(m);
                    System.out.println(lista1 + "\n-------------------------------");
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Recorrer Recursivo");
                    lista1.recorreRecursivo(lista1.getInicio());
                    System.out.println(lista1 + "\n-------------------------------");
                    break;
                case 11:
                        JOptionPane.showMessageDialog(null, "Recorrer Iterativo");
                    lista1.RecorreIterativo();
                    System.out.println(lista1 + "\n-------------------------------");
                    break;
                    
                    case 12:
                         JOptionPane.showMessageDialog(null, "Inserta Ordenado");
                          int k = Integer.parseInt(JOptionPane.showInputDialog("digite un dato para insertar de forma ordenada"));
                    lista1.insertaOrdenado(k);
                    System.out.println(lista1 + "\n-------------------------------");
                         
                    break;
                         case 13:
                    break;
            }
         }catch(Exception excep){
  JOptionPane.showMessageDialog(null,"Elija alguna opcion");
  }
        } while (menu != 13);
    }

}
