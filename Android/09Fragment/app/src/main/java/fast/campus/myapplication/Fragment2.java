package fast.campus.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("lifeCycle", "Fragment2 : onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment2 : onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment2 : onCreateView");
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("lifeCycle", "Fragment2 : onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("lifeCycle", "Fragment2 : onStart");
        super.onStart();
    }

    @Override
    public void onPause() {
        Log.d("lifeCycle", "Fragment2 : onPause");
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        Log.d("lifeCycle", "Fragment2 : onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("lifeCycle", "Fragment2 : onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("lifeCycle", "Fragment2 : onDetach");
        super.onDetach();
    }
}