package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@N Uri uri, @P String str, @P String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @P
    public final String getType(@N Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @P
    public final Uri insert(@N Uri uri, @P ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                a.e(context).a();
                return true;
            }
            return true;
        }
        throw new StartupException("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    @P
    public final Cursor query(@N Uri uri, @P String[] strArr, @P String str, @P String[] strArr2, @P String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(@N Uri uri, @P ContentValues contentValues, @P String str, @P String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
