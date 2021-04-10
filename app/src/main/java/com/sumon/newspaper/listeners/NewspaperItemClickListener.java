package com.sumon.newspaper.listeners;

import android.view.View;

import com.sumon.newspaper.models.Newspaper;

public interface NewspaperItemClickListener {
    void onNewspaperClick(Newspaper newspaper, View newspaperImageView);
}
