package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.N;
import com.bumptech.glide.load.model.n;
import java.io.InputStream;

/* loaded from: classes.dex */
public class a<Data> implements n<Uri, Data> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f26266c = "android_asset";

    /* renamed from: d, reason: collision with root package name */
    private static final String f26267d = "file:///android_asset/";

    /* renamed from: e, reason: collision with root package name */
    private static final int f26268e = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f26269a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0234a<Data> f26270b;

    /* renamed from: com.bumptech.glide.load.model.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0234a<Data> {
        com.bumptech.glide.load.data.d<Data> b(AssetManager assetManager, String str);
    }

    /* loaded from: classes.dex */
    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0234a<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f26271a;

        public b(AssetManager assetManager) {
            this.f26271a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0234a
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Uri, ParcelFileDescriptor> c(r rVar) {
            return new a(this.f26271a, this);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Uri, InputStream>, InterfaceC0234a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f26272a;

        public c(AssetManager assetManager) {
            this.f26272a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.a.InterfaceC0234a
        public com.bumptech.glide.load.data.d<InputStream> b(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Uri, InputStream> c(r rVar) {
            return new a(this.f26272a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0234a<Data> interfaceC0234a) {
        this.f26269a = assetManager;
        this.f26270b = interfaceC0234a;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@N Uri uri, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), this.f26270b.b(this.f26269a, uri.toString().substring(f26268e)));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !f26266c.equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
