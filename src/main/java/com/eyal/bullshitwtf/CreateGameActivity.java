package com.eyal.bullshitwtf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.eyal.bullshitwtf.Game.GameProperties;

public class CreateGameActivity extends AppCompatActivity {

    private RadioGroup languageRadioGroup;
    private RadioGroup lengthRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_game);

        languageRadioGroup = findViewById(R.id.languageRadioGroup);
        lengthRadioGroup = findViewById(R.id.lengthRadioGroup);

        findViewById(R.id.createButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createGameButtonClicked();
            }
        });


    }

    private void createGameButtonClicked() {

        int selectedLanguageId = languageRadioGroup.getCheckedRadioButtonId();
        int selectedLengthId = lengthRadioGroup.getCheckedRadioButtonId();

        String selectedLanguage = ((Button)findViewById(selectedLanguageId)).getText().toString();
        String selectedLength = ((Button)findViewById(selectedLengthId)).getText().toString();

//        Toast.makeText(this, selectedLanguage + " " + selectedLength, Toast.LENGTH_SHORT).show();
        GameProperties gameProperties = new GameProperties(selectedLanguage, Integer.parseInt(selectedLanguage));

    }
}
