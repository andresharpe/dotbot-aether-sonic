package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
final class zzbin extends IllegalArgumentException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbin(int i4, int i5) {
        super("Unpaired surrogate at index " + i4 + " of " + i5);
    }
}
