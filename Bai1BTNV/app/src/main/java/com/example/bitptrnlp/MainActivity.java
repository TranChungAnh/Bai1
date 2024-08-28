
package com.example.bitptrnlp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
   EditText edt1,edt2,edtketqua;

   Button btncong ,btntru,btnnhan,btnchia,btnva;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Tinhtoan();

    }

    private void Tinhtoan(){
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        edtketqua=findViewById(R.id.edtketqua);
        btncong=findViewById(R.id.btncong);
        btntru=findViewById(R.id.btntru);
        btnnhan=findViewById(R.id.btnnhan);
        btnchia=findViewById(R.id.btnchia);
        btnva=findViewById(R.id.btnva);
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=Integer.parseInt(edt1.getText().toString());
                int y=Integer.parseInt(edt2.getText().toString());
                int ketqua=x+y;
                edtketqua.setText(String.valueOf(ketqua));
            }
        });
        // Sự kiện cho nút trừ
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(edt1.getText().toString());
                int y = Integer.parseInt(edt2.getText().toString());
                int ketqua = x - y;
                edtketqua.setText(String.valueOf(ketqua));
            }
        });

// Sự kiện cho nút nhân
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(edt1.getText().toString());
                int y = Integer.parseInt(edt2.getText().toString());
                int ketqua = x * y;
                edtketqua.setText(String.valueOf(ketqua));
            }
        });

// Sự kiện cho nút chia
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(edt1.getText().toString());
                int y = Integer.parseInt(edt2.getText().toString());
                if (y != 0) {
                    float ketqua =(float) x / y;
                    edtketqua.setText(String.valueOf(ketqua));
                } else {
                    edtketqua.setText(" mẫu phải khác 0");
                }
            }
        });
    // Sự kiện cho nút và
        btnva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(edt1.getText().toString());
                int y = Integer.parseInt(edt2.getText().toString());

                edtketqua.setText(x + " & " + y + " = " );
            }
        });


    }
}