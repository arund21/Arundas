package com.arithmetic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etFirst,etSecond;
    Button btnSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
////        etFirst = findViewById(R.id.etFirst);
////        etSecond = findViewById(R.id.etSecond);
////        btnSum = findViewById(R.id.btnSum);
////
////        btnSum.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////
////                if(TextUtils.isEmpty(etFirst.getText().toString()))
////                {
////                    etFirst.setError("Enter First Number");
////                    return;
////                }
////                else if(TextUtils.isEmpty(etSecond.getText().toString()))
////                {
////                    etSecond.setError("Enter Second Number");
////                    return;
////                }
////
////
////                int first,second;
////                first= Integer.parseInt(etFirst.getText().toString());
////                second= Integer.parseInt(etSecond.getText().toString());
////                Arithmetic arithmetic=new Arithmetic(first,second);
////                int result = arithmetic.add();
////
////                Toast.makeText(MainActivity.this, "Sum of two number is "+result,Toast.LENGTH_LONG).show();
////            }
//        });
    }
}
