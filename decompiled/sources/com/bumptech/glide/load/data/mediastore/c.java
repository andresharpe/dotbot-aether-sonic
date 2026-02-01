package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.i0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: H, reason: collision with root package name */
    private static final String f25825H = "MediaStoreThumbFetcher";

    /* renamed from: E, reason: collision with root package name */
    private final Uri f25826E;

    /* renamed from: F, reason: collision with root package name */
    private final e f25827F;

    /* renamed from: G, reason: collision with root package name */
    private InputStream f25828G;

    /* loaded from: classes.dex */
    static class a implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f25829b = {"_data"};

        /* renamed from: c, reason: collision with root package name */
        private static final String f25830c = "kind = 1 AND image_id = ?";

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f25831a;

        a(ContentResolver contentResolver) {
            this.f25831a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri) {
            return this.f25831a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f25829b, f25830c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* loaded from: classes.dex */
    static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f25832b = {"_data"};

        /* renamed from: c, reason: collision with root package name */
        private static final String f25833c = "kind = 1 AND video_id = ?";

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f25834a;

        b(ContentResolver contentResolver) {
            this.f25834a = contentResolver;
        }

        @Override // com.bumptech.glide.load.data.mediastore.d
        public Cursor a(Uri uri) {
            return this.f25834a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f25832b, f25833c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @i0
    c(Uri uri, e eVar) {
        this.f25826E = uri;
        this.f25827F = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.e(context).n().g(), dVar, com.bumptech.glide.b.e(context).g(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        int i4;
        InputStream d4 = this.f25827F.d(this.f25826E);
        if (d4 != null) {
            i4 = this.f25827F.a(this.f25826E);
        } else {
            i4 = -1;
        }
        if (i4 != -1) {
            return new g(d4, i4);
        }
        return d4;
    }

    @Override // com.bumptech.glide.load.data.d
    @N
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f25828G;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    @N
    public DataSource d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(@N Priority priority, @N d.a<? super InputStream> aVar) {
        try {
            InputStream h4 = h();
            this.f25828G = h4;
            aVar.f(h4);
        } catch (FileNotFoundException e4) {
            if (Log.isLoggable(f25825H, 3)) {
                Log.d(f25825H, "Failed to find thumbnail file", e4);
            }
            aVar.c(e4);
        }
    }
}
