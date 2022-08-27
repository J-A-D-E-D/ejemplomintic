import ProyectoFinal.Empleado;
import ProyectoFinal.Empresa;
import ProyectoFinal.MovimientoDinero;

public class main {
        public static void main(String[] args) {
                Empleado empleado = new Empleado();
                Empresa empresa = new Empresa();
                MovimientoDinero movimientodinero = new MovimientoDinero();
                empleado.setNombreEmpleado("Andres");
                empleado.setCorreoEmpleado("pepito@gmail.com");
                empleado.setEmpresaEmpleado("JADED");
                empleado.setRolEmpleado("administrador");

                empresa.setDireccionEmpresa("Calle 3");
                empresa.setNitEmpresa(56651);
                empresa.setNombreEmpresa("JADED");
                empresa.setTelefonoEmpresa(5555555);

                movimientodinero.setUsuarioEncargado("Dannys");
                movimientodinero.setMontoMovimiento(100);
                movimientodinero.setConceptoMovimiento("hola");
                movimientodinero.setTipoMonto(true);

                System.out.println(empleado.getNombreEmpleado());
                System.out.println(movimientodinero.getMontoMovimiento());
        }
}