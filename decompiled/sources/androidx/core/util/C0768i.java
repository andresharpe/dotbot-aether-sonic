package androidx.core.util;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.util.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0768i {
    private C0768i() {
    }

    public static void a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
