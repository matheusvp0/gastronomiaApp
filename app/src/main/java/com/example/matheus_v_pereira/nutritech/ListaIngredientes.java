package com.example.matheus_v_pereira.nutritech;


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
public class ListaIngredientes extends Fragment {


    public ListaIngredientes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listaingredientes_fragment, container, false);


        FloatingActionButton btn2 = (FloatingActionButton) view.findViewById(R.id.btnCriarIngrediente);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), CadastrarIngrediente.class);
                startActivity(intent);

            }
        });

        return view;
    }

}
