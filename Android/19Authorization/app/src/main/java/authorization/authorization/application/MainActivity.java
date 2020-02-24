package authorization.authorization.application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int requestCode = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 권한을 얻었는지 확인하는 부분
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){

            // 권한을 설명해줘야 할 필요가 있는지
            if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)){
                // 권한을 설명해준다
            } else{
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, requestCode);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == this.requestCode){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Log.d("permission1", "PERMISSION_GRANTED");
            }else{
                Log.d("permission1", "PERMISSION_DENIED");
            }
        }
    }
}
