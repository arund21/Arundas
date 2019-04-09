package com.arithmetic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Task1Activity extends AppCompatActivity {
    EditText etCircle,etFtoc,etHeight,etBreadth,etCheckp;
    Button btnCircle,btnFtoc,btnTriangle,btnCheckp;
    TextView tvCircle,tvFtoc,tvTriangle,tvCheckp;
double radius;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        etCircle = findViewById(R.id.etCircle);
        etFtoc = findViewById(R.id.etFtoc);
        etHeight = findViewById(R.id.etHeight);
        etBreadth = findViewById(R.id.etBreadth);
        etCheckp = findViewById(R.id.etCheckp);
        btnCircle = findViewById(R.id.btnCircle);
        btnFtoc = findViewById(R.id.btnFtoc);
        btnTriangle = findViewById(R.id.btnTriangle);
        btnCheckp = findViewById(R.id.btnCheckp);
        tvCircle = findViewById(R.id.tvCircle);
        tvFtoc = findViewById(R.id.tvFtoc);
        tvTriangle = findViewById(R.id.tvTriangle);
        tvCheckp = findViewById(R.id.tvCheckp);

        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(etCircle.getText().toString()))
                {
                    etCircle.setError("Enter Radius");
                    return;
                }

                int radius;
                radius= Integer.parseInt(etCircle.getText().toString());
                Task1activitycode task1activitycode= new Task1activitycode(radius);
                double result1 = task1activitycode.areaCircle();
                tvCircle.setText(Double.toString(result1));
            }
        });


        btnFtoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(etFtoc.getText().toString()))
                {
                    etFtoc.setError("Enter Fahrenheit");
                    return;
                }

                int Fahren;
                Fahren= Integer.parseInt(etFtoc.getText().toString());
                int result=5*(Fahren-32)/9;
                tvFtoc.setText(Integer.toString(result));
            }
        });

        btnTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(etBreadth.getText().toString()))
                {
                    etBreadth.setError("Enter Breadth");
                    return;
                }
                else if(TextUtils.isEmpty(etHeight.getText().toString()))
                {
                    etHeight.setError("Enter Height");
                    return;
                }
                int Height;
                int Breadth;
                Height= Integer.parseInt(etHeight.getText().toString());
                Breadth= Integer.parseInt(etBreadth.getText().toString());
                Double result=(0.5*Height*Breadth);
                tvTriangle.setText(Double.toString(result));
            }
        });

            btnCheckp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(TextUtils.isEmpty(etCheckp.getText().toString()))
                    {
                        etCheckp.setError("Enter a number");
                        return;
                    }

                    int value;

                    value= Integer.parseInt(etCheckp.getText().toString());
                    String result=("Need to update");
                    tvCheckp.setText(result);
                }


        });




    }

}
