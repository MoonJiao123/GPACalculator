package com.example.yuejiao.gpacalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.hwScore)
    EditText hwScore;
    @BindView(R.id.hwPercentage)
    EditText hwPercentage;
    @BindView(R.id.quizScore)
    EditText quizScore;
    @BindView(R.id.quizPercentage)
    EditText quizPercentage;
    @BindView(R.id.midtermScore)
    EditText midtermScore;
    @BindView(R.id.midtermPercentage)
    EditText midtermPercentage;
    @BindView(R.id.finalPercentage)
    EditText finalPercentage;
    @BindView(R.id.finalScore)
    EditText finalScore;
    @BindView(R.id.calculation)
    TextView calculation;
    @BindView(R.id.button)
    Button button;

    //instance variables
    float inputHwScore = 0;
    float inputHwPercentage = 0;
    float inputQuizScore = 0;
    float inputQuizPercentage = 0;
    float inputMidtermScore = 0;
    float inputMidtermPercentage = 0;
    float inputFinalScore = 0;
    float inputFinalPercentage = 0;
    float calculatedGPA = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setCalculation();

    }

    public void setCalculation() {
        calculation.setText(getString(R.string.calculation, calculatedGPA));
    }

    @OnClick(R.id.button)
    public void onClick() {
        calculateFinalGPA();
        setCalculation();
    }

    public void calculateFinalGPA() {
        inputHwScore = Float.valueOf(hwScore.getText().toString());
        inputHwPercentage = Float.valueOf(hwPercentage.getText().toString());
        inputQuizScore = Float.valueOf(quizScore.getText().toString());
        inputQuizPercentage = Float.valueOf(quizPercentage.getText().toString());
        inputMidtermScore = Float.valueOf(midtermScore.getText().toString());
        inputMidtermPercentage = Float.valueOf(midtermPercentage.getText().toString());
        inputFinalScore = Float.valueOf(finalScore.getText().toString());
        inputFinalPercentage = Float.valueOf(finalPercentage.getText().toString());
        calculatedGPA = inputHwScore * inputHwPercentage / 100 +
                inputQuizScore * inputQuizPercentage / 100+
                inputMidtermScore * inputMidtermPercentage / 100 +
                inputFinalScore * inputFinalPercentage / 100;


    }

}
