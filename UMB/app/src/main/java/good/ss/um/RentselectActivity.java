package good.ss.um;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class RentselectActivity extends AppCompatActivity {

    ImageButton day1rent, day3rent, day5rent, day7rent, day10rent, day14rent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentselect);

        day1rent = findViewById(R.id.day1rent);
        day1rent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(RentselectActivity.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog);
                bottomSheetDialog.setCanceledOnTouchOutside(false);

                EditText etUsername = bottomSheetDialog.findViewById(R.id.et_username);
                EditText etCardNumber = bottomSheetDialog.findViewById(R.id.et_cardnumber);
                EditText etPassword = bottomSheetDialog.findViewById(R.id.et_password);
                EditText etCvc = bottomSheetDialog.findViewById(R.id.et_cvc);

                Button button=findViewById(R.id.bt_submt);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"버튼 클릭 성공", Toast.LENGTH_SHORT).show();

                    }
                });
                bottomSheetDialog.show();
                }

        });

        day3rent = findViewById(R.id.day3rent);
        day3rent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(RentselectActivity.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog);
                bottomSheetDialog.setCanceledOnTouchOutside(false);

                EditText etUsername = bottomSheetDialog.findViewById(R.id.et_username);
                EditText etCardNumber = bottomSheetDialog.findViewById(R.id.et_cardnumber);
                EditText etPassword = bottomSheetDialog.findViewById(R.id.et_password);
                EditText etCvc = bottomSheetDialog.findViewById(R.id.et_cvc);

                Button button=findViewById(R.id.bt_submt);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"버튼 클릭 성공", Toast.LENGTH_SHORT).show();

                    }
                });
                bottomSheetDialog.show();
            }


        });

        day5rent = findViewById(R.id.day5rent);
        day5rent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(RentselectActivity.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog);
                bottomSheetDialog.setCanceledOnTouchOutside(false);

                EditText etUsername = bottomSheetDialog.findViewById(R.id.et_username);
                EditText etCardNumber = bottomSheetDialog.findViewById(R.id.et_cardnumber);
                EditText etPassword = bottomSheetDialog.findViewById(R.id.et_password);
                EditText etCvc = bottomSheetDialog.findViewById(R.id.et_cvc);

                Button button=findViewById(R.id.bt_submt);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"버튼 클릭 성공", Toast.LENGTH_SHORT).show();

                    }
                });
                bottomSheetDialog.show();
            }

        });

        day7rent = findViewById(R.id.day7rent);
        day7rent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(RentselectActivity.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog);
                bottomSheetDialog.setCanceledOnTouchOutside(false);

                EditText etUsername = bottomSheetDialog.findViewById(R.id.et_username);
                EditText etCardNumber = bottomSheetDialog.findViewById(R.id.et_cardnumber);
                EditText etPassword = bottomSheetDialog.findViewById(R.id.et_password);
                EditText etCvc = bottomSheetDialog.findViewById(R.id.et_cvc);

                Button button=findViewById(R.id.bt_submt);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"버튼 클릭 성공", Toast.LENGTH_SHORT).show();

                    }
                });
                bottomSheetDialog.show();
            }

        });

        day10rent = findViewById(R.id.day10rent);
        day10rent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(RentselectActivity.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog);
                bottomSheetDialog.setCanceledOnTouchOutside(false);

                EditText etUsername = bottomSheetDialog.findViewById(R.id.et_username);
                EditText etCardNumber = bottomSheetDialog.findViewById(R.id.et_cardnumber);
                EditText etPassword = bottomSheetDialog.findViewById(R.id.et_password);
                EditText etCvc = bottomSheetDialog.findViewById(R.id.et_cvc);

                Button button=findViewById(R.id.bt_submt);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"버튼 클릭 성공", Toast.LENGTH_SHORT).show();

                    }
                });
                bottomSheetDialog.show();
            }

        });

        day14rent = findViewById(R.id.day14rent);
        day14rent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(RentselectActivity.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_dialog);
                bottomSheetDialog.setCanceledOnTouchOutside(false);

                EditText etUsername = bottomSheetDialog.findViewById(R.id.et_username);
                EditText etCardNumber = bottomSheetDialog.findViewById(R.id.et_cardnumber);
                EditText etPassword = bottomSheetDialog.findViewById(R.id.et_password);
                EditText etCvc = bottomSheetDialog.findViewById(R.id.et_cvc);

                Button button=findViewById(R.id.bt_submt);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"버튼 클릭 성공", Toast.LENGTH_SHORT).show();

                    }
                });
                bottomSheetDialog.show();
            }

        });

        //Initialize & assign variable

        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_navigation);
        //set home selected
        bottomNavigationView.setSelectedItemId((R.id.mypage));

        //perform itemselectedlistner
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.weather:
                        startActivity(new Intent(getApplicationContext()
                                , WeatherActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MapsActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.mypage:
                        return true;
                }
                return false;
            }
        });
    }
}
