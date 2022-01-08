package network;

import java.util.ArrayList;
import java.util.List;
import io.reactivex.Observable;

import Model.Kisiler;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi{

    @GET("kisiler.json")
    Observable<List<Kisiler>> getkisiler();

}
