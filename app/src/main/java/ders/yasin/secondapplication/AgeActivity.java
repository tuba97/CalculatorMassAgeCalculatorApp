package ders.yasin.secondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class AgeActivity extends AppCompatActivity {
    Button btnCalculateAge;
    EditText etAge;
    TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        etAge=findViewById(R.id.et_Age);
        tvAge=findViewById(R.id.tv_Age);
        btnCalculateAge=findViewById(R.id.btn_CalculateAge);

        btnCalculateAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int birthYear= Integer.parseInt(etAge.getText().toString());
                int currentYear= Calendar.getInstance().get(Calendar.YEAR);
                int age=currentYear-birthYear;
                tvAge.setText("Your age is "+ age);
            }
        });
    }
}