package com.google.android.gms.internal.common;

import java.util.Iterator;
import l1.InterfaceC2354a;

/* renamed from: com.google.android.gms.internal.common.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316d extends C1314b {
    public C1316d() {
        super(4);
    }

    @InterfaceC2354a
    public final C1316d c(Object obj) {
        super.a(obj);
        return this;
    }

    @InterfaceC2354a
    public final C1316d d(Iterator it) {
        while (it.hasNext()) {
            super.a(it.next());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1316d(int i4) {
        super(4);
    }
}
