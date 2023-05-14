package problema2;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        boolean bandera;
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleado = new ArrayList<>(); //para almacenar una lista con varios objetos :p       
        bandera = true;
        while(bandera){
        System.out.println("AGREGAR UN EMPLEADO:                  [1]");
        System.out.println("MOSTRAR INFO. DE LOS EMPLEADOS        [2] ");
        System.out.println("CALCULAR AUMENTO DE SALARIO:          [3]");
        System.out.println("SALIR                                 [4]");
        int opcion = sc.nextInt();
        if(opcion == 1){
            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = sc.next();
            System.out.println("Ingrese el salario del empleado: ");
            double salario = sc.nextDouble();
            System.out.println("Ingrese la edad del empleado: ");
            int edad = sc.nextInt();
            sc.nextLine();
            empleado.add(new Empleado(nombre, salario, edad)); //se instancia la lista de objetos con los parametros 
        }else if(opcion == 2){
            for(Empleado empl:empleado){    
                System.out.println(empl);
        }
             }else if(opcion==3){
                 System.out.println("Ingrese la cantidad de porcentaje para aumento salarial: ");
                 int aumento = sc.nextInt();
                 double s= 0;
                 for (Empleado empl:empleado){
                     s += empl.getSalario(); //suma de total de los salarios del numero de empleados 
                 }
                 s/= empleado.size(); //divide la suma total de los salarios de todos los empleados s entre el número total de empleados empleado.size()
                 
                 for (Empleado empl : empleado) {
                    if (empl.getSalario() < s) {
                        double saumento = empl.getSalario() * aumento / 100.0;
                        double nuevoSalario = empl.getSalario() + saumento;         //el auxiliar epml. llama a los metodos para asi poder hacer las opreciones 
                        empl.setSalario(nuevoSalario); //envia el numero salario el metodo set para actualizar 
                        System.out.println("El nuevo salario de "+empl.getNombre()+" es de: "+ nuevoSalario);
                    }
}
             }else if(opcion == 4){
                 bandera = false;
             }
        }
    }
    
}
