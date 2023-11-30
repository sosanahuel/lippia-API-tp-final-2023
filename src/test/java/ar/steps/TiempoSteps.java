package ar.steps;

import ar.validator.TiempoValidador;
import io.cucumber.java.en.And;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

import static ar.validator.TiempoValidador.obtengoElIdCreado;
import static services.BaseService.*;

public class TiempoSteps {
    @And("se obtiene los tiempos")
    public void seObtienenLosTiempos(){
        TiempoValidador.obtengoLosTiempos();
    }
    public static String convertirAFechaISO(String fechaEnFormatoYYYYMMDD) {
        try {
            SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy-MM-dd");
            formatoEntrada.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date fecha = formatoEntrada.parse(fechaEnFormatoYYYYMMDD);
            Random random = new Random();
            int hora = random.nextInt(23);
            int minuto = random.nextInt(59);
            int segundo = random.nextInt(59);
            SimpleDateFormat formatoSalida = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            formatoSalida.setTimeZone(TimeZone.getTimeZone("UTC"));
            fecha.setHours(hora);
            fecha.setMinutes(minuto);
            fecha.setSeconds(segundo);
            return formatoSalida.format(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    @And("agrego un nombre {string}, hora inicio {string} y hora de fin {string}")
    public void agregoUnNombreNombreHoraInicioHorasInicioYHoraDeFinHorasFin(String nombre,String fechaInicio, String fechaFin ) {
        TIEMPO_NOMBRE.set(nombre);
        TIEMPO_INICIO.set(convertirAFechaISO(fechaInicio));
        TIEMPO_FIN.set(convertirAFechaISO(fechaFin));
    }

    @And("guardo el ID del tiempo creado y lo cambio de nombre a {string}")
    public void guardoElIDDelTiempoCreadoYLoCambioDeNombreANuevoNombre(String nuevoNombre) throws InterruptedException {
        obtengoElIdCreado();
        TIEMPO_NUEVO_NOMBRE.set(nuevoNombre);
        //Espera para mostrar que realemente edita el time entry
        Thread.sleep(2000);
    }

    @And("guardo el ID del tiempo creado para eliminarlo")
    public void guardoElIDDelTiempoCreadoParaEliminarlo() throws InterruptedException {
        obtengoElIdCreado();
    }
}
