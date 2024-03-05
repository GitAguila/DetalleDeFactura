import java.util.InputMismatchException;
import java.util.Scanner;

/*
EJERCICIO: Se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner
PROGRAMA: Es un programa el cual ayuda a crear una factura a una empresa de servicios por ejemplo:
Hacer una factura a x empresa, para los servicios SEO que se hayan realizado para dicha empresa
 */
public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Recibe los datos de la empresa que OFRECE sus servicios
        System.out.println("Introduce el nombre de su empresa: ");
        String nombreEmp = scanner.nextLine();
        System.out.println("nombreEmp = " + nombreEmp);

        System.out.println("Introduce la dirección de su empresa: ");
        String direccion = scanner.nextLine();
        System.out.println("direccion = " + direccion);

        System.out.println("Introduce el NIF de su empresa: ");
        String nif = scanner.nextLine();
        System.out.println("nif = " + nif);

        System.out.println("Introduce el correo de su empresa: ");
        String correo = scanner.nextLine();
        System.out.println("correo = " + correo);

        System.out.println("Introduce el teléfono de su empresa: ");
        int tlf = 0;
        try {
            tlf = Integer.parseInt(scanner.nextLine());
            System.out.println("tlf = " + tlf);
        } catch (NumberFormatException e) {
            System.out.println("Error, tienes que poner números.");
            System.out.println("----------------------------------------");
            main(args);
            System.exit(0);
        }

        System.out.println("Introduce la web de su empresa: ");
        String web = scanner.nextLine();
        System.out.println("web = " + web);


        //Recibe los datos de la empresa que RECIBE sus servicios
        System.out.println("Introduce el nombre de la empresa que recibe la factura: ");
        String nombreEmp2 = scanner.nextLine();
        System.out.println("nombreEmp = " + nombreEmp2);

        System.out.println("Introduce la dirección de la empresa que recibe la factura: ");
        String direccion2 = scanner.nextLine();
        System.out.println("direccion = " + direccion2);

        System.out.println("Introduce el NIF de la empresa que recibe la factura: ");
        String nif2 = scanner.nextLine();
        System.out.println("nif = " + nif2);


        //Servicios ofrecidos
        System.out.println("Introduce el número de identificación (Crear factura):");
        String idFactura = scanner.nextLine();
        System.out.println("idFactura = " + idFactura);

        System.out.println("Introduce la fecha de factura: ");
        String fechaFactura = scanner.nextLine();
        System.out.println("fechaFactura = " + fechaFactura);

        System.out.println("Introduce la fecha de vencimiento de la factura: ");
        String fechaVencimiento = scanner.nextLine();
        System.out.println("fechaVencimiento = " + fechaVencimiento);

        System.out.println("Introduce la descripción del primer trabajo: ");
        String descripcion = scanner.nextLine();
        System.out.println("descripcion = " + descripcion);

        System.out.println("Introduce el número de horas que se realizó dicho trabajo: ");
        int horasTrabajadas = 0;
        try{
            horasTrabajadas = Integer.parseInt(scanner.nextLine());
            System.out.println("horasTrabajadas = " + horasTrabajadas);
        } catch (NumberFormatException e) {
            System.out.println("Error, tienes que introducir números.");
            System.out.println("----------------------------------------");
            main(args);
            System.exit(0);
        }

        System.out.println("Introduce el precio del trabajo: ");
        double precio = 0;
        try {
            precio = scanner.nextDouble();
            System.out.println("precio = " + precio);
        } catch (InputMismatchException e){
            System.out.println("Error, tienes que introducir números");
            System.out.println("----------------------------------------");
            main(args);
            System.exit(0);
        }

        System.out.println("Introduce la descripción del segundo trabajo: ");
        String descripcion2 = scanner.nextLine();
        scanner.nextLine();
        System.out.println("descripcion = " + descripcion2);

        System.out.println("Introduce el número de horas que se realizó dicho trabajo: ");
        int horasTrabajadas2 = 0;
        try{
            horasTrabajadas2 = Integer.parseInt(scanner.nextLine());
            System.out.println("horasTrabajadas2 = " + horasTrabajadas2);
        } catch (NumberFormatException e) {
            System.out.println("Error, tienes que introducir números.");
            System.out.println("----------------------------------------");
            main(args);
            System.exit(0);
        }

        System.out.println("Introduce el precio del trabajo: ");
        double precio2 = 0;
        try {
            precio2 = scanner.nextDouble();
            System.out.println("precio = " + precio2);
        } catch (InputMismatchException e){
            System.out.println("Error, tienes que introducir números");
            System.out.println("----------------------------------------");
            main(args);
            System.exit(0);
        }

        System.out.println("Introduce el % de descuento aplicable a la factura: ");
        double descuento = 0;
        try{
            descuento = scanner.nextDouble();
            System.out.println("descuento = " + descuento);
        } catch (NumberFormatException e) {
            System.out.println("Error, tienes que introducir números.");
            System.out.println("----------------------------------------");
            main(args);
            System.exit(0);
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("FACTURA");
        String datosEm = "Empresa: " + nombreEmp + "\n" + direccion + "\nNIF: " + nif + " E-mail: " +
                correo + " Teléfono: " + tlf + "\nPágina web: " + web;
        System.out.println(datosEm);

        String datosEm2 = "Factura a: " + nombreEmp2 + "\n" + direccion2 + "\n" + nif2;
        System.out.println(datosEm2);

        String datosFactura = "Factura: " + idFactura + "\nFechaDeFactura: " + fechaFactura +
                " Fecha de vencimiento: " + fechaVencimiento;
        System.out.println(datosFactura);

        String datosServicios = "descripcion = " + descripcion + " horasTrabajadas = " + horasTrabajadas +
                " precio = " + precio + " descuento = " + descuento;
        System.out.println(datosServicios);


        double importe = horasTrabajadas * precio + horasTrabajadas2 * precio2;
        System.out.println("importe = " + importe + "€");

        double descuentoAplicado = (descuento / 100) * importe;
        System.out.println("descuentoAplicado = -" + descuentoAplicado + "€");

        double iva = ((double) 19 / 100) * (importe - descuentoAplicado);
        System.out.println("IVA = " + iva + "€");
        double total = importe - descuentoAplicado + iva;
        System.out.println("total a pagar = " + total + "€");

        System.out.println("------------------------------------------------------------");
        String end = ("La descripción de los trabajos ofrecidos son: " + descripcion + " y " + descripcion2 +
                "tienen un total bruto(antes del impuesto) de " + importe + "€, con un impuesto del 19% de IVA que se queda en " +
                iva + "€ y el monto después de impuesto es de " + total +
                "€\nTérminos y Condiciones \nA pagar en los 14 siguientes días a la prestación del servicio. " +
                "\nPuedes pagarnos a través de transferencia bancaria al IBAN ES64 xxxx xxxx xxxx xxxx");
        System.out.println(end);
    }
}