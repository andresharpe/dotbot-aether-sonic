package com.harman.sdk.message;

import com.harman.sdk.message.AdvancedPresetEQPayload;
import java.util.ArrayList;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

@E(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/harman/sdk/message/DefaultPresetEQPayload;", "Lcom/harman/sdk/message/AdvancedPresetEQPayload;", "Ljava/util/ArrayList;", "Lcom/harman/sdk/message/AdvancedPresetEQPayload$Parameter;", "paramList", "", "g", "(Ljava/util/ArrayList;)[I", "", "toString", "()Ljava/lang/String;", "", "H", "[B", "c", "()[B", "f", "([B)V", "rawBytes", "<init>", "()V", "I", "a", "0_fundermental_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class DefaultPresetEQPayload extends AdvancedPresetEQPayload {

    /* renamed from: I, reason: collision with root package name */
    @d
    public static final a f48174I = new a(null);

    /* renamed from: H, reason: collision with root package name */
    @e
    private byte[] f48175H;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48176a;

        static {
            int[] iArr = new int[EQBandType.values().length];
            try {
                iArr[EQBandType.PEAKING_EQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EQBandType.HIGH_SHELF_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EQBandType.LOW_SHELF_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EQBandType.HIGH_PASS_FILTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EQBandType.LOW_PASS_FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f48176a = iArr;
        }
    }

    private final int[] g(ArrayList<AdvancedPresetEQPayload.Parameter> arrayList) {
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        int[] iArr = new int[arrayList.size() * 5];
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            AdvancedPresetEQPayload.Parameter parameter = arrayList.get(i4);
            F.o(parameter, "get(...)");
            AdvancedPresetEQPayload.Parameter parameter2 = parameter;
            float a4 = parameter2.a();
            float b4 = parameter2.b();
            float c4 = parameter2.c();
            double d9 = 1;
            double tan = d9 / Math.tan((3.1415927f * a4) / parameter2.d());
            double d10 = tan * tan;
            int i5 = size;
            double pow = Math.pow(10.0d, b4 * 0.05d);
            int i6 = b.f48176a[parameter2.e().ordinal()];
            double d11 = 1.0d;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                d4 = d9;
                                d8 = 0.0d;
                                d5 = 0.0d;
                                d6 = 0.0d;
                                d7 = 1.0d;
                                d10 = 1.0d;
                                d11 = 0.0d;
                            } else {
                                double d12 = tan / c4;
                                d7 = d9 + d12 + d10;
                                d5 = 2 * (d9 - d10);
                                d4 = d9;
                                d8 = 2.0d;
                                d6 = d10 + (d9 - d12);
                                d10 = 1.0d;
                            }
                        } else {
                            d8 = (-2) * d10;
                            double d13 = tan / c4;
                            double d14 = d9 + d13 + d10;
                            d5 = 2 * (d9 - d10);
                            d6 = (d9 - d13) + d10;
                            d4 = d9;
                            d7 = d14;
                            d11 = d10;
                        }
                    } else {
                        if (pow <= 1.0d) {
                            double d15 = 1.0d / pow;
                            pow = 1.0d;
                            d11 = d15;
                        }
                        d4 = d9;
                        double d16 = c4;
                        double sqrt = ((Math.sqrt(pow) * tan) / d16) + pow + d10;
                        double d17 = 2;
                        double d18 = (pow - d10) * d17;
                        double sqrt2 = (pow - ((Math.sqrt(pow) * tan) / d16)) + d10;
                        d7 = d11 + ((Math.sqrt(d11) * tan) / d16) + d10;
                        double d19 = d17 * (d11 - d10);
                        double sqrt3 = (d11 - ((Math.sqrt(d11) * tan) / d16)) + d10;
                        d11 = sqrt2;
                        d8 = d18;
                        d6 = sqrt3;
                        d10 = sqrt;
                        d5 = d19;
                    }
                } else {
                    d4 = d9;
                    if (pow <= 1.0d) {
                        double d20 = d4 / pow;
                        pow = 1.0d;
                        d11 = d20;
                    }
                    double d21 = c4;
                    double d22 = pow * d10;
                    double sqrt4 = d4 + ((Math.sqrt(pow) * tan) / d21) + d22;
                    double d23 = 2;
                    double d24 = (d4 - d22) * d23;
                    double sqrt5 = (d4 - ((Math.sqrt(pow) * tan) / d21)) + d22;
                    double d25 = d10 * d11;
                    double sqrt6 = d4 + ((Math.sqrt(d11) * tan) / d21) + d25;
                    double d26 = d23 * (d4 - d25);
                    double sqrt7 = d25 + (d4 - ((Math.sqrt(d11) * tan) / d21));
                    d11 = sqrt5;
                    d5 = d26;
                    d6 = sqrt7;
                    d10 = sqrt4;
                    d8 = d24;
                    d7 = sqrt6;
                }
            } else {
                d4 = d9;
                if (pow < 1.0d) {
                    c4 = (float) (c4 * pow);
                }
                double d27 = c4;
                double d28 = (pow * tan) / d27;
                double d29 = d4 + d28 + d10;
                d5 = 2 * (d4 - d10);
                double d30 = tan / d27;
                double d31 = d4 + d30 + d10;
                d6 = d10 + (d4 - d30);
                d7 = d31;
                d11 = (d4 - d28) + d10;
                d8 = d5;
                d10 = d29;
            }
            double d32 = d4 / d7;
            int i7 = i4 * 5;
            double d33 = 536870912;
            iArr[i7] = (int) ((d10 * d32 * d33) + 0.5d);
            iArr[i7 + 1] = (int) ((d8 * d32 * d33) + 0.5d);
            iArr[i7 + 2] = (int) ((d11 * d32 * d33) + 0.5d);
            iArr[i7 + 3] = (int) (((-d5) * d32 * d33) + 0.5d);
            iArr[i7 + 4] = (int) (((-d6) * d32 * d33) + 0.5d);
            i4++;
            size = i5;
        }
        return iArr;
    }

    @Override // com.harman.sdk.message.AdvancedPresetEQPayload
    @e
    public byte[] c() {
        int[] g4 = g(b());
        byte[] bArr = new byte[g4.length * 4];
        int length = g4.length;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 4;
            int i6 = g4[i4];
            bArr[i5] = (byte) i6;
            bArr[i5 + 1] = (byte) (i6 >> 8);
            bArr[i5 + 2] = (byte) (i6 >> 16);
            bArr[i5 + 3] = (byte) (i6 >> 24);
        }
        return bArr;
    }

    @Override // com.harman.sdk.message.AdvancedPresetEQPayload
    public void f(@e byte[] bArr) {
        this.f48175H = bArr;
    }

    @Override // com.harman.sdk.message.AdvancedPresetEQPayload
    @d
    public String toString() {
        return "AdvancedPresetEQPayload(params=" + b() + ")";
    }
}
