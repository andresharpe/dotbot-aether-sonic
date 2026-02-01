package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: A, reason: collision with root package name */
    @Deprecated
    public static final int f13167A = 17;

    /* renamed from: B, reason: collision with root package name */
    @Deprecated
    public static final int f13168B = 18;

    /* renamed from: C, reason: collision with root package name */
    @Deprecated
    public static final int f13169C = 19;

    /* renamed from: D, reason: collision with root package name */
    @Deprecated
    public static final int f13170D = 20;

    /* renamed from: E, reason: collision with root package name */
    @Deprecated
    public static final int f13171E = 21;

    /* renamed from: F, reason: collision with root package name */
    @Deprecated
    public static final int f13172F = 22;

    /* renamed from: G, reason: collision with root package name */
    @Deprecated
    public static final int f13173G = 23;

    /* renamed from: H, reason: collision with root package name */
    @Deprecated
    public static final int f13174H = 24;

    /* renamed from: I, reason: collision with root package name */
    @Deprecated
    public static final int f13175I = 25;

    /* renamed from: J, reason: collision with root package name */
    public static final int f13176J = 26;

    /* renamed from: K, reason: collision with root package name */
    public static final int f13177K = 27;

    /* renamed from: L, reason: collision with root package name */
    public static final int f13178L = 28;

    /* renamed from: M, reason: collision with root package name */
    @Deprecated
    public static final int f13179M = 32;

    /* renamed from: N, reason: collision with root package name */
    @Deprecated
    public static final int f13180N = 33;

    /* renamed from: O, reason: collision with root package name */
    @Deprecated
    public static final int f13181O = 34;

    /* renamed from: P, reason: collision with root package name */
    @Deprecated
    public static final int f13182P = 35;

    /* renamed from: Q, reason: collision with root package name */
    @Deprecated
    public static final int f13183Q = 36;

    /* renamed from: R, reason: collision with root package name */
    @Deprecated
    public static final int f13184R = 37;

    /* renamed from: S, reason: collision with root package name */
    @Deprecated
    public static final int f13185S = 38;

    /* renamed from: T, reason: collision with root package name */
    @Deprecated
    public static final int f13186T = 39;

    /* renamed from: U, reason: collision with root package name */
    @Deprecated
    public static final int f13187U = 40;

    /* renamed from: V, reason: collision with root package name */
    @Deprecated
    public static final int f13188V = 41;

    /* renamed from: W, reason: collision with root package name */
    @Deprecated
    public static final int f13189W = 42;

    /* renamed from: X, reason: collision with root package name */
    @Deprecated
    public static final int f13190X = 43;

    /* renamed from: Y, reason: collision with root package name */
    @Deprecated
    public static final int f13191Y = 44;

    /* renamed from: Z, reason: collision with root package name */
    @Deprecated
    public static final int f13192Z = 45;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f13193a = 255;

    /* renamed from: a0, reason: collision with root package name */
    @Deprecated
    public static final int f13194a0 = 46;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f13195b = 5;

    /* renamed from: b0, reason: collision with root package name */
    @Deprecated
    public static final int f13196b0 = 47;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f13197c = 6;

    /* renamed from: c0, reason: collision with root package name */
    @Deprecated
    public static final int f13198c0 = 1;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f13199d = 7;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f13200e = 8;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f13201f = 65280;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f13202g = 8;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public static final int f13203h = 9;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final int f13204i = 10;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f13205j = 0;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f13206k = 1;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f13207l = 2;

    /* renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f13208m = 3;

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final int f13209n = 4;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final int f13210o = 5;

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final int f13211p = 6;

    /* renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f13212q = 7;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f13213r = 8;

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f13214s = 9;

    /* renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f13215t = 10;

    /* renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f13216u = 11;

    /* renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f13217v = 12;

    /* renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final int f13218w = 13;

    /* renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final int f13219x = 14;

    /* renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final int f13220y = 15;

    /* renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final int f13221z = 16;

    private Q() {
    }

    @Deprecated
    public static int a(MotionEvent motionEvent, int i4) {
        return motionEvent.findPointerIndex(i4);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static float d(MotionEvent motionEvent, int i4) {
        return motionEvent.getAxisValue(i4);
    }

    @Deprecated
    public static float e(MotionEvent motionEvent, int i4, int i5) {
        return motionEvent.getAxisValue(i4, i5);
    }

    @Deprecated
    public static int f(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @Deprecated
    public static int g(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    public static int h(MotionEvent motionEvent, int i4) {
        return motionEvent.getPointerId(i4);
    }

    @Deprecated
    public static int i(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @Deprecated
    public static float j(MotionEvent motionEvent, int i4) {
        return motionEvent.getX(i4);
    }

    @Deprecated
    public static float k(MotionEvent motionEvent, int i4) {
        return motionEvent.getY(i4);
    }

    public static boolean l(@androidx.annotation.N MotionEvent motionEvent, int i4) {
        if ((motionEvent.getSource() & i4) == i4) {
            return true;
        }
        return false;
    }
}
