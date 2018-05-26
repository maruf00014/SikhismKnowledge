package com.sikhismknowledge.sikhismknowledge;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AskQuestion extends AppCompatActivity {

    private EditText mEditTextSubject;
    private EditText mEditTextMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_question);



            mEditTextSubject = findViewById(R.id.edit_text_subject);
            mEditTextMessage = findViewById(R.id.edit_text_message);

            Button buttonSend = findViewById(R.id.button_send);
            buttonSend.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sendMail();
                }
            });
        }

    private void sendMail() {
        String recipientList = "admin@sikhismknowledge.com";
        String[] recipients = recipientList.split(",");


        String subject = mEditTextSubject.getText().toString();
        String message = mEditTextMessage.getText().toString();

        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setType("plain/text");
        sendIntent.setData(Uri.parse("admin@sikhismknowledge.com"));
        sendIntent.setClassName("com.google.android.gm",
                "com.google.android.gm.ComposeActivityGmail");
        sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "admin@sikhismknowledge.com" });
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        sendIntent.putExtra(Intent.EXTRA_TEXT,
                message);
        startActivity(sendIntent);
    }
}


