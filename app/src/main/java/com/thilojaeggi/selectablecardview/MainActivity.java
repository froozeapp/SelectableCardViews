package com.thilojaeggi.selectablecardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.thilojaeggi.selectablecardview.R;

public class MainActivity extends AppCompatActivity {
    CardView cv1, cv2, cv3;
    Integer selection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv1 = findViewById(R.id.cv1);
        cv2 = findViewById(R.id.cv2);
        cv3 = findViewById(R.id.cv3);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = 1;
                getSelectedCardView();
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = 2;
                getSelectedCardView();
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = 3;
                getSelectedCardView();
            }
        });
    }
    private void getSelectedCardView(){
        switch (selection){
            case 1:
                cv1.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
                cv2.setCardBackgroundColor(getResources().getColor(R.color.colorWhite));
                cv3.setCardBackgroundColor(getResources().getColor(R.color.colorWhite));
                break;
            case 2:
                cv2.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
                cv1.setCardBackgroundColor(getResources().getColor(R.color.colorWhite));
                cv3.setCardBackgroundColor(getResources().getColor(R.color.colorWhite));
                break;
            case 3:
                cv3.setCardBackgroundColor(getResources().getColor(R.color.colorAccent));
                cv1.setCardBackgroundColor(getResources().getColor(R.color.colorWhite));
                cv2.setCardBackgroundColor(getResources().getColor(R.color.colorWhite));
                break;
        }


    }
}