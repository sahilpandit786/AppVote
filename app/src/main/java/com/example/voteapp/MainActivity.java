package com.example.voteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    TextView name;
    TextView id;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.canidate_names);
        name = findViewById(R.id.txtPName);
        id = findViewById(R.id.txtPId);
        btn = findViewById(R.id.btnAccept);
    }

    public void choose(View view){
        String btnText = btn.getText().toString();
        if (btnText.equals("ACCEPT"))
        {
            btn.setText("REFUSE");
        }
        else
        {
            btn.setText("ACCEPT");
        }

    }

    public void vote(View view){
        // we are going to go to the next activity!
        Intent intent =new Intent(this,Activity2.class);
        intent.putExtra("name",name.getText().toString());
        intent.putExtra("id",id.getText().toString());
        intent.putExtra("cName",sp.getSelectedItem().toString());
        startActivity(intent);
    }
}