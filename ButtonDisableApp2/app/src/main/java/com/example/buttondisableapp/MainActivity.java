package com.example.buttondisableapp;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
public int liczba=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void lol(View D){
        Button XD=findViewById(R.id.button);
        XD.setEnabled(false);
        TextView Licznik=findViewById(R.id.TextView);
        liczba=liczba+1;
        Licznik.setText("liczba;"+liczba);
    }
    public void olo(View D){
        Button s=findViewById(R.id.button2);

    Button XD=findViewById(R.id.button);
    XD.setEnabled(true);}
}