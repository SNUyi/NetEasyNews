package cn.bproject.neteasynews.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import cn.bproject.neteasynews.Utils.LogUtils;

/**
 * Created by Administrator on 2017/2/17.
 */

public class BaseActivity extends AppCompatActivity{

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.i("SUNny", getClass().getSimpleName());
    }
}
