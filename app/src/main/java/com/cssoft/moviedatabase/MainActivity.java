package com.cssoft.moviedatabase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.cssoft.moviedatabase.movies.Movies;
import com.cssoft.moviedatabase.retrofit.MainRetrofit;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MyInterface {


    @BindView(R.id.gridView)
    GridView gridViewMovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        MainRetrofit obj=new MainRetrofit();
        obj.showMessage(this);



    }

    @Override
    protected void onResume() {
        super.onResume();
        if (Initials.isNetworkAvailable(this) != true) {
            finish();
        }
    }




    @Override
    public void loadMovies(Movies movies) {
        Initials.showToast(this,movies.results.get(0).title+"");
    }


}
