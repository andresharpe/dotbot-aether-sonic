package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.C1285y;
import com.google.firebase.e;

/* loaded from: classes2.dex */
public class a extends ContentProvider {

    /* renamed from: E, reason: collision with root package name */
    private static final String f37355E = "FirebaseInitProvider";

    /* renamed from: F, reason: collision with root package name */
    @i0
    static final String f37356F = "com.google.firebase.firebaseinitprovider";

    private static void a(@N ProviderInfo providerInfo) {
        C1285y.m(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!f37356F.equals(providerInfo.authority)) {
        } else {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@N Context context, @N ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

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
        if (e.x(getContext()) == null) {
            Log.i(f37355E, "FirebaseApp initialization unsuccessful");
            return false;
        }
        Log.i(f37355E, "FirebaseApp initialization successful");
        return false;
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
