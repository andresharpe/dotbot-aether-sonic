package com.google.android.material.transition;

import android.graphics.RectF;

/* loaded from: classes2.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private static final f f34051a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final f f34052b = new b();

    /* loaded from: classes2.dex */
    class a implements f {
        a() {
        }

        @Override // com.google.android.material.transition.f
        public h a(float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
            float m4 = u.m(f7, f9, f5, f6, f4, true);
            float f11 = m4 / f7;
            float f12 = m4 / f9;
            return new h(f11, f12, m4, f8 * f11, m4, f10 * f12);
        }

        @Override // com.google.android.material.transition.f
        public boolean b(h hVar) {
            if (hVar.f34056d > hVar.f34058f) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.transition.f
        public void c(RectF rectF, float f4, h hVar) {
            rectF.bottom -= Math.abs(hVar.f34058f - hVar.f34056d) * f4;
        }
    }

    /* loaded from: classes2.dex */
    class b implements f {
        b() {
        }

        @Override // com.google.android.material.transition.f
        public h a(float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
            float m4 = u.m(f8, f10, f5, f6, f4, true);
            float f11 = m4 / f8;
            float f12 = m4 / f10;
            return new h(f11, f12, f7 * f11, m4, f9 * f12, m4);
        }

        @Override // com.google.android.material.transition.f
        public boolean b(h hVar) {
            if (hVar.f34055c > hVar.f34057e) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.transition.f
        public void c(RectF rectF, float f4, h hVar) {
            float abs = (Math.abs(hVar.f34057e - hVar.f34055c) / 2.0f) * f4;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a(int i4, boolean z3, RectF rectF, RectF rectF2) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    return f34052b;
                }
                throw new IllegalArgumentException("Invalid fit mode: " + i4);
            }
            return f34051a;
        }
        if (b(z3, rectF, rectF2)) {
            return f34051a;
        }
        return f34052b;
    }

    private static boolean b(boolean z3, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f4 = (height2 * width) / width2;
        float f5 = (width2 * height) / width;
        if (z3) {
            if (f4 < height) {
                return false;
            }
        } else if (f5 < height2) {
            return false;
        }
        return true;
    }
}
