package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.N;
import com.bumptech.glide.load.model.n;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class w<Data> implements n<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f26391b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", FirebaseAnalytics.b.f34769P)));

    /* renamed from: a, reason: collision with root package name */
    private final c<Data> f26392a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f26393a;

        public a(ContentResolver contentResolver) {
            this.f26393a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.w.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f26393a, uri);
        }

        @Override // com.bumptech.glide.load.model.o
        public n<Uri, AssetFileDescriptor> c(r rVar) {
            return new w(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f26394a;

        public b(ContentResolver contentResolver) {
            this.f26394a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.w.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f26394a, uri);
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
            return new w(this);
        }
    }

    /* loaded from: classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> b(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f26395a;

        public d(ContentResolver contentResolver) {
            this.f26395a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.w.c
        public com.bumptech.glide.load.data.d<InputStream> b(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f26395a, uri);
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Uri, InputStream> c(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f26392a = cVar;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@N Uri uri, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), this.f26392a.b(uri));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N Uri uri) {
        return f26391b.contains(uri.getScheme());
    }
}
