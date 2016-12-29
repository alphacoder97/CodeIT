package io.github.sidrai97.codeit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String lol = getIntent().getExtras().getString("tp1").toString();

        TextView tv1 = (TextView)findViewById(R.id.textView2);
        tv1.setText(""+lol);

    }
}
