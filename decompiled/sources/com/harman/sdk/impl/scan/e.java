package com.harman.sdk.impl.scan;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.os.ParcelUuid;
import android.text.TextUtils;
import java.util.Map;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;

/* loaded from: classes2.dex */
public final class e implements B2.b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f48064b = 3787;

    /* renamed from: c, reason: collision with root package name */
    public static final int f48065c = 64991;

    /* renamed from: d, reason: collision with root package name */
    public static final int f48066d = 64617;

    /* renamed from: e, reason: collision with root package name */
    public static final int f48067e = 87;

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f48063a = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final ParcelUuid f48068f = ParcelUuid.fromString("0000dffd-0000-1000-8000-00805f9b34fb");

    /* renamed from: g, reason: collision with root package name */
    private static final ParcelUuid f48069g = ParcelUuid.fromString("0000fc69-0000-1000-8000-00805f9b34fb");

    /* renamed from: h, reason: collision with root package name */
    private static final ParcelUuid f48070h = ParcelUuid.fromString("0000fddf-0000-1000-8000-00805f9b34fb");

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final ParcelUuid a() {
            return e.f48070h;
        }

        public final ParcelUuid b() {
            return e.f48068f;
        }

        public final ParcelUuid c() {
            return e.f48069g;
        }

        private a() {
        }
    }

    @Override // B2.b
    @SuppressLint({"MissingPermission"})
    public boolean a(@l3.d Object scanRecord, @l3.e Object obj) {
        int a4;
        int a5;
        int a6;
        int a7;
        F.p(scanRecord, "scanRecord");
        if ((scanRecord instanceof ScanRecord) && (obj instanceof Map)) {
            Map map = (Map) obj;
            Object obj2 = map.get("Vendor_ID");
            Object obj3 = map.get("Product_ID");
            Object obj4 = map.get(com.harman.sdk.utils.d.f48499P);
            if (obj3 != null) {
                String str = (String) obj3;
                if (!TextUtils.isEmpty(str)) {
                    if (obj2 != null) {
                        String str2 = (String) obj2;
                        if (!TextUtils.isEmpty(str2)) {
                            if (com.harman.sdk.utils.d.f0(str)) {
                                a6 = C2220b.a(16);
                                if (Integer.parseInt(str2, a6) != 3787) {
                                    a7 = C2220b.a(16);
                                    if (Integer.parseInt(str2, a7) != 87) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                            return false;
                        }
                    }
                    if (obj4 != null) {
                        String str3 = (String) obj4;
                        if (!TextUtils.isEmpty(str3)) {
                            if (com.harman.sdk.utils.d.f0(str)) {
                                a4 = C2220b.a(16);
                                if (Integer.parseInt(str3, a4) != 64991) {
                                    a5 = C2220b.a(16);
                                    if (Integer.parseInt(str3, a5) != 64617) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                            return false;
                        }
                    }
                    return com.harman.sdk.utils.d.f0(str);
                }
            }
        } else if (scanRecord instanceof BluetoothDevice) {
            return com.harman.sdk.utils.d.d0(((BluetoothDevice) scanRecord).getName());
        }
        return false;
    }
}
