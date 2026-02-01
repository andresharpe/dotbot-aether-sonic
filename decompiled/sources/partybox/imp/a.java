package partybox.imp;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.P;
import com.google.gson.GsonBuilder;
import com.harman.log.f;
import jar.model.RequestPayload;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import partybox.api.IBaseDataAnalytics;

/* loaded from: classes2.dex */
public abstract class a implements IBaseDataAnalytics {

    /* renamed from: g, reason: collision with root package name */
    private static final String f55874g = "UpdatePartyBoxAnalyticsReq";

    /* renamed from: h, reason: collision with root package name */
    private static final String f55875h = "party box";

    /* renamed from: i, reason: collision with root package name */
    private static long f55876i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final int f55877j = 24;

    /* renamed from: k, reason: collision with root package name */
    private static final int f55878k = 50;

    /* renamed from: l, reason: collision with root package name */
    private static final int f55879l = 1;

    /* renamed from: b, reason: collision with root package name */
    private M2.a f55881b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55883d;

    /* renamed from: e, reason: collision with root package name */
    private String f55884e;

    /* renamed from: a, reason: collision with root package name */
    private String f55880a = "BaseDataAnalyticManager";

    /* renamed from: c, reason: collision with root package name */
    String f55882c = "";

    /* renamed from: f, reason: collision with root package name */
    private String f55885f = null;

