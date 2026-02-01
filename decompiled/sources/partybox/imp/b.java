package partybox.imp;

import android.content.Context;
import com.harman.log.f;
import jar.model.RequestPayload;
import jar.model.RequestPayloadData;
import jar.model.RequestPayloadDataAppAnalytics;
import jar.model.RequestPayloadDataDeviceAnalytics;
import jar.model.RequestPayloadDataHarmanDevice;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: m, reason: collision with root package name */
    private static final String f55888m = "BaseDataAnalyticManager";

    /* renamed from: n, reason: collision with root package name */
    private static volatile b f55889n;

    private boolean u(RequestPayloadDataHarmanDevice requestPayloadDataHarmanDevice) {
        if (requestPayloadDataHarmanDevice.d() != null && requestPayloadDataHarmanDevice.c() != null && requestPayloadDataHarmanDevice.f() != null) {
            return true;
        }
        return false;
    }

    public static b v() {
        if (f55889n == null) {
            synchronized (b.class) {
                try {
                    if (f55889n == null) {
                        f55889n = new b();
                    }
                } finally {
                }
            }
        }
        return f55889n;
    }

    @Override // partybox.imp.a, partybox.api.IBaseDataAnalytics
    public boolean c(Context context) {
        return super.c(context);
    }

    @Override // partybox.imp.a
    boolean m(RequestPayload requestPayload) {
        RequestPayloadDataHarmanDevice d4 = requestPayload.a().d();
        RequestPayloadDataDeviceAnalytics c4 = requestPayload.a().c();
        if (d4 != null && u(d4)) {
            if (c4 == null) {
                f.a(f55888m, "checkPayloadData DeviceAnalytics contains null");
                return false;
            }
            if (this.f55882c == null) {
                f.a(f55888m, "checkPayloadData currentAddress is null");
                return false;
            }
            return true;
        }
        f.a(f55888m, "checkPayloadData HarmanDevice contains null");
        return false;
    }

    @Override // partybox.imp.a
    public RequestPayload q() {
        RequestPayload requestPayload = new RequestPayload();
        requestPayload.d(new RequestPayloadData());
        requestPayload.a().i(new RequestPayloadDataHarmanDevice());
        RequestPayloadDataAppAnalytics requestPayloadDataAppAnalytics = new RequestPayloadDataAppAnalytics();
        requestPayloadDataAppAnalytics.f("");
        requestPayloadDataAppAnalytics.e("");
        requestPayloadDataAppAnalytics.g("");
        requestPayloadDataAppAnalytics.h("");
        requestPayload.a().f(requestPayloadDataAppAnalytics);
        return requestPayload;
    }

    @Override // partybox.imp.a
    RequestPayload t() {
        RequestPayload c4 = d.d().c(this.f55882c);
        c4.a().a().f("");
        c4.a().a().e("");
        c4.a().a().g("");
        c4.a().a().h("");
        return c4;
    }

    public void w(RequestPayloadDataDeviceAnalytics requestPayloadDataDeviceAnalytics) {
        RequestPayload c4 = d.d().c(this.f55882c);
        if (c4 == null) {
            f.b(f55888m, "logDeviceInfo requestPayload is null, currentAddress: " + this.f55882c);
            return;
        }
        c4.a().h(requestPayloadDataDeviceAnalytics);
        f.d(f55888m, "logDeviceInfo deviceAnalytics: " + requestPayloadDataDeviceAnalytics);
        d.d().l(this.f55882c, c4);
    }

    public void x(List<Map<String, Integer>> list) {
        RequestPayload c4 = d.d().c(this.f55882c);
        if (c4 == null) {
            f.b(f55888m, "logPlayInfo requestPayload is null, currentAddress: " + this.f55882c);
            return;
        }
        c4.a().j(list);
        f.d(f55888m, "logPlayInfo playAnalytics: " + list);
        d.d().l(this.f55882c, c4);
    }

    public void y(String str) {
        RequestPayload c4 = d.d().c(this.f55882c);
        if (c4 == null) {
            f.b(f55888m, "saveLog requestPayload is null, currentAddress: " + this.f55882c);
            return;
        }
        d.d().j(str, c4);
    }
}
