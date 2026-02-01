package com.harman.analytics.deviceAws;

import androidx.recyclerview.widget.n;
import com.harman.log.f;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f37820c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f37821d = 7;

    /* renamed from: e, reason: collision with root package name */
    public static final int f37822e = 14;

    /* renamed from: f, reason: collision with root package name */
    public static final int f37823f = 24;

    /* renamed from: g, reason: collision with root package name */
    public static final int f37824g = 37;

    /* renamed from: h, reason: collision with root package name */
    public static final int f37825h = 45;

    /* renamed from: i, reason: collision with root package name */
    public static final int f37826i = 110;

    /* renamed from: j, reason: collision with root package name */
    public static final int f37827j = 136;

    /* renamed from: k, reason: collision with root package name */
    public static final int f37828k = 148;

    /* renamed from: l, reason: collision with root package name */
    public static final int f37829l = 168;

    /* renamed from: m, reason: collision with root package name */
    public static final int f37830m = 177;

    /* renamed from: n, reason: collision with root package name */
    public static final int f37831n = 197;

    /* renamed from: o, reason: collision with root package name */
    public static final int f37832o = 14;

    /* renamed from: p, reason: collision with root package name */
    @d
    public static final String f37833p = "DeviceAnalyticsParser";

    /* renamed from: a, reason: collision with root package name */
    @d
    private final String f37835a = "00080207030300020900010500040802010003080002";

    /* renamed from: b, reason: collision with root package name */
    @d
    public static final C0343a f37819b = new C0343a(null);

    /* renamed from: q, reason: collision with root package name */
    @d
    private static final HashMap<Integer, String> f37834q = new HashMap<>();

    /* renamed from: com.harman.analytics.deviceAws.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0343a {
        public /* synthetic */ C0343a(C2197u c2197u) {
            this();
        }

        private C0343a() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d2, code lost:
    
        if (r10 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String b(int r7, int r8, java.lang.String r9, java.util.HashMap<java.lang.Integer, java.lang.String> r10) {
        /*
            r6 = this;
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "enter checkAndAddedPackageInformation packageID = "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = ", totalFeaturesLength = "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ", logLength = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", log = "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "DeviceAnalyticsParser"
            com.harman.log.f.a(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r10.containsKey(r0)
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            if (r0 != 0) goto L5c
            int r0 = r9.length()
            if (r0 < r8) goto L5c
            java.lang.String r0 = "enter checkAndAddedPackageInformation whole package"
            com.harman.log.f.a(r1, r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0 = 0
            java.lang.String r0 = r9.substring(r0, r8)
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.F.o(r0, r1)
            r10.put(r7, r0)
            goto Lf1
        L5c:
            java.lang.String r0 = "enter checkAndAddedPackageInformation organize package"
            com.harman.log.f.a(r1, r0)
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = com.harman.analytics.deviceAws.a.f37834q
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Ld4
            r4 = 2
            java.lang.String r4 = r9.substring(r4)
            kotlin.jvm.internal.F.o(r4, r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            int r4 = r3.length()
            if (r4 != r8) goto Lb5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "enter checkAndAddedPackageInformation organize package complete data = "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = "\""
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.harman.log.f.a(r1, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r10.put(r4, r3)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r0.remove(r10)
            goto Ld2
        Lb5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r4 = "enter checkAndAddedPackageInformation organize package joining data = "
            r10.append(r4)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.harman.log.f.a(r1, r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r0.put(r10, r3)
            kotlin.H0 r10 = kotlin.H0.f51801a
        Ld2:
            if (r10 != 0) goto Lf1
        Ld4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "enter checkAndAddedPackageInformation organize package first data = "
            r10.append(r3)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.harman.log.f.a(r1, r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.put(r7, r9)
            kotlin.H0 r7 = kotlin.H0.f51801a
        Lf1:
            int r7 = r9.length()
            if (r7 < r8) goto Lff
            java.lang.String r7 = r9.substring(r8)
            kotlin.jvm.internal.F.o(r7, r2)
            goto L101
        Lff:
            java.lang.String r7 = ""
        L101:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.analytics.deviceAws.a.b(int, int, java.lang.String, java.util.HashMap):java.lang.String");
    }

    private final void e(String str, DeviceAnalytics deviceAnalytics) {
        int i4;
        f.a(f37833p, "enter extractPackage log = " + str);
        while (str.length() > 0 && str.length() >= 4) {
            String substring = str.substring(0, 2);
            F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int l4 = l(this, substring, false, 2, null);
            String substring2 = str.substring(2, 4);
            F.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int l5 = l(this, substring2, false, 2, null);
            if (l4 == 14) {
                i4 = n.f.f18255b;
            } else {
                i4 = (l5 * 4) + (l5 * 2) + 2;
            }
            String substring3 = str.substring(2);
            F.o(substring3, "this as java.lang.String).substring(startIndex)");
            str = b(l4, i4, substring3, deviceAnalytics.p());
        }
    }

    private final int g(String str, boolean z3) {
        if (str.length() < 4) {
            return 0;
        }
        String substring = str.substring(0, 4);
        F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return k(substring, z3);
    }

    static /* synthetic */ int h(a aVar, String str, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return aVar.g(str, z3);
    }

    private final int k(String str, boolean z3) {
        int a4;
        if (str.length() == 4 && z3) {
            String substring = str.substring(2, 4);
            F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = str.substring(0, 2);
            F.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            str = substring + substring2;
        }
        try {
            a4 = C2220b.a(16);
            return Integer.parseInt(str, a4);
        } catch (NumberFormatException e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    static /* synthetic */ int l(a aVar, String str, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return aVar.k(str, z3);
    }

    public final boolean a(@e HashMap<Integer, String> hashMap, @e Integer num) {
        if (hashMap == null) {
            return false;
        }
        int size = hashMap.size();
        if (num == null || size != num.intValue()) {
            return false;
        }
        return true;
    }

    @d
    public final DeviceAnalytics c(@d String deviceLog, @d DeviceAnalytics data, int i4) {
        F.p(deviceLog, "deviceLog");
        F.p(data, "data");
        int i5 = 2;
        if (deviceLog.length() >= 2) {
            String substring = deviceLog.substring(0, 2);
            F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Object obj = null;
            data.l().put(Integer.valueOf(i4), Integer.valueOf(l(this, substring, false, 2, null)));
            String substring2 = deviceLog.substring(2);
            F.o(substring2, "this as java.lang.String).substring(startIndex)");
            while (substring2.length() > 0) {
                String substring3 = substring2.substring(0, i5);
                F.o(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                substring2 = substring2.substring(i5);
                F.o(substring2, "this as java.lang.String).substring(startIndex)");
                switch (l(this, substring3, false, i5, obj)) {
                    case 1:
                        if (substring2.length() < 24) {
                            break;
                        } else {
                            String substring4 = substring2.substring(0, 24);
                            F.o(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (F.g("000000000000000000000000", substring4)) {
                                data.t("");
                            } else {
                                byte[] i6 = i(substring4);
                                Charset US_ASCII = StandardCharsets.US_ASCII;
                                F.o(US_ASCII, "US_ASCII");
                                data.t(new String(i6, US_ASCII));
                            }
                            f.a(f37833p, "enter extractBatteryInfoFeatures content = " + substring4 + ", battery_1_pack_model = " + data.c());
                            substring2 = substring2.substring(24);
                            F.o(substring2, "this as java.lang.String).substring(startIndex)");
                            break;
                        }
                    case 2:
                        if (substring2.length() < 4) {
                            break;
                        } else {
                            String substring5 = substring2.substring(0, 4);
                            F.o(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (F.g("0000", substring5)) {
                                data.s("");
                            } else {
                                data.s(substring5);
                            }
                            f.a(f37833p, "enter extractBatteryInfoFeatures content = " + substring5 + ", battery_1_cell_connection = " + data.b());
                            substring2 = substring2.substring(4);
                            F.o(substring2, "this as java.lang.String).substring(startIndex)");
                            break;
                        }
                    case 3:
                        if (substring2.length() < 32) {
                            break;
                        } else {
                            String substring6 = substring2.substring(0, 32);
                            F.o(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (F.g("00000000000000000000000000000000", substring6)) {
                                data.u("");
                            } else {
                                byte[] i7 = i(substring6);
                                Charset US_ASCII2 = StandardCharsets.US_ASCII;
                                F.o(US_ASCII2, "US_ASCII");
                                data.u(new String(i7, US_ASCII2));
                            }
                            f.a(f37833p, "enter extractBatteryInfoFeatures content = " + substring6 + ", battery_1_sn = " + data.d());
                            substring2 = substring2.substring(32);
                            F.o(substring2, "this as java.lang.String).substring(startIndex)");
                            break;
                        }
                    case 4:
                        if (substring2.length() < 24) {
                            break;
                        } else {
                            String substring7 = substring2.substring(0, 24);
                            F.o(substring7, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (F.g("000000000000000000000000", substring7)) {
                                data.w("");
                            } else {
                                byte[] i8 = i(substring7);
                                Charset US_ASCII3 = StandardCharsets.US_ASCII;
                                F.o(US_ASCII3, "US_ASCII");
                                data.w(new String(i8, US_ASCII3));
                            }
                            f.a(f37833p, "enter extractBatteryInfoFeatures content = " + substring7 + ", battery_2_pack_model = " + data.f());
                            substring2 = substring2.substring(24);
                            F.o(substring2, "this as java.lang.String).substring(startIndex)");
                            break;
                        }
                    case 5:
                        if (substring2.length() < 4) {
                            break;
                        } else {
                            String substring8 = substring2.substring(0, 4);
                            F.o(substring8, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (F.g("0000", substring8)) {
                                data.v("");
                            } else {
                                data.v(substring8);
                            }
                            f.a(f37833p, "enter extractBatteryInfoFeatures content = " + substring8 + ", battery_2_cell_connection = " + data.e());
                            substring2 = substring2.substring(4);
                            F.o(substring2, "this as java.lang.String).substring(startIndex)");
                            break;
                        }
                    case 6:
                        if (substring2.length() < 32) {
                            break;
                        } else {
                            String substring9 = substring2.substring(0, 32);
                            F.o(substring9, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (F.g("00000000000000000000000000000000", substring9)) {
                                data.x("");
                            } else {
                                byte[] i9 = i(substring9);
                                Charset US_ASCII4 = StandardCharsets.US_ASCII;
                                F.o(US_ASCII4, "US_ASCII");
                                data.x(new String(i9, US_ASCII4));
                            }
                            f.a(f37833p, "enter extractBatteryInfoFeatures content = " + substring9 + ", battery_2_sn = " + data.g());
                            substring2 = substring2.substring(32);
                            F.o(substring2, "this as java.lang.String).substring(startIndex)");
                            break;
                        }
                    case 7:
                        if (substring2.length() < 24) {
                            break;
                        } else {
                            String substring10 = substring2.substring(0, 24);
                            F.o(substring10, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (F.g("000000000000000000000000", substring10)) {
                                data.z("");
                            } else {
                                byte[] i10 = i(substring10);
                                Charset US_ASCII5 = StandardCharsets.US_ASCII;
                                F.o(US_ASCII5, "US_ASCII");
                                data.z(new String(i10, US_ASCII5));
                            }
                            f.a(f37833p, "enter extractBatteryInfoFeatures content = " + substring10 + ", battery_3_pack_model = " + data.i());
                            substring2 = substring2.substring(24);
                            F.o(substring2, "this as java.lang.String).substring(startIndex)");
                            break;
                        }
                    case 8:
                        if (substring2.length() < 4) {
                            break;
                        } else {
                            String substring11 = substring2.substring(0, 4);
                            F.o(substring11, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (F.g("0000", substring11)) {
                                data.y("");
                            } else {
                                data.y(substring11);
                            }
                            f.a(f37833p, "enter extractBatteryInfoFeatures content = " + substring11 + ", battery_3_cell_connection = " + data.h());
                            substring2 = substring2.substring(4);
                            F.o(substring2, "this as java.lang.String).substring(startIndex)");
                            break;
                        }
                    case 9:
                        if (substring2.length() < 32) {
                            break;
                        } else {
                            String substring12 = substring2.substring(0, 32);
                            F.o(substring12, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (F.g("00000000000000000000000000000000", substring12)) {
                                data.A("");
                            } else {
                                byte[] i11 = i(substring12);
                                Charset US_ASCII6 = StandardCharsets.US_ASCII;
                                F.o(US_ASCII6, "US_ASCII");
                                data.A(new String(i11, US_ASCII6));
                            }
                            f.a(f37833p, "enter extractBatteryInfoFeatures content = " + substring12 + ", battery_3_sn = " + data.j());
                            substring2 = substring2.substring(32);
                            F.o(substring2, "this as java.lang.String).substring(startIndex)");
                            break;
                        }
                }
                i5 = 2;
                obj = null;
            }
        }
        return data;
    }

    @d
    public final DeviceAnalytics d(@d String deviceLog, @d DeviceAnalytics data, int i4, int i5, boolean z3) {
        F.p(deviceLog, "deviceLog");
        F.p(data, "data");
        f.a(f37833p, "enter extractFeatures deviceLog = " + deviceLog + ", packageStartingIndex = " + i4 + ", featureCountIndex = " + i5);
        if (deviceLog.length() >= 2) {
            String substring = deviceLog.substring(0, 2);
            F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            data.l().put(Integer.valueOf(i5), Integer.valueOf(l(this, substring, false, 2, null)));
            String substring2 = deviceLog.substring(2);
            F.o(substring2, "this as java.lang.String).substring(startIndex)");
            StringBuilder sb = new StringBuilder();
            while (substring2.length() > 0) {
                F.o(substring2.substring(0, 2), "this as java.lang.String…ing(startIndex, endIndex)");
                substring2 = substring2.substring(2);
                F.o(substring2, "this as java.lang.String).substring(startIndex)");
                int l4 = (l(this, r6, false, 2, null) - 1) + i4;
                data.n().put(data.m().get(l4), Integer.valueOf(g(substring2, z3)));
                sb.append(data.m().get(l4));
                sb.append(" = ");
                sb.append(data.n().get(data.m().get(l4)));
                sb.append(", ");
                if (substring2.length() >= 4) {
                    substring2 = substring2.substring(4);
                    F.o(substring2, "this as java.lang.String).substring(startIndex)");
                }
            }
            f.a(f37833p, "exit extractFeatures log details = " + ((Object) sb));
        }
        return data;
    }

    @d
    public final DeviceAnalytics f(@d HashMap<Integer, String> packagesMap, @e DeviceAnalytics deviceAnalytics, boolean z3) {
        F.p(packagesMap, "packagesMap");
        if (deviceAnalytics == null) {
            deviceAnalytics = new DeviceAnalytics();
        }
        for (Map.Entry<Integer, String> entry : packagesMap.entrySet()) {
            f.a(f37833p, "enter extractPackageIdInformation packageId = " + entry.getKey() + " package data = " + ((Object) entry.getValue()));
            switch (entry.getKey().intValue()) {
                case 1:
                    d(entry.getValue(), deviceAnalytics, 0, 1, z3);
                    break;
                case 2:
                    d(entry.getValue(), deviceAnalytics, 7, 2, z3);
                    break;
                case 3:
                    d(entry.getValue(), deviceAnalytics, 14, 3, z3);
                    break;
                case 4:
                    d(entry.getValue(), deviceAnalytics, 24, 4, z3);
                    break;
                case 5:
                    d(entry.getValue(), deviceAnalytics, 37, 5, z3);
                    break;
                case 6:
                    d(entry.getValue(), deviceAnalytics, 45, 6, z3);
                    break;
                case 7:
                    d(entry.getValue(), deviceAnalytics, f37826i, 7, z3);
                    break;
                case 8:
                    d(entry.getValue(), deviceAnalytics, f37827j, 8, z3);
                    break;
                case 9:
                    d(entry.getValue(), deviceAnalytics, f37828k, 9, z3);
                    break;
                case 10:
                    d(entry.getValue(), deviceAnalytics, 168, 10, z3);
                    break;
                case 12:
                    d(entry.getValue(), deviceAnalytics, f37830m, 12, z3);
                    break;
                case 13:
                    d(entry.getValue(), deviceAnalytics, f37831n, 13, z3);
                    break;
                case 14:
                    c(entry.getValue(), deviceAnalytics, 14);
                    break;
            }
        }
        return deviceAnalytics;
    }

    @d
    public final byte[] i(@d String hexString) {
        int a4;
        F.p(hexString, "hexString");
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i4 * 2;
            String substring = hexString.substring(i5, i5 + 2);
            F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            a4 = C2220b.a(16);
            bArr[i4] = (byte) Integer.parseInt(substring, a4);
        }
        return bArr;
    }

    @d
    public final DeviceAnalytics j(@d String log, @e DeviceAnalytics deviceAnalytics) {
        F.p(log, "log");
        f.a(f37833p, "enter parseData log = " + log);
        if (deviceAnalytics == null) {
            deviceAnalytics = new DeviceAnalytics();
        }
        deviceAnalytics.p();
        if (log.length() > 2) {
            String substring = log.substring(0, 2);
            F.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            deviceAnalytics.B(l(this, substring, false, 2, null));
            if (log.length() > 10) {
                String substring2 = log.substring(2, 4);
                F.o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                deviceAnalytics.F(l(this, substring2, false, 2, null));
                String substring3 = log.substring(6);
                F.o(substring3, "this as java.lang.String).substring(startIndex)");
                e(substring3, deviceAnalytics);
            }
        }
        return deviceAnalytics;
    }
}
