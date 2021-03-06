package com.sikhismknowledge.sikhismknowledge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.sikhismknowledge.sikhismknowledge.data.DbHelper;

import java.util.List;

import static android.view.View.*;


public class QuizActivity extends AppCompatActivity {
    List<Question> quesList;
    int score=0;
    int qid=0;
    Question currentQ;
    TextView txtQuestion;
    RadioButton rda, rdb, rdc;
    Button butNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        DbHelper db=new DbHelper(this);
        quesList=db.getAllQuestions();
        currentQ=quesList.get(qid);
        txtQuestion=(TextView)findViewById(R.id.textView1);
        rda=(RadioButton)findViewById(R.id.radio0);
        rdb=(RadioButton)findViewById(R.id.radio1);
        rdc=(RadioButton)findViewById(R.id.radio2);
        butNext=(Button)findViewById(R.id.button1);
        setQuestionView();



        RadioGroup grp=(RadioGroup)findViewById(R.id.radioGroup1);
        grp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                butNext.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        RadioGroup grp=(RadioGroup)findViewById(R.id.radioGroup1);
                        RadioButton answer=(RadioButton)findViewById(grp.getCheckedRadioButtonId());
                        grp.clearCheck();
                        Log.d("yourans", currentQ.getANSWER()+" "+answer.getText());
                        if(currentQ.getANSWER().equals(answer.getText()))
                        {
                            score++;
                            Log.d("score", "Your score"+score);
                            Toast.makeText(getApplicationContext(),"Correct!",Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(getApplicationContext(),"Wrong!",Toast.LENGTH_SHORT).show();
                        }
                        if(qid<5){
                            currentQ=quesList.get(qid);
                            setQuestionView();
                            butNext.setOnClickListener(null);
                        }else{
                            Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                            Bundle b = new Bundle();
                            b.putInt("score", score); //Your score
                            intent.putExtras(b); //Put your score to your next Intent
                            startActivity(intent);
                            finish();
                        }

                    }
                });

            }
        });


    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_quiz, menu);
        return true;
    }
    */
    private void setQuestionView()
    {
        txtQuestion.setText(currentQ.getQUESTION());
        rda.setText(currentQ.getOPTA());
        rdb.setText(currentQ.getOPTB());
        rdc.setText(currentQ.getOPTC());
        qid++;
    }
}