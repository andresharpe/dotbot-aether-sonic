package org.junit.experimental.theories.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ParameterizedAssertionError extends AssertionError {

    /* renamed from: E, reason: collision with root package name */
    private static final long f55538E = 1;

    public ParameterizedAssertionError(Throwable th, String str, Object... objArr) {
        super(String.format("%s(%s)", str, b(", ", objArr)));
        initCause(th);
    }

    public static String a(String str, Collection<Object> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(c(it.next()));
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String b(String str, Object... objArr) {
        return a(str, Arrays.asList(objArr));
    }

    private static String c(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Throwable unused) {
            return "[toString failed]";
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof ParameterizedAssertionError) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
