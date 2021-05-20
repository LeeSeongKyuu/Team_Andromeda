package com.example.qrscanner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

//지도 api import할것
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button scanBtn;
   private GoogleMap mMap;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scanBtn = findViewById(R.id.scanBtn);
        scanBtn.setOnClickListener(this);
    
        //지도 code
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        //지도code
    }

    @Override
    public void onClick(View v) {
    scanCode();
    }

    private void scanCode(){
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setCaptureActivity(CaptureActivity.class);
        integrator.setOrientationLocked(false);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrator.setPrompt("Scanning Code");
        integrator.initiateScan();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        
        if (result !=null){
            if (result.getContents() != null){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(result.getContents());
                builder.setTitle("scanning Result");
                builder.setPositiveButton("Scan Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        scanCode();
                    }
                }).setNegativeButton("finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();


            }
            else {
                Toast.makeText(this, "No Results", Toast.LENGTH_LONG).show();
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

  @Override
    public void onMapReady(final GoogleMap googleMap) {

        mMap = googleMap;
        
        //서울 좌표(변수로 현재위치로 바꾸면 좋을듯)
        LatLng SEOUL = new LatLng(37.56, 126.97);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(SEOUL);
        markerOptions.title("서울");
        markerOptions.snippet("한국의 수도");
        mMap.addMarker(markerOptions);


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SEOUL, 10));


    }
}
