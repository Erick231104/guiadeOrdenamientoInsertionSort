public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World, metodo de ordenamiento por inserion");
        
        int [] arr = {12, 11, 13, 5, 6};

        System.out.println("Arreglo original");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        System.out.println();

        System.out.println("============================");
        insertionsort(arr);// Llamada al metodo de ordenamiento por insercion

        System.out.println("Arreglo ordenado");
        for (int num : arr){
            System.out.println(num + " ");
        }
    }

   
   //Metodo de ordenamiento de insercion
       private static void insertionsort(int[] arr){

        int n = arr.length;
        int i;
          for (i = 1; i < n; i++){
          int key = arr[i]; // Seleccionamos el elomento a insertar en su posicion correcta
          int j = i - 1;
          // Movemos los elementos que key a una posicion adelante de su posicion 
          // actual 
          while (j >= 0 && arr[j] > key ){
              arr[j + 1 ] = arr[j];
              j--; 
           }
          arr[j + 1] = key; // Insertamos key en su posicon correcta
       
         }
       }
      
    


}  
    

//Nombre:Erick Mateo Sequeira Centeno
//Numero de Carnet: 2024-1660U
