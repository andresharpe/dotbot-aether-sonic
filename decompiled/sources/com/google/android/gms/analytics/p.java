package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import com.google.android.gms.common.internal.C1275t;
import java.util.ArrayList;
import java.util.Collections;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public final class p implements C {

    /* renamed from: F, reason: collision with root package name */
    private static final Uri f27809F;

    /* renamed from: E, reason: collision with root package name */
    private final LogPrinter f27810E = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority(C1275t.f28814b);
        f27809F = builder.build();
    }

    @Override // com.google.android.gms.analytics.C
    public final void a(q qVar) {
        ArrayList arrayList = new ArrayList(qVar.e());
        Collections.sort(arrayList, new o(this));
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            String obj = ((s) arrayList.get(i4)).toString();
            if (!TextUtils.isEmpty(obj)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
            }
        }
        this.f27810E.println(sb.toString());
    }

    @Override // com.google.android.gms.analytics.C
    public final Uri zzb() {
        return f27809F;
    }
}
