package androidx.profileinstaller;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
@W(19)
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final int f17375a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f17376b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f17377c = 4;

    /* renamed from: d, reason: collision with root package name */
    private static final int f17378d = 6;

    /* renamed from: e, reason: collision with root package name */
    private static final int f17379e = 7;

    /* renamed from: f, reason: collision with root package name */
    static final byte[] f17380f = {com.harman.sdk.utils.k.f48602N0, 114, 111, 0};

    /* renamed from: g, reason: collision with root package name */
    static final byte[] f17381g = {com.harman.sdk.utils.k.f48602N0, 114, 109, 0};

    private o() {
    }

    private static void A(@N InputStream inputStream) throws IOException {
        e.h(inputStream);
        int j4 = e.j(inputStream);
        if (j4 == 6 || j4 == 7) {
            return;
        }
        while (j4 > 0) {
            e.j(inputStream);
            for (int j5 = e.j(inputStream); j5 > 0; j5--) {
                e.h(inputStream);
            }
            j4--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B(@N OutputStream outputStream, @N byte[] bArr, @N d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, q.f17407a)) {
            N(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, q.f17408b)) {
            M(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, q.f17410d)) {
            K(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, q.f17409c)) {
            L(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, q.f17411e)) {
            J(outputStream, dVarArr);
            return true;
        }
        return false;
    }

    private static void C(@N OutputStream outputStream, @N d dVar) throws IOException {
        int i4 = 0;
        for (int i5 : dVar.f17328h) {
            Integer valueOf = Integer.valueOf(i5);
            e.p(outputStream, valueOf.intValue() - i4);
            i4 = valueOf.intValue();
        }
    }

    private static s D(@N d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i4 = 2;
            for (d dVar : dVarArr) {
                e.q(byteArrayOutputStream, dVar.f17323c);
                e.q(byteArrayOutputStream, dVar.f17324d);
                e.q(byteArrayOutputStream, dVar.f17327g);
                String j4 = j(dVar.f17321a, dVar.f17322b, q.f17407a);
                int k4 = e.k(j4);
                e.p(byteArrayOutputStream, k4);
                i4 = i4 + 14 + k4;
                e.n(byteArrayOutputStream, j4);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i4 == byteArray.length) {
                s sVar = new s(f.DEX_FILES, i4, byteArray, false);
                byteArrayOutputStream.close();
                return sVar;
            }
            throw e.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(@N OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f17380f);
        outputStream.write(bArr);
    }

    private static void F(@N OutputStream outputStream, @N d dVar) throws IOException {
        I(outputStream, dVar);
        C(outputStream, dVar);
        H(outputStream, dVar);
    }

    private static void G(@N OutputStream outputStream, @N d dVar, @N String str) throws IOException {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f17325e);
        e.q(outputStream, dVar.f17326f);
        e.q(outputStream, dVar.f17323c);
        e.q(outputStream, dVar.f17327g);
        e.n(outputStream, str);
    }

    private static void H(@N OutputStream outputStream, @N d dVar) throws IOException {
        byte[] bArr = new byte[k(dVar.f17327g)];
        for (Map.Entry<Integer, Integer> entry : dVar.f17329i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, dVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(@N OutputStream outputStream, @N d dVar) throws IOException {
        int i4 = 0;
        for (Map.Entry<Integer, Integer> entry : dVar.f17329i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                e.p(outputStream, intValue - i4);
                e.p(outputStream, 0);
                i4 = intValue;
            }
        }
    }

    private static void J(@N OutputStream outputStream, @N d[] dVarArr) throws IOException {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String j4 = j(dVar.f17321a, dVar.f17322b, q.f17411e);
            e.p(outputStream, e.k(j4));
            e.p(outputStream, dVar.f17329i.size());
            e.p(outputStream, dVar.f17328h.length);
            e.q(outputStream, dVar.f17323c);
            e.n(outputStream, j4);
            Iterator<Integer> it = dVar.f17329i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, it.next().intValue());
            }
            for (int i4 : dVar.f17328h) {
                e.p(outputStream, i4);
            }
        }
    }

    private static void K(@N OutputStream outputStream, @N d[] dVarArr) throws IOException {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            int size = dVar.f17329i.size() * 4;
            String j4 = j(dVar.f17321a, dVar.f17322b, q.f17410d);
            e.p(outputStream, e.k(j4));
            e.p(outputStream, dVar.f17328h.length);
            e.q(outputStream, size);
            e.q(outputStream, dVar.f17323c);
            e.n(outputStream, j4);
            Iterator<Integer> it = dVar.f17329i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, it.next().intValue());
                e.p(outputStream, 0);
            }
            for (int i4 : dVar.f17328h) {
                e.p(outputStream, i4);
            }
        }
    }

    private static void L(@N OutputStream outputStream, @N d[] dVarArr) throws IOException {
        byte[] b4 = b(dVarArr, q.f17409c);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b4);
    }

    private static void M(@N OutputStream outputStream, @N d[] dVarArr) throws IOException {
        byte[] b4 = b(dVarArr, q.f17408b);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, b4);
    }

    private static void N(@N OutputStream outputStream, @N d[] dVarArr) throws IOException {
        O(outputStream, dVarArr);
    }

    private static void O(@N OutputStream outputStream, @N d[] dVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length2 = q.f17407a.length + f17380f.length + 4 + (arrayList.size() * 16);
        e.q(outputStream, arrayList.size());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            s sVar = (s) arrayList.get(i4);
            e.q(outputStream, sVar.f17416a.f());
            e.q(outputStream, length2);
            if (sVar.f17419d) {
                byte[] bArr = sVar.f17418c;
                long length3 = bArr.length;
                byte[] b4 = e.b(bArr);
                arrayList2.add(b4);
                e.q(outputStream, b4.length);
                e.q(outputStream, length3);
                length = b4.length;
            } else {
                arrayList2.add(sVar.f17418c);
                e.q(outputStream, sVar.f17418c.length);
                e.q(outputStream, 0L);
                length = sVar.f17418c.length;
            }
            length2 += length;
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            outputStream.write((byte[]) arrayList2.get(i5));
        }
    }

    private static int a(@N d dVar) {
        Iterator<Map.Entry<Integer, Integer>> it = dVar.f17329i.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 |= it.next().getValue().intValue();
        }
        return i4;
    }

    @N
    private static byte[] b(@N d[] dVarArr, @N byte[] bArr) throws IOException {
        int i4 = 0;
        int i5 = 0;
        for (d dVar : dVarArr) {
            i5 += e.k(j(dVar.f17321a, dVar.f17322b, bArr)) + 16 + (dVar.f17325e * 2) + dVar.f17326f + k(dVar.f17327g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5);
        if (Arrays.equals(bArr, q.f17409c)) {
            int length = dVarArr.length;
            while (i4 < length) {
                d dVar2 = dVarArr[i4];
                G(byteArrayOutputStream, dVar2, j(dVar2.f17321a, dVar2.f17322b, bArr));
                F(byteArrayOutputStream, dVar2);
                i4++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                G(byteArrayOutputStream, dVar3, j(dVar3.f17321a, dVar3.f17322b, bArr));
            }
            int length2 = dVarArr.length;
            while (i4 < length2) {
                F(byteArrayOutputStream, dVarArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == i5) {
            return byteArrayOutputStream.toByteArray();
        }
        throw e.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i5);
    }

    private static s c(@N d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        for (int i5 = 0; i5 < dVarArr.length; i5++) {
            try {
                d dVar = dVarArr[i5];
                e.p(byteArrayOutputStream, i5);
                e.p(byteArrayOutputStream, dVar.f17325e);
                i4 = i4 + 4 + (dVar.f17325e * 2);
                C(byteArrayOutputStream, dVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i4 == byteArray.length) {
            s sVar = new s(f.CLASSES, i4, byteArray, true);
            byteArrayOutputStream.close();
            return sVar;
        }
        throw e.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
    }

    private static s d(@N d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        for (int i5 = 0; i5 < dVarArr.length; i5++) {
            try {
                d dVar = dVarArr[i5];
                int a4 = a(dVar);
                byte[] e4 = e(dVar);
                byte[] f4 = f(dVar);
                e.p(byteArrayOutputStream, i5);
                int length = e4.length + 2 + f4.length;
                e.q(byteArrayOutputStream, length);
                e.p(byteArrayOutputStream, a4);
                byteArrayOutputStream.write(e4);
                byteArrayOutputStream.write(f4);
                i4 = i4 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i4 == byteArray.length) {
            s sVar = new s(f.METHODS, i4, byteArray, true);
            byteArrayOutputStream.close();
            return sVar;
        }
        throw e.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(@N d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(@N d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @N
    private static String g(@N String str, @N String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    @N
    private static String h(@N String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    @P
    private static d i(@N d[] dVarArr, @N String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String h4 = h(str);
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            if (dVarArr[i4].f17322b.equals(h4)) {
                return dVarArr[i4];
            }
        }
        return null;
    }

    @N
    private static String j(@N String str, @N String str2, @N byte[] bArr) {
        String a4 = q.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a4);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + q.a(bArr) + str2;
        }
        return g(str2, a4);
    }

    private static int k(int i4) {
        return y(i4 * 2) / 8;
    }

    private static int l(int i4, int i5, int i6) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 4) {
                    return i5 + i6;
                }
                throw e.c("Unexpected flag: " + i4);
            }
            return i5;
        }
        throw e.c("HOT methods are not stored in the bitmap");
    }

    private static int[] m(@N InputStream inputStream, int i4) throws IOException {
        int[] iArr = new int[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += e.h(inputStream);
            iArr[i6] = i5;
        }
        return iArr;
    }

    private static int n(@N BitSet bitSet, int i4, int i5) {
        int i6 = 2;
        if (!bitSet.get(l(2, i4, i5))) {
            i6 = 0;
        }
        if (bitSet.get(l(4, i4, i5))) {
            return i6 | 4;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] o(@N InputStream inputStream, @N byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, q.f17408b.length);
        }
        throw e.c("Invalid magic");
    }

    private static void p(@N InputStream inputStream, @N d dVar) throws IOException {
        int available = inputStream.available() - dVar.f17326f;
        int i4 = 0;
        while (inputStream.available() > available) {
            i4 += e.h(inputStream);
            dVar.f17329i.put(Integer.valueOf(i4), 1);
            for (int h4 = e.h(inputStream); h4 > 0; h4--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw e.c("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static d[] q(@N InputStream inputStream, @N byte[] bArr, @N byte[] bArr2, d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, q.f17412f)) {
            if (!Arrays.equals(q.f17407a, bArr2)) {
                return r(inputStream, bArr, dVarArr);
            }
            throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, q.f17413g)) {
            return t(inputStream, bArr2, dVarArr);
        }
        throw e.c("Unsupported meta version");
    }

    @N
    static d[] r(@N InputStream inputStream, @N byte[] bArr, d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, q.f17412f)) {
            int j4 = e.j(inputStream);
            byte[] e4 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
                try {
                    d[] s4 = s(byteArrayInputStream, j4, dVarArr);
                    byteArrayInputStream.close();
                    return s4;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw e.c("Content found after the end of file");
        }
        throw e.c("Unsupported meta version");
    }

    @N
    private static d[] s(@N InputStream inputStream, int i4, d[] dVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i4 == dVarArr.length) {
            String[] strArr = new String[i4];
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                int h4 = e.h(inputStream);
                iArr[i5] = e.h(inputStream);
                strArr[i5] = e.f(inputStream, h4);
            }
            for (int i6 = 0; i6 < i4; i6++) {
                d dVar = dVarArr[i6];
                if (dVar.f17322b.equals(strArr[i6])) {
                    int i7 = iArr[i6];
                    dVar.f17325e = i7;
                    dVar.f17328h = m(inputStream, i7);
                } else {
                    throw e.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return dVarArr;
        }
        throw e.c("Mismatched number of dex files found in metadata");
    }

    @N
    static d[] t(@N InputStream inputStream, @N byte[] bArr, d[] dVarArr) throws IOException {
        int h4 = e.h(inputStream);
        byte[] e4 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
            try {
                d[] u3 = u(byteArrayInputStream, bArr, h4, dVarArr);
                byteArrayInputStream.close();
                return u3;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw e.c("Content found after the end of file");
    }

    @N
    private static d[] u(@N InputStream inputStream, @N byte[] bArr, int i4, d[] dVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i4 == dVarArr.length) {
            for (int i5 = 0; i5 < i4; i5++) {
                e.h(inputStream);
                String f4 = e.f(inputStream, e.h(inputStream));
                long i6 = e.i(inputStream);
                int h4 = e.h(inputStream);
                d i7 = i(dVarArr, f4);
                if (i7 != null) {
                    i7.f17324d = i6;
                    int[] m4 = m(inputStream, h4);
                    if (Arrays.equals(bArr, q.f17411e)) {
                        i7.f17325e = h4;
                        i7.f17328h = m4;
                    }
                } else {
                    throw e.c("Missing profile key: " + f4);
                }
            }
            return dVarArr;
        }
        throw e.c("Mismatched number of dex files found in metadata");
    }

    private static void v(@N InputStream inputStream, @N d dVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f17327g * 2)));
        int i4 = 0;
        while (true) {
            int i5 = dVar.f17327g;
            if (i4 < i5) {
                int n4 = n(valueOf, i4, i5);
                if (n4 != 0) {
                    Integer num = dVar.f17329i.get(Integer.valueOf(i4));
                    if (num == null) {
                        num = 0;
                    }
                    dVar.f17329i.put(Integer.valueOf(i4), Integer.valueOf(n4 | num.intValue()));
                }
                i4++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static d[] w(@N InputStream inputStream, @N byte[] bArr, @N String str) throws IOException {
        if (Arrays.equals(bArr, q.f17408b)) {
            int j4 = e.j(inputStream);
            byte[] e4 = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e4);
                try {
                    d[] x3 = x(byteArrayInputStream, str, j4);
                    byteArrayInputStream.close();
                    return x3;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw e.c("Content found after the end of file");
        }
        throw e.c("Unsupported version");
    }

    @N
    private static d[] x(@N InputStream inputStream, @N String str, int i4) throws IOException {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int h4 = e.h(inputStream);
            int h5 = e.h(inputStream);
            dVarArr[i5] = new d(str, e.f(inputStream, h4), e.i(inputStream), 0L, h5, (int) e.i(inputStream), (int) e.i(inputStream), new int[h5], new TreeMap());
        }
        for (int i6 = 0; i6 < i4; i6++) {
            d dVar = dVarArr[i6];
            p(inputStream, dVar);
            dVar.f17328h = m(inputStream, dVar.f17325e);
            v(inputStream, dVar);
        }
        return dVarArr;
    }

    private static int y(int i4) {
        return (i4 + 7) & (-8);
    }

    private static void z(@N byte[] bArr, int i4, int i5, @N d dVar) {
        int l4 = l(i4, i5, dVar.f17327g);
        int i6 = l4 / 8;
        bArr[i6] = (byte) ((1 << (l4 % 8)) | bArr[i6]);
    }
}
