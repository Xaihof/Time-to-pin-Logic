package com.example.timetopin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.timetopin.databinding.ActivityMainBinding;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //binding
    ActivityMainBinding binding;

    //Variables.
    String pinCode, fileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //binding
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SimpleDateFormat format = new SimpleDateFormat("HHmm", Locale.CANADA);

                Date now = new Date();

                fileName = format.format(now);

                binding.tvPin.setText(fileName);

                pinCode = binding.etPin.getText().toString();

                if (pinCode.equals(fileName)) {
                    Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Incorrect Pin Code", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}