    /* renamed from: partybox.imp.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class RunnableC0540a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ q3.a f55886E;

        RunnableC0540a(q3.a aVar) {
            this.f55886E = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConcurrentHashMap<String, RequestPayload> b4 = d.d().b();
            if (b4 == null) {
                return;
            }
            boolean z3 = false;
            for (Map.Entry<String, RequestPayload> entry : b4.entrySet()) {
                String key = entry.getKey();
                RequestPayload value = entry.getValue();
                if (value != null && a.this.m(value)) {
                    value.e(a.this.r());
                    value.f(s3.a.f57647g);
                    value.a().g(a.f55874g);
                    value.a().d().h(a.this.s());
                    value.a().a().f("Android");
                    value.a().a().e(Build.VERSION.RELEASE);
                    value.a().a().g(Build.BRAND.toUpperCase());
                    value.a().a().h(Build.MODEL);
                    N2.b bVar = null;
                    try {
                        bVar = a.this.f55881b.a(value, null).a();
                        f.a(a.this.f55880a, "uploadToServer response -----> status : " + bVar.d() + ", cmd : " + bVar.a() + ", sequence : " + bVar.b() + ", shardId : " + bVar.c());
                    } catch (Exception e4) {
                        f.c(a.this.f55880a, "uploadToServer exception: ", e4);
                    }
                    String f4 = value.a().d().f();
                    if (bVar != null && bVar.d().intValue() == 1) {
                        if (a.this.f55882c.equalsIgnoreCase(key)) {
                            a.this.f55885f = new GsonBuilder().setPrettyPrinting().create().toJson(value);
                            f.a(a.this.f55880a, "uploadToServer -----> " + f4 + "/" + key + ", current json: " + a.this.f55885f);
                            d.d().l(key, a.this.t());
                            z3 = true;
                        } else {
                            String json = new GsonBuilder().setPrettyPrinting().create().toJson(value);
                            f.a(a.this.f55880a, "uploadToServer -----> " + f4 + "/ " + key + ", other json: " + json);
                            d.d().a(key);
                        }
                    } else {
                        f.a(a.this.f55880a, "uploadToServer failed! productName:  " + f4 + ",mac: " + key);
                    }
                } else {
                    f.b(a.this.f55880a, "uploadToServer error, RequestPayload is null/check payload data failed!");
                }
            }
            q3.a aVar = this.f55886E;
            if (aVar != null) {
                aVar.a(z3);
            }
        }
    }

    private boolean n(Context context) {
        s3.c cVar = s3.c.f57654a;
        long c4 = cVar.c(context, s3.a.f57648h, 0L);
        f55876i = c4;
        boolean z3 = true;
        if (c4 != 0) {
            long currentTimeMillis = (System.currentTimeMillis() - f55876i) / com.harman.jbl.partybox.ui.party.b.f44883c;
            f.a(this.f55880a, "checkUploadInterval period(s): " + currentTimeMillis);
            if (currentTimeMillis < 1) {
                z3 = false;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        f55876i = currentTimeMillis2;
        cVar.h(context, s3.a.f57648h, currentTimeMillis2);
        return z3;
    }

    private boolean o(Context context) {
        s3.c cVar = s3.c.f57654a;
        int b4 = cVar.b(context, s3.a.f57650j, 0);
        f.a(this.f55880a, "checkUploadTimes uploadTimes: " + b4);
        if (b4 == 0) {
            cVar.h(context, s3.a.f57649i, System.currentTimeMillis());
        } else {
            long currentTimeMillis = (System.currentTimeMillis() - cVar.c(context, s3.a.f57649i, System.currentTimeMillis())) / 3600000;
            f.a(this.f55880a, "checkUploadTimes period: " + currentTimeMillis);
            if (currentTimeMillis > 24) {
                cVar.g(context, s3.a.f57650j, 0);
                return true;
            }
        }
        if (b4 > 50) {
            return false;
        }
        return true;
    }

    private String p(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e4) {
            f.c(this.f55880a, "Exception:", e4);
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String r() {
        return new SimpleDateFormat("yyyyMMddHHmmss", Locale.US).format(new Date());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String s() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    @Override // partybox.api.IBaseDataAnalytics
    public String a() {
        return this.f55885f;
    }

    @Override // partybox.api.IBaseDataAnalytics
    public void b(Context context, q3.a aVar) {
        if (o(context) && n(context)) {
            boolean a4 = s3.b.a(context);
            f.a(this.f55880a, "uploadToServer isNetworkConnected: " + a4 + ",isUploadAlready: " + this.f55883d + ",currentAddress: " + this.f55882c);
            if (a4 && !this.f55883d) {
                this.f55883d = true;
                s3.c cVar = s3.c.f57654a;
                int b4 = cVar.b(context, s3.a.f57650j, 0) + 1;
                f.a(this.f55880a, "uploadToServer uploadTimes: " + b4);
                cVar.g(context, s3.a.f57650j, b4);
                new Thread(new RunnableC0540a(aVar)).start();
                return;
            }
            return;
        }
        f.a(this.f55880a, "uploadToServer checkUploadTimes true or checkUploadInterval false");
    }

    @Override // partybox.api.IBaseDataAnalytics
    public boolean c(Context context) {
        try {
            if (this.f55881b == null) {
                f.a(this.f55880a, "init isDebug: false");
                String str = s3.a.f57641a;
                String str2 = s3.a.f57644d;
                f.a(this.f55880a, "apiKey: " + s3.a.f57642b);
                f.a(this.f55880a, "endPoint: " + s3.a.f57643c);
                f.a(this.f55880a, "streamName: " + s3.a.f57647g);
                this.f55881b = (M2.a) new com.amazonaws.mobileconnectors.apigateway.a().a(str).e(str2).b(M2.a.class);
                d.d().f(context);
                this.f55884e = p(context);
                return true;
            }
            return false;
        } catch (Exception e4) {
            f.c(this.f55880a, "Exception:", e4);
            return false;
        }
    }

    @Override // partybox.api.IBaseDataAnalytics
    public void d(boolean z3, String str, Object obj, boolean z4) {
    }

    @Override // partybox.api.IBaseDataAnalytics
    public IBaseDataAnalytics.CUR_DEVICE_STATUS e(String str, int i4, String str2, String str3, String str4) {
        IBaseDataAnalytics.CUR_DEVICE_STATUS cur_device_status = IBaseDataAnalytics.CUR_DEVICE_STATUS.UPDATED;
        if (str != null && i4 >= 0 && str2 != null) {
            this.f55882c = str;
            f.a(this.f55880a, "setCurDevice currentAddress: " + this.f55882c);
            RequestPayload c4 = d.d().c(this.f55882c);
            if (c4 == null || c4.a() == null) {
                f.a(this.f55880a, "setCurDevice requestPayload is not exist, so init current device!");
                c4 = q();
                cur_device_status = IBaseDataAnalytics.CUR_DEVICE_STATUS.CREATED;
            }
            this.f55883d = false;
            c4.a().d().k(str);
            c4.a().d().l(Integer.valueOf(i4));
            c4.a().d().m(str2);
            c4.a().d().j(str3);
            c4.a().d().i(this.f55884e);
            c4.a().d().n(f55875h);
            f.a(this.f55880a, "setCurDevice macAddress: " + str + ",productId: " + i4 + ",productName: " + str2 + ",mac: " + c4.a().d().d() + ",fwVersion: " + str3);
            d.d().l(this.f55882c, c4);
            return cur_device_status;
        }
        f.b(this.f55880a, "setCurDevice params contain null or less than 0");
        return IBaseDataAnalytics.CUR_DEVICE_STATUS.FAILED;
    }

    boolean l(String str) {
        return true;
    }

    abstract boolean m(RequestPayload requestPayload);

    @P
    abstract RequestPayload q();

    abstract RequestPayload t();
}
