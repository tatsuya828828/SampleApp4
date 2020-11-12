package com.kuma.sampleapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // ボタンで列を開閉する処理
    // テーブル列を開閉するには、setColumunCollapseメソッドを利用する
    // setColumnCollapsedメソッドの引数isCollapsedは、閉じる際にtrueを指定する
    // 今回は、あらかじめboolean型の変数flagを用意しておきクリックするたびに反転させることで表示を切り替えている
    public void btnflag_onClick(View view) {
        TableLayout table = findViewById(R.id.table);
        table.setColumnCollapsed(1, flag);
        flag = !flag;
    }
}