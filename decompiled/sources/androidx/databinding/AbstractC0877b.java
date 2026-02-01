package androidx.databinding;

import androidx.databinding.u;

/* renamed from: androidx.databinding.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0877b extends C0863a {

    /* renamed from: androidx.databinding.b$a */
    /* loaded from: classes.dex */
    class a extends u.a {
        a() {
        }

        @Override // androidx.databinding.u.a
        public void f(u uVar, int i4) {
            AbstractC0877b.this.e();
        }
    }

    public AbstractC0877b() {
    }

    public AbstractC0877b(u... uVarArr) {
        if (uVarArr == null || uVarArr.length == 0) {
            return;
        }
        a aVar = new a();
        for (u uVar : uVarArr) {
            uVar.a(aVar);
        }
    }
}
