package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.model.n;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes.dex */
public class u<Data> implements n<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final n<Uri, Data> f26387a;

    /* loaded from: classes.dex */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        public n<String, AssetFileDescriptor> c(@N r rVar) {
            return new u(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<String, ParcelFileDescriptor> c(@N r rVar) {
            return new u(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<String, InputStream> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<String, InputStream> c(@N r rVar) {
            return new u(rVar.d(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.f26387a = nVar;
    }

    @P
    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return f(str);
        }
        return parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@N String str, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        Uri e4 = e(str);
        if (e4 != null && this.f26387a.a(e4)) {
            return this.f26387a.b(e4, i4, i5, fVar);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N String str) {
        return true;
    }
}
