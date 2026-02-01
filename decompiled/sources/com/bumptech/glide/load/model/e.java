package com.bumptech.glide.load.model;

import android.util.Base64;
import androidx.annotation.N;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class e<Model, Data> implements n<Model, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f26281b = "data:image";

    /* renamed from: c, reason: collision with root package name */
    private static final String f26282c = ";base64";

    /* renamed from: a, reason: collision with root package name */
    private final a<Data> f26283a;

    /* loaded from: classes.dex */
    public interface a<Data> {
        Class<Data> a();

        Data b(String str) throws IllegalArgumentException;

        void c(Data data) throws IOException;
    }

    /* loaded from: classes.dex */
    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: E, reason: collision with root package name */
        private final String f26284E;

        /* renamed from: F, reason: collision with root package name */
        private final a<Data> f26285F;

        /* renamed from: G, reason: collision with root package name */
        private Data f26286G;

        b(String str, a<Data> aVar) {
            this.f26284E = str;
            this.f26285F = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public Class<Data> a() {
            return this.f26285F.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f26285F.c(this.f26286G);
            } catch (IOException unused) {
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

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void e(@N Priority priority, @N d.a<? super Data> aVar) {
            try {
                Data b4 = this.f26285F.b(this.f26284E);
                this.f26286G = b4;
                aVar.f(b4);
            } catch (IllegalArgumentException e4) {
                aVar.c(e4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final a<InputStream> f26287a = new a();

        /* loaded from: classes.dex */
        class a implements a<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void c(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream b(String str) {
                if (str.startsWith(e.f26281b)) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(e.f26282c)) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Model, InputStream> c(@N r rVar) {
            return new e(this.f26287a);
        }
    }

    public e(a<Data> aVar) {
        this.f26283a = aVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean a(@N Model model) {
        return model.toString().startsWith(f26281b);
    }

    @Override // com.bumptech.glide.load.model.n
    public n.a<Data> b(@N Model model, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(model), new b(model.toString(), this.f26283a));
    }
}
