package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
class e {

    /* renamed from: f, reason: collision with root package name */
    private static final String f25835f = "ThumbStreamOpener";

    /* renamed from: g, reason: collision with root package name */
    private static final a f25836g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final a f25837a;

    /* renamed from: b, reason: collision with root package name */
    private final d f25838b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f25839c;

    /* renamed from: d, reason: collision with root package name */
    private final ContentResolver f25840d;

    /* renamed from: e, reason: collision with root package name */
    private final List<ImageHeaderParser> f25841e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(List<ImageHeaderParser> list, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this(list, f25836g, dVar, bVar, contentResolver);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x001b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:28), block:B:26:0x001b */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(@androidx.annotation.N android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            com.bumptech.glide.load.data.mediastore.d r2 = r6.f25838b     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L27
            android.database.Cursor r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L25 java.lang.SecurityException -> L27
            if (r2 == 0) goto L1f
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            if (r3 == 0) goto L1f
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.Throwable -> L1a java.lang.SecurityException -> L1d
            r2.close()
            return r7
        L1a:
            r7 = move-exception
            r1 = r2
            goto L4a
        L1d:
            r3 = move-exception
            goto L29
        L1f:
            if (r2 == 0) goto L24
            r2.close()
        L24:
            return r1
        L25:
            r7 = move-exception
            goto L4a
        L27:
            r3 = move-exception
            r2 = r1
        L29:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L44
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r4.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L1a
            r4.append(r7)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L1a
            android.util.Log.d(r0, r7, r3)     // Catch: java.lang.Throwable -> L1a
        L44:
            if (r2 == 0) goto L49
            r2.close()
        L49:
            return r1
        L4a:
            if (r1 == 0) goto L4f
            r1.close()
        L4f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.e.b(android.net.Uri):java.lang.String");
    }

    private boolean c(File file) {
        if (this.f25837a.a(file) && 0 < this.f25837a.c(file)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f25840d.openInputStream(uri);
                int b4 = com.bumptech.glide.load.b.b(this.f25841e, inputStream, this.f25839c);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b4;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e4) {
            if (Log.isLoggable(f25835f, 3)) {
                Log.d(f25835f, "Failed to open uri: " + uri, e4);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
            return -1;
        }
    }

    public InputStream d(Uri uri) throws FileNotFoundException {
        String b4 = b(uri);
        if (TextUtils.isEmpty(b4)) {
            return null;
        }
        File b5 = this.f25837a.b(b4);
        if (!c(b5)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b5);
        try {
            return this.f25840d.openInputStream(fromFile);
        } catch (NullPointerException e4) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e4));
        }
    }

    e(List<ImageHeaderParser> list, a aVar, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this.f25837a = aVar;
        this.f25838b = dVar;
        this.f25839c = bVar;
        this.f25840d = contentResolver;
        this.f25841e = list;
    }
}
