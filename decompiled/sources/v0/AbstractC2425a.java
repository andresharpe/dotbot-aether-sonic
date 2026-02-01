package v0;

import android.os.Handler;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2425a {

    /* renamed from: a, reason: collision with root package name */
    private String f57884a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f57885b;

    public Handler a() {
        return this.f57885b;
    }

    public String b() {
        return this.f57884a;
    }

    public void c(Handler handler) {
        this.f57885b = handler;
    }

    public void d(String str) {
        this.f57884a = str;
    }
}
