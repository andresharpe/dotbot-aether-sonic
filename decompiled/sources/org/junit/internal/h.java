package org.junit.internal;

import java.io.PrintStream;

/* loaded from: classes2.dex */
public class h implements f {
    @Override // org.junit.internal.f
    public PrintStream a() {
        return System.out;
    }

    @Override // org.junit.internal.f
    @Deprecated
    public void b(int i4) {
        System.exit(i4);
    }
}
