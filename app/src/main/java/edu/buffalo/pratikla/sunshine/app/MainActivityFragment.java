package edu.buffalo.pratikla.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // rootView contains the fragment and we can use the view to access views inside it
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Dummy data for forecast
        String[] weekForecast = {"Today - Sunny - 75/58 ", "Tomorrow - Foggy - 60/44", "Thurs - Cloudy - 68/54", "Fri - Rain - 70/60",
                "Sat - Sunny - 78/68", "Sun - Sunny - 83/57", "Mon - Rain - 53/35"};

        // Creates adapter that will be attached to the list view. The parameters are context, layout, text view and the array.
        mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);

        // Get the list view from the xml and set adapter to it.
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);


        return rootView;
    }
}
