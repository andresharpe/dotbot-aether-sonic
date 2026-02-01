package partybox.api;

import android.content.Context;
import q3.a;

/* loaded from: classes2.dex */
public interface IBaseDataAnalytics {

    /* loaded from: classes2.dex */
    public enum CUR_DEVICE_STATUS {
        FAILED,
        CREATED,
        UPDATED
    }

    String a();

    void b(Context context, a aVar);

    boolean c(Context context);

    void d(boolean z3, String str, Object obj, boolean z4);

    CUR_DEVICE_STATUS e(String str, int i4, String str2, String str3, String str4);
}
