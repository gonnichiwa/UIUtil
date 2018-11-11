package com.d.ui.view.replybg;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.d.lib.common.utils.ViewHelper;
import com.d.ui.view.R;

/**
 * ReplyBgActivity
 * Created by D on 2018/11/11.
 */
public class ReplyBgActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply_bg);
        initBack();
    }

    private void initBack() {
        ViewHelper.setOnClick(this, R.id.iv_title_left, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
