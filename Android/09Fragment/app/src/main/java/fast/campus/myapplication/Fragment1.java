package fast.campus.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static fast.campus.myapplication.MainActivity.BUNDLE_KEY;

public class Fragment1 extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("lifeCycle", "Fragment1 : onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment1 : onCreate");
        super.onCreate(savedInstanceState);
    }

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment1 : onCreateView");
        view = inflater.inflate(R.layout.fragment1, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment1 : onActivityCreated");

        int number = getArguments().getInt(BUNDLE_KEY);
        Log.d("test", "number : " + number);

        Button button = view.findViewById(R.id.fragment1_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("test", "CLICK !");
            }
        });
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("lifeCycle", "Fragment1 : onStart");
        super.onStart();
    }

    @Override
    public void onPause() {
        Log.d("lifeCycle", "Fragment1 : onPause");
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        Log.d("lifeCycle", "Fragment1 : onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("lifeCycle", "Fragment1 : onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("lifeCycle", "Fragment1 : onDetach");
        super.onDetach();
    }
}
