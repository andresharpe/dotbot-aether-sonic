package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.N;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: H, reason: collision with root package name */
    private static final String f25788H = "AssetPathFetcher";

    /* renamed from: E, reason: collision with root package name */
    private final String f25789E;

    /* renamed from: F, reason: collision with root package name */
    private final AssetManager f25790F;

    /* renamed from: G, reason: collision with root package name */
    private T f25791G;

    public b(AssetManager assetManager, String str) {
        this.f25790F = assetManager;
        this.f25789E = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t3 = this.f25791G;
        if (t3 == null) {
            return;
        }
        try {
            c(t3);
        } catch (IOException unused) {
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
    public void e(@N Priority priority, @N d.a<? super T> aVar) {
        try {
            T f4 = f(this.f25790F, this.f25789E);
            this.f25791G = f4;
            aVar.f(f4);
        } catch (IOException e4) {
            if (Log.isLoggable(f25788H, 3)) {
                Log.d(f25788H, "Failed to load data from asset manager", e4);
            }
            aVar.c(e4);
        }
    }

    protected abstract T f(AssetManager assetManager, String str) throws IOException;
}
