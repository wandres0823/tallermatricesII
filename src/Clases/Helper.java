/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adalberto
 */
public class Helper {
   public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
}
     public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }
      public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }
      
       public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    } 
    
     public static void LetraB(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
         if (j==nc-1 && i!=0 && i!=nf-1 && i!=nf/2 || j==0 || i==0 && j!=nc-1 || i==nf-1 && j!=nc-1 || i==nf/2 && j!=nf-1){
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
           }
    public static void LetraK(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (nf -1 -i-4 == j || j==0|| i==j+4) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }
    

    public static void LetraM(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((i + j == nf - 1 && i <= j) || (i == j && i + j <= nf)|| j==nf-1 || j==0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
}
        public static void LetraW(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((i + j == nf - 1 && i >= j) || (i == j && i + j >= nf)|| j==nf-1 || j==0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
}
        public static void LetraQ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i==0 && j!=0 && j!=nc-1 || j==0 && i!=0 && i!=nc-1 && i!=nc-2 || i==nf-2 && j!=0 && j!=nc-1 || j==nc-1 && i!=0 && i!=nc-2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
}
        public static void LetraJ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (  i == 0 || j== nc/2 ||( i == nf-1 && j <nc/2)||  j==  0 && i> nc/2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
         
}
public static void LetraG(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (  j == 0||i == 0||  i== nf -1 ||j== nc - 1 &&i<=(nc/2)-2 || i== nf /2||( j == nc - 1 &&i> nf/2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        } 
}        
   public static void LetraR(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (( j == 0 || i == 0   || i == nf / 2) || (j == nc - 1 && i< nf/2)|| j == i && i+j >= nc) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }       

        public static void Figura1(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i >= j && j>= nf-1-i|| i <=j && j <= nf -1-i) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
         
}
        public static void Figura2(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j >= i && i>= nf-1-j|| j <=i && i <= nf -1-j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
         
}

        public static void Figura3(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (  j== nc/2 || i== nf /2|| j== (nc/2)-1|| i==( nf /2)-1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
         
}
        
public static void Figura4(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == j-nf/2 || j==nf/2 - i   || j==nf - i + nf/2-1   || i == j+nf/2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    }