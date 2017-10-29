package shafin.ltrack;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by shafins on 9/22/17.
 */

public class DataMessage {
    String name;
            double data1; LatLng data2;

    public DataMessage() {
    }

    public DataMessage(String name, double data1, LatLng data2) {
        this.name = name;
        this.data1 = data1;
        this.data2 = data2;

    }

    public String getName() {
        return name;
    }

    public double getData1() {
        return data1;
    }

    public LatLng getData2() {
        return data2;
    }
}
