package com.example.bitp2trnlp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
//  TextView txtnumber; phần 1
    ImageView img;
  Button btnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        RandomNumber();
        RandomImage();

    }
    // PHẦN 1
    /*private void RandomNumber(){
        txtnumber=findViewById(R.id.txtNumber);
        btnRandom=findViewById(R.id.btnRandom);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random= new Random();
                int ketqua=random.nextInt(10)+1;
                txtnumber.setText(String.valueOf(ketqua));
            }
        });
    }*/
  private void RandomImage(){
      img=findViewById(R.id.image);
      btnRandom=findViewById(R.id.btnRandom);

      btnRandom.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Random random= new Random();
              int ketqua=random.nextInt(6)+1;
              int sucsac=getResources().getIdentifier("sucsac"+ketqua,"drawable",getPackageName());
              img.setImageResource(sucsac);
          }
      });
  }



}