package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import com.bumptech.glide.load.model.o;
import com.bumptech.glide.load.model.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

@W(ConstraintLayout.b.a.f9571D)
/* loaded from: classes.dex */
public final class f<DataT> implements n<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26367a;

    /* renamed from: b, reason: collision with root package name */
    private final n<File, DataT> f26368b;

    /* renamed from: c, reason: collision with root package name */
    private final n<Uri, DataT> f26369c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<DataT> f26370d;

    /* loaded from: classes.dex */
    private static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f26371a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<DataT> f26372b;

        a(Context context, Class<DataT> cls) {
            this.f26371a = context;
            this.f26372b = cls;
        }

        @Override // com.bumptech.glide.load.model.o
        public final void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public final n<Uri, DataT> c(@N r rVar) {
            return new f(this.f26371a, rVar.d(File.class, this.f26372b), rVar.d(Uri.class, this.f26372b), this.f26372b);
        }
    }

    @W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: O, reason: collision with root package name */
        private static final String[] f26373O = {"_data"};

        /* renamed from: E, reason: collision with root package name */
        private final Context f26374E;

        /* renamed from: F, reason: collision with root package name */
        private final n<File, DataT> f26375F;

        /* renamed from: G, reason: collision with root package name */
        private final n<Uri, DataT> f26376G;

        /* renamed from: H, reason: collision with root package name */
        private final Uri f26377H;

        /* renamed from: I, reason: collision with root package name */
        private final int f26378I;

        /* renamed from: J, reason: collision with root package name */
        private final int f26379J;

        /* renamed from: K, reason: collision with root package name */
        private final com.bumptech.glide.load.f f26380K;

        /* renamed from: L, reason: collision with root package name */
        private final Class<DataT> f26381L;

        /* renamed from: M, reason: collision with root package name */
        private volatile boolean f26382M;

        /* renamed from: N, reason: collision with root package name */
        @P
        private volatile com.bumptech.glide.load.data.d<DataT> f26383N;

        d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i4, int i5, com.bumptech.glide.load.f fVar, Class<DataT> cls) {
            this.f26374E = context.getApplicationContext();
            this.f26375F = nVar;
            this.f26376G = nVar2;
            this.f26377H = uri;
            this.f26378I = i4;
            this.f26379J = i5;
            this.f26380K = fVar;
            this.f26381L = cls;
        }

        @P
        private n.a<DataT> c() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            Uri uri;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.f26375F.b(h(this.f26377H), this.f26378I, this.f26379J, this.f26380K);
            }
            if (g()) {
                uri = MediaStore.setRequireOriginal(this.f26377H);
            } else {
                uri = this.f26377H;
            }
            return this.f26376G.b(uri, this.f26378I, this.f26379J, this.f26380K);
        }

        @P
        private com.bumptech.glide.load.data.d<DataT> f() throws FileNotFoundException {
            n.a<DataT> c4 = c();
            if (c4 != null) {
                return c4.f26328c;
            }
            return null;
        }

        private boolean g() {
            if (this.f26374E.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                return true;
            }
            return false;
        }

        @N
        private File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor query = this.f26374E.getContentResolver().query(uri, f26373O, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        query.close();
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public Class<DataT> a() {
            return this.f26381L;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f26383N;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f26382M = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f26383N;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@N Priority priority, @N d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> f4 = f();
                if (f4 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f26377H));
                    return;
                }
                this.f26383N = f4;
                if (this.f26382M) {
                    cancel();
                } else {
                    f4.e(priority, aVar);
                }
            } catch (FileNotFoundException e4) {
                aVar.c(e4);
            }
        }
    }

    f(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f26367a = context.getApplicationContext();
        this.f26368b = nVar;
        this.f26369c = nVar2;
        this.f26370d = cls;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<DataT> b(@N Uri uri, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), new d(this.f26367a, this.f26368b, this.f26369c, uri, i4, i5, fVar, this.f26370d));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N Uri uri) {
        if (Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.data.mediastore.b.b(uri)) {
            return true;
        }
        return false;
    }
}
