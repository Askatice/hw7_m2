package com.askat.hw7_m2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Integer first, second;
    private Boolean isOperationClick = false;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
    }

    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.zero:
                if (tvResult.getText().toString().equals("0") || isOperationClick){
                    tvResult.setText("0");
                }else {
                    tvResult.append("0");
                }
                isOperationClick = false;
                break;
            case R.id.btn_one:
                if (tvResult.getText().toString().equals("0") || isOperationClick){
                    tvResult.setText("1");
                }else {
                    tvResult.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_two:
                if (tvResult.getText().toString().equals("0") || isOperationClick){
                    tvResult.setText("2");
                }else {
                    tvResult.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.three:
                if (tvResult.getText().toString().equals("0") || isOperationClick){
                    tvResult.setText("3");
                }else {
                    tvResult.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.four:
                if (tvResult.getText().toString().equals("0") || isOperationClick){
                    tvResult.setText("4");
                }else {
                    tvResult.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.five:
                if (tvResult.getText().toString().equals("0") || isOperationClick){
                    tvResult.setText("5");
                }else {
                    tvResult.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.six:
                if (tvResult.getText().toString().equals("0") || isOperationClick){
                    tvResult.setText("6");
                }else {
                    tvResult.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.seven:
                if (tvResult.getText().toString().equals("0") || isOperationClick){
                    tvResult.setText("7");
                }else {
                    tvResult.append("7");
                }
                isOperationClick = false;
                break;
            case R.id.eight:
                if (tvResult.getText().toString().equals("0") || isOperationClick){
                    tvResult.setText("8");
                }else {
                    tvResult.append("8");
                }
                isOperationClick = false;
                break;
            case R.id.nine:
                if (tvResult.getText().toString().equals("0") || isOperationClick){
                    tvResult.setText("9");
                }else {
                    tvResult.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.m:
                if (tvResult.getText().toString().equals("0")  || isOperationClick){
                    tvResult.setText("-");
                }
                isOperationClick = false;
                break;
            case R.id.btn_clear:
                tvResult.setText("0");
                first = 0;
                second = 0;
                break;
        }
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
          operation = "+";
                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;
            case R.id.minus:
                operation = "-";
                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;
            case R.id.division:
                operation = "/";
                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;
            case R.id.multiplication:
                operation = "X";
                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;
            case R.id.percent:
                operation = "%";
                first = Integer.parseInt(tvResult.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_equal:
                switch (operation){
                    case "+":
                        second = Integer.parseInt(tvResult.getText().toString());
                        Integer result = first + second;
                        tvResult.setText(result.toString());
                        isOperationClick = true;
                        break;
                    case "-":
                        second = Integer.parseInt(tvResult.getText().toString());
                        Integer result1 = first - second;
                        tvResult.setText(result1.toString());
                        isOperationClick = true;
                        break;
                    case "/":
                        second = Integer.parseInt(tvResult.getText().toString());
                        Integer result2 = first / second;
                        tvResult.setText(result2.toString());
                        isOperationClick = true;
                        break;
                    case "X":
                        second = Integer.parseInt(tvResult.getText().toString());
                        Integer result3 = first * second;
                        tvResult.setText(result3.toString());
                        isOperationClick = true;
                        break;
                    case "%":
                        second = Integer.parseInt(tvResult.getText().toString());
                        Integer result4 = first/100 * second;
                        tvResult.setText(result4.toString());
                        isOperationClick = true;
                        break;

                }

                break;
        }
    }
}