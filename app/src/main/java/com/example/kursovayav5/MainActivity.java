package com.example.kursovayav5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Integer> arrayList;

    private EditText output, input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        EditText input = findViewById(R.id.input);
//        Integer[] items = {2, -3, 6, 0, 4, -1, 5, 9, 7, -2, 8};
//        arrayList = new ArrayList<>(Arrays.asList(items));
//
//        input.setText(arrayList.toString());

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);


//        Button enter = findViewById(R.id.enter);
//        enter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

    }

    public void sortButtonPress(View view) {
        String[] numbersList = input.getText().toString().split(" ");
        Integer[] numbers = new Integer[numbersList.length];
        for (int i = 0; i < numbersList.length;
             i++) {
            numbers[i] = Integer.parseInt(numbersList[i]);
        }
        bubleSort(numbers, numbers.length);
        output.setText(Arrays.toString(numbers));


    }

    private void bubleSort(Integer[] numbers, int lenght) {
        if (lenght < 2) {
            return;
        }
        for (int i = 0; i < lenght-1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                Integer temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;

            }
        }
        bubleSort(numbers, lenght - 1);
    }
}