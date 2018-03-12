package edu.css.thauck.exam1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    TextView tvResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText)findViewById(R.id.editTextName);
        tvResponse = (TextView) findViewById(R.id.textViewResponse);

    }

    public void onClickButtonEnter(View view) {
        String name = (etName.getText().toString());
        tvResponse.setText(name + " is a great android programmer!");

    }
}
