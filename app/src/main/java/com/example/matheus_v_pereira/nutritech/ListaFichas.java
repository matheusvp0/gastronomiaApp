package com.example.matheus_v_pereira.nutritech;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */


public class ListaFichas extends Fragment {


    public ListaFichas() {
        // Required empty public constructor
    }

    Context context; //Declare the variable context

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listafichas_fragment, container, false);


        FloatingActionButton btn2 = (FloatingActionButton) view.findViewById(R.id.btnCriarFicha);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), CadastrarFichaActivity.class);
                startActivity(intent);

            }
        });

        return view;
    }

}
