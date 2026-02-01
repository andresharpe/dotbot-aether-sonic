package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.N;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class f<Data> implements n<File, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f26289b = "FileLoader";

    /* renamed from: a, reason: collision with root package name */
    private final d<Data> f26290a;

    /* loaded from: classes.dex */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final d<Data> f26291a;

        public a(d<Data> dVar) {
            this.f26291a = dVar;
        }

        @Override // com.bumptech.glide.load.model.o
        public final void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<File, Data> c(@N r rVar) {
            return new f(this.f26291a);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* loaded from: classes.dex */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.model.f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.bumptech.glide.load.model.f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: E, reason: collision with root package name */
        private final File f26292E;

        /* renamed from: F, reason: collision with root package name */
        private final d<Data> f26293F;

        /* renamed from: G, reason: collision with root package name */
        private Data f26294G;

        c(File file, d<Data> dVar) {
            this.f26292E = file;
            this.f26293F = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public Class<Data> a() {
            return this.f26293F.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f26294G;
            if (data != null) {
                try {
                    this.f26293F.c(data);
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

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void e(@N Priority priority, @N d.a<? super Data> aVar) {
            try {
                Data b4 = this.f26293F.b(this.f26292E);
                this.f26294G = b4;
                aVar.f(b4);
            } catch (FileNotFoundException e4) {
                if (Log.isLoggable(f.f26289b, 3)) {
                    Log.d(f.f26289b, "Failed to open file", e4);
                }
                aVar.c(e4);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void c(Data data) throws IOException;
    }

    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* loaded from: classes.dex */
        class a implements d<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.model.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.f.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void c(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.model.f.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f26290a = dVar;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> b(@N File file, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(file), new c(file, this.f26290a));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N File file) {
        return true;
    }
}
