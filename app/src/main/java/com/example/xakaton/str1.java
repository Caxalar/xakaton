package com.example.xakaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class str1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_str1);

        Button btnGoToForm = findViewById(R.id.btnGoToForm);//тут заменияем id кнопки
        btnGoToForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLScdUFi58B6sZzQfL3yxlR_ZcumUpqIKr-xxPJaPWIiarLGY3g/viewform?usp=sf_link"; // Замените ссылку на свою
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        Button whatsappButton = findViewById(R.id.whatsapp_button);
        whatsappButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // При нажатии кнопки, открыть WhatsApp
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://chat.whatsapp.com/EDWZpttMZGgDlWT1Wjx3MW"));
                startActivity(intent);
            }
        });
    }

}