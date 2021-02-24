package edu.temple.imageactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {

    ArrayList potatoArray;

    TextView textView;
    ImageView imageView;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);


        potatoArray = new ArrayList<String>();
        potatoArray.add(R.drawable.straight);
        potatoArray.add(R.drawable.hydroberd);
        potatoArray.add(R.drawable.uwuberd);



        ImageAdapter adapter = new ImageAdapter(this, potatoArray);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ImageActivity.this, "Item selected", Toast.LENGTH_SHORT).show();
                showPicture(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(ImageActivity.this, "Item Unselected", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void showPicture(int position) {
        imageView.setImageResource((Integer) potatoArray.get(position));
    }
}