package tech.sammy.androidallcapsbug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatTextView buggyTextView;
    AppCompatButton buggyButton;
    boolean isBuggyUppercase = true;

    AppCompatTextView fixedTextView;
    AppCompatButton fixedButton;
    boolean isFixedUppercase = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buggyTextView = findViewById(R.id.buggyTextView);
        buggyButton = findViewById(R.id.buggyBehavior);

        fixedTextView = findViewById(R.id.fixedTextView);
        fixedButton = findViewById(R.id.fixedBehavior);

        buggyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (isBuggyUppercase) {
                    buggyTextView.setTextAppearance(MainActivity.this.getBaseContext(), R.style.BuggyLowercase);
                    buggyButton.setText("Make uppercase");
                } else {
                    buggyTextView.setTextAppearance(MainActivity.this.getBaseContext(), R.style.BuggyUppercase);
                    buggyButton.setText("Make lowercase");
                }

                isBuggyUppercase = !isBuggyUppercase;
            }
        });

        fixedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (isFixedUppercase) {
                    fixedTextView.setTextAppearance(MainActivity.this.getBaseContext(), R.style.FixedLowercase);
                    fixedButton.setText("Make uppercase");
                } else {
                    fixedTextView.setTextAppearance(MainActivity.this.getBaseContext(), R.style.FixedUppercase);
                    fixedButton.setText("Make lowercase");
                }

                isFixedUppercase = !isFixedUppercase;
            }
        });
    }
}
