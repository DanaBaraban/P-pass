//package dana_app.dana_ppass.dana.ppass;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.ListView;
//import android.widget.TextView;
//
//public class ListOfPlaces extends AppCompatActivity {
//
//    int[] placeMarker = {R.drawable.place_icon_in_list, R.drawable.place_icon_in_list};
//    String[] placeNames = {"MuchaPizza"};
//    String[] placeAddress = {"19 Ibn Gabirol street, Tel Aviv-Yafo"};
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_of_places);
//
//        ListView listView = (ListView) findViewById(R.id.list_view);
//
//        CustomAdapter customAdapter = new CustomAdapter();
//        listView.setAdapter(customAdapter);
//    }
//
//    class CustomAdapter extends BaseAdapter {
//
//        @Override
//        public int getCount() {
//            return placeNames.length;
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return 0;
//        }
//
//        @Override
//        public View getView(int i, View view, ViewGroup viewGroup) {
//            setContentView(R.layout.activity_list_of_places);
//
//            view = getLayoutInflater().inflate(R.layout.custom_layout, null);
//
////            final TextView txtHi = (TextView) findViewById(R.id.greeting_message);
////            txtHi.setText("Greetings " + userName);
////
////            setContentView(R.layout.main);
//
//
//            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
//            imageView.setImageResource(placeMarker[0]);
//            TextView textView_placeName = (TextView) view.findViewById(R.id.place_name);
//            //try {
//
//                textView_placeName.setText("Hello");
////
////            } catch(NullPointerException e) {
////                Toast.makeText(ListOfPlaces.this, "The app has recovered from an error.", Toast.LENGTH_SHORT).show();
////            }
//
//
//
//            //textView_placeName.setText(placeNames[i]);
//            TextView textView_placeAddress = (TextView) view.findViewById(R.id.place_address);
//            //textView_placeAddress.setText(placeAddress[i]);
//           // try {
//
//                textView_placeAddress.setText("Hello");
//
////            } catch(NullPointerException e) {
////                Toast.makeText(ListOfPlaces.this, "The app has recovered from an error.", Toast.LENGTH_SHORT).show();
////            }
//
//
//
//
//            return view;
//        }
//    }
//}