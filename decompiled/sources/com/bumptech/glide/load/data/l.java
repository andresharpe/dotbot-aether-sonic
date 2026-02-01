package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.N;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: H, reason: collision with root package name */
    private static final String f25819H = "LocalUriFetcher";

    /* renamed from: E, reason: collision with root package name */
    private final Uri f25820E;

    /* renamed from: F, reason: collision with root package name */
    private final ContentResolver f25821F;

    /* renamed from: G, reason: collision with root package name */
    private T f25822G;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f25821F = contentResolver;
        this.f25820E = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t3 = this.f25822G;
        if (t3 != null) {
            try {
                c(t3);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(T t3) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    @N
    public DataSource d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(@N Priority priority, @N d.a<? super T> aVar) {
        try {
            T f4 = f(this.f25820E, this.f25821F);
            this.f25822G = f4;
            aVar.f(f4);
        } catch (FileNotFoundException e4) {
            if (Log.isLoggable(f25819H, 3)) {
                Log.d(f25819H, "Failed to open Uri", e4);
            }
            aVar.c(e4);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
