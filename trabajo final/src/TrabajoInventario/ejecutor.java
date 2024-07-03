package TrabajoInventario;
import java.time.LocalDate;
import java.util.Scanner;

public class ejecutor {
    public static void main(String[] args) {
        Empresa emp = new Empresa("TI","Lima");

        System.out.println();
        emp.agregarEquipo(new PCescritorio("012","DELL","D12","10/01/2022","20/08/2024","Teclado y Mouse"));

        System.out.println();
        emp.agregarEquipo(new Laptop("L002","HP","HP123","15/05/2022","20/08/2024",true));

        System.out.println();
        emp.agregarEquipo(new Servidor("S001","HP","H526","12/01/2022","12/03/2030",6));


// Menu
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("🌟 BIENVENIDOS A CONSEJITOS APP 🌟");
            System.out.println("\nMenú:");
            System.out.println("1️⃣  Ingresar nuevo equipo");
            System.out.println("2️⃣  Listado de equipos");
            System.out.println("3️⃣  Ver estado de equipos próximos a renovar");
            System.out.println("4️⃣  Buscar equipos por código");
            System.out.println("5️⃣  Asignar equipo a área");
            System.out.println("6️⃣  Mostrar equipos por área");
            System.out.println("7️⃣  Eliminar un equipo");
            System.out.println("8️⃣  Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    String tipoEquipo;
                    do {
                        System.out.println("\nIngrese el tipo de equipo:");
                        System.out.println("a.- PC escritorio");
                        System.out.println("b.- Laptop");
                        System.out.println("c.- Servidor");
                        tipoEquipo = scanner.nextLine().trim();

                        switch (tipoEquipo) {
                            case "a":
                                System.out.print("Ingrese el código del equipo: ");
                                String codigo = scanner.nextLine();
                                System.out.print("Ingrese la marca del equipo: ");
                                String marca = scanner.nextLine();
                                System.out.print("Ingrese el modelo del equipo: ");
                                String modelo = scanner.nextLine();
                                System.out.print("Ingrese la fecha de registro (dd/mm/yyyy): ");
                                String fechaRegistro = scanner.nextLine();
                                System.out.print("Ingrese la fecha de baja del equipo (dd/mm/yyyy): ");
                                String fechaBajaEquipo = scanner.nextLine();
                                System.out.print("Ingrese accesorios:");
                                String accesorios = scanner.nextLine();

                                 PCescritorio nuevoEquipo = new PCescritorio(codigo, marca, modelo, fechaRegistro, fechaBajaEquipo, accesorios);
                                 emp.agregarEquipo(nuevoEquipo);

                                System.out.println("\nNuevo equipo agregado correctamente:");
                                 System.out.println(nuevoEquipo);

                                break;
                            case "b":
                                System.out.print("Ingrese el código del equipo: ");
                                String codigob = scanner.nextLine();
                                System.out.print("Ingrese la marca del equipo: ");
                                String marcab = scanner.nextLine();
                                System.out.print("Ingrese el modelo del equipo: ");
                                String modelob = scanner.nextLine();
                                System.out.print("Ingrese la fecha de registro (dd/mm/yyyy): ");
                                String fechaRegistrob = scanner.nextLine();
                                System.out.print("Ingrese la fecha de baja del equipo (dd/mm/yyyy): ");
                                String fechaBajaEquipob = scanner.nextLine();
                                System.out.print("Incluye Cooler?(true/false):");
                                 Boolean incluyeCoolerb = scanner.nextBoolean();
                                scanner.nextLine();

                                Laptop nuevoEquipob = new Laptop(codigob, marcab, modelob, fechaRegistrob, fechaBajaEquipob, incluyeCoolerb);
                                emp.agregarEquipo(nuevoEquipob);

                                System.out.println("\nNuevo equipo agregado correctamente:");
                                System.out.println(nuevoEquipob);
                                break;
                            case "c":
                                System.out.print("Ingrese el código del equipo: ");
                                String codigoc = scanner.nextLine();
                                System.out.print("Ingrese la marca del equipo: ");
                                String marcac = scanner.nextLine();
                                System.out.print("Ingrese el modelo del equipo: ");
                                String modeloc = scanner.nextLine();
                                System.out.print("Ingrese la fecha de registro (dd/mm/yyyy): ");
                                String fechaRegistroc = scanner.nextLine();
                                System.out.print("Ingrese la fecha de baja del equipo (dd/mm/yyyy): ");
                                String fechaBajaEquipoc = scanner.nextLine();
                                System.out.print("Ingrese la cantidad de discos:");
                                int CantidadDiscosc = scanner.nextInt();
                                scanner.nextLine();

                                Servidor nuevoEquipoc = new Servidor(codigoc, marcac, modeloc, fechaRegistroc, fechaBajaEquipoc, CantidadDiscosc);
                                emp.agregarEquipo(nuevoEquipoc);

                                System.out.println("\nNuevo equipo agregado correctamente:");
                                System.out.println(nuevoEquipoc);
                                break;
                            default:
                                System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                        }

                        System.out.print("\n¿Desea ingresar otro equipo? (si/no): ");
                    } while (scanner.nextLine().trim().equalsIgnoreCase("si"));
                    break;
                case 2:

                    do {
                        System.out.println("\nSe muestra el listado de equipos:");
                        emp.listarInventario();

                        System.out.print("\n¿Desea realizar otra acción? (si/no): ");
                    } while (scanner.nextLine().trim().equalsIgnoreCase("si"));
                    break;

                case 3:
                    System.out.println("\nEquipos próximos a renovar:");
                    // Aquí deberías implementar la lógica para mostrar equipos próximos a renovar
                    break;
                case 4:
                    do {
                        System.out.print("\nIngrese el código del equipo a buscar: ");
                        String codigoBuscar = scanner.nextLine();
                        try {
                            emp.buscarEquipoPorCodigo(codigoBuscar);
                        } catch (ExceptionInventarioChecked e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.print("\n¿Desea buscar otro equipo? (si/no): ");

                    } while (scanner.nextLine().trim().equalsIgnoreCase("si"));
                    break;

                case 5:

                    System.out.print("\nIngrese el código del equipo a asignar: ");
                    String codigoAsignar = scanner.nextLine();
                    System.out.print("Ingrese el área a la que desea asignar el equipo (Marketing/Tecnologia/Finanzas): ");
                    String areaAsignar = scanner.nextLine().trim().toLowerCase();

                    Inventario equipoAsignar = null;
                    for (Inventario inv : emp.getListaInventario()) {
                        if (inv.getCodigo().equalsIgnoreCase(codigoAsignar)) {
                            equipoAsignar = inv;
                            break;
                        }
                    }

                    if (equipoAsignar != null) {
                        try {
                            emp.asignarEquipoArea(areaAsignar, equipoAsignar);
                        } catch (ExceptionInventarioChecked e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("No se encontró ningún equipo con el código especificado.");
                    }

                    System.out.print("\n¿Desea realizar alguna acción más? (si/no): ");
                    String continuar = scanner.nextLine().trim().toLowerCase();
                    if (continuar.equals("si")) {
                        break;
                    } else if (continuar.equals("no")) {
                        opcion = 8; // Sale del bucle
                    } else {
                        System.out.println("Opción no válida. Se cerrará el programa.");
                        opcion = 8; // Sale del bucle
                    }

                    break;
                case 6:
                    System.out.print("\nIngrese el área para mostrar sus equipos (Marketing/Tecnologia/Finanzas): ");
                    String areaMostrar = scanner.nextLine().trim().toLowerCase();
                    try {
                        emp.mostrarEquiposPorArea(areaMostrar);
                    } catch (ExceptionInventarioChecked e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.print("\n¿Desea realizar alguna acción más? (si/no): ");
                    String continuarCase5 = scanner.nextLine().trim().toLowerCase();
                    if (continuarCase5.equals("si")) {
                        break;
                    } else if (continuarCase5.equals("no")) {
                        opcion = 8; // Sale del bucle
                    } else {
                        System.out.println("Opción no válida. Se cerrará el programa.");
                        opcion = 8; // Sale del bucle
                    }

                    break;
                case 7:
                  // eliminar equipo
                case 8:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, ingrese una opción válida.");
            }

            System.out.println(); // Imprimir una línea en blanco para mejor legibilidad
        } while (opcion != 8);

        scanner.close(); // Cerrar el scanner al salir del programa
    }
}



