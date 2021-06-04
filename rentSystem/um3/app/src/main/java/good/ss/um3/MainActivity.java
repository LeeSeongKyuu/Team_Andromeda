package good.ss.um3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_startRent;
    private Button btn_startReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_startRent = findViewById(R.id.btn_startRent);
        btn_startRent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RentActivity.class );
                startActivity(intent); //렌트 엑티비티로 이동

            }
        });

        btn_startReturn = findViewById(R.id.btn_startReturn);
        btn_startReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ReturnActivity.class );
                startActivity(intent); //렌트 엑티비티로 이동
            }
        });
    }
}