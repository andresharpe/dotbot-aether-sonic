package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: com.google.android.gms.measurement.internal.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1683n {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.google.android.gms.measurement.internal.C1720t1 r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19) throws android.database.sqlite.SQLiteException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1683n.a(com.google.android.gms.measurement.internal.t1, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(C1720t1 c1720t1, SQLiteDatabase sQLiteDatabase) {
        if (c1720t1 != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                c1720t1.u().a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                c1720t1.u().a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                c1720t1.u().a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                c1720t1.u().a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
