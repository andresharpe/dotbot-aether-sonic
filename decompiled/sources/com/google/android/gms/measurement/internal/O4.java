package com.google.android.gms.measurement.internal;

import N0.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.C1355b;
import com.google.android.gms.internal.measurement.C1358b2;
import com.google.android.gms.internal.measurement.C1366c2;
import com.google.android.gms.internal.measurement.C1406h2;
import com.google.android.gms.internal.measurement.C1414i2;
import com.google.android.gms.internal.measurement.C1422j2;
import com.google.android.gms.internal.measurement.C1461o1;
import com.google.android.gms.internal.measurement.C1462o2;
import com.google.android.gms.internal.measurement.C1477q1;
import com.google.android.gms.internal.measurement.C1478q2;
import com.google.android.gms.internal.measurement.C1485r2;
import com.google.android.gms.internal.measurement.C1493s2;
import com.google.android.gms.internal.measurement.C1516v1;
import com.google.android.gms.internal.measurement.C1532x1;
import com.google.android.gms.internal.measurement.D6;
import com.google.android.gms.internal.measurement.zzko;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public final class O4 extends AbstractC1759z4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public O4(L4 l4) {
        super(l4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.internal.measurement.O4 A(com.google.android.gms.internal.measurement.O4 o4, byte[] bArr) throws zzko {
        com.google.android.gms.internal.measurement.X3 a4 = com.google.android.gms.internal.measurement.X3.a();
        if (a4 != null) {
            return o4.m(bArr, a4);
        }
        return o4.c(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List F(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            long j4 = 0;
            for (int i5 = 0; i5 < 64; i5++) {
                int i6 = (i4 * 64) + i5;
                if (i6 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i6)) {
                    j4 |= 1 << i5;
                }
            }
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean J(List list, int i4) {
        if (i4 < list.size() * 64) {
            if (((1 << (i4 % 64)) & ((Long) list.get(i4 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean L(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void N(com.google.android.gms.internal.measurement.X1 x12, String str, Object obj) {
        List K3 = x12.K();
        int i4 = 0;
        while (true) {
            if (i4 < K3.size()) {
                if (str.equals(((C1366c2) K3.get(i4)).G())) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        C1358b2 E3 = C1366c2.E();
        E3.E(str);
        if (obj instanceof Long) {
            E3.D(((Long) obj).longValue());
        }
        if (i4 >= 0) {
            x12.E(i4, E3);
        } else {
            x12.y(E3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public static final boolean k(C1736w c1736w, Z4 z4) {
        C1285y.l(c1736w);
        C1285y.l(z4);
        if (TextUtils.isEmpty(z4.f30507F) && TextUtils.isEmpty(z4.f30522U)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final C1366c2 l(com.google.android.gms.internal.measurement.Y1 y12, String str) {
        for (C1366c2 c1366c2 : y12.I()) {
            if (c1366c2.G().equals(str)) {
                return c1366c2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object m(com.google.android.gms.internal.measurement.Y1 y12, String str) {
        C1366c2 l4 = l(y12, str);
        if (l4 != null) {
            if (l4.X()) {
                return l4.H();
            }
            if (l4.V()) {
                return Long.valueOf(l4.D());
            }
            if (l4.T()) {
                return Double.valueOf(l4.A());
            }
            if (l4.C() > 0) {
                List<C1366c2> I3 = l4.I();
                ArrayList arrayList = new ArrayList();
                for (C1366c2 c1366c2 : I3) {
                    if (c1366c2 != null) {
                        Bundle bundle = new Bundle();
                        for (C1366c2 c1366c22 : c1366c2.I()) {
                            if (c1366c22.X()) {
                                bundle.putString(c1366c22.G(), c1366c22.H());
                            } else if (c1366c22.V()) {
                                bundle.putLong(c1366c22.G(), c1366c22.D());
                            } else if (c1366c22.T()) {
                                bundle.putDouble(c1366c22.G(), c1366c22.A());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    private final void n(StringBuilder sb, int i4, List list) {
        String str;
        String str2;
        Long l4;
        if (list == null) {
            return;
        }
        int i5 = i4 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1366c2 c1366c2 = (C1366c2) it.next();
            if (c1366c2 != null) {
                p(sb, i5);
                sb.append("param {\n");
                Double d4 = null;
                if (c1366c2.W()) {
                    str = this.f31060a.B().e(c1366c2.G());
                } else {
                    str = null;
                }
                s(sb, i5, a.C0015a.f1688b, str);
                if (c1366c2.X()) {
                    str2 = c1366c2.H();
                } else {
                    str2 = null;
                }
                s(sb, i5, "string_value", str2);
                if (c1366c2.V()) {
                    l4 = Long.valueOf(c1366c2.D());
                } else {
                    l4 = null;
                }
                s(sb, i5, "int_value", l4);
                if (c1366c2.T()) {
                    d4 = Double.valueOf(c1366c2.A());
                }
                s(sb, i5, "double_value", d4);
                if (c1366c2.C() > 0) {
                    n(sb, i5, c1366c2.I());
                }
                p(sb, i5);
                sb.append("}\n");
            }
        }
    }

    private final void o(StringBuilder sb, int i4, C1477q1 c1477q1) {
        String str;
        if (c1477q1 == null) {
            return;
        }
        p(sb, i4);
        sb.append("filter {\n");
        if (c1477q1.H()) {
            s(sb, i4, "complement", Boolean.valueOf(c1477q1.G()));
        }
        if (c1477q1.J()) {
            s(sb, i4, "param_name", this.f31060a.B().e(c1477q1.E()));
        }
        if (c1477q1.K()) {
            int i5 = i4 + 1;
            com.google.android.gms.internal.measurement.C1 D3 = c1477q1.D();
            if (D3 != null) {
                p(sb, i5);
                sb.append("string_filter {\n");
                if (D3.I()) {
                    switch (D3.J()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    s(sb, i5, "match_type", str);
                }
                if (D3.H()) {
                    s(sb, i5, "expression", D3.D());
                }
                if (D3.G()) {
                    s(sb, i5, "case_sensitive", Boolean.valueOf(D3.F()));
                }
                if (D3.A() > 0) {
                    p(sb, i4 + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : D3.E()) {
                        p(sb, i4 + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                p(sb, i5);
                sb.append("}\n");
            }
        }
        if (c1477q1.I()) {
            t(sb, i4 + 1, "number_filter", c1477q1.C());
        }
        p(sb, i4);
        sb.append("}\n");
    }

    private static final void p(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append("  ");
        }
    }

    private static final String q(boolean z3, boolean z4, boolean z5) {
        StringBuilder sb = new StringBuilder();
        if (z3) {
            sb.append("Dynamic ");
        }
        if (z4) {
            sb.append("Sequence ");
        }
        if (z5) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void r(StringBuilder sb, int i4, String str, C1462o2 c1462o2) {
        Integer num;
        Integer num2;
        Long l4;
        if (c1462o2 == null) {
            return;
        }
        p(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c1462o2.B() != 0) {
            p(sb, 4);
            sb.append("results: ");
            int i5 = 0;
            for (Long l5 : c1462o2.K()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(l5);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (c1462o2.D() != 0) {
            p(sb, 4);
            sb.append("status: ");
            int i7 = 0;
            for (Long l6 : c1462o2.M()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(l6);
                i7 = i8;
            }
            sb.append('\n');
        }
        if (c1462o2.A() != 0) {
            p(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i9 = 0;
            for (com.google.android.gms.internal.measurement.W1 w12 : c1462o2.J()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                if (w12.H()) {
                    num2 = Integer.valueOf(w12.A());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (w12.G()) {
                    l4 = Long.valueOf(w12.B());
                } else {
                    l4 = null;
                }
                sb.append(l4);
                i9 = i10;
            }
            sb.append("}\n");
        }
        if (c1462o2.C() != 0) {
            p(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i11 = 0;
            for (C1478q2 c1478q2 : c1462o2.L()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                if (c1478q2.I()) {
                    num = Integer.valueOf(c1478q2.B());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                Iterator it = c1478q2.F().iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i13 = i14;
                }
                sb.append("]");
                i11 = i12;
            }
            sb.append("}\n");
        }
        p(sb, 3);
        sb.append("}\n");
    }

    private static final void s(StringBuilder sb, int i4, String str, Object obj) {
        if (obj == null) {
            return;
        }
        p(sb, i4 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void t(StringBuilder sb, int i4, String str, C1516v1 c1516v1) {
        String str2;
        if (c1516v1 == null) {
            return;
        }
        p(sb, i4);
        sb.append(str);
        sb.append(" {\n");
        if (c1516v1.G()) {
            int L3 = c1516v1.L();
            if (L3 != 1) {
                if (L3 != 2) {
                    if (L3 != 3) {
                        if (L3 != 4) {
                            str2 = "BETWEEN";
                        } else {
                            str2 = "EQUAL";
                        }
                    } else {
                        str2 = "GREATER_THAN";
                    }
                } else {
                    str2 = "LESS_THAN";
                }
            } else {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            }
            s(sb, i4, "comparison_type", str2);
        }
        if (c1516v1.I()) {
            s(sb, i4, "match_as_float", Boolean.valueOf(c1516v1.F()));
        }
        if (c1516v1.H()) {
            s(sb, i4, "comparison_value", c1516v1.C());
        }
        if (c1516v1.K()) {
            s(sb, i4, "min_comparison_value", c1516v1.E());
        }
        if (c1516v1.J()) {
            s(sb, i4, "max_comparison_value", c1516v1.D());
        }
        p(sb, i4);
        sb.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(C1414i2 c1414i2, String str) {
        if (c1414i2 != null) {
            for (int i4 = 0; i4 < c1414i2.q0(); i4++) {
                if (str.equals(c1414i2.k0(i4).F())) {
                    return i4;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String B(C1406h2 c1406h2) {
        Long l4;
        Long l5;
        Double d4;
        if (c1406h2 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C1422j2 c1422j2 : c1406h2.D()) {
            if (c1422j2 != null) {
                p(sb, 1);
                sb.append("bundle {\n");
                if (c1422j2.n1()) {
                    s(sb, 1, "protocol_version", Integer.valueOf(c1422j2.w1()));
                }
                D6.b();
                if (this.f31060a.x().z(null, C1643g1.f30737t0) && c1422j2.q1()) {
                    s(sb, 1, "session_stitching_token", c1422j2.K());
                }
                s(sb, 1, "platform", c1422j2.I());
                if (c1422j2.j1()) {
                    s(sb, 1, "gmp_version", Long.valueOf(c1422j2.E1()));
                }
                if (c1422j2.u1()) {
                    s(sb, 1, "uploading_gmp_version", Long.valueOf(c1422j2.J1()));
                }
                if (c1422j2.h1()) {
                    s(sb, 1, "dynamite_version", Long.valueOf(c1422j2.C1()));
                }
                if (c1422j2.e1()) {
                    s(sb, 1, "config_version", Long.valueOf(c1422j2.A1()));
                }
                s(sb, 1, "gmp_app_id", c1422j2.F());
                s(sb, 1, "admob_app_id", c1422j2.O1());
                s(sb, 1, "app_id", c1422j2.P1());
                s(sb, 1, "app_version", c1422j2.A());
                if (c1422j2.z0()) {
                    s(sb, 1, "app_version_major", Integer.valueOf(c1422j2.a0()));
                }
                s(sb, 1, "firebase_instance_id", c1422j2.E());
                if (c1422j2.g1()) {
                    s(sb, 1, "dev_cert_hash", Long.valueOf(c1422j2.B1()));
                }
                s(sb, 1, "app_store", c1422j2.R1());
                if (c1422j2.t1()) {
                    s(sb, 1, "upload_timestamp_millis", Long.valueOf(c1422j2.I1()));
                }
                if (c1422j2.r1()) {
                    s(sb, 1, "start_timestamp_millis", Long.valueOf(c1422j2.H1()));
                }
                if (c1422j2.i1()) {
                    s(sb, 1, "end_timestamp_millis", Long.valueOf(c1422j2.D1()));
                }
                if (c1422j2.m1()) {
                    s(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c1422j2.G1()));
                }
                if (c1422j2.l1()) {
                    s(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c1422j2.F1()));
                }
                s(sb, 1, "app_instance_id", c1422j2.Q1());
                s(sb, 1, "resettable_device_id", c1422j2.J());
                s(sb, 1, "ds_id", c1422j2.D());
                if (c1422j2.k1()) {
                    s(sb, 1, "limited_ad_tracking", Boolean.valueOf(c1422j2.x0()));
                }
                s(sb, 1, "os_version", c1422j2.H());
                s(sb, 1, "device_model", c1422j2.C());
                s(sb, 1, "user_default_language", c1422j2.L());
                if (c1422j2.s1()) {
                    s(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c1422j2.y1()));
                }
                if (c1422j2.A0()) {
                    s(sb, 1, "bundle_sequential_index", Integer.valueOf(c1422j2.b1()));
                }
                if (c1422j2.p1()) {
                    s(sb, 1, "service_upload", Boolean.valueOf(c1422j2.y0()));
                }
                s(sb, 1, "health_monitor", c1422j2.G());
                if (c1422j2.o1()) {
                    s(sb, 1, "retry_counter", Integer.valueOf(c1422j2.x1()));
                }
                if (c1422j2.f1()) {
                    s(sb, 1, "consent_signals", c1422j2.B());
                }
                List<C1493s2> O3 = c1422j2.O();
                if (O3 != null) {
                    for (C1493s2 c1493s2 : O3) {
                        if (c1493s2 != null) {
                            p(sb, 2);
                            sb.append("user_property {\n");
                            if (c1493s2.R()) {
                                l4 = Long.valueOf(c1493s2.C());
                            } else {
                                l4 = null;
                            }
                            s(sb, 2, "set_timestamp_millis", l4);
                            s(sb, 2, a.C0015a.f1688b, this.f31060a.B().f(c1493s2.F()));
                            s(sb, 2, "string_value", c1493s2.G());
                            if (c1493s2.Q()) {
                                l5 = Long.valueOf(c1493s2.B());
                            } else {
                                l5 = null;
                            }
                            s(sb, 2, "int_value", l5);
                            if (c1493s2.P()) {
                                d4 = Double.valueOf(c1493s2.A());
                            } else {
                                d4 = null;
                            }
                            s(sb, 2, "double_value", d4);
                            p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.U1> M3 = c1422j2.M();
                if (M3 != null) {
                    for (com.google.android.gms.internal.measurement.U1 u12 : M3) {
                        if (u12 != null) {
                            p(sb, 2);
                            sb.append("audience_membership {\n");
                            if (u12.K()) {
                                s(sb, 2, "audience_id", Integer.valueOf(u12.A()));
                            }
                            if (u12.L()) {
                                s(sb, 2, "new_audience", Boolean.valueOf(u12.J()));
                            }
                            r(sb, 2, "current_data", u12.D());
                            if (u12.M()) {
                                r(sb, 2, "previous_data", u12.E());
                            }
                            p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.Y1> N3 = c1422j2.N();
                if (N3 != null) {
                    for (com.google.android.gms.internal.measurement.Y1 y12 : N3) {
                        if (y12 != null) {
                            p(sb, 2);
                            sb.append("event {\n");
                            s(sb, 2, a.C0015a.f1688b, this.f31060a.B().d(y12.H()));
                            if (y12.T()) {
                                s(sb, 2, "timestamp_millis", Long.valueOf(y12.D()));
                            }
                            if (y12.S()) {
                                s(sb, 2, "previous_timestamp_millis", Long.valueOf(y12.C()));
                            }
                            if (y12.R()) {
                                s(sb, 2, "count", Integer.valueOf(y12.A()));
                            }
                            if (y12.B() != 0) {
                                n(sb, 2, y12.I());
                            }
                            p(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                p(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String C(C1461o1 c1461o1) {
        if (c1461o1 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (c1461o1.O()) {
            s(sb, 0, "filter_id", Integer.valueOf(c1461o1.B()));
        }
        s(sb, 0, "event_name", this.f31060a.B().d(c1461o1.G()));
        String q4 = q(c1461o1.K(), c1461o1.L(), c1461o1.M());
        if (!q4.isEmpty()) {
            s(sb, 0, "filter_type", q4);
        }
        if (c1461o1.N()) {
            t(sb, 1, "event_count_filter", c1461o1.F());
        }
        if (c1461o1.A() > 0) {
            sb.append("  filters {\n");
            Iterator it = c1461o1.H().iterator();
            while (it.hasNext()) {
                o(sb, 2, (C1477q1) it.next());
            }
        }
        p(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String D(C1532x1 c1532x1) {
        if (c1532x1 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c1532x1.J()) {
            s(sb, 0, "filter_id", Integer.valueOf(c1532x1.A()));
        }
        s(sb, 0, "property_name", this.f31060a.B().f(c1532x1.E()));
        String q4 = q(c1532x1.G(), c1532x1.H(), c1532x1.I());
        if (!q4.isEmpty()) {
            s(sb, 0, "filter_type", q4);
        }
        o(sb, 1, c1532x1.B());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List E(List list, List list2) {
        int i4;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f31060a.b().u().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f31060a.b().u().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i5 = size2;
            i4 = size;
            size = i5;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(G((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(G((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(G((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map G(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.G(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.G(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.G(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.O4.G(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(C1358b2 c1358b2, Object obj) {
        C1285y.l(obj);
        c1358b2.B();
        c1358b2.y();
        c1358b2.x();
        c1358b2.A();
        if (obj instanceof String) {
            c1358b2.F((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c1358b2.D(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            c1358b2.C(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C1358b2 E3 = C1366c2.E();
                    for (String str : bundle.keySet()) {
                        C1358b2 E4 = C1366c2.E();
                        E4.E(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            E4.D(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            E4.F((String) obj2);
                        } else if (obj2 instanceof Double) {
                            E4.C(((Double) obj2).doubleValue());
                        }
                        E3.w(E4);
                    }
                    if (E3.t() > 0) {
                        arrayList.add((C1366c2) E3.q());
                    }
                }
            }
            c1358b2.u(arrayList);
            return;
        }
        this.f31060a.b().p().b("Ignoring invalid (type) event param value", obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(C1485r2 c1485r2, Object obj) {
        C1285y.l(obj);
        c1485r2.w();
        c1485r2.u();
        c1485r2.t();
        if (obj instanceof String) {
            c1485r2.C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c1485r2.y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c1485r2.x(((Double) obj).doubleValue());
        } else {
            this.f31060a.b().p().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean K(long j4, long j5) {
        if (j4 != 0 && j5 > 0 && Math.abs(this.f31060a.zzav().a() - j4) <= j5) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] M(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            this.f31060a.b().p().b("Failed to gzip content", e4);
            throw e4;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1759z4
    protected final boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final long v(byte[] bArr) {
        C1285y.l(bArr);
        this.f31060a.L().f();
        MessageDigest r4 = U4.r();
        if (r4 == null) {
            this.f31060a.b().p().a("Failed to get MD5");
            return 0L;
        }
        return U4.o0(r4.digest(bArr));
    }

    final Bundle w(Map map, boolean z3) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z3) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        arrayList2.add(w((Map) arrayList.get(i4), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable x(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.f31060a.b().p().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1736w y(C1355b c1355b) {
        String str;
        Object obj;
        Bundle w3 = w(c1355b.e(), true);
        if (w3.containsKey("_o") && (obj = w3.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = com.spotify.android.appremote.internal.l.f48821i;
        }
        String str2 = str;
        String b4 = D2.b(c1355b.d());
        if (b4 == null) {
            b4 = c1355b.d();
        }
        return new C1736w(b4, new C1724u(w3), str2, c1355b.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.Y1 z(r rVar) {
        com.google.android.gms.internal.measurement.X1 E3 = com.google.android.gms.internal.measurement.Y1.E();
        E3.G(rVar.f30938e);
        C1718t c1718t = new C1718t(rVar.f30939f);
        while (c1718t.hasNext()) {
            String next = c1718t.next();
            C1358b2 E4 = C1366c2.E();
            E4.E(next);
            Object y02 = rVar.f30939f.y0(next);
            C1285y.l(y02);
            H(E4, y02);
            E3.y(E4);
        }
        return (com.google.android.gms.internal.measurement.Y1) E3.q();
    }
}
