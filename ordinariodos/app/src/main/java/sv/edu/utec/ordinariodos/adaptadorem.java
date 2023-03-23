package sv.edu.utec.ordinariodos;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adaptadorem  extends ArrayAdapter<String> {
    Activity contexto;
    String []nombre;
    Integer [] imagenfoto;
    String []carg;

    String []comp;
    ImageView imgfoto;
    TextView txNombre,tCargo,tCompañia;
    public adaptadorem(Activity contexto, String[]nombre,String []carg,String []comp, Integer[] imagenfoto) {
        super(contexto, R.layout.empleados, nombre);
        this.contexto = contexto;
        this.nombre = nombre;
        this.carg = carg;
        this.comp = comp;
        this.imagenfoto = imagenfoto;
    }
    public View getView(int posicion, View v, ViewGroup parent) {
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.empleados, null, true);
        txNombre = rowView.findViewById(R.id.txtnombre);
        tCargo = rowView.findViewById(R.id.txtcargo);
        tCompañia = rowView.findViewById(R.id.txtcomp);
        imgfoto = rowView.findViewById(R.id.imgfoto);
        txNombre.setText(nombre[posicion]);
        tCargo.setText(carg[posicion]);
        tCompañia.setText(comp[posicion]);
        imgfoto.setImageResource(imagenfoto[posicion]);
        return rowView;
    }
}
