package com.google.android.material.color;

import android.app.Activity;
import androidx.annotation.N;
import androidx.annotation.d0;
import com.google.android.material.color.l;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: d, reason: collision with root package name */
    private static final l.f f32020d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final l.e f32021e = new b();

    /* renamed from: a, reason: collision with root package name */
    @d0
    private final int f32022a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final l.f f32023b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final l.e f32024c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements l.f {
        a() {
        }

        @Override // com.google.android.material.color.l.f
        public boolean a(@N Activity activity, int i4) {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    class b implements l.e {
        b() {
        }

        @Override // com.google.android.material.color.l.e
        public void a(@N Activity activity) {
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @d0
        private int f32025a;

        /* renamed from: b, reason: collision with root package name */
        @N
        private l.f f32026b = m.f32020d;

        /* renamed from: c, reason: collision with root package name */
        @N
        private l.e f32027c = m.f32021e;

        @N
        public m d() {
            return new m(this, null);
        }

        @N
        public c e(@N l.e eVar) {
            this.f32027c = eVar;
            return this;
        }

        @N
        public c f(@N l.f fVar) {
            this.f32026b = fVar;
            return this;
        }

        @N
        public c g(@d0 int i4) {
            this.f32025a = i4;
            return this;
        }
    }

    /* synthetic */ m(c cVar, a aVar) {
        this(cVar);
    }

    @N
    public l.e c() {
        return this.f32024c;
    }

    @N
    public l.f d() {
        return this.f32023b;
    }

    @d0
    public int e() {
        return this.f32022a;
    }

    private m(c cVar) {
        this.f32022a = cVar.f32025a;
        this.f32023b = cVar.f32026b;
        this.f32024c = cVar.f32027c;
    }
}
