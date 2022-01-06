package activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.hr200036_yusuf_emre_sener_final.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import Model.Constants;
import Model.CustomItemClickListener;
import Model.DataAdapter;
import Model.Kisiler;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import network.Service;
import network.ServiceApi;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private List<Kisiler> list;
    ImageView image_view;
    private RecyclerView recyclerView;
    private DataAdapter dataAdapter;
    RecyclerView.Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_view = findViewById(R.id.image_view);
        recyclerView = findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);



        IstekleriAl();
    }

    private void IstekleriAl() {
        try {
            new Service().getServiceApi().getkisiler().
                    subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<List<Kisiler>>() {

                        List<Kisiler> kisiler = new ArrayList<>();

                        @Override
                        public void onSubscribe(@NonNull Disposable d) {

                        }

                        @Override
                        public void onNext(@NonNull List<Kisiler> kisileriAl) {
                            kisiler = kisileriAl;
                        }

                        @Override
                        public void onError(@androidx.annotation.NonNull Throwable e) {

                        }

                        @Override
                        public void onComplete() {
                            if (kisiler.size()>0)
                            {
                                list = new ArrayList<Kisiler>();
                                for (Kisiler item: list)
                                {

                                    list.add(item.getAd());
                                    list.add(item.getSoyad());

                                    DataAdapter dataAdapter = new DataAdapter(list, new CustomItemClickListener() {
                                        @Override
                                        public void onItemClick(View v, int position) {

                                        }
                                    });
                                    recyclerView.setAdapter(dataAdapter);
                                }
                            }
                        }
                    });
            }
        catch (Exception e)
        {
            Log.d("Hata", "Hataaa");
        }

    }
}