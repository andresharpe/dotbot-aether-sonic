package okio;

/* loaded from: classes2.dex */
public final class B {
    private B() {
    }

    public static long a(String str) {
        return b(str, 0, str.length());
    }

    public static long b(String str, int i4, int i5) {
        long j4;
        char c4;
        if (str != null) {
            if (i4 >= 0) {
                if (i5 >= i4) {
                    if (i5 <= str.length()) {
                        long j5 = 0;
                        while (i4 < i5) {
                            char charAt = str.charAt(i4);
                            if (charAt < 128) {
                                j5++;
                            } else {
                                if (charAt < 2048) {
                                    j4 = 2;
                                } else if (charAt >= 55296 && charAt <= 57343) {
                                    int i6 = i4 + 1;
                                    if (i6 < i5) {
                                        c4 = str.charAt(i6);
                                    } else {
                                        c4 = 0;
                                    }
                                    if (charAt <= 56319 && c4 >= 56320 && c4 <= 57343) {
                                        j5 += 4;
                                        i4 += 2;
                                    } else {
                                        j5++;
                                        i4 = i6;
                                    }
                                } else {
                                    j4 = 3;
                                }
                                j5 += j4;
                            }
                            i4++;
                        }
                        return j5;
                    }
                    throw new IllegalArgumentException("endIndex > string.length: " + i5 + " > " + str.length());
                }
                throw new IllegalArgumentException("endIndex < beginIndex: " + i5 + " < " + i4);
            }
            throw new IllegalArgumentException("beginIndex < 0: " + i4);
        }
        throw new IllegalArgumentException("string == null");
    }
}
