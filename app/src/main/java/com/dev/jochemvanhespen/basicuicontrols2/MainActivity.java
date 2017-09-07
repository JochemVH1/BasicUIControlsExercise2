package com.dev.jochemvanhespen.basicuicontrols2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        // add a list of strings to control
        ArrayAdapter<String> aa = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]{"Pasi","Juha","Kari","Jouni","Esa","Hannu","Jochem","Steve"}
        );
        actv.setAdapter(aa);
    }

    public void selectButtonClicked(View view){
        // findViewById is used to find the AutoCompleteTextView with the id given in the xml file
        // After the cast you can surround it with parenthesis to access the AutoCompleteTextView variable
        // this allow you to call to getText method which returns a Editable
        // on the Editable the toString method is called to ensure a String type
        // same technique is used for the EditText
        String text =
                ((AutoCompleteTextView) findViewById(R.id.autoCompleteTextView)).getText().toString() +
                        " " +
                ((EditText) findViewById(R.id.editText)).getText().toString();
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }
}
