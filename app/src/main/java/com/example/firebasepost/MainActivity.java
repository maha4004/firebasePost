package com.example.firebasepost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    DatabaseReference databaseReference ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseReference = FirebaseDatabase.getInstance().getReference();
        editText = findViewById(R.id.id);
        button = findViewById(R.id.send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postData();
            }
        });
    }

    public void postData(){
        String id = editText.getText().toString().trim();

      String ip=  databaseReference.push().getKey();
        data data = new data(id,ip);
        databaseReference.child(ip).setValue(data);
        Toast.makeText(getApplicationContext(),"data added",Toast.LENGTH_LONG).show();
    }
}
