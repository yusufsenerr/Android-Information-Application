package activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.provider.Settings;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hr200036_yusuf_emre_sener_final.R;

public class SplashActivity extends AppCompatActivity {

    public boolean InternetKontrol (final Context context)
    {
        final ConnectivityManager connectivityManager  = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (InternetKontrol(this))
        {
            Thread splashThread;
            splashThread = new Thread()
            {
                @Override public void run()
                {
                    try {
                        synchronized (this)
                        {
                            wait(3000);
                        }
                    }
                    catch (InterruptedException ex)
                    {

                    }
                    finally {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    }
                }

            };
            splashThread.start();
        }
        else
        {
            AlertDialog alert = new AlertDialog.Builder(this).create();
            alert.setTitle("Bağlantı Bağlantınız Yok!");
            alert.setMessage("Uygulamayı kullanmak için internete bağlayın");
            alert.setButton(DialogInterface.BUTTON_NEGATIVE, "Kapat",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int wich)
                            {
                                int pid = android.os.Process.myPid();
                                android.os.Process.killProcess(pid);
                                dialogInterface.dismiss();
                            }
                    });
            alert.setButton(DialogInterface.BUTTON_NEUTRAL, "İnternet Ayarları",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            startActivityForResult(new Intent(Settings.ACTION_WIFI_SETTINGS), 0);
                        }
                    });
            alert.show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
