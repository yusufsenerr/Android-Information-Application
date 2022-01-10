package activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hr200036_yusuf_emre_sener_final.R;
import com.squareup.picasso.Picasso;

import Util.GlideUtil;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        KapakFotografiGoster();
        VerileriAl();
    }

    private void KapakFotografiGoster()
    {
        ImageView imageView = (ImageView) findViewById(R.id.KapakFotografi);
        String KapakFotografiCek = "https://raw.githubusercontent.com/yusufsenerr/hr200036yusufemresener/main/KapakFotografi.png";
        Glide.with(getApplicationContext())
                .load(KapakFotografiCek)
                .into(imageView);

        ImageView imageView2 = (ImageView) findViewById(R.id.KisiFoto);
        String KisiFotografiCek = "https://raw.githubusercontent.com/yusufsenerr/hr200036yusufemresener/main/MustafaKemalAtaturkDetail.png";
        Glide.with(getApplicationContext())
                .load(KisiFotografiCek)
                .into(imageView2);
    }
    private void VerileriAl()
    {
        TextView txtad;
        TextView txtgenelbilgi;
        TextView txtgenelbilgi2;

        txtad = (TextView) findViewById(R.id.Ad);
        txtgenelbilgi = (TextView) findViewById(R.id.GenelBilgi);
        ImageView imageView = (ImageView) findViewById(R.id.KisiFoto);

        Intent intent = getIntent();

        String Ad = intent.getStringExtra("Ad");
        String GenelBilgi = intent.getStringExtra("GenelBilgi");
        String GenelBilgi2 = intent.getStringExtra("GenelBilgi").substring(300);

        txtad.setText(Ad);
        txtgenelbilgi.setText(Html.fromHtml(GenelBilgi));
    }
}