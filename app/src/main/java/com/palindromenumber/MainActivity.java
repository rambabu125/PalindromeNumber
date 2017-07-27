package com.palindromenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.et1);
        button = (Button) findViewById(R.id.btn1);
        textView = (TextView) findViewById(R.id.t1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String s = editText.getText().toString();
                    String s2 = editText.getText().toString();
                    // The big works ;)
                    StringBuffer buffer = new StringBuffer(s);
                    buffer.reverse();
                    if (String.valueOf(buffer).equals(editText.getText().toString())) {
                        textView.setText("palindrome");
                    } else {
                        textView.setText("not palindrome");
                    }

                } catch (NumberFormatException nfe) {
                    System.out.println("Could not parse " + nfe);
                }

            }
        });
    }
}
