package sv.edu.utec.ordinariodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] nombre={"Alexander Pierrot","Carlos Lopez", "Sara Bonz", "Liliana Clarence","Benito Peralta","Juan Jaramillo",
            "Christian Steps","Alexa Giraldo","Linda Murillo","Lizeth Astrada"};
    String [] carg={"CEO","Asistente","Directora de Marketing", "Diseñadora de Producto","Supervisor de Ventas","CEO","CEO","Lead Programmer","Directora de Marketing","CEO"};
    String [] comp={"Insures S,O","Hospital Blue","Electrical Parts Itd", "Creativa App","Neumaticos Press","Banco Nacional","Cooperativa Verde","Frutisofy","Seguros Boliver","Concesionario Motolox"};
    ListView lvstEmpleado;
    Integer[]imagenfoto={

            R.drawable.pierrot,
            R.drawable.lopez,
            R.drawable.bonz,
            R.drawable.clarence,
            R.drawable.peralta,
            R.drawable.jaramillo,
            R.drawable.steps,
            R.drawable.giraldo,
            R.drawable.murillo,
            R.drawable.astrada,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adaptadorem adaptador = new adaptadorem(this, nombre ,carg,comp,imagenfoto);
        lvstEmpleado = findViewById(R.id.lsttrab);
        lvstEmpleado.setAdapter (adaptador);
    }
}