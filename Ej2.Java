public class Ej2 {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", 1000, 3);
        empleados[1] = new Empleado("María", 2000, 6);
        empleados[2] = new Empleado("Pedro", 1500, 2);

        for (Empleado empleado : empleados) {
            if (empleado.getAntiguedad() > 5) {
                empleado.aumentarSalario(10);
            }
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario actualizado: " + empleado.getSalario());
            System.out.println("--------------------------");
        }
    }

    public static class Empleado {
        private String nombre;
        private double salario;
        private int antiguedad;

        public Empleado(String nombre, double salario, int antiguedad) {
            this.nombre = nombre;
            this.salario = salario;
            this.antiguedad = antiguedad;
        }

        public String getNombre() {
            return nombre;
        }

        public double getSalario() {
            return salario;
        }

        public int getAntiguedad() {
            return antiguedad;
        }

        public void aumentarSalario(double porcentaje) {
            salario += salario * porcentaje / 100;
        }
    }
}