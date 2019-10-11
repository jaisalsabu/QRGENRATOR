package com.example.qrgenrator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import net.glxn.qrgen.android.QRCode;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    EditText txt1;
    Button btn;
    Bitmap myBitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        txt1=findViewById(R.id.editText);
        img=findViewById(R.id.imageView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myBitmap= QRCode.from(txt1.getText().toString()).bitmap();
                img.setImageBitmap(myBitmap);
            }
        });

    }
}
