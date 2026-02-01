package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import com.amazonaws.logging.LogFactory;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class k extends InputStream implements c {
    @Override // com.amazonaws.internal.c
    @Deprecated
    public final boolean a() {
        Closeable d4 = d();
        if (d4 instanceof c) {
            return ((c) d4).a();
        }
        return false;
    }

    protected void b() throws IOException {
    }

    protected final void c() {
        if (!Thread.interrupted()) {
            return;
        }
        try {
            b();
        } catch (IOException e4) {
            LogFactory.c(getClass()).b("FYI", e4);
        }
        throw new AbortedException();
    }

    protected abstract InputStream d();
}
