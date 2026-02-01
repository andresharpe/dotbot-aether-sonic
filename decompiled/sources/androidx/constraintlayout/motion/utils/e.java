package androidx.constraintlayout.motion.utils;

import android.view.View;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public float f8436a;

    /* renamed from: b, reason: collision with root package name */
    public int f8437b;

    /* renamed from: c, reason: collision with root package name */
    public int f8438c;

    /* renamed from: d, reason: collision with root package name */
    public int f8439d;

    /* renamed from: e, reason: collision with root package name */
    public int f8440e;

    public void a(View view) {
        this.f8437b = view.getLeft();
        this.f8438c = view.getTop();
        this.f8439d = view.getRight();
        this.f8440e = view.getBottom();
        this.f8436a = view.getRotation();
    }

    public int b() {
        return this.f8440e - this.f8438c;
    }

    public int c() {
        return this.f8439d - this.f8437b;
    }
}
