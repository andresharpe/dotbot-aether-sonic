package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.fragment.app.F;
import com.bumptech.glide.gifdecoder.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements a {

    /* renamed from: A, reason: collision with root package name */
    private static final String f25544A = "f";

    /* renamed from: B, reason: collision with root package name */
    private static final int f25545B = 4096;

    /* renamed from: C, reason: collision with root package name */
    private static final int f25546C = -1;

    /* renamed from: D, reason: collision with root package name */
    private static final int f25547D = -1;

    /* renamed from: E, reason: collision with root package name */
    private static final int f25548E = 4;

    /* renamed from: F, reason: collision with root package name */
    private static final int f25549F = 255;

    /* renamed from: G, reason: collision with root package name */
    @InterfaceC0569l
    private static final int f25550G = 0;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC0569l
    private int[] f25551f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC0569l
    private final int[] f25552g;

    /* renamed from: h, reason: collision with root package name */
    private final a.InterfaceC0221a f25553h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f25554i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f25555j;

    /* renamed from: k, reason: collision with root package name */
    private d f25556k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f25557l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f25558m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f25559n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f25560o;

    /* renamed from: p, reason: collision with root package name */
    @InterfaceC0569l
    private int[] f25561p;

    /* renamed from: q, reason: collision with root package name */
    private int f25562q;

    /* renamed from: r, reason: collision with root package name */
    private c f25563r;

    /* renamed from: s, reason: collision with root package name */
    private Bitmap f25564s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f25565t;

    /* renamed from: u, reason: collision with root package name */
    private int f25566u;

    /* renamed from: v, reason: collision with root package name */
    private int f25567v;

    /* renamed from: w, reason: collision with root package name */
    private int f25568w;

    /* renamed from: x, reason: collision with root package name */
    private int f25569x;

    /* renamed from: y, reason: collision with root package name */
    @P
    private Boolean f25570y;

    /* renamed from: z, reason: collision with root package name */
    @N
    private Bitmap.Config f25571z;

    public f(@N a.InterfaceC0221a interfaceC0221a, c cVar, ByteBuffer byteBuffer) {
        this(interfaceC0221a, cVar, byteBuffer, 1);
    }

    private int A() {
        return this.f25554i.get() & 255;
    }

    private Bitmap B(b bVar, b bVar2) {
        int i4;
        int i5;
        Bitmap bitmap;
        int[] iArr = this.f25561p;
        int i6 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f25564s;
            if (bitmap2 != null) {
                this.f25553h.c(bitmap2);
            }
            this.f25564s = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f25500g == 3 && this.f25564s == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i5 = bVar2.f25500g) > 0) {
            if (i5 == 2) {
                if (!bVar.f25499f) {
                    c cVar = this.f25563r;
                    int i7 = cVar.f25518l;
                    if (bVar.f25504k == null || cVar.f25516j != bVar.f25501h) {
                        i6 = i7;
                    }
                }
                int i8 = bVar2.f25497d;
                int i9 = this.f25567v;
                int i10 = i8 / i9;
                int i11 = bVar2.f25495b / i9;
                int i12 = bVar2.f25496c / i9;
                int i13 = bVar2.f25494a / i9;
                int i14 = this.f25569x;
                int i15 = (i11 * i14) + i13;
                int i16 = (i10 * i14) + i15;
                while (i15 < i16) {
                    int i17 = i15 + i12;
                    for (int i18 = i15; i18 < i17; i18++) {
                        iArr[i18] = i6;
                    }
                    i15 += this.f25569x;
                }
            } else if (i5 == 3 && (bitmap = this.f25564s) != null) {
                int i19 = this.f25569x;
                bitmap.getPixels(iArr, 0, i19, 0, 0, i19, this.f25568w);
            }
        }
        w(bVar);
        if (!bVar.f25498e && this.f25567v == 1) {
            v(bVar);
        } else {
            u(bVar);
        }
        if (this.f25565t && ((i4 = bVar.f25500g) == 0 || i4 == 1)) {
            if (this.f25564s == null) {
                this.f25564s = y();
            }
            Bitmap bitmap3 = this.f25564s;
            int i20 = this.f25569x;
            bitmap3.setPixels(iArr, 0, i20, 0, 0, i20, this.f25568w);
        }
        Bitmap y3 = y();
        int i21 = this.f25569x;
        y3.setPixels(iArr, 0, i21, 0, 0, i21, this.f25568w);
        return y3;
    }

    @InterfaceC0569l
    private int t(int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = i4; i12 < this.f25567v + i4; i12++) {
            byte[] bArr = this.f25560o;
            if (i12 >= bArr.length || i12 >= i5) {
                break;
            }
            int i13 = this.f25551f[bArr[i12] & 255];
            if (i13 != 0) {
                i7 += (i13 >> 24) & 255;
                i8 += (i13 >> 16) & 255;
                i9 += (i13 >> 8) & 255;
                i10 += i13 & 255;
                i11++;
            }
        }
        int i14 = i4 + i6;
        for (int i15 = i14; i15 < this.f25567v + i14; i15++) {
            byte[] bArr2 = this.f25560o;
            if (i15 >= bArr2.length || i15 >= i5) {
                break;
            }
            int i16 = this.f25551f[bArr2[i15] & 255];
            if (i16 != 0) {
                i7 += (i16 >> 24) & 255;
                i8 += (i16 >> 16) & 255;
                i9 += (i16 >> 8) & 255;
                i10 += i16 & 255;
                i11++;
            }
        }
        if (i11 == 0) {
            return 0;
        }
        return ((i7 / i11) << 24) | ((i8 / i11) << 16) | ((i9 / i11) << 8) | (i10 / i11);
    }

    private void u(b bVar) {
        boolean z3;
        boolean booleanValue;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.f25561p;
        int i9 = bVar.f25497d;
        int i10 = this.f25567v;
        int i11 = i9 / i10;
        int i12 = bVar.f25495b / i10;
        int i13 = bVar.f25496c / i10;
        int i14 = bVar.f25494a / i10;
        if (this.f25562q == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i15 = this.f25569x;
        int i16 = this.f25568w;
        byte[] bArr = this.f25560o;
        int[] iArr2 = this.f25551f;
        Boolean bool = this.f25570y;
        int i17 = 8;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1;
        while (i19 < i11) {
            Boolean bool2 = bool;
            if (bVar.f25498e) {
                if (i18 >= i11) {
                    int i21 = i20 + 1;
                    i4 = i11;
                    if (i21 != 2) {
                        if (i21 != 3) {
                            if (i21 == 4) {
                                i20 = i21;
                                i18 = 1;
                                i17 = 2;
                            }
                        } else {
                            i17 = 4;
                            i20 = i21;
                            i18 = 2;
                        }
                    } else {
                        i18 = 4;
                    }
                    i20 = i21;
                } else {
                    i4 = i11;
                }
                i5 = i18 + i17;
            } else {
                i4 = i11;
                i5 = i18;
                i18 = i19;
            }
            int i22 = i18 + i12;
            if (i10 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i22 < i16) {
                int i23 = i22 * i15;
                int i24 = i23 + i14;
                int i25 = i24 + i13;
                int i26 = i23 + i15;
                if (i26 < i25) {
                    i25 = i26;
                }
                i6 = i5;
                int i27 = i19 * i10 * bVar.f25496c;
                if (z4) {
                    int i28 = i24;
                    while (i28 < i25) {
                        int i29 = i12;
                        int i30 = iArr2[bArr[i27] & 255];
                        if (i30 != 0) {
                            iArr[i28] = i30;
                        } else if (z3 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i27 += i10;
                        i28++;
                        i12 = i29;
                    }
                } else {
                    i8 = i12;
                    int i31 = ((i25 - i24) * i10) + i27;
                    int i32 = i24;
                    while (true) {
                        i7 = i13;
                        if (i32 >= i25) {
                            break;
                        }
                        int t3 = t(i27, i31, bVar.f25496c);
                        if (t3 != 0) {
                            iArr[i32] = t3;
                        } else if (z3 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i27 += i10;
                        i32++;
                        i13 = i7;
                    }
                    bool = bool2;
                    i19++;
                    i12 = i8;
                    i11 = i4;
                    i13 = i7;
                    i18 = i6;
                }
            } else {
                i6 = i5;
            }
            i8 = i12;
            i7 = i13;
            bool = bool2;
            i19++;
            i12 = i8;
            i11 = i4;
            i13 = i7;
            i18 = i6;
        }
        Boolean bool3 = bool;
        if (this.f25570y == null) {
            if (bool3 == null) {
                booleanValue = false;
            } else {
                booleanValue = bool3.booleanValue();
            }
            this.f25570y = Boolean.valueOf(booleanValue);
        }
    }

    private void v(b bVar) {
        boolean z3;
        boolean z4;
        b bVar2 = bVar;
        int[] iArr = this.f25561p;
        int i4 = bVar2.f25497d;
        int i5 = bVar2.f25495b;
        int i6 = bVar2.f25496c;
        int i7 = bVar2.f25494a;
        if (this.f25562q == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i8 = this.f25569x;
        byte[] bArr = this.f25560o;
        int[] iArr2 = this.f25551f;
        int i9 = 0;
        byte b4 = -1;
        while (i9 < i4) {
            int i10 = (i9 + i5) * i8;
            int i11 = i10 + i7;
            int i12 = i11 + i6;
            int i13 = i10 + i8;
            if (i13 < i12) {
                i12 = i13;
            }
            int i14 = bVar2.f25496c * i9;
            int i15 = i11;
            while (i15 < i12) {
                byte b5 = bArr[i14];
                int i16 = i4;
                int i17 = b5 & 255;
                if (i17 != b4) {
                    int i18 = iArr2[i17];
                    if (i18 != 0) {
                        iArr[i15] = i18;
                    } else {
                        b4 = b5;
                    }
                }
                i14++;
                i15++;
                i4 = i16;
            }
            i9++;
            bVar2 = bVar;
        }
        Boolean bool = this.f25570y;
        if ((bool != null && bool.booleanValue()) || (this.f25570y == null && z3 && b4 != -1)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f25570y = Boolean.valueOf(z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void w(b bVar) {
        int i4;
        int i5;
        short s4;
        f fVar = this;
        if (bVar != null) {
            fVar.f25554i.position(bVar.f25503j);
        }
        if (bVar == null) {
            c cVar = fVar.f25563r;
            i4 = cVar.f25512f;
            i5 = cVar.f25513g;
        } else {
            i4 = bVar.f25496c;
            i5 = bVar.f25497d;
        }
        int i6 = i4 * i5;
        byte[] bArr = fVar.f25560o;
        if (bArr == null || bArr.length < i6) {
            fVar.f25560o = fVar.f25553h.e(i6);
        }
        byte[] bArr2 = fVar.f25560o;
        if (fVar.f25557l == null) {
            fVar.f25557l = new short[4096];
        }
        short[] sArr = fVar.f25557l;
        if (fVar.f25558m == null) {
            fVar.f25558m = new byte[4096];
        }
        byte[] bArr3 = fVar.f25558m;
        if (fVar.f25559n == null) {
            fVar.f25559n = new byte[F.f14939I];
        }
        byte[] bArr4 = fVar.f25559n;
        int A3 = A();
        int i7 = 1 << A3;
        int i8 = i7 + 1;
        int i9 = i7 + 2;
        int i10 = A3 + 1;
        int i11 = (1 << i10) - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            sArr[i13] = 0;
            bArr3[i13] = (byte) i13;
        }
        byte[] bArr5 = fVar.f25555j;
        int i14 = i10;
        int i15 = i9;
        int i16 = i11;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = -1;
        while (true) {
            if (i12 >= i6) {
                break;
            }
            if (i17 == 0) {
                i17 = z();
                if (i17 <= 0) {
                    fVar.f25566u = 3;
                    break;
                }
                i18 = 0;
            }
            i20 += (bArr5[i18] & 255) << i19;
            i18++;
            i17--;
            int i25 = i19 + 8;
            int i26 = i15;
            int i27 = i14;
            int i28 = i24;
            int i29 = i10;
            int i30 = i22;
            while (true) {
                if (i25 >= i27) {
                    int i31 = i9;
                    int i32 = i20 & i16;
                    i20 >>= i27;
                    i25 -= i27;
                    if (i32 == i7) {
                        i16 = i11;
                        i27 = i29;
                        i26 = i31;
                        i9 = i26;
                        i28 = -1;
                    } else {
                        if (i32 == i8) {
                            i19 = i25;
                            i22 = i30;
                            i15 = i26;
                            i10 = i29;
                            i9 = i31;
                            i24 = i28;
                            i14 = i27;
                            fVar = this;
                            break;
                        }
                        if (i28 == -1) {
                            bArr2[i21] = bArr3[i32];
                            i21++;
                            i12++;
                            i28 = i32;
                            i30 = i28;
                            i9 = i31;
                            i25 = i25;
                        } else {
                            if (i32 >= i26) {
                                bArr4[i23] = (byte) i30;
                                i23++;
                                s4 = i28;
                            } else {
                                s4 = i32;
                            }
                            while (s4 >= i7) {
                                bArr4[i23] = bArr3[s4];
                                i23++;
                                s4 = sArr[s4];
                            }
                            i30 = bArr3[s4] & 255;
                            byte b4 = (byte) i30;
                            bArr2[i21] = b4;
                            while (true) {
                                i21++;
                                i12++;
                                if (i23 <= 0) {
                                    break;
                                }
                                i23--;
                                bArr2[i21] = bArr4[i23];
                            }
                            byte[] bArr6 = bArr4;
                            if (i26 < 4096) {
                                sArr[i26] = (short) i28;
                                bArr3[i26] = b4;
                                i26++;
                                if ((i26 & i16) == 0 && i26 < 4096) {
                                    i27++;
                                    i16 += i26;
                                }
                            }
                            i28 = i32;
                            i9 = i31;
                            i25 = i25;
                            bArr4 = bArr6;
                        }
                    }
                } else {
                    i24 = i28;
                    i15 = i26;
                    i19 = i25;
                    fVar = this;
                    i22 = i30;
                    i10 = i29;
                    i14 = i27;
                    break;
                }
            }
        }
        Arrays.fill(bArr2, i21, i6, (byte) 0);
    }

    @N
    private d x() {
        if (this.f25556k == null) {
            this.f25556k = new d();
        }
        return this.f25556k;
    }

    private Bitmap y() {
        Bitmap.Config config;
        Boolean bool = this.f25570y;
        if (bool != null && !bool.booleanValue()) {
            config = this.f25571z;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap a4 = this.f25553h.a(this.f25569x, this.f25568w, config);
        a4.setHasAlpha(true);
        return a4;
    }

    private int z() {
        int A3 = A();
        if (A3 <= 0) {
            return A3;
        }
        ByteBuffer byteBuffer = this.f25554i;
        byteBuffer.get(this.f25555j, 0, Math.min(A3, byteBuffer.remaining()));
        return A3;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int a() {
        return this.f25563r.f25513g;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int b() {
        return this.f25563r.f25512f;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @N
    public ByteBuffer c() {
        return this.f25554i;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void clear() {
        this.f25563r = null;
        byte[] bArr = this.f25560o;
        if (bArr != null) {
            this.f25553h.d(bArr);
        }
        int[] iArr = this.f25561p;
        if (iArr != null) {
            this.f25553h.f(iArr);
        }
        Bitmap bitmap = this.f25564s;
        if (bitmap != null) {
            this.f25553h.c(bitmap);
        }
        this.f25564s = null;
        this.f25554i = null;
        this.f25570y = null;
        byte[] bArr2 = this.f25555j;
        if (bArr2 != null) {
            this.f25553h.d(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int d(@P InputStream inputStream, int i4) {
        int i5;
        if (inputStream != null) {
            if (i4 > 0) {
                i5 = i4 + 4096;
            } else {
                i5 = 16384;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i5);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e4) {
                Log.w(f25544A, "Error reading data from stream", e4);
            }
        } else {
            this.f25566u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                Log.w(f25544A, "Error closing stream", e5);
            }
        }
        return this.f25566u;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0 A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x003d, B:13:0x0047, B:15:0x004e, B:16:0x0058, B:18:0x0069, B:19:0x0075, B:22:0x007e, B:24:0x0082, B:26:0x008a, B:27:0x00a0, B:31:0x00a4, B:33:0x00a8, B:35:0x00ba, B:37:0x00be, B:38:0x00c2, B:41:0x007a, B:43:0x00c8, B:45:0x00d0, B:48:0x0011, B:50:0x0019, B:51:0x003b), top: B:2:0x0001 }] */
    @Override // com.bumptech.glide.gifdecoder.a
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.graphics.Bitmap e() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.gifdecoder.f.e():android.graphics.Bitmap");
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void f() {
        this.f25562q = (this.f25562q + 1) % this.f25563r.f25509c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void g(@N c cVar, @N byte[] bArr) {
        m(cVar, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int getStatus() {
        return this.f25566u;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int h() {
        return this.f25563r.f25509c;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int i() {
        int i4;
        if (this.f25563r.f25509c > 0 && (i4 = this.f25562q) >= 0) {
            return k(i4);
        }
        return 0;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void j(@N Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config != config3 && config != (config2 = Bitmap.Config.RGB_565)) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
        }
        this.f25571z = config;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int k(int i4) {
        if (i4 >= 0) {
            c cVar = this.f25563r;
            if (i4 < cVar.f25509c) {
                return cVar.f25511e.get(i4).f25502i;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public void l() {
        this.f25562q = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void m(@N c cVar, @N ByteBuffer byteBuffer) {
        o(cVar, byteBuffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int n() {
        return this.f25562q;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized void o(@N c cVar, @N ByteBuffer byteBuffer, int i4) {
        try {
            if (i4 > 0) {
                int highestOneBit = Integer.highestOneBit(i4);
                this.f25566u = 0;
                this.f25563r = cVar;
                this.f25562q = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f25554i = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f25554i.order(ByteOrder.LITTLE_ENDIAN);
                this.f25565t = false;
                Iterator<b> it = cVar.f25511e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().f25500g == 3) {
                        this.f25565t = true;
                        break;
                    }
                }
                this.f25567v = highestOneBit;
                int i5 = cVar.f25512f;
                this.f25569x = i5 / highestOneBit;
                int i6 = cVar.f25513g;
                this.f25568w = i6 / highestOneBit;
                this.f25560o = this.f25553h.e(i5 * i6);
                this.f25561p = this.f25553h.b(this.f25569x * this.f25568w);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int p() {
        return this.f25563r.f25519m;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int q() {
        return this.f25554i.limit() + this.f25560o.length + (this.f25561p.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public int r() {
        int i4 = this.f25563r.f25519m;
        if (i4 == -1) {
            return 1;
        }
        if (i4 == 0) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    public synchronized int read(@P byte[] bArr) {
        try {
            c d4 = x().r(bArr).d();
            this.f25563r = d4;
            if (bArr != null) {
                g(d4, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f25566u;
    }

    @Override // com.bumptech.glide.gifdecoder.a
    @Deprecated
    public int s() {
        int i4 = this.f25563r.f25519m;
        if (i4 == -1) {
            return 1;
        }
        return i4;
    }

    public f(@N a.InterfaceC0221a interfaceC0221a, c cVar, ByteBuffer byteBuffer, int i4) {
        this(interfaceC0221a);
        o(cVar, byteBuffer, i4);
    }

    public f(@N a.InterfaceC0221a interfaceC0221a) {
        this.f25552g = new int[256];
        this.f25571z = Bitmap.Config.ARGB_8888;
        this.f25553h = interfaceC0221a;
        this.f25563r = new c();
    }
}
