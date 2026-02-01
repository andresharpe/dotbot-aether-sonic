package com.amazonaws.internal;

import com.amazonaws.logging.LogFactory;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class e extends i implements d {

    /* renamed from: F, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23746F = LogFactory.c(e.class);

    /* renamed from: E, reason: collision with root package name */
    private boolean f23747E;

    /* JADX INFO: Access modifiers changed from: protected */
    public e(InputStream inputStream) {
        super(inputStream);
    }

    private void f() {
        try {
            ((FilterInputStream) this).in.close();
        } catch (Exception e4) {
            com.amazonaws.logging.c cVar = f23746F;
            if (cVar.f()) {
                cVar.b("FYI", e4);
            }
        }
        if (((FilterInputStream) this).in instanceof d) {
            ((d) ((FilterInputStream) this).in).release();
        }
        c();
    }

    public static e i(InputStream inputStream) {
        if (inputStream instanceof e) {
            return (e) inputStream;
        }
        if (inputStream instanceof FileInputStream) {
            return f.n((FileInputStream) inputStream);
        }
        return new e(inputStream);
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f23747E) {
            f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends e> T d() {
        this.f23747E = true;
        return this;
    }

    public final boolean h() {
        return this.f23747E;
    }

    @Override // com.amazonaws.internal.d
    public final void release() {
        f();
    }
}
