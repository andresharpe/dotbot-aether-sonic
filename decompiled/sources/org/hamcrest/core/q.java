package org.hamcrest.core;

/* loaded from: classes2.dex */
public class q extends r {
    public q(String str) {
        super(str);
    }

    @org.hamcrest.i
    public static org.hamcrest.k<String> k(String str) {
        return new q(str);
    }

    @Override // org.hamcrest.core.r
    protected boolean h(String str) {
        return str.startsWith(this.f55444G);
    }

    @Override // org.hamcrest.core.r
    protected String j() {
        return "starting with";
    }
}
