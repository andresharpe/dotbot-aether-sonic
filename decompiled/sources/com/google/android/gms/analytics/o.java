package com.google.android.gms.analytics;

import java.util.Comparator;

/* loaded from: classes.dex */
final class o implements Comparator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public o(p pVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((s) obj).getClass().getCanonicalName().compareTo(((s) obj2).getClass().getCanonicalName());
    }
}
