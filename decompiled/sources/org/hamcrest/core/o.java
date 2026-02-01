package org.hamcrest.core;

/* loaded from: classes2.dex */
public class o extends r {
    public o(String str) {
        super(str);
    }

    @org.hamcrest.i
    public static org.hamcrest.k<String> k(String str) {
        return new o(str);
    }

    @Override // org.hamcrest.core.r
    protected boolean h(String str) {
        if (str.indexOf(this.f55444G) >= 0) {
            return true;
        }
        return false;
    }

    @Override // org.hamcrest.core.r
    protected String j() {
        return "containing";
    }
}
