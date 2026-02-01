package com.amazonaws.internal;

import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.OutputStream;

@Deprecated
/* loaded from: classes.dex */
public class j extends FilterOutputStream implements c {
    public j(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.amazonaws.internal.c
    public boolean a() {
        Closeable closeable = ((FilterOutputStream) this).out;
        if (closeable instanceof c) {
            return ((c) closeable).a();
        }
        return false;
    }
}
