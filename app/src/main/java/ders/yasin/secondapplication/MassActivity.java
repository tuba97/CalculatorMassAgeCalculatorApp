package ders.yasin.secondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MassActivity extends AppCompatActivity {
    TextView tvMass,tvMassInfo;
    EditText etWeight, etHeigth;
    Button btnCalcMass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        tvMass=findViewById(R.id.tv_Mass);
        tvMassInfo=findViewById(R.id.tv_Mass_Info);
        etHeigth=findViewById(R.id.et_height);
        etWeight=findViewById(R.id.et_Weigth);
        btnCalcMass=findViewById(R.id.btn_Calc_Mass);

        btnCalcMass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight=Double.parseDouble(etWeight.getText().toString());
                double height=Double.parseDouble(etHeigth.getText().toString());
                double massIndex=weight/Math.pow(height,2);
                //tvMass.setText(String.valueOf(massIndex));
                tvMass.setText("Mass Value="+massIndex);
                if (massIndex>25)
                    tvMassInfo.setText("Obez");
                else
                    tvMassInfo.setText("Normal");

            }
        });

    }
}