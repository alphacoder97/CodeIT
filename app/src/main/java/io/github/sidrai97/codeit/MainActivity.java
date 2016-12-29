package io.github.sidrai97.codeit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void haha(View view)
    {
        EditText ed1 = (EditText)findViewById(R.id.editText);
        String haha1 = ed1.getText().toString();
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra("tp1",haha1);
        startActivity(i);

    }


}
