package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.bumptech.glide.util.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    @i0
    static final Bitmap.Config f26213e = Bitmap.Config.RGB_565;

    /* renamed from: a, reason: collision with root package name */
    private final int f26214a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26215b;

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap.Config f26216c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26217d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f26218a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26219b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap.Config f26220c;

        /* renamed from: d, reason: collision with root package name */
        private int f26221d;

        public a(int i4) {
            this(i4, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d a() {
            return new d(this.f26218a, this.f26219b, this.f26220c, this.f26221d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Bitmap.Config b() {
            return this.f26220c;
        }

        public a c(@P Bitmap.Config config) {
            this.f26220c = config;
            return this;
        }

        public a d(int i4) {
            if (i4 > 0) {
                this.f26221d = i4;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }

        public a(int i4, int i5) {
            this.f26221d = 1;
            if (i4 <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i5 > 0) {
                this.f26218a = i4;
                this.f26219b = i5;
                return;
            }
            throw new IllegalArgumentException("Height must be > 0");
        }
    }

    d(int i4, int i5, Bitmap.Config config, int i6) {
        this.f26216c = (Bitmap.Config) l.e(config, "Config must not be null");
        this.f26214a = i4;
        this.f26215b = i5;
        this.f26217d = i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap.Config a() {
        return this.f26216c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f26215b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f26217d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f26214a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f26215b != dVar.f26215b || this.f26214a != dVar.f26214a || this.f26217d != dVar.f26217d || this.f26216c != dVar.f26216c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.f26214a * 31) + this.f26215b) * 31) + this.f26216c.hashCode()) * 31) + this.f26217d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f26214a + ", height=" + this.f26215b + ", config=" + this.f26216c + ", weight=" + this.f26217d + '}';
    }
}
