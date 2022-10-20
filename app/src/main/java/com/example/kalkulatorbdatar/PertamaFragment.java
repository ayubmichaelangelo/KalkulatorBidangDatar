package com.example.kalkulatorbdatar;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PertamaFragment extends Fragment {
    private Button btnHasil, btnKeliling;
    private EditText txt_panjang, txt_lebar;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pertama, container, false);
        btnHasil = v.findViewById(R.id.btnHasil);
        btnKeliling = v.findViewById(R.id.btnKeliling);
        txt_panjang = v.findViewById(R.id.txt_panjang);
        txt_lebar = v.findViewById(R.id.txt_lebar);
        hasil = v.findViewById(R.id.hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_panjang.getText().toString();
                String nilai2 = txt_lebar.getText().toString();

                if (nilai1.isEmpty()) {
                    txt_panjang.setError("Harus Diisi!");
                    txt_panjang.requestFocus();
                } else if (nilai2.isEmpty()) {
                    txt_lebar.setError("Harus Diisi!");
                    txt_lebar.requestFocus();
                } else {
                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);

                    Integer luas = panjang * lebar;
                    hasil.setText(String.valueOf(luas));
                }
            }
        });
        btnKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 = txt_panjang.getText().toString();
                String nilai2 = txt_lebar.getText().toString();

                if (nilai1.isEmpty()) {
                    txt_panjang.setError("Harus Diisi!");
                    txt_panjang.requestFocus();
                } else if (nilai2.isEmpty()) {
                    txt_lebar.setError("Harus Diisi!");
                    txt_lebar.requestFocus();
                } else {
                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);

                    Integer keliling = 2 * (panjang + lebar);
                    hasil.setText(String.valueOf(keliling));
                }
            };
        });
        return v;
    }
}