package okio;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class p extends AbstractList<ByteString> implements RandomAccess {

    /* renamed from: E, reason: collision with root package name */
    final ByteString[] f55378E;

    /* renamed from: F, reason: collision with root package name */
    final int[] f55379F;

    private p(ByteString[] byteStringArr, int[] iArr) {
        this.f55378E = byteStringArr;
        this.f55379F = iArr;
    }

    private static void b(long j4, C2385c c2385c, int i4, List<ByteString> list, int i5, int i6, List<Integer> list2) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C2385c c2385c2;
        if (i5 < i6) {
            for (int i12 = i5; i12 < i6; i12++) {
                if (list.get(i12).R() < i4) {
                    throw new AssertionError();
                }
            }
            ByteString byteString = list.get(i5);
            ByteString byteString2 = list.get(i6 - 1);
            if (i4 == byteString.R()) {
                int i13 = i5 + 1;
                i8 = i13;
                i7 = list2.get(i5).intValue();
                byteString = list.get(i13);
            } else {
                i7 = -1;
                i8 = i5;
            }
            if (byteString.r(i4) != byteString2.r(i4)) {
                int i14 = 1;
                for (int i15 = i8 + 1; i15 < i6; i15++) {
                    if (list.get(i15 - 1).r(i4) != list.get(i15).r(i4)) {
                        i14++;
                    }
                }
                long d4 = j4 + d(c2385c) + 2 + (i14 * 2);
                c2385c.B(i14);
                c2385c.B(i7);
                for (int i16 = i8; i16 < i6; i16++) {
                    byte r4 = list.get(i16).r(i4);
                    if (i16 == i8 || r4 != list.get(i16 - 1).r(i4)) {
                        c2385c.B(r4 & 255);
                    }
                }
                C2385c c2385c3 = new C2385c();
                int i17 = i8;
                while (i17 < i6) {
                    byte r5 = list.get(i17).r(i4);
                    int i18 = i17 + 1;
                    int i19 = i18;
                    while (true) {
                        if (i19 < i6) {
                            if (r5 != list.get(i19).r(i4)) {
                                i10 = i19;
                                break;
                            }
                            i19++;
                        } else {
                            i10 = i6;
                            break;
                        }
                    }
                    if (i18 == i10 && i4 + 1 == list.get(i17).R()) {
                        c2385c.B(list2.get(i17).intValue());
                        i11 = i10;
                        c2385c2 = c2385c3;
                    } else {
                        c2385c.B((int) ((d(c2385c3) + d4) * (-1)));
                        i11 = i10;
                        c2385c2 = c2385c3;
                        b(d4, c2385c3, i4 + 1, list, i17, i10, list2);
                    }
                    c2385c3 = c2385c2;
                    i17 = i11;
                }
                C2385c c2385c4 = c2385c3;
                c2385c.n0(c2385c4, c2385c4.F0());
                return;
            }
            int min = Math.min(byteString.R(), byteString2.R());
            int i20 = 0;
            for (int i21 = i4; i21 < min && byteString.r(i21) == byteString2.r(i21); i21++) {
                i20++;
            }
            long d5 = 1 + j4 + d(c2385c) + 2 + i20;
            c2385c.B(-i20);
            c2385c.B(i7);
            int i22 = i4;
            while (true) {
                i9 = i4 + i20;
                if (i22 >= i9) {
                    break;
                }
                c2385c.B(byteString.r(i22) & 255);
                i22++;
            }
            if (i8 + 1 == i6) {
                if (i9 == list.get(i8).R()) {
                    c2385c.B(list2.get(i8).intValue());
                    return;
                }
                throw new AssertionError();
            }
            C2385c c2385c5 = new C2385c();
            c2385c.B((int) ((d(c2385c5) + d5) * (-1)));
            b(d5, c2385c5, i9, list, i8, i6, list2);
            c2385c.n0(c2385c5, c2385c5.F0());
            return;
        }
        throw new AssertionError();
    }

    private static int d(C2385c c2385c) {
        return (int) (c2385c.F0() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static okio.p f(okio.ByteString... r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.p.f(okio.ByteString[]):okio.p");
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteString get(int i4) {
        return this.f55378E[i4];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f55378E.length;
    }
}
