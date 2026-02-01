package org.hamcrest;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.text.F;

/* loaded from: classes2.dex */
public abstract class a implements g {
    private g i(String str, String str2, String str3, Iterator<? extends m> it) {
        h(str);
        boolean z3 = false;
        while (it.hasNext()) {
            if (z3) {
                h(str2);
            }
            b(it.next());
            z3 = true;
        }
        h(str3);
        return this;
    }

    private <T> g j(String str, String str2, String str3, Iterator<T> it) {
        return i(str, str2, str3, new org.hamcrest.internal.d(it));
    }

    private String k(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    private void l(char c4) {
        if (c4 != '\t') {
            if (c4 != '\n') {
                if (c4 != '\r') {
                    if (c4 != '\"') {
                        g(c4);
                        return;
                    } else {
                        h("\\\"");
                        return;
                    }
                }
                h("\\r");
                return;
            }
            h("\\n");
            return;
        }
        h("\\t");
    }

    private void m(String str) {
        g(F.f52746b);
        for (int i4 = 0; i4 < str.length(); i4++) {
            l(str.charAt(i4));
        }
        g(F.f52746b);
    }

    @Override // org.hamcrest.g
    public g a(String str, String str2, String str3, Iterable<? extends m> iterable) {
        return i(str, str2, str3, iterable.iterator());
    }

    @Override // org.hamcrest.g
    public g b(m mVar) {
        mVar.b(this);
        return this;
    }

    @Override // org.hamcrest.g
    public <T> g c(String str, String str2, String str3, T... tArr) {
        return f(str, str2, str3, Arrays.asList(tArr));
    }

    @Override // org.hamcrest.g
    public g d(String str) {
        h(str);
        return this;
    }

    @Override // org.hamcrest.g
    public g e(Object obj) {
        if (obj == null) {
            h("null");
        } else if (obj instanceof String) {
            m((String) obj);
        } else if (obj instanceof Character) {
            g(F.f52746b);
            l(((Character) obj).charValue());
            g(F.f52746b);
        } else if (obj instanceof Short) {
            g(F.f52749e);
            h(k(obj));
            h("s>");
        } else if (obj instanceof Long) {
            g(F.f52749e);
            h(k(obj));
            h("L>");
        } else if (obj instanceof Float) {
            g(F.f52749e);
            h(k(obj));
            h("F>");
        } else if (obj.getClass().isArray()) {
            j("[", ", ", "]", new org.hamcrest.internal.a(obj));
        } else {
            g(F.f52749e);
            h(k(obj));
            g(F.f52750f);
        }
        return this;
    }

    @Override // org.hamcrest.g
    public <T> g f(String str, String str2, String str3, Iterable<T> iterable) {
        return j(str, str2, str3, iterable.iterator());
    }

    protected abstract void g(char c4);

    protected void h(String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            g(str.charAt(i4));
        }
    }
}
