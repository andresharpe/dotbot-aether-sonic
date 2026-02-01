package junit.extensions;

import junit.framework.f;
import junit.framework.j;

/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: b, reason: collision with root package name */
    private int f51486b;

    public b(f fVar, int i4) {
        super(fVar);
        if (i4 >= 0) {
            this.f51486b = i4;
            return;
        }
        throw new IllegalArgumentException("Repetition count must be >= 0");
    }

    @Override // junit.extensions.c, junit.framework.f
    public int b() {
        return super.b() * this.f51486b;
    }

    @Override // junit.extensions.c, junit.framework.f
    public void d(j jVar) {
        for (int i4 = 0; i4 < this.f51486b && !jVar.n(); i4++) {
            super.d(jVar);
        }
    }

    @Override // junit.extensions.c
    public String toString() {
        return super.toString() + "(repeated)";
    }
}
