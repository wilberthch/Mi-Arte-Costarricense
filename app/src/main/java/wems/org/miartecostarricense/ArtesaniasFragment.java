package wems.org.miartecostarricense;


import android.app.FragmentManager;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ArtesaniasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ArtesaniasFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<ListGroup> listDataHeader;
    HashMap<String, List<String>> listDataChild;



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ArtesaniasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ArtesaniasFragment newInstance(String param1, String param2) {
        ArtesaniasFragment fragment = new ArtesaniasFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);

        return fragment;
    }

    public ArtesaniasFragment() {
        // Required empty public constructor
        // get the listview

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_artesanias, container, false);
        // Inflate the layout for this fragment
        expListView = (ExpandableListView) view.findViewById(R.id.elvArtesanias);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(view.getContext(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);


        expListView.setOnChildClickListener(new OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                Fragment fragment = new ArtesanosFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame, fragment)
                        .commit();
                return true;
            }
        });


        return view;
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<ListGroup>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add(new ListGroup("Alfarería", R.drawable.alfareria));
        listDataHeader.add(new ListGroup("Cestería", R.drawable.cesteria));
        listDataHeader.add(new ListGroup("Jícaros", R.drawable.jicaros));

        // Adding child data
        List<String> alfareria = new ArrayList<String>();
        alfareria.add("Mario Magregor");
        alfareria.add("El Chunche Montero");
        alfareria.add("David Guilmore");

        List<String> cesteria = new ArrayList<String>();
        cesteria.add("Mario Magregor");
        cesteria.add("El Chunche Montero");
        cesteria.add("David Guilmore");

        List<String> jicaros = new ArrayList<String>();
        jicaros.add("Mario Magregor");
        jicaros.add("El Chunche Montero");
        jicaros.add("David Guilmore");

        listDataChild.put(listDataHeader.get(0).getNombre(), alfareria); // Header, Child data
        listDataChild.put(listDataHeader.get(1).getNombre(), cesteria);
        listDataChild.put(listDataHeader.get(2).getNombre(), jicaros);
    }


}
