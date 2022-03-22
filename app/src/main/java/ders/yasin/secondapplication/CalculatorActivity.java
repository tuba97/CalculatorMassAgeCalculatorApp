package ders.yasin.secondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etFirst,etSecond;
    Button btnAdd,btnSubtract,btnMultiply,btnDivision;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        etFirst=findViewById(R.id.et_firstNumber);
        etSecond=findViewById(R.id.et_secondNumber);
        btnAdd=findViewById(R.id.btn_Add);
        btnSubtract=findViewById(R.id.btn_Subtract);
        btnMultiply=findViewById(R.id.btn_Multiply);
        btnDivision=findViewById(R.id.btn_Division);
        tvResult=findViewById(R.id.tv_Result);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        double firstNumber=Double.parseDouble(etFirst.getText().toString());
        double secondNumber=Double.parseDouble(etSecond.getText().toString());
        double result=0.0;
        int ID=view.getId();
        switch (ID){
            case R.id.btn_Add: result=firstNumber+secondNumber; break;
            case R.id.btn_Subtract: result=firstNumber-secondNumber; break;
            case R.id.btn_Multiply: result=firstNumber*secondNumber; break;
            case R.id.btn_Division:
                if(secondNumber!=0)
                    result=firstNumber/secondNumber;
        }
        tvResult.setText("Result:"+result);

    }
}