package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.model.n;
import java.io.InputStream;

/* loaded from: classes.dex */
public class s<Data> implements n<Integer, Data> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f26351c = "ResourceLoader";

    /* renamed from: a, reason: collision with root package name */
    private final n<Uri, Data> f26352a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f26353b;

    /* loaded from: classes.dex */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f26354a;

        public a(Resources resources) {
            this.f26354a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        public n<Integer, AssetFileDescriptor> c(r rVar) {
            return new s(this.f26354a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f26355a;

        public b(Resources resources) {
            this.f26355a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Integer, ParcelFileDescriptor> c(r rVar) {
            return new s(this.f26355a, rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f26356a;

        public c(Resources resources) {
            this.f26356a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Integer, InputStream> c(r rVar) {
            return new s(this.f26356a, rVar.d(Uri.class, InputStream.class));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f26357a;

        public d(Resources resources) {
            this.f26357a = resources;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Integer, Uri> c(r rVar) {
            return new s(this.f26357a, v.c());
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f26353b = resources;
        this.f26352a = nVar;
    }

    @P
    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f26353b.getResourcePackageName(num.intValue()) + '/' + this.f26353b.getResourceTypeName(num.intValue()) + '/' + this.f26353b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e4) {
            if (Log.isLoggable(f26351c, 5)) {
                Log.w(f26351c, "Received invalid resource id: " + num, e4);
                return null;
            }
            return null;
        }
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@N Integer num, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        Uri d4 = d(num);
        if (d4 == null) {
            return null;
        }
        return this.f26352a.b(d4, i4, i5, fVar);
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(@N Integer num) {
        return true;
    }
}
