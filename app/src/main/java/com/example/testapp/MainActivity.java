package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.testapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());
            plusUI();
            minusUI();
            multyUI();
            divideUI();
        }

        private void plusUI() {
            binding.okBtnPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Math math = new Math();
                    String num1 = binding.num1Ed.getText().toString();
                    String num2 = binding.num2Ed.getText().toString();
                    String result = math.add(num1, num2);
                    binding.resultTv.setText(result);
                }
            });
        }

        private void minusUI() {
            binding.okBtnMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Math math = new Math();
                    String num1 = binding.num1Ed.getText().toString();
                    String num2 = binding.num2Ed.getText().toString();
                    String result = math.minus(num1, num2);
                    binding.resultTv.setText(result);
                }
            });
        }

        private void multyUI() {
            binding.okBtnMulti.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Math math = new Math();
                    String num1 = binding.num1Ed.getText().toString();
                    String num2 = binding.num2Ed.getText().toString();
                    String result = math.multy(num1, num2);
                    binding.resultTv.setText(result);
                }
            });
        }

        private void divideUI() {
            binding.okBtnDivide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Math math = new Math();
                    String num1 = binding.num1Ed.getText().toString();
                    String num2 = binding.num2Ed.getText().toString();
                    String result = math.divide(num1, num2);
                    binding.resultTv.setText(result);
                }
            });
        }
    }