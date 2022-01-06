package Model;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hr200036_yusuf_emre_sener_final.R;

public class KisilerViewHolder  extends RecyclerView.ViewHolder {
    TextView Adtxt;
    TextView Soyadtxt;

    public KisilerViewHolder(@NonNull View itemview)
    {
        super(itemview);
        Adtxt = itemview.findViewById(R.id.Adtxt);
        Soyadtxt = itemview.findViewById(R.id.Soyadtxt);
    }
}
