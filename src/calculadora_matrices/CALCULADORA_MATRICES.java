 
package calculadora_matrices;

import javax.swing.*;




public class CALCULADORA_MATRICES
{ public static void main(String[] args) 
{ // TODO code application logic here 
//Declaracion de variables
    int numfa, numfb, numca, numcb, bandera, opcion;
    bandera=0;
    String aux;
    double matrizA[][] = new double[50][50]; 
    double matrizB[][] = new double[50][50]; 
    double matrizC[][] = new double[50][50]; 
//Mensaje de Bienvenida 
JOptionPane.showMessageDialog(null, "Bienvenido");
JOptionPane.showMessageDialog(null, "Calculadora Basica de Matrices");
JOptionPane.showMessageDialog(null, "Matriz A");
//Dimension de la matriz A y su ingreso
aux = JOptionPane.showInputDialog("Ingrese el numero de filas de la Matriz A");
numfa = Integer.parseInt(aux); aux = JOptionPane.showInputDialog("Ingrese el numero de columnas de la Matriz A"); 
numca = Integer.parseInt(aux); JOptionPane.showMessageDialog(null, "Ingrese los elementos de la Matriz A"); 
for (int i = 0; i < numfa; i++)
{ for (int j = 0; j < numca; j++) 
{ aux = JOptionPane.showInputDialog("elem A:" + i + "-" + j);
matrizA[i][j] = Integer.parseInt(aux); } }
//Dimension de la matriz B y su ingreso
JOptionPane.showMessageDialog(null, "Matriz B");
aux = JOptionPane.showInputDialog("Ingrese el numero de filas de la Matriz B");
numfb = Integer.parseInt(aux);
aux = JOptionPane.showInputDialog("Ingrese el numero de columnas de la Matriz B");
numcb = Integer.parseInt(aux);
JOptionPane.showMessageDialog(null, "Ingrese los elementos de la Matriz B");
for (int i = 0; i < numfb; i++) 
{ for (int j = 0; j < numcb; j++)
{ aux = JOptionPane.showInputDialog("elem B:" + i + "-" + j); matrizB[i][j] = Integer.parseInt(aux); } }
aux = JOptionPane.showInputDialog("Elija una opcion: \n 1: suma \n 2: resta \n 3:multiplicación \n 4:división");
opcion = Integer.parseInt(aux); 
switch (opcion) { case 1: if (numfa == numfb && numca == numcb)
{for (int i = 0; i < numfa; i++) 
{ for (int j = 0; j < numca; j++) { matrizC[i][j] = matrizA[i][j] + matrizB[i][j]; } } }
else { for (int i = 0; i < numfa; i++) 
{ for (int j = 0; j < numcb; j++)
{ matrizC[i][j] = 9999; bandera =1; } } } break; case 2: if (numfa == numfb && numca == numcb)
{ for (int i = 0; i < numfa; i++) 
{ for (int j = 0; j < numca; j++) { matrizC[i][j] = matrizA[i][j] - matrizB[i][j]; } } } 
else 
{ for (int i = 0; i < numfa; i++) 
{ for (int j = 0; j < numcb; j++) { matrizC[i][j] = 9999; bandera =1; } } }
break; case 3: if (numca == numfb)
{ for (int i = 0; i < numfa; i++)
{ for (int j = 0; j < numcb; j++) { matrizC[i][j] = 0;
for (int k = 0; k < numfa; k++) { matrizC[i][j] = matrizC[i][j] + matrizA[i][k] * matrizB[k][j]; } } } }
else
{ for (int i = 0; i < numfa; i++)
{ for (int j = 0; j < numcb; j++) { matrizC[i][j] = 9999; bandera = 2; } } } 
break; case 4: if (numfa == numfb && numca == numcb)
{for (int i = 0; i < numfa; i++) { for (int j = 0; j < numca; j++)
{ if (matrizB[i][j] == 0) { matrizC[i][j] = 9999; } else { matrizC[i][j] = matrizA[i][j] / matrizB[i][j]; } } } }
else 
{ for (int i = 0; i < numfa; i++) { for (int j = 0; j < numcb; j++) { matrizC[i][j] = 9999; bandera =1; } } } 
break; default: System.out.println("ERROR DE OPCION");break;}
if (bandera==1)
{
    JOptionPane.showMessageDialog(null, "Para poder sumar, restar, o dividir matrices \n Las mismas deben der de igual dimension \n es decir mismo numero de filas y columnas ", "Error", JOptionPane.ERROR_MESSAGE); }
if (bandera==2)
{ JOptionPane.showMessageDialog(null, "Para poder multiplicar matrices \n El numero de columnas de la Matriz A debe ser igual al numero de filas de la Matriz B", "Error", JOptionPane.ERROR_MESSAGE); } //Impresion de la matriz A 
System.out.println("MATRIZ A:"); System.out.println();
for (int i = 0; i < numfa; i++) { for (int j = 0; j < numca; j++)
{ System.out.print(matrizA[i][j] + "\t"); }
System.out.println(); } 
//Impresion de la matriz B 
System.out.println();
System.out.println("MATRIZ B:");
System.out.println(); for (int i = 0; i < numfb; i++) { for (int j = 0; j < numcb; j++)
{ System.out.print(matrizB[i][j] + "\t"); }
System.out.println(); }
System.out.println(); System.out.println("MATRIZ RESULTANTE:"); 
System.out.println(); for (int i = 0; i < numfa; i++) 
{ for (int j = 0; j < numcb; j++) { if (matrizC[i][j] == 9999) 
{ System.out.print("error"); } System.out.print(matrizC[i][j] + "\t"); }
System.out.println();
} 
}
}
