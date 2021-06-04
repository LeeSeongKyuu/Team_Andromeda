package good.ss.um;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.auth.FirebaseAuth;

//반납대여 시작화면, 첫시작 화면 아님!
public class MainActivity extends AppCompatActivity {

    private Button btn_startRent;
    private Button btn_startReturn;
    private Button btn_logout;
    private FirebaseAuth mFirebaseAuth;

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

        mFirebaseAuth = FirebaseAuth.getInstance();

        btn_logout = findViewById(R.id.btn_logout);
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    // 로그아웃 하기
                mFirebaseAuth.signOut();

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
            // 탈퇴 처리
            // mFirebaseAuth.getCurrentUser().delete();

    }
}