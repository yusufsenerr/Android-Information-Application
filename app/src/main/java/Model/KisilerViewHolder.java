package Model;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hr200036_yusuf_emre_sener_final.R;

public class KisilerViewHolder  extends RecyclerView.ViewHolder {
    TextView txtAd;
    TextView txtDogumTarihi;
    TextView txtOzet;
    ImageView imgFoto;

    public KisilerViewHolder(@NonNull View itemview)
    {
        super(itemview);
        txtAd = itemview.findViewById(R.id.txtAd);
        txtDogumTarihi = itemview.findViewById(R.id.txtDogumTarihi);
        txtOzet = itemview.findViewById(R.id.txtOzet);
        imgFoto = itemview.findViewById(R.id.ImgKisi);

    }
}
