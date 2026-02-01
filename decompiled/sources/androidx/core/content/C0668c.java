package androidx.core.content;

import android.content.ContentValues;
import kotlin.Pair;

/* renamed from: androidx.core.content.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668c {
    @l3.d
    public static final ContentValues a(@l3.d Pair<String, ? extends Object>... pairs) {
        kotlin.jvm.internal.F.p(pairs, "pairs");
        ContentValues contentValues = new ContentValues(pairs.length);
        for (Pair<String, ? extends Object> pair : pairs) {
            String a4 = pair.a();
            Object b4 = pair.b();
            if (b4 == null) {
                contentValues.putNull(a4);
            } else if (b4 instanceof String) {
                contentValues.put(a4, (String) b4);
            } else if (b4 instanceof Integer) {
                contentValues.put(a4, (Integer) b4);
            } else if (b4 instanceof Long) {
                contentValues.put(a4, (Long) b4);
            } else if (b4 instanceof Boolean) {
                contentValues.put(a4, (Boolean) b4);
            } else if (b4 instanceof Float) {
                contentValues.put(a4, (Float) b4);
            } else if (b4 instanceof Double) {
                contentValues.put(a4, (Double) b4);
            } else if (b4 instanceof byte[]) {
                contentValues.put(a4, (byte[]) b4);
            } else if (b4 instanceof Byte) {
                contentValues.put(a4, (Byte) b4);
            } else if (b4 instanceof Short) {
                contentValues.put(a4, (Short) b4);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b4.getClass().getCanonicalName() + " for key \"" + a4 + kotlin.text.F.f52746b);
            }
        }
        return contentValues;
    }
}
