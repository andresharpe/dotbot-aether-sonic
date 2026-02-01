package P1;

import R1.b;
import android.app.Application;
import android.content.Context;
import com.blankj.utilcode.util.E0;
import com.harman.sdk.setting.ProductConfig;
import com.harman.sdk.utils.d;
import com.harman.sdk.utils.h;
import com.harman.sdk.utils.n;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a implements b {
    private final void a() {
        com.harman.sdk.b.f47608a.v(d.j());
    }

    @Override // R1.b
    public void b() {
        Application a4 = E0.a();
        F.o(a4, "getApp(...)");
        c(a4);
    }

    public final void c(@l3.d Context applicationContext) {
        F.p(applicationContext, "applicationContext");
        ProductConfig productConfig = (ProductConfig) h.a().fromJson(n.f(applicationContext, "ProductListConfig.json"), ProductConfig.class);
        if (productConfig != null) {
            com.harman.sdk.b.f47608a.o(applicationContext, productConfig);
            a();
        }
    }
}
