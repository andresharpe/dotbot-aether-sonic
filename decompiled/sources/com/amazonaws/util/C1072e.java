package com.amazonaws.util;

/* renamed from: com.amazonaws.util.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1072e extends AbstractC1069b {

    /* renamed from: k, reason: collision with root package name */
    private static final int f24289k = 26;

    /* renamed from: l, reason: collision with root package name */
    private static final int f24290l = 24;

    /* renamed from: com.amazonaws.util.e$a */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final byte[] f24291a = b();

        private a() {
        }

        private static byte[] b() {
            byte[] bArr = new byte[123];
            for (int i4 = 0; i4 <= 122; i4++) {
                if (i4 >= 65 && i4 <= 90) {
                    bArr[i4] = (byte) (i4 - 65);
                } else if (i4 >= 50 && i4 <= 55) {
                    bArr[i4] = (byte) (i4 - 24);
                } else if (i4 >= 97 && i4 <= 122) {
                    bArr[i4] = (byte) (i4 - 97);
                } else {
                    bArr[i4] = -1;
                }
            }
            return bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1072e() {
        super(k());
    }

    private static byte[] k() {
        return CodecUtils.f("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
    }

    @Override // com.amazonaws.util.AbstractC1069b
    protected int j(byte b4) {
        byte b5 = a.f24291a[b4];
        if (b5 > -1) {
            return b5;
        }
        throw new IllegalArgumentException("Invalid base 32 character: '" + ((char) b4) + "'");
    }
}
