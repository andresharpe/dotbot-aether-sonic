package kotlin.io.encoding;

import com.harman.sdk.utils.k;
import kotlin.Y;
import kotlin.collections.C2100o;
import kotlin.jvm.internal.U;

@U({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,643:1\n13384#2,3:644\n13384#2,3:647\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n580#1:644,3\n597#1:647,3\n*E\n"})
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    @l3.d
    private static final byte[] f52122a;

    /* renamed from: b */
    @l3.d
    private static final int[] f52123b;

    /* renamed from: c */
    @l3.d
    private static final byte[] f52124c;

    /* renamed from: d */
    @l3.d
    private static final int[] f52125d;

    static {
        byte[] bArr = {65, 66, 67, k.f48645b0, 69, 70, k.f48653d0, 72, 73, k.f48657e0, k.f48661f0, k.f48665g0, k.f48677j0, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, k.f48614R0, k.f48725w0, 90, 97, 98, 99, k.f48584H0, k.f48587I0, k.f48590J0, k.f48593K0, k.f48596L0, k.f48599M0, k.f48702p1, k.f48706q1, 108, 109, 110, 111, k.f48602N0, 113, 114, 115, k.f48720u1, 117, k.f48662f1, k.f48666g1, k.f48670h1, 121, 122, 48, 49, 50, 51, k.f48684l, 53, 54, 55, 56, 57, 43, 47};
        f52122a = bArr;
        int[] iArr = new int[256];
        int i4 = 0;
        C2100o.T1(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            iArr[bArr[i5]] = i6;
            i5++;
            i6++;
        }
        f52123b = iArr;
        byte[] bArr2 = {65, 66, 67, k.f48645b0, 69, 70, k.f48653d0, 72, 73, k.f48657e0, k.f48661f0, k.f48665g0, k.f48677j0, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, k.f48614R0, k.f48725w0, 90, 97, 98, 99, k.f48584H0, k.f48587I0, k.f48590J0, k.f48593K0, k.f48596L0, k.f48599M0, k.f48702p1, k.f48706q1, 108, 109, 110, 111, k.f48602N0, 113, 114, 115, k.f48720u1, 117, k.f48662f1, k.f48666g1, k.f48670h1, 121, 122, 48, 49, 50, 51, k.f48684l, 53, 54, 55, 56, 57, 45, 95};
        f52124c = bArr2;
        int[] iArr2 = new int[256];
        C2100o.T1(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i7 = 0;
        while (i4 < length2) {
            iArr2[bArr2[i4]] = i7;
            i4++;
            i7++;
        }
        f52125d = iArr2;
    }

    @f
    private static /* synthetic */ void e() {
    }

    @f
    private static /* synthetic */ void f() {
    }

    @f
    @Y(version = "1.8")
    public static final boolean g(int i4) {
        if (i4 >= 0) {
            int[] iArr = f52123b;
            if (i4 < iArr.length && iArr[i4] != -1) {
                return true;
            }
        }
        return false;
    }
}
