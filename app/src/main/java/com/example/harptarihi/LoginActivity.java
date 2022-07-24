package com.example.harptarihi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.harptarihi.databinding.ActivityLoginBinding;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    private SharedPrefsStorage sharedPrefsStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sharedPrefsStorage = new SharedPrefsStorage(this);
        if(!sharedPrefsStorage.getUsername().isEmpty()) {
            openAnaMenu();
        }
    }

    public void giris(View view) {
        String username = Objects.requireNonNull(binding.edtUsername.getText()).toString();
        if (!username.isEmpty()) {
            sharedPrefsStorage.saveUsername(username);

            openAnaMenu();
        }
    }

    private void openAnaMenu() {
        startActivity(new Intent(this, AnaMenuActivity.class));
        finish();
    }
}