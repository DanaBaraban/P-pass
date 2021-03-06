package dana_app.dana_ppass.dana.ppass;

import com.google.android.gms.maps.model.LatLng;

public class Place {
    private String placeName;
    private String placeAdress;
    private LatLng latLng;
    private String link;
    private Properties properties;

    public Place(String placeName, String placeAdress) {
        this.placeName = placeName;
        this.placeAdress = placeAdress;
    }

    public Place() {}

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceAdress() {
        return placeAdress;
    }

    public void setPlaceAdress(String placeAdress) {
        this.placeAdress = placeAdress;
    }
}
