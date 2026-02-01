package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class G extends u0 {

    /* renamed from: d, reason: collision with root package name */
    private float f19822d = 3.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f19823e = 80;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0012, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001d, code lost:
    
        if (androidx.core.view.C0823k0.Z(r6) == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (androidx.core.view.C0823k0.Z(r6) == 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        r0 = 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int h(android.view.View r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            r5 = this;
            int r0 = r5.f19823e
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 1
            r3 = 3
            r4 = 5
            if (r0 != r1) goto L14
            int r6 = androidx.core.view.C0823k0.Z(r6)
            if (r6 != r2) goto L12
        L10:
            r0 = r4
            goto L20
        L12:
            r0 = r3
            goto L20
        L14:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L20
            int r6 = androidx.core.view.C0823k0.Z(r6)
            if (r6 != r2) goto L10
            goto L12
        L20:
            if (r0 == r3) goto L46
            if (r0 == r4) goto L3e
            r6 = 48
            if (r0 == r6) goto L36
            r6 = 80
            if (r0 == r6) goto L2e
            r6 = 0
            goto L4d
        L2e:
            int r8 = r8 - r12
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r6 = r6 + r8
            goto L4d
        L36:
            int r14 = r14 - r8
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r6 = r6 + r14
            goto L4d
        L3e:
            int r7 = r7 - r11
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r6 = r6 + r7
            goto L4d
        L46:
            int r13 = r13 - r7
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r6 = r6 + r13
        L4d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.G.h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int i(ViewGroup viewGroup) {
        int i4 = this.f19823e;
        if (i4 != 3 && i4 != 5 && i4 != 8388611 && i4 != 8388613) {
            return viewGroup.getHeight();
        }
        return viewGroup.getWidth();
    }

    @Override // androidx.transition.N
    public long c(ViewGroup viewGroup, J j4, S s4, S s5) {
        int i4;
        int i5;
        int i6;
        S s6 = s4;
        if (s6 == null && s5 == null) {
            return 0L;
        }
        Rect L3 = j4.L();
        if (s5 != null && e(s6) != 0) {
            s6 = s5;
            i4 = 1;
        } else {
            i4 = -1;
        }
        int f4 = f(s6);
        int g4 = g(s6);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (L3 != null) {
            i5 = L3.centerX();
            i6 = L3.centerY();
        } else {
            i5 = (round + width) / 2;
            i6 = (round2 + height) / 2;
        }
        float h4 = h(viewGroup, f4, g4, i5, i6, round, round2, width, height) / i(viewGroup);
        long K3 = j4.K();
        if (K3 < 0) {
            K3 = 300;
        }
        return Math.round((((float) (K3 * i4)) / this.f19822d) * h4);
    }

    public void j(float f4) {
        if (f4 != 0.0f) {
            this.f19822d = f4;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    public void k(int i4) {
        this.f19823e = i4;
    }
}
