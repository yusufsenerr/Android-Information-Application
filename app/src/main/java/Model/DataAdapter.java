package Model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hr200036_yusuf_emre_sener_final.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private List<Kisiler> liste;
    public DataAdapter(List<Kisiler> list) {
        liste = list;

    }
    public void  onAttachedToRecyclerView(RecyclerView recyclerView)
    {
        super.onAttachedToRecyclerView(recyclerView);
    }
    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent,             false));
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
    holder.Ad.setText(liste.get(position).getAd());
        holder.soyad.setText(liste.get(position).getAd());
        Picasso.with(holder.Fotograf.getContext()).load(liste.get(position).getFotograf()).into(holder.Fotograf);
    }

    @Override
    public int getItemCount() {
        return liste.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public CardView card_view;
        public TextView Ad;
        public  TextView soyad;
        public  TextView DogumTarihi;
        public ImageView Fotograf;
        public TextView Aciklama;
        public ViewHolder ( View  itemView)
        {
            super(itemView);
            this.card_view = itemView.findViewById(R.id.card_view);
            this.Ad = itemView.findViewById(R.id.Ad);
            this.soyad = itemView.findViewById(R.id.Soyad);
            this.Fotograf = itemView.findViewById(R.id.image_view);
        }
    }
}
