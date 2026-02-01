package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.u;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9288a = "TransitionBuilder";

    public static u.b a(u uVar, int i4, int i5, androidx.constraintlayout.widget.d dVar, int i6, androidx.constraintlayout.widget.d dVar2) {
        u.b bVar = new u.b(i4, uVar, i5, i6);
        b(uVar, bVar, dVar, dVar2);
        return bVar;
    }

    private static void b(u uVar, u.b bVar, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
        int I3 = bVar.I();
        int B3 = bVar.B();
        uVar.k0(I3, dVar);
        uVar.k0(B3, dVar2);
    }

    public static void c(s sVar) {
        u uVar = sVar.f8986p0;
        if (uVar != null) {
            if (uVar.t0(sVar)) {
                if (uVar.f9120c != null && !uVar.s().isEmpty()) {
                    return;
                } else {
                    throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
                }
            }
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
    }
}
