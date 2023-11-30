package services;

import com.crowdar.api.rest.MethodsService;

public class BaseService extends MethodsService {
    public static final ThreadLocal<String> API_KEY = new ThreadLocal<>();
    public static final ThreadLocal<String> PRIMER_ESPACIO_DE_TRABAJO = new ThreadLocal<>();
    public static final ThreadLocal<String> ID_USUARIO = new ThreadLocal<>();
    public static final ThreadLocal<String> ID_PROYECTO = new ThreadLocal<>();
    public static final ThreadLocal<String> TIEMPO_INICIO = new ThreadLocal<>();
    public static final ThreadLocal<String> TIEMPO_FIN = new ThreadLocal<>();
    public static final ThreadLocal<String> TIEMPO_NOMBRE = new ThreadLocal<>();
    public static final ThreadLocal<String> TIEMPO_NUEVO_NOMBRE = new ThreadLocal<>();
    public static final ThreadLocal<String> TIEMPO_NUEVO_ID = new ThreadLocal<>();

}
