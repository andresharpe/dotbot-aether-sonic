package androidx.core.database;

import android.database.Cursor;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes.dex */
public final class a {
    @e
    public static final byte[] a(@d Cursor cursor, int i4) {
        F.p(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return cursor.getBlob(i4);
    }

    @e
    public static final Double b(@d Cursor cursor, int i4) {
        F.p(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i4));
    }

    @e
    public static final Float c(@d Cursor cursor, int i4) {
        F.p(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i4));
    }

    @e
    public static final Integer d(@d Cursor cursor, int i4) {
        F.p(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i4));
    }

    @e
    public static final Long e(@d Cursor cursor, int i4) {
        F.p(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i4));
    }

    @e
    public static final Short f(@d Cursor cursor, int i4) {
        F.p(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i4));
    }

    @e
    public static final String g(@d Cursor cursor, int i4) {
        F.p(cursor, "<this>");
        if (cursor.isNull(i4)) {
            return null;
        }
        return cursor.getString(i4);
    }
}
