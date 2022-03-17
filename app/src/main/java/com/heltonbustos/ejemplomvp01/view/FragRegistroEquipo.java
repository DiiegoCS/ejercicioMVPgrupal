package com.heltonbustos.ejemplomvp01.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.heltonbustos.ejemplomvp01.R;

public class FragRegistroEquipo extends Fragment {

    EditText codigoIngreso, ingresoMarca, ingresoModelo, fechaIngreso, txtObservaciones;

    RadioButton btnCajaSi, btnCajaNo, btnCargadorSi, btnCargadorNo, btnManualSi,
    btnManualNo, btnGarantiSi, btnGarantiaNo, btnCargaSoSi, btncargaSoNo, btnMotinorSi,
    btnMonitorNo, btnAudioSi, btnAudioNo, btnTouchSi, btnTouchNo;

    Button btnTomarFoto, btnGuardarFoto, btnGuardarRegistro;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View v = inflater.inflate(R.layout.fragment_registro_equipo, container, false);
        codigoIngreso = v.findViewById(R.id.txtCodigoIngreso);
        ingresoMarca = v.findViewById(R.id.txtMarca);
        ingresoModelo = v.findViewById(R.id.txtModelo);
        fechaIngreso = v.findViewById(R.id.txtFecha);
        txtObservaciones = v.findViewById(R.id.txtObservaciones);






        return v;
    }
}