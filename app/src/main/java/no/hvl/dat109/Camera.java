package no.hvl.dat109;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Camera extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.livecamera);

        Button menyBtn = findViewById(R.id.menyButton);
        menyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Camera.this, MainActivity.class));
            }
        });

        Button nyttSpmBtn = findViewById(R.id.nyttSpm);
        nyttSpmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Camera.this, QuestionClass.class));
            }
        });
    }
}