package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.q;
import androidx.window.layout.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final p f20859a = new p();

    private p() {
    }

    private final boolean c(Activity activity, androidx.window.core.b bVar) {
        Rect a4 = G.f20824b.e(activity).a();
        if (bVar.h()) {
            return false;
        }
        if (bVar.f() != a4.width() && bVar.b() != a4.height()) {
            return false;
        }
        if (bVar.f() < a4.width() && bVar.b() < a4.height()) {
            return false;
        }
        if (bVar.f() == a4.width() && bVar.b() == a4.height()) {
            return false;
        }
        return true;
    }

    @l3.e
    public final q a(@l3.d Activity activity, @l3.d FoldingFeature oemFeature) {
        r.b a4;
        q.c cVar;
        kotlin.jvm.internal.F.p(activity, "activity");
        kotlin.jvm.internal.F.p(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            a4 = r.b.f20876b.b();
        } else {
            a4 = r.b.f20876b.a();
        }
        int state = oemFeature.getState();
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            cVar = q.c.f20870d;
        } else {
            cVar = q.c.f20869c;
        }
        Rect bounds = oemFeature.getBounds();
        kotlin.jvm.internal.F.o(bounds, "oemFeature.bounds");
        if (!c(activity, new androidx.window.core.b(bounds))) {
            return null;
        }
        Rect bounds2 = oemFeature.getBounds();
        kotlin.jvm.internal.F.o(bounds2, "oemFeature.bounds");
        return new r(new androidx.window.core.b(bounds2), a4, cVar);
    }

    @l3.d
    public final B b(@l3.d Activity activity, @l3.d WindowLayoutInfo info) {
        q qVar;
        kotlin.jvm.internal.F.p(activity, "activity");
        kotlin.jvm.internal.F.p(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        kotlin.jvm.internal.F.o(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                p pVar = f20859a;
                kotlin.jvm.internal.F.o(feature, "feature");
                qVar = pVar.a(activity, feature);
            } else {
                qVar = null;
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        return new B(arrayList);
    }
}
