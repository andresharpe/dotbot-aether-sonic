package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class E4 extends C1459o {

    /* renamed from: F, reason: collision with root package name */
    private final C1363c f29313F;

    public E4(C1363c c1363c) {
        this.f29313F = c1363c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C1459o, com.google.android.gms.internal.measurement.r
    public final r d(String str, C1398g2 c1398g2, List list) {
        char c4;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        if (c4 != 0) {
            if (c4 != 1) {
                if (c4 != 2) {
                    if (c4 != 3) {
                        if (c4 != 4) {
                            if (c4 != 5) {
                                return super.d(str, c1398g2, list);
                            }
                            H2.h("setParamValue", 2, list);
                            String zzi = c1398g2.b((r) list.get(0)).zzi();
                            r b4 = c1398g2.b((r) list.get(1));
                            this.f29313F.b().g(zzi, H2.f(b4));
                            return b4;
                        }
                        H2.h("setEventName", 1, list);
                        r b5 = c1398g2.b((r) list.get(0));
                        if (!r.f29754h.equals(b5) && !r.f29755i.equals(b5)) {
                            this.f29313F.b().f(b5.zzi());
                            return new C1514v(b5.zzi());
                        }
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    H2.h("getTimestamp", 0, list);
                    return new C1419j(Double.valueOf(this.f29313F.b().a()));
                }
                H2.h("getParams", 0, list);
                Map e4 = this.f29313F.b().e();
                C1459o c1459o = new C1459o();
                for (String str2 : e4.keySet()) {
                    c1459o.c(str2, C1415i3.b(e4.get(str2)));
                }
                return c1459o;
            }
            H2.h("getParamValue", 1, list);
            return C1415i3.b(this.f29313F.b().c(c1398g2.b((r) list.get(0)).zzi()));
        }
        H2.h("getEventName", 0, list);
        return new C1514v(this.f29313F.b().d());
    }
}
