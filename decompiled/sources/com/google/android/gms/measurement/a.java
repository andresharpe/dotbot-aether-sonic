package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.measurement.internal.C1638f2;

@Deprecated
/* loaded from: classes2.dex */
public class a extends ContentProvider {
    @Override // android.content.ContentProvider
    public void attachInfo(@N Context context, @N ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!"com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
        } else {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@N Uri uri, @P String str, @N String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @P
    public String getType(@N Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @P
    public Uri insert(@N Uri uri, @N ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        C1285y.l(context);
        C1638f2.F(context, null, null);
        return false;
    }

    @Override // android.content.ContentProvider
    @P
    public Cursor query(@N Uri uri, @N String[] strArr, @P String str, @N String[] strArr2, @P String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@N Uri uri, @P ContentValues contentValues, @P String str, @N String[] strArr) {
        return 0;
    }
}
