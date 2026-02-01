package org.hamcrest;

import java.io.IOException;

/* loaded from: classes2.dex */
public class n extends a {

    /* renamed from: b, reason: collision with root package name */
    private final Appendable f55459b;

    public n() {
        this(new StringBuilder());
    }

    public static String n(m mVar) {
        return o(mVar);
    }

    public static String o(m mVar) {
        return new n().b(mVar).toString();
    }

    @Override // org.hamcrest.a
    protected void g(char c4) {
        try {
            this.f55459b.append(c4);
        } catch (IOException e4) {
            throw new RuntimeException("Could not write description", e4);
        }
    }

    @Override // org.hamcrest.a
    protected void h(String str) {
        try {
            this.f55459b.append(str);
        } catch (IOException e4) {
            throw new RuntimeException("Could not write description", e4);
        }
    }

    public String toString() {
        return this.f55459b.toString();
    }

    public n(Appendable appendable) {
        this.f55459b = appendable;
    }
}
