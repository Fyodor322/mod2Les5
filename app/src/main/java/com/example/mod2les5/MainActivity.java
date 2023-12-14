package com.example.mod2les5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import entity.Income;
import entity.Service;

public class MainActivity extends AppCompatActivity {

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);

        Income rent = new Income(1, "Аренда площадей порта", 170000);
        Service serv = new Service(2, "Обслуживание морских судов", 3500, 125);

        int totalCostOfWork = rent.costOfWork() + serv.costOfWork();

        output.setText("порт в месяц зарабатывает " + totalCostOfWork + " монет");

        output.append("\nПри выполнении плана:\n"
                + rent.getName() + " " + rent.getSum() + " рублей\n"
                + serv.getName() + " " + serv.getQuantity() + " судов");
    }


}