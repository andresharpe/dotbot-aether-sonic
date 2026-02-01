package com.google.android.gms.internal.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u extends t {

    /* renamed from: a, reason: collision with root package name */
    private final char f29159a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(char c4) {
        this.f29159a = c4;
    }

    @Override // com.google.android.gms.internal.common.x
    public final boolean a(char c4) {
        return c4 == this.f29159a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        int i4 = this.f29159a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i5 = 0; i5 < 4; i5++) {
            cArr[5 - i5] = "0123456789ABCDEF".charAt(i4 & 15);
            i4 >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
