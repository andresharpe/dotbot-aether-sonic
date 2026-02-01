package com.harman.log;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes2.dex */
public class h extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(@N Uri uri, @P String str, @P String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @P
    public String getType(@N Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @P
    public Uri insert(@N Uri uri, @P ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @P
    public Cursor query(@N Uri uri, @P String[] strArr, @P String str, @P String[] strArr2, @P String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@N Uri uri, @P ContentValues contentValues, @P String str, @P String[] strArr) {
        return 0;
    }
}
