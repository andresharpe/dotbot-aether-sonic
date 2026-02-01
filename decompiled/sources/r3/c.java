package r3;

import android.content.Context;
import androidx.annotation.N;
import com.google.gson.GsonBuilder;
import jar.model.RequestPayloadDataDeviceAnalytics;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f57450a = "AwsAnalyticsManager";

    @N
    public static String c() {
        return partybox.imp.c.l().a();
    }

    public static void d(Context context, String str, String str2) {
        partybox.imp.c.f55890f = str;
        partybox.imp.c.f55891g = str2;
        partybox.imp.b.v().c(context);
        partybox.imp.c.l().c(context);
    }

    public static void e(e eVar) {
        com.harman.log.f.a(f57450a, "initCurrentDevice deviceName: " + eVar.f57454b + ",myDevice.pid: " + eVar.f57455c);
        int parseInt = Integer.parseInt(eVar.f57455c, 16);
        StringBuilder sb = new StringBuilder();
        sb.append("initCurrentDevice pid: ");
        sb.append(parseInt);
        com.harman.log.f.a(f57450a, sb.toString());
        partybox.imp.b.v().e(eVar.f57453a.replace(":", ""), parseInt, eVar.f57454b, eVar.f57456d, eVar.f57457e);
        partybox.imp.c.l().e(eVar.f57453a, parseInt, eVar.f57454b, eVar.f57456d, eVar.f57457e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(f fVar, boolean z3) {
        if (fVar != null) {
            fVar.a(z3);
        }
    }

    public static void h(RequestPayloadDataDeviceAnalytics requestPayloadDataDeviceAnalytics) {
        com.harman.log.f.a(f57450a, "logSADeviceInfo requestPayloadDataDeviceAnalytics: " + new GsonBuilder().setPrettyPrinting().create().toJson(requestPayloadDataDeviceAnalytics));
        partybox.imp.b.v().w(requestPayloadDataDeviceAnalytics);
        partybox.imp.c.l().n(requestPayloadDataDeviceAnalytics);
    }

    public static void i(List<Map<String, Integer>> list) {
        partybox.imp.b.v().x(list);
        partybox.imp.c.l().o(list);
    }

    public static void j(String str) {
        partybox.imp.b.v().y(str);
        partybox.imp.c.l().p(str);
    }

    public static void k(boolean z3, Context context, final f fVar) {
        s3.c cVar = s3.c.f57654a;
        boolean a4 = cVar.a(context, d.f57452b, true);
        com.harman.log.f.a(f57450a, "uploadToServer isDeviceDisconnectedLastTime: " + a4);
        if (a4) {
            cVar.f(context, d.f57452b, false);
            if (z3) {
                partybox.imp.b.v().b(context, new q3.a() { // from class: r3.a
                    @Override // q3.a
                    public final void a(boolean z4) {
                        c.f(z4);
                    }
                });
            }
            partybox.imp.c.l().b(context, new q3.a() { // from class: r3.b
                @Override // q3.a
                public final void a(boolean z4) {
                    c.g(f.this, z4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(boolean z3) {
    }
}
