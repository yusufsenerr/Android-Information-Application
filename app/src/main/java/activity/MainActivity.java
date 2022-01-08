package activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.widget.ImageView;

import com.example.hr200036_yusuf_emre_sener_final.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import Model.DataAdapter;
import Model.Kisiler;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import network.Service;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        HeaderAl();

    }
    private void HeaderAl()
    {
        ImageView imageView = (ImageView) findViewById(R.id.arkaplan);
        String arkaplan = "https://raw.githubusercontent.com/yusufsenerr/hr200036yusufemresener/main/ArkaPlan.jpg";
        Picasso.with(this).load(arkaplan).into(imageView);
    }
    private void init()
    {
        recyclerView = findViewById(R.id.rcvKisilers);
        IstekleriAl();
    }
    private void IstekleriAl()
    {
            new Service().getServiceApi().getkisiler().
                    subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<List<Kisiler>>() {

                        List<Kisiler> kisiler = new ArrayList<>();

                        @Override
                        public void onSubscribe(@NonNull Disposable d) {

                        }

                        @Override
                        public void onNext(@NonNull List<Kisiler> getKisiler) {
                            kisiler = getKisiler;
                        }

                        @Override
                        public void onError(@androidx.annotation.NonNull Throwable e) {

                        }

                        @Override
                        public void onComplete() {
                            if (kisiler.size()>0)
                            {
                                initRecycleView(kisiler);
                            }
                        }
                    });
            }

    private void initRecycleView(List<Kisiler> kisileriAl)
    {
        recyclerView = findViewById(R.id.rcvKisilers);

        DataAdapter dataAdapter = new DataAdapter(kisileriAl,getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(dataAdapter);
    }
}