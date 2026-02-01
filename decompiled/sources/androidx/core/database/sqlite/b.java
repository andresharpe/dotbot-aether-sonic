package androidx.core.database.sqlite;

import X2.l;
import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes.dex */
public final class b {
    public static final <T> T a(@d SQLiteDatabase sQLiteDatabase, boolean z3, @d l<? super SQLiteDatabase, ? extends T> body) {
        F.p(sQLiteDatabase, "<this>");
        F.p(body, "body");
        if (z3) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T C3 = body.C(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return C3;
        } finally {
            C.d(1);
            sQLiteDatabase.endTransaction();
            C.c(1);
        }
    }

    public static /* synthetic */ Object b(SQLiteDatabase sQLiteDatabase, boolean z3, l body, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        F.p(sQLiteDatabase, "<this>");
        F.p(body, "body");
        if (z3) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object C3 = body.C(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return C3;
        } finally {
            C.d(1);
            sQLiteDatabase.endTransaction();
            C.c(1);
        }
    }
}
