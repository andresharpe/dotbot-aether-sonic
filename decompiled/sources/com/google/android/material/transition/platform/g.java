package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.W;

@W(21)
/* loaded from: classes2.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private static final f f34206a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final f f34207b = new b();

    /* loaded from: classes2.dex */
    class a implements f {
        a() {
        }

        @Override // com.google.android.material.transition.platform.f
        public h a(float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
            float m4 = v.m(f7, f9, f5, f6, f4, true);
            float f11 = m4 / f7;
            float f12 = m4 / f9;
            return new h(f11, f12, m4, f8 * f11, m4, f10 * f12);
        }

        @Override // com.google.android.material.transition.platform.f
        public boolean b(h hVar) {
            if (hVar.f34211d > hVar.f34213f) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.transition.platform.f
        public void c(RectF rectF, float f4, h hVar) {
            rectF.bottom -= Math.abs(hVar.f34213f - hVar.f34211d) * f4;
        }
    }

    /* loaded from: classes2.dex */
    class b implements f {
        b() {
        }

        @Override // com.google.android.material.transition.platform.f
        public h a(float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
            float m4 = v.m(f8, f10, f5, f6, f4, true);
            float f11 = m4 / f8;
            float f12 = m4 / f10;
            return new h(f11, f12, f7 * f11, m4, f9 * f12, m4);
        }

        @Override // com.google.android.material.transition.platform.f
        public boolean b(h hVar) {
            if (hVar.f34210c > hVar.f34212e) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.transition.platform.f
        public void c(RectF rectF, float f4, h hVar) {
            float abs = (Math.abs(hVar.f34212e - hVar.f34210c) / 2.0f) * f4;
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
                    return f34207b;
                }
                throw new IllegalArgumentException("Invalid fit mode: " + i4);
            }
            return f34206a;
        }
        if (b(z3, rectF, rectF2)) {
            return f34206a;
        }
        return f34207b;
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
