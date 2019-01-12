/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author LLira
 */
public class Ordenamientos {
    public static void shellSort(int[] datos){
        int k= (datos.length + 1)/2;
        int aux= 0;
        
        while(k >= 1){
            boolean ban= true;
            while(ban){
                ban = false;
                for (int i = 0; i < datos.length - k; i++) {
                    if (datos[i]>datos[i + k]) {
                        aux= datos[i];
                        datos[i]= datos[i+k];
                        datos[i+k]= aux;
                        ban= true;
                    }
                }
            }
            k= k/2;
        }
    }
    
    public static void quickSort(int[] data, int start, int stop) {
        int left = start;
        int right = stop;
        int x = start;
        boolean flag = false;
        int aux = 0;

        while (flag&&left<right) {
            flag = false;
            while (left < right && data[x] <= data[right]) {
                right--;
            }
            if (left < right) { 
                aux = data[x];
                data[x] = data[right];
                data[right] = aux;
                flag = true;
            }

            while (left < right && data[left] < data[x]) {

                left++;

            }
            if (left < right) {
                aux = data[left];
                data[left] = data[x];
                data[x] = aux;
                x = left;
                flag = true;
            }
        }
        
        if (start<x-1){
            quickSort(data,start,x-1);
        }
        
        if(x+1<stop){
            quickSort(data,x+1,stop);
        }
        
    }
    
    public static int[]mezcla(int[]a, int[]b){
        int i = 0; //indice del arreglo a
        int j = 0; //indice del arreglo b
        int k = 0; //indice del arreglo c
        int[]c=new int[a.length+b.length];
        
        while(i < a.length && j < b.length){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }else{
                c[k]=b[j++];
            }
        }
        
            if (i>=a.length) { 
                for (int x = j; x < b.length; x++) {
                    c[k++]=b[x];
                }
            }else{
                for (int x = i; x < a.length; x++) {
                    c[k++]=a[x];
                }
            }
            
            return c;
        
    }
    
    public static int[][] insercionDirecta(int[] data, char orden){
        
        int tam = data.length;
        int[][] pasadas = new int[tam-1][tam];
        int j = 0;
        int aux;
        for (int i = 1; i < tam; i++) {
            j = i;
            
            if (orden == 'a') {
                while(j >= 1 && data[j] < data[j-1]){
                aux = data[j];
                data[j] = data[j-1];
                data[j-1] = aux;
                j--;
            }
            }else{
                while(j >= 1 && data[j] > data[j-1]){
                aux = data[j];
                data[j] = data[j-1];
                data[j-1] = aux;
                j--;
            }
            }
            
            //save
            for (int k = 0; k < tam; k++) {
                pasadas[i-1][k] = data[k];
            }
            
        }
        return pasadas;
    }
    
    public static int[][] burbuja(int[] data, char orden) {
        int tam = data.length;
        int[][] pasadas = new int[tam - 1][tam];
        int aux = 0;
        for (int pivote = 0; pivote < tam - 1; pivote++) {

            for (int k = pivote + 1; k < tam; k++) {
                if (orden == 'a') { //asc
                    if (data[k] < data[pivote]) {

                        aux = data[k];
                        data[k] = data[pivote];
                        data[pivote] = aux;

                    }
                } else { //desc
                    if (data[k]>data[pivote]) {

                        aux = data[k];
                        data[k] = data[pivote];
                        data[pivote] = aux;

                    }
                }
                
            }
            for (int k = 0; k < tam; k++) {
                pasadas[pivote][k] = data[k];
            }
          
        }
        return pasadas;  
    }
    
//    public static void upgradedBubble(int[] data){ //cuz upgraded thingz are better
//        int tam = data.length;
//        int aux = 0;
//        for (int pivot = 0; pivot < tam-1; pivot++) {
//            int pos = pivot;
//            for (int k = pivot+1; k < tam; k++) {
//                if (data[k]<data[pos]) {
//                    pos = k;
//                }
//            }
//            if (pos!=pivot) {
//                aux = data[pivot];
//                data[pivot] = data[pos];
//                data[pos] = aux;
//            }
//            System.out.println("Pasada #" + (pivot+1) + " :" );
//            mostrarDatos(data);
//        }
//    }
    
    public static int[][] upgradedBubble(int[] data, char orden){ 
        int tam = data.length;
        int aux = 0;
        int[][] pasadas = new int[tam - 1][tam];
        for (int pivot = 0; pivot < tam-1; pivot++) {
            int pos = pivot;
            for (int k = pivot+1; k < tam; k++) {
                ////////////////////////////////////

                if (orden == 'a') {

                    if (data[k] < data[pos]) {
                        pos = k;
                    }

                } else {
                    if (data[k] > data[pos]) {
                        pos = k;
                    }
                }
                
                
            }
            if (pos!=pivot) {
                aux = data[pivot];
                data[pivot] = data[pos];
                data[pos] = aux;
            }
            
            for (int k = 0; k < tam; k++) {
                pasadas[pivot][k] = data[k];
            }
            
        }
        return pasadas;  
    }
    
    
    
    
    
    //Muestra los datos
    public static void mostrarDatos(int[] data){
        for (int i = 0; i < data.length; i++) {
            
            System.out.print("\t"+data[i]);
            
        }
        System.out.println("");
    }

    static void upgradedBubble(int[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
