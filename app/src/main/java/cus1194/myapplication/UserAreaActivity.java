package cus1194.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername=(EditText)findViewById(R.id.etUsername);
        final EditText etAge=(EditText)findViewById(R.id.etAge);
        final TextView WelcomeMessage=(TextView)findViewById(R.id.tvWelcomeMsg);
        final EditText etPosition=(EditText)findViewById(R.id.etPosition);
        final EditText etNPI=(EditText)findViewById(R.id.etNPI);
        final EditText etEmail=(EditText)findViewById(R.id.etEmail);
    }
}
