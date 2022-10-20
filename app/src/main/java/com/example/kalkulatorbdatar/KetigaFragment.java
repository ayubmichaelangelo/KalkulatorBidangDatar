package com.example.kalkulatorbdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class KetigaFragment extends Fragment {
    private Button btnHasil, btnKeliling;
    private EditText txt_jari_jari;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ketiga, container, false);

        btnHasil = v.findViewById(R.id.btnHasil);
        txt_jari_jari = v.findViewById(R.id.txt_jari_jari);
        hasil = v.findViewById(R.id.hasil);
        btnKeliling = v.findViewById(R.id.btnKeliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_jari_jari.getText().toString();
                if (nilai.isEmpty()){
                    txt_jari_jari.setError("Harus Diisi");
                    txt_jari_jari.requestFocus();
                }else{
                    Double jari = Double.parseDouble(nilai);
                    Double luas = 3.14 * jari * jari;
                    hasil.setText(String.format("%.2f", luas
                    ));
                }
            }
        });

        btnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_jari_jari.getText().toString();
                if (nilai.isEmpty()){
                    txt_jari_jari.setError("Harus Diisi");
                    txt_jari_jari.requestFocus();
                }else{
                    Double jari = Double.parseDouble(nilai);
                    Double keliling = 3.14 * (jari * 2);
                    hasil.setText(String.format("%.2f", keliling
                    ));
                }
            }
        });

        return v;
    }
}