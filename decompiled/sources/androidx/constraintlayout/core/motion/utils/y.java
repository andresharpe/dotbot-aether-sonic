package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public float f7589a;

    /* renamed from: b, reason: collision with root package name */
    public int f7590b;

    /* renamed from: c, reason: collision with root package name */
    public int f7591c;

    /* renamed from: d, reason: collision with root package name */
    public int f7592d;

    /* renamed from: e, reason: collision with root package name */
    public int f7593e;

    public void a(androidx.constraintlayout.core.motion.e eVar) {
        this.f7590b = eVar.l();
        this.f7591c = eVar.w();
        this.f7592d = eVar.q();
        this.f7593e = eVar.h();
        this.f7589a = (int) eVar.t();
    }

    public int b() {
        return this.f7593e - this.f7591c;
    }

    public int c() {
        return this.f7592d - this.f7590b;
    }
}
