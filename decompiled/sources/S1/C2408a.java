package s1;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.C1799g;

/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2408a implements InterfaceC2409b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f57635a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f57636b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f57637c;

    public C2408a(Context context) {
        this.f57635a = context;
    }

    @Override // s1.InterfaceC2409b
    public String a() {
        if (!this.f57636b) {
            this.f57637c = C1799g.E(this.f57635a);
            this.f57636b = true;
        }
        String str = this.f57637c;
        if (str != null) {
            return str;
        }
        return null;
    }
}
