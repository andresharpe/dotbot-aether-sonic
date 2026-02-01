package com.blankj.utilcode.util;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.blankj.utilcode.util.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1112w {
    private C1112w() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public static void b(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
