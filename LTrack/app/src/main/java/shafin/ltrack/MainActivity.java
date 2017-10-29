package shafin.ltrack;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="shafin.tracklocation" ;
    Button button;
    EditText editText;
    String markerName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
//AIzaSyB459aLunibz50z_eVsnucrUxC6-cDJLQ0
        //AIzaSyBmxwFRr369mpwL4lSGabzMjpzKOvJT2do
        button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.editText);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendMessage();
            }
        });

    }

    public void sendMessage(){


        Intent intent=new Intent(this,MapsActivity.class);
        markerName=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, markerName);
        startActivity(intent);

    }


}
