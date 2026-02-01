package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class X2 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.B("PhenotypeConstants.class")
    private static final androidx.collection.a f29550a = new androidx.collection.a();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri a(String str) {
        synchronized (X2.class) {
            androidx.collection.a aVar = f29550a;
            Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                aVar.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
