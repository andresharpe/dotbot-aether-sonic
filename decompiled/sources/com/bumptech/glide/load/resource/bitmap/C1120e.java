package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.P;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1120e implements com.bumptech.glide.load.h<Bitmap> {

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Integer> f26515b = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Bitmap.CompressFormat> f26516c = com.bumptech.glide.load.e.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: d, reason: collision with root package name */
    private static final String f26517d = "BitmapEncoder";

    /* renamed from: a, reason: collision with root package name */
    @P
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f26518a;

    public C1120e(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f26518a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, com.bumptech.glide.load.f fVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) fVar.c(f26516c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.h
    @androidx.annotation.N
    public EncodeStrategy b(@androidx.annotation.N com.bumptech.glide.load.f fVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #4 {all -> 0x0056, blocks: (B:3:0x0021, B:14:0x0052, B:17:0x0070, B:19:0x0076, B:45:0x00c2, B:43:0x00c5, B:37:0x006b), top: B:2:0x0021 }] */
    @Override // com.bumptech.glide.load.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(@androidx.annotation.N com.bumptech.glide.load.engine.u<android.graphics.Bitmap> r8, @androidx.annotation.N java.io.File r9, @androidx.annotation.N com.bumptech.glide.load.f r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            com.bumptech.glide.util.pool.b.d(r4, r2, r3, r1)
            long r2 = com.bumptech.glide.util.h.b()     // Catch: java.lang.Throwable -> L56
            com.bumptech.glide.load.e<java.lang.Integer> r4 = com.bumptech.glide.load.resource.bitmap.C1120e.f26515b     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = r10.c(r4)     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L56
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L56
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            com.bumptech.glide.load.engine.bitmap_recycle.b r9 = r7.f26518a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L48
            if (r9 == 0) goto L4b
            com.bumptech.glide.load.data.c r9 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L48
            com.bumptech.glide.load.engine.bitmap_recycle.b r5 = r7.f26518a     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L48
            r9.<init>(r6, r5)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L48
            r5 = r9
            goto L4c
        L44:
            r8 = move-exception
            r5 = r6
            goto Lc0
        L48:
            r9 = move-exception
            r5 = r6
            goto L5d
        L4b:
            r5 = r6
        L4c:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r5.close()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5c
            r5.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            goto L58
        L56:
            r8 = move-exception
            goto Lc6
        L58:
            r9 = 1
            goto L6f
        L5a:
            r8 = move-exception
            goto Lc0
        L5c:
            r9 = move-exception
        L5d:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L5a
            if (r4 == 0) goto L69
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r9)     // Catch: java.lang.Throwable -> L5a
        L69:
            if (r5 == 0) goto L6e
            r5.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L6e
        L6e:
            r9 = 0
        L6f:
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto Lbc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r4.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = "Compressed with type: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L56
            r4.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = " of size "
            r4.append(r1)     // Catch: java.lang.Throwable -> L56
            int r1 = com.bumptech.glide.util.n.h(r8)     // Catch: java.lang.Throwable -> L56
            r4.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = " in "
            r4.append(r1)     // Catch: java.lang.Throwable -> L56
            double r1 = com.bumptech.glide.util.h.a(r2)     // Catch: java.lang.Throwable -> L56
            r4.append(r1)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = ", options format: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L56
            com.bumptech.glide.load.e<android.graphics.Bitmap$CompressFormat> r1 = com.bumptech.glide.load.resource.bitmap.C1120e.f26516c     // Catch: java.lang.Throwable -> L56
            java.lang.Object r10 = r10.c(r1)     // Catch: java.lang.Throwable -> L56
            r4.append(r10)     // Catch: java.lang.Throwable -> L56
            java.lang.String r10 = ", hasAlpha: "
            r4.append(r10)     // Catch: java.lang.Throwable -> L56
            boolean r8 = r8.hasAlpha()     // Catch: java.lang.Throwable -> L56
            r4.append(r8)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L56
            android.util.Log.v(r0, r8)     // Catch: java.lang.Throwable -> L56
        Lbc:
            com.bumptech.glide.util.pool.b.e()
            return r9
        Lc0:
            if (r5 == 0) goto Lc5
            r5.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> Lc5
        Lc5:
            throw r8     // Catch: java.lang.Throwable -> L56
        Lc6:
            com.bumptech.glide.util.pool.b.e()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C1120e.a(com.bumptech.glide.load.engine.u, java.io.File, com.bumptech.glide.load.f):boolean");
    }

    @Deprecated
    public C1120e() {
        this.f26518a = null;
    }
}
