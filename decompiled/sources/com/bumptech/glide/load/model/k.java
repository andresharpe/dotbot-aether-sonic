package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.N;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class k implements n<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26314a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f26315a;

        public a(Context context) {
            this.f26315a = context;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Uri, File> c(r rVar) {
            return new k(this.f26315a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: G, reason: collision with root package name */
        private static final String[] f26316G = {"_data"};

        /* renamed from: E, reason: collision with root package name */
        private final Context f26317E;

        /* renamed from: F, reason: collision with root package name */
        private final Uri f26318F;

        b(Context context, Uri uri) {
            this.f26317E = context;
            this.f26318F = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
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
        public void e(@N Priority priority, @N d.a<? super File> aVar) {
            Cursor query = this.f26317E.getContentResolver().query(this.f26318F, f26316G, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f26318F));
                return;
            }
            aVar.f(new File(str));
        }
    }

    public k(Context context) {
        this.f26314a = context;
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<File> b(@N Uri uri, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(uri), new b(this.f26314a, uri));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N Uri uri) {
        return com.bumptech.glide.load.data.mediastore.b.b(uri);
    }
}
