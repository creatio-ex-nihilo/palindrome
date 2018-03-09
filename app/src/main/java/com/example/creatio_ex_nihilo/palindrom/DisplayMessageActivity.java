package com.example.creatio_ex_nihilo.palindrom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent i = getIntent();
        String msg = i.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // it isn't obvious from the assignment if this should be case sensitive ...
        String check = msg.toLowerCase();

        TextView tv = findViewById(R.id.textView);
        StringBuilder sb = new StringBuilder();
        sb.append("'").append(msg).append("'").append(" is");
        if(!isPalindrome(check)){
            sb.append(" not");
        }
        sb.append(" a palindrome");
        tv.setText(sb.toString());
    }

    // taken from assignment sheet
    private boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
