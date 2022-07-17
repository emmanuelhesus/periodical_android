

package de.com.android.periodical;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    //Button pdred = (Button) findViewById(R.id.pdsen);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivityApp.class);
        startActivity(intent);
        finish();

        //pdred.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {


               //new Intent(MainActivity.this, MainActivityPdf.class);

                //startActivity(intent);


            }
        //});
    }
//}