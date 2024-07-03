package TrabajoInventario;
import java.time.LocalDate;
import java.util.Scanner;

public class ejecutor {
    public static void main(String[] args) {
        Empresa emp = new Empresa("TI","Lima");
   //     emp.agregarInventario(new Inventario("1234","Lenovo","L34","23Junio2023","15Julio2024"));
        emp.listarInventario();
        System.out.println();
     //   emp.agregarInventario(new PCescritorio("012","DELL","D12","10Enero2022","20Agosto2024","Teclado y Mouse"));
        emp.listarInventario();
        System.out.println();
    //    emp.agregarInventario(new Laptop("L002","HP","HP123","15Mayo2022","20Agosto2024",true));
        emp.listarInventario();
        System.out.println();
    //    emp.agregarInventario(new Servidor("S001","HP","H526","12Enero2000","12Marzo2030",6));
        emp.listarInventario();

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
            System.out.println("5️⃣  Eliminar un equipo");
            System.out.println("6️⃣  Salir");
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
                                System.out.print("Ingrese la fecha de registro (ddMMyyyy): ");
                                String fechaRegistro = scanner.nextLine();
                                System.out.print("Ingrese la fecha de baja del equipo (ddMMyyyy): ");
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
                                System.out.print("Ingrese la fecha de registro (ddMMyyyy): ");
                                String fechaRegistrob = scanner.nextLine();
                                System.out.print("Ingrese la fecha de baja del equipo (ddMMyyyy): ");
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
                                System.out.print("Ingrese la fecha de registro (ddMMyyyy): ");
                                String fechaRegistroc = scanner.nextLine();
                                System.out.print("Ingrese la fecha de baja del equipo (ddMMyyyy): ");
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
                    System.out.println("\nSe muestra el listado de equipos:");
                    // Aquí deberías llamar al método que lista los equipos de la empresa
                    // emp.listarEquipos();
                    break;
                case 3:
                    System.out.println("\nEquipos próximos a renovar:");
                    // Aquí deberías implementar la lógica para mostrar equipos próximos a renovar
                    break;
                case 4:
                    System.out.println("\nIngrese el código del equipo a buscar:");
                    // Aquí deberías implementar la lógica para buscar un equipo por código
                    break;
                case 5:
                    System.out.println("\nEliminar un equipo");
                    // Aquí deberías implementar la lógica para eliminar un equipo
                    break;
                case 6:
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, ingrese una opción válida.");
            }

            System.out.println(); // Imprimir una línea en blanco para mejor legibilidad
        } while (opcion != 6);

        scanner.close(); // Cerrar el scanner al salir del programa
    }
}



