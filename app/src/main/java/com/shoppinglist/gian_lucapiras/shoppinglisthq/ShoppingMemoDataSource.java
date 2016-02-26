package com.shoppinglist.gian_lucapiras.shoppinglisthq;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by gian-lucapiras on 26.02.16.
 */
public class ShoppingMemoDataSource {
    private static final String LOG_TAG = ShoppingMemoDataSource.class.getSimpleName();

    private SQLiteDatabase database;
    private ShoppingMemoDbHelper dbHelper;


    public ShoppingMemoDataSource(Context context) {
        Log.d(LOG_TAG, "Unsere DataSource erzeugt jetzt den dbHelper.");
        dbHelper = new ShoppingMemoDbHelper(context);
    }
}
