package com.example.ownstoryapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ownstoryapp.R;

public class StoryActivity extends AppCompatActivity {

    TextView pageTextView;
    ImageView pageImageView;
    Button choiceButton1;
    Button choiceButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        pageTextView = findViewById(R.id.pageTextView);
        pageImageView = findViewById(R.id.pageImageView);
        choiceButton1 = findViewById(R.id.choiceButton1);
        choiceButton2 = findViewById(R.id.choiceButton2);
        //This gets the intent from the previous page
        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.user_name));
        //Gives name a default value if user doesn't enter name
        if(name == null || name.isEmpty()){
            name = "Friend";
        }

        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

    }
}
