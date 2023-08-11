package v0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new Empleado(1, "Oscar Blancarte", "Systems"));
        listaEmpleados.add(new Empleado(2, "Liliana Castro", "Systems"));
        listaEmpleados.add(new Empleado(3, "Fernanda Martinez", "Systems"));
        listaEmpleados.add(new Empleado(4, "Manuel Lopez", "RH"));
        listaEmpleados.add(new Empleado(5, "Rebeca Perez", "Systems"));
        listaEmpleados.add(new Empleado(1, "Oscar Blancarte", "Systems"));

        
        List<Empleado> empleadosSystemsOrdenadosSinDuplicados = listaEmpleados.stream()
                .filter(empleado -> empleado.getDepartamento().equals("Systems"))
                .sorted(Comparator.comparing(Empleado::getNombre))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Empleados del departamento Systems (ordenados por nombre y sin duplicados):");
        for (Empleado empleado : empleadosSystemsOrdenadosSinDuplicados) {
            System.out.println("ID: " + empleado.getId());
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Departamento: " + empleado.getDepartamento());
            System.out.println();
        }
    }
 }
	