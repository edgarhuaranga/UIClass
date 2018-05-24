package com.ehuaranga.uiclass;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;


    public BlankFragment() {
        // Required empty public constructor
    }


    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_lista_actividades);

        HashMap<String, ArrayList<Evento>> fecha = new HashMap<>();
        fecha.put("10:00 - 11:00", new ArrayList<>(Arrays.asList(
                new Evento("Charla", "Charla de orientación sobre las especialidades de Geología, Minas y Metalurgia", "Salón 501 - Biblioteca Central"),
                new Evento("Charla", "Charla de orientación sobre las especialidades de Ing. Económica y Estadística", "Salón 401 - Biblioteca Central"),
                new Evento("Charla", "La mujer y la ingeniería", "Salón 409 - Biblioteca Central"),
                new Evento("Conferencia", "Becas a la Unión Europea: ERASMUS+", "Auditorio del CTIC"),
                new Evento("Visita guiada", "Visita guiada a la Facultad de Ciencias", "Visita a laboratorios (FC)"),
                new Evento("Visita guiada", "Visita guiada a la Facultad de Ingeniería Eléctrica y Electrónica", "Laboratorio de Electrónica"),
                new Evento("Visita guiada", "Visita guiada al Museo de Artes y Ciencias", "Pabellón Central")))
        );
        fecha.put("11:00 - 12:00", new ArrayList<>(Arrays.asList(
                new Evento("Exhibición", "Exhibición de Aikido", "Zona de presentaciones"),
                new Evento("Exhibición", "Exhibición de Capoeira", "Zona de presentaciones"),
                new Evento("Conferencia", "Conferencia: \"Becas, intercambios e internacionalización\"", "Auditorio del CTIC"),
                new Evento("Visita guiada", "Visita guiada a la Facultad de Ingeniería Ambiental", "Centro de Investigación en Tratamiento de Aguas Residuales y Residuos Peligrosos (CITRAR-FAUA)"),
                new Evento("Visita guiada", "Visita guiada al laboratorio del Centro de Energías Renovables y Uso Racional de la Energía, y al Ecocargador Solar", "Laboratorio CER"),
                new Evento("Visita guiada", "Visita guiada a la Facultad de Ingeniería Mecánica", "Laboratorios FIM")))
        );
        fecha.put("12:00 - 13:00", new ArrayList<>(Arrays.asList(
                new Evento("Conferencia", "Becas a Francia", "Auditorio del CTIC"),
                new Evento("Visita guiada", "Visita guiada a la Facultad de Ingeniería Eléctrica y Electrónica", "Laboratorio de Telecomunicaciones (FIEE)"),
                new Evento("Visita guiada", "Visita guiada al Museo de Artes y Ciencias", "Pabellon Central")))
        );
        fecha.put("13:00 - 14:00", new ArrayList<>(Arrays.asList(
                new Evento("Exhibición", "Exhibición de danza Caporales y Tuntuna", "Zona de presentaciones")))
        );
        fecha.put("14:00 - 15:00", new ArrayList<>(Arrays.asList(
                new Evento("Charla", "Charla: \"Inteligencia Artificial\".", "Salón 401 - Biblioteca Central"),
                new Evento("Conferencia", "Conferencia: \"Becas a Suecia\"", "Auditorio del CTIC"),
                new Evento("Taller", "Test de Interés Vocacional", "Salón 409 - Biblioteca Central"),
                new Evento("Visita Guiada", "Visita guiada a la Facultad de Arquitectura, Urbanismo y Artes", "Laboratorio de Fabricación Digital FAUA"),
                new Evento("Visita Guiada", "Visita guiada a la Facultad de Ingeniería Económica, Estadística y Ciencias Sociales", "Laboratorio de Altos Estudios Financieros"),
                new Evento("Visita guiada", "Visita guiada a la Facultad de Ingeniería Geológica, Minera y Metalúrgica", "Museos de Mineralogía, Paleontología,Laboratorio de Mecánica de Rocas y Exhibición de Rescate Minero (FIGMM)")))
        );
        fecha.put("15:00 - 16:00", new ArrayList<>(Arrays.asList(
                new Evento("Taller", "Descubriendo la Ciencia y Tecnología", "Salón 501 - Biblioteca Central"),
                new Evento("Conferencia","Conferencia: \"Becas para estudiar inglés en el extranjero\"","Auditorio del CTIC"),
                new Evento("Exhibición","Exhibición de Danza Contemporánea / Exhibición de Clown","Zona de presentaciones"),
                new Evento("Taller","Test de interés vocacional","Salón 409 - Biblioteca Central"),
                new Evento("Charla","Charla:\"Ingreso Directo a la UNI\"","Salón 401 - Biblioteca Central"),
                new Evento("Visita guiada","Visita guiada al Laboratorio de Petróleo","Facultad de Ingeniería de Petróleo, Gas Natural y Petroquímica (FIP)")))
        );
        fecha.put("16:00 - 17:00", new ArrayList<>(Arrays.asList(
                new Evento("Charla", "Charla: \"El arte como parte escencial del conocimiento humano\"", "Salón 501 - Biblioteca Central"),
                new Evento("Taller", "Test de Interés Vocacional", "Salón 409 - Biblioteca Central"),
                new Evento("Charla", "Charla: \"Experiencia de becarios ganadores de Beca Alianza del pacífico - Colombia\"", "Auditorio del CTIC"),
                new Evento("Visita guiada", "Visita guiada al Laboratorio de Petroquímica", "Facultad de Ingeniería de Petróleo, Gas Natural y Petroquímica (FIP)")))
        );
        fecha.put("17:00 - 18:00", new ArrayList<>(Arrays.asList(
                new Evento("Taller", "Test de interés vocacional", "Salón 409 - Biblioteca Central"),
                new Evento("Charla", "Charla: \"Cómo funcionan las escuelas de ingeniería en Francia\"", "Salón 401 - Biblioteca Central"),
                new Evento("Charla", "\"Como elaborar un Plan de Marketing: Desarrollo de Marca Personal\"", "Auditorio del CTIC")))
        );

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);

        ActividadesAdapter adapter = new ActividadesAdapter(getContext(), fecha);

        recyclerView.setAdapter(adapter);

        return view;
    }

}
