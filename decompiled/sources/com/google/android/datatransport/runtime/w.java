package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.persistence.AbstractC1136f;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d;
import java.io.Closeable;
import java.io.IOException;
import x0.InterfaceC2436b;
import x0.d;

/* JADX INFO: Access modifiers changed from: package-private */
@O2.f
@x0.d(modules = {com.google.android.datatransport.runtime.backends.f.class, AbstractC1136f.class, k.class, com.google.android.datatransport.runtime.scheduling.h.class, com.google.android.datatransport.runtime.scheduling.f.class, com.google.android.datatransport.runtime.time.d.class})
/* loaded from: classes.dex */
public abstract class w implements Closeable {

    @d.a
    /* loaded from: classes.dex */
    interface a {
        w a();

        @InterfaceC2436b
        a b(Context context);
    }

    abstract InterfaceC1134d a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract v b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
