package Admin_Usuarios.sqlite;

import android.provider.BaseColumns;

public class AdminUsuarios {

    public abstract class Usuario implements BaseColumns {
        public final static String NOMBRE_TABLA="dn_usuario";
        public final static String ID_USUARIO="us_id_usuario";
        public final static String ID_ESTADO="eu_id_estado";
        public final static String NOMBRE="us_nombre";
        public final static String APELLIDO="us_apellido";
        public final static String CELULAR="us_celular";
        public final static String EMAIL="us_email";
        public final static String DIRECCION="us_direccion";
        public final static String FECHA_NACIMIENTO="us_fecha_nacimiento";
        public final static String FECHA_REGISTRO="us_fecha_registro";
        public final static String CODIGO_ACTIVACION="us_cod_activacion";
        public final static String CONTRASEÑA="us_contraseña";
    }
    public final static String CREATE_TABLE =
            "CREATE TABLE " + Usuario.NOMBRE_TABLA+ " ("+
                    Usuario.ID_USUARIO + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    Usuario.NOMBRE_IMAGEN + " TEXT,"+
                    Usuario.CUENTA + " TEXT,"+
                    Usuario.NOMBRE + " TEXT,"+
                    Usuario.EMAIL + " TEXT,"+
                    Usuario.CLAVE + " TEXT)";
}
