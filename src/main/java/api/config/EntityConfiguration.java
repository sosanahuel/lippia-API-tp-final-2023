package api.config;

import services.*;

public enum EntityConfiguration {

    ESPACIO_DE_TRABAJO {
        @Override
        public Class<?> getEntityService() {
            return EspacioTrabajoService.class;
        }
    },
    USERID {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }
    },
    GET_TIEMPOS {
        @Override
        public Class<?> getEntityService() {
            return ObtenerTiempos.class;
        }
    },
    ID_PROYECTO {
        @Override
        public Class<?> getEntityService() {
            return ProyectoService.class;
        }
    },
    AGREGAR_TIEMPOS {
        @Override
        public Class<?> getEntityService() {
            return AgregarTiemposService.class;
        }
    },
    EDITAR_TIEMPO {
        @Override
        public Class<?> getEntityService() {
            return EditarTiempo.class;
        }
    },
    ELIMINAR_TIEMPO {
        @Override
        public Class<?> getEntityService() {
            return EliminarTiempo.class;
        }
    };

    public abstract Class<?> getEntityService();
}



