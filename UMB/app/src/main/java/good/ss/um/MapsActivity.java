package good.ss.um;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        Toast.makeText(this,"Map is Ready",Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onMapReady: map is ready");
        mMap = googleMap;


    }

    private static final String TAG ="MapActivity";

    private static final String FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    private static final String COURSE_LOCATION =Manifest.permission.ACCESS_COARSE_LOCATION;
    private static final int LOCATION_PERISSION_REQUEST_CODE=1234;

    //vars
    private Boolean mLocationPermissionGranted =false;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        getLocationPermission();
    }

    private void initMap(){
        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        Log.d(TAG,"onMapReady: initializing map");
        mapFragment.getMapAsync(MapsActivity.this);
    }

    private void getLocationPermission(){
        Log.d(TAG,"getLocationPermission: getting locatation permissions")
        String[] permissions ={Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_COARSE_LOCATION};

        if(ContextCompat.checkSelfPermission(this.getApplicationContext(),
                FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
            if(ContextCompat.checkSelfPermission(this.getApplicationContext(),
                    FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                mLocationPermissionGranted=true;
            }else{
                ActivityCompat.requestPermissions(this,
                        permissions,
                        LOCATION_PERISSION_REQUEST_CODE);
            }
        }else{
            ActivityCompat.requestPermissions(this,
                    permissions,
                    LOCATION_PERISSION_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mLocationPermissionGranted=false;
        switch(requestCode){
            case LOCATION_PERISSION_REQUEST_CODE:{
                if(grantResults.length>0){
                    for(int i=0; i<grantResults.length;i++){
                        if(grantResults[i] != PackageManager.PERMISSION_GRANTED){
                            mLocationPermissionGranted=false;
                            Log.d(TAG,"OnRequestPermissionResult: permission failed");
                            return;
                        }
                    }
                    Log.d(TAG,"OnRequestPermissionResult: permission granted");
                    mLocationPermissionGranted=true;

                    initMap();
                }
            }
        }
    }

